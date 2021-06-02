def recursive_len(my_list):
    """Gets the length of a list

    :param my_list: The list that's length will be measured
    :type my_list: list
    :returns: the length of my_list
    :rtype: int

    """

    # Empty list result is zero: Base case
    if not my_list:
        return 0
    else:
        return 1 + recursive_len(my_list[1:])


def recursive_len_nested(my_list):
    """Gets the length of the individual values in a nested list

    :param my_list: The list that's length will be measured
    :type my_list: list
    :returns: the length of my_list
    :rtype: int

    """

    # Empty list result is zero: Base case
    if not my_list:
        return 0
    # TODO Not sure how to complete recursive length function for the nested list
    # else:


print(recursive_len([1, 3, 4, 6, 7, 8, 9]))