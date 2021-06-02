import unittest

from recursive_length import recursive_len

# from recursive_length import recursive_len_nested


class MyTestCase(unittest.TestCase):
    def test_empty_list(self):
        my_list = []
        self.assertEqual(0, recursive_len(my_list))

    def test_one_list(self):
        my_list = [1]
        self.assertEqual(1, recursive_len(my_list))

    def test_two_list(self):
        my_list = [1, 1]
        self.assertEqual(2, recursive_len(my_list))

    def test_nested_not_counted(self):
        my_list = [1, [1, 2, 3]]
        self.assertEqual(4, recursive_len(my_list))


if __name__ == '__main__':
    unittest.main()
