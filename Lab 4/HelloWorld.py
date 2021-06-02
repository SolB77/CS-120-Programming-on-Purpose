## 1. Print hello word + other outputs
print("Hello world!")
print("Hello solar system!")
print("Hello galaxy!")
print("Hello universe!")

## 2. ZyBooks 1.10 and 1.11 in python

# 1.10 Salary calculator
hourly_wage = 20
print("Salary calculator")
print(f"Annual salary is: {hourly_wage * 40 * 50}")
print(f"Monthly salary is: {round((hourly_wage * 40 * 50) / 12,2)}")

# 1.11 Married-couple names
firstName1 = input("What is the first person's first name? ")
lastName1 = input("What is the first person's last name? ")
firstName2 = input("What is the second person's first name? ")
lastName2 = input("What is the second person's last name? ")

print("Here are some common married-couple names:")
print(f"{firstName1} {lastName1} and {firstName2} {lastName2}")
print(f"{firstName1} and {firstName2} {lastName1}")
print(f"{firstName1} and {firstName2} {lastName2}")
