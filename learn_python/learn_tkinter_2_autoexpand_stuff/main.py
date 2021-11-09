#Study how to auto resize with window size, but in size, it seems use a lot single core resources
import tkinter as tk


root = tk.Tk()
tk.Grid.rowconfigure(root, 0, weight=1)
tk.Grid.columnconfigure(root, 0, weight=1)


frame=tk.Frame(root)
frame.grid(row=0, column=0, sticky=tk.N+tk.S+tk.E+tk.W)


for row in range(2):
    tk.Grid.rowconfigure(frame, row, weight=1)
    for column in range(5):
        tk.Grid.columnconfigure(frame, column, weight=1)
        button = tk.Button(frame) #create a button inside frame 
        button.grid(row=row, column=column, sticky=tk.N+tk.S+tk.E+tk.W)  

root.mainloop()