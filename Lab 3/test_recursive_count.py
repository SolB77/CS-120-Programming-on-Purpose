import unittest

from recursive_count import recursive_count

from recursive_count import recursive_count_nested



class MyTestCase(unittest.TestCase):
    def test_empty_list(self):
        my_list = []
        target = 1
        self.assertEqual(0, recursive_count(my_list, target),
                         str(my_list) + " list has zero target")

    def test_one_list(self):
        my_list = [1]
        target = 1
        self.assertEqual(1, recursive_count(my_list, target),
                         str(my_list) + " list has 1 target")

    def test_two_list(self):
        my_list = [1, 1]
        target = 1
        self.assertEqual(2, recursive_count(my_list, target),
                         str(my_list) + " list has 2 target")

    def test_nested_not_counted(self):
        my_list = [1, [1, 2, 3]]
        target = 1
        self.assertEqual(2, recursive_count(my_list, target),
                         str(my_list) + " list has 2 target")


    def test_empty_list_nested(self):
        my_list = []
        target = 1
        self.assertEqual(0, recursive_count_nested(my_list, target),
                         str(my_list) + " list has zero target")

    def test_one_list_nested(self):
        my_list = [1]
        target = 1
        self.assertEqual(1, recursive_count_nested(my_list, target),
                         str(my_list) + " list has 1 target")

    def test_two_list_nested(self):
        my_list = [1, 1]
        target = 1
        self.assertEqual(2, recursive_count_nested(my_list, target),
                         str(my_list) + " list has 2 target")

    def test_two_list_nested_counted(self):
        my_list = [1, [1, 2, 3]]
        target = 1
        self.assertEqual(2, recursive_count_nested(my_list, target),
                         str(my_list) + " list has 2 target")


if __name__ == '__main__':
    unittest.main()
