# We affirm that we have carried out the attached academic endeavours with full academic honesty
# Sol Ben-Ishay, Christopher Ringer, Milo Baker-Durante

# Use random for sentence get, use tkinter for gui, use timeit for stopwatch
import random
import tkinter as tk
from tkinter import messagebox
from timeit import default_timer as timer

# These global variables need to be accessed by various functions so this initializes them
start = 0
copy_this = ""
what_typed = ""
time_took = 0
count = 0
accuracy = 0
end = 0
window = tk.Tk()
screen = tk.Canvas(window, width=600, height=300)
usersInput = tk.Entry(window, width=60, background='#EFFBEF', fg='#0059b3')
shiftClicked = False
# Create Enter button
# enterBtn = tk.Button(window, text="Enter")
# # Create Start button

def reset_game():
    global window
    global start
    global copy_this
    global usersInput
    global end
    global count
    global time_took
    global what_typed
    global accuracy
    global shiftClicked
    shiftClicked = False
    what_typed = ""
    count = 0
    accuracy = 0
    start = 0
    end = 0
    time_took = 0
    copy_this = ""
    usersInput.delete(0, "end")
    window.focus()



def get_sentences():
    # Will get a sentence for user to copy
    f = open('sentences.txt', "r")
    list_sentences = []
    for line in f:
        stripped_line = line.strip()
        list_sentences.append(stripped_line)
    f.close()
    sentence = random.choice(list_sentences)
    return sentence  # outputs a random sentence from the file of sentences


def onKey(*args):
    # When shift is pressed, timer starts
    global start
    global usersInput
    global shiftClicked
    if not shiftClicked:
        shiftClicked = True
        usersInput.focus()
        usersInput.delete(0, "end")
        start = timer()


def onReturn(*args):
    # When return is pressed stops timer and calculates results, updates display to show results after
    global start
    global window
    global screen
    global copy_this
    global end
    global time_took
    global what_typed
    global count
    global shiftClicked
    if shiftClicked:
        end = timer()
        time_took = round(end - start)
        what_typed = usersInput.get();
        # sacrifices accuracy i guess
        for i in range(0, len(what_typed)):
            if copy_this[i] == what_typed[i]:
                count += 1
        accuracy = round((count / len(copy_this)) * 100)
        # Wpm based on avg word len of 5 char
        wpm = round((len(copy_this) / 5) / (time_took / 60))
        # Create results string
        result_string = "Total time: " + str(time_took) + "sec / WPM: " + str(wpm) + "/ Accuracy: " + str(accuracy) + "%"
        # Display results
        messagebox.showinfo("Results", result_string)
        # Continue playing until quit
        reset_game()
        play()

def play():
    # Outputs the main window for the game
    global window
    global screen
    global usersInput
    global copy_this
    global enterBtn
    global startBtn
    # Title
    window.title("Typing Game")
    screen.configure(background='#EFFBEF')
    screen.grid(columnspan=7, rowspan=7)
    # Main logo
    tk.Label(window, text="Test Your Typing Skills", font=("Helvetica", 25, 'bold', 'underline'), fg='#0059b3',
             background='#EFFBEF').grid(columnspan=7, column=0, row=0)
    # Gets a sentence to show
    copy_this = get_sentences()
    # Create Label for Sentence
    tk.Label(window, text=copy_this, background='white', fg='#0059b3').grid(columnspan=7, column=0, row=1)
    # Edit entry box for user input
    usersInput.grid(columnspan=7, column=0, row=2)
    usersInput.insert(0, "Enter the sentence here, press shift to start and return at end.")
    # enterBtn = tk.Button(window, text="Enter",command=lambda: onReturn()).grid(columnspan=3, column=2, row=4)
    # startBtn = tk.Button(window, text="Start",command=lambda: onKey()).grid(columnspan=3, column=2, row=5)
    # Actions
    window.bind("<Return>", onReturn)
    window.bind("<Shift_L>", onKey)
    window.bind("<Shift_R>", onKey)
    window.mainloop()


play()
