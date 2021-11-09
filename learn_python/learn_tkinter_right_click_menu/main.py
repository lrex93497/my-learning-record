import tkinter as tk


def show_popup_menu(target):   
    n = target.widget
    popup_menu.entryconfigure("Cut",command=lambda: n.event_generate("<<Cut>>"))
    popup_menu.entryconfigure("Copy",command=lambda: n.event_generate("<<Copy>>"))
    popup_menu.entryconfigure("Paste",command=lambda: n.event_generate("<<Paste>>"))
    popup_menu.tk.call("tk_popup", popup_menu, target.x_root, target.y_root)

root = tk.Tk()

popup_menu = tk.Menu(root, tearoff=0)
popup_menu.add_command(label="Cut")
popup_menu.add_command(label="Copy")
popup_menu.add_command(label="Paste")

text_1 = tk.Text() 
text_1.pack()
entry_2 = tk.Entry()
entry_2.pack()
root.bind_class("Text", "<Button-3><ButtonRelease-3>", show_popup_menu)
root.bind_class("Entry", "<Button-3><ButtonRelease-3>", show_popup_menu)

root.mainloop()