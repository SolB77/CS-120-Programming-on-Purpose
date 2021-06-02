## Read Tic-Tac-Toe Boards (Comment out the files you don't want for testing with a #)

# Base Board
boardfile = open("Boards/tictactoe_board.txt")
# Row Not Equal to 3 Test Board
#boardfile = open("Boards/rownotequalto3.txt")
# Column Not Equal to 3 Test Board
#boardfile = open("Boards/columnnotequalto3.txt")
# Three in a Row Test Board
#boardfile = open("Boards/threeinarowtest.txt")
# Three in a Column Test Board
#boardfile = open("Boards/threeinacolumntest.txt")
# Three Diagonally Test Board
#boardfile = open("Boards/threediagonallytest.txt")
# Three in a Row, Column, and Diagonally Test Board
#boardfile = open("Boards/threeinarowcolumnanddiagonaltest.txt")
board = boardfile.read()
boardfile.close()

## Split the string into a list by linebreaks
rows = board.split('\n')

## Print the list containing the split board sections unless the rows or columns are not equal to 3
if len(rows) != 3:
    raise ValueError(f"The number of rows in the board is not equal to 3!:\n"
                     f"{rows}. There are only {len(rows)} rows!")
elif (len(rows[0]) != 3) or (len(rows[1]) != 3) or (len(rows[2]) != 3):
    raise ValueError(f"The number of complete columns in the board is not equal to 3!:\n"
                     f"{rows[0]}\n"
                     f"{rows[1]}\n"
                     f"{rows[2]}")
else:
    print(f"The board looks like:\n"
          f"{rows[0]}\n"
          f"{rows[1]}\n"
          f"{rows[2]}\n")

## Print whether any of the rows are 3 in a row (either all X or O) and print the row position and values
for row in rows:
    if row[0] == row[1] == row[2]:
        print(f"Row {rows.index(row)+1} has three {[row][0]}'s in a row:\n{row}\n")

## Print whether any of the columns are 3 in a row (either all X or 0) and print the column position and values
if rows[0][0] == rows[1][0] == rows[2][0]:
    print(f"Column 1 has three {rows[0][0]} in a row:\n"
          f"{rows[0][0]}\n"
          f"{rows[1][0]}\n"
          f"{rows[2][0]}\n")

if rows[0][1] == rows[1][1] == rows[2][1]:
    print(f"Column 2 has three {rows[0][1]} in a row:\n"
          f"{rows[0][1]}\n"
          f"{rows[1][1]}\n"
          f"{rows[2][1]}\n")

if rows[0][2] == rows[1][2] == rows[2][2]:
    print(f"Column 3 has three {rows[0][2]} in a row:\n"
          f"{rows[0][2]}\n"
          f"{rows[1][2]}\n"
          f"{rows[2][2]}\n")

## Print whether any of the diagonals are 3 in a row (either all X or 0) and print the diagonal slope (upward/downward) and values
if rows[0][0] == rows[1][1] == rows[2][2]:
    print(f"The downward sloping diagonal going from (0,0) to (2,2) has three in a row:\n"
          f"{rows[0][0]}\n"
          f" {rows[1][1]}\n"
          f"  {rows[2][2]}")

if rows[2][0] == rows[1][1] == rows[0][2]:
    print(f"The upward sloping diagonal going from (2,0) to (0,2) has three in a row:\n"
          f"{rows[2][0]}\n"
          f" {rows[1][1]}\n"
          f"  {rows[0][2]}")
