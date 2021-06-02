HOW_MANY = 72


def simple_data(n):
    print("\nInside simple_data function")
    print("=" * HOW_MANY)

    print("Before the assignment")
    print("Variable: {} and value: {} address: {}".format("n", n, id(n)))

    n = 6

    print("After the assignment")
    print("Variable: {} and value: {} address: {}".format("n", n, id(n)))

    return n + 1


def complex_data(n, a_list):
    print("\nInside complex_data function")
    print("=" * HOW_MANY)

    print("Before the assignments")
    print("Variable: {} and value: {} address: {}".format("n", n, id(n)))
    print("Variable: {} and value: {} address: {}".format("a_list", a_list, id(a_list)))

    n = 2
    a_list[n] += 3

    print("After the assignments")
    print("Variable: {} and value: {} address: {}".format("n", n, id(n)))
    print("Variable: {} and value: {} address: {}".format("a_list", a_list, id(a_list)))


# test data
n = 1
a_list = [5, 10, 15, 20]

print("\nBefore simple_data function is called")
print("="*HOW_MANY)
print("Variable: {} and value: {} address: {}".format("n", n, id(n)))
print("Variable: {} and value: {} address: {}".format("a_list", a_list, id(a_list)))

n_new = simple_data(n)

print("\nAfter simple_data function is called")
print("="*HOW_MANY)
print("Variable: {} and value: {} address: {}".format("n", n, id(n)))
print("Variable: {} and value: {} address: {}".format("n_new", n_new, id(n_new)))

print("\nBefore complex_data function is called")
print("="*HOW_MANY)
print("Variable: {} and value: {} address: {}".format("n", n, id(n)))
print("Variable: {} and value: {} address: {}".format("a_list", a_list, id(a_list)))

complex_data(n, a_list)

print("\nAfter complex_data function is called")
print("="*HOW_MANY)
print("Variable: {} and value: {} address: {}".format("n", n, id(n)))
print("Variable: {} and value: {} address: {}".format("a_list", a_list, id(a_list)))
