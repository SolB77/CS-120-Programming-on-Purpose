def recursive_count(my_list, my_target):
    """ Finds the frequency of target in a given list
        without considering nested lists

    :param my_list: The list where target will be searched and counted
    :type my_list: list
    :param my_target: the item to be counted inside my_list
    :type my_target: anything
    :returns: the count of the target in the list my_list
    :rtype: int

    """

    # Empty list result is zero: Base case
    if not my_list:
        return 0
    else:
        # If the first is the target
        # result is the count in the rest plus 1
        if my_list[0] == my_target:
            return 1 + recursive_count(my_list[1:], my_target)
        # else skip the first one
        else:
            return recursive_count(my_list[1:], my_target)


def recursive_count_nested(my_list, my_target):
    """ Finds the frequency of target in a given list
        considering nested lists

    :param my_list: The list where target will be searched and counted
    :type my_list: list
    :param my_target: the item to be counted inside my_list
    :type my_target: anything
    :returns: the count of the target in the list my_list
    :rtype: int

    """

    # Empty list result is zero: Base case
    if not my_list:
        return 0
    else:
        # if first is not a list
        if type(my_list[0]) is not list:
            # If the first is the target
            # result is the count in the rest plus 1
            if my_list[0] == my_target:
                return 1 + recursive_count_nested(my_list[1:], my_target)
            # else skip the first one
            else:
                return recursive_count_nested(my_list[1:], my_target)
        # First is a list: Nested
        # Count the target in the first and in the rest, then add them
        else:
            return recursive_count_nested(my_list[0], my_target) \
                 + recursive_count_nested(my_list[1:], my_target)


if __name__ == '__main__':
    lists = [[], [1], [1, 1], [1, 2, 1],
             [1, [1, 2, 3]], [1, [1, 2, 3, 2, 2]]]
    targets = [1, 2]

    for target in targets:
        for list_test in lists:
            print("Count of {} in {} without nested: "
                  "{}".format(target, list_test,
                              recursive_count(list_test, target)))

    print("=" * 72)

    for target in targets:
        for list_test in lists:
            print("Count of {} in {} with nested: "
                  "{}".format(target, list_test,
                              recursive_count_nested(list_test, target)))
