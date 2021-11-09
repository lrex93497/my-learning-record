#This file is not necessary meaningful, just for learning tkinter
import tkinter as tk
from tkinter import messagebox
from PIL import ImageTk, Image
from tkinter import filedialog
import winreg
import os
#from tkinter import *

abspath = os.path.abspath(__file__)
dname = os.path.dirname(abspath)
os.chdir(dname)

def click():
    tklabel = tk.Label(root, text="sadasdas{}".format(entry.get()))
    tklabel.grid(row=1, column=0, padx=50, pady =50)

def click_value(x):
    entry.delete(0, tk.END)
    entry.insert(0, x)

def click_value_2(x):
    current = str(entry.get()) +str(x)
    entry.delete(0, tk.END)
    entry.insert(0, current)

def clean():
    entry.delete(0, tk.END)

def disappear_test_picture():
    image_label.grid_forget()

def show_test_picture():
    image_label.grid(row=9, column=0, columnspan=3)

def radio_click(selection):
    global radio_label
    radio_label.destroy()
    radio_label=tk.Label(root, text=selection)
    radio_label.grid(row=9, column=11)

def infopopup():
    respone = messagebox.showinfo("popup!", "popup content")
    print(respone)

def warningpopup():
    respone = messagebox.showwarning("warning!", "warning content")
    print(respone)

def errorpopup():
    respone = messagebox.showerror("error!", "error content")
    print(respone)

def askpopup():
    respone = messagebox.askquestion("Asking", "Yes or No?") #respone = yes and no
    print(respone)

def askokpopup():
    respone = messagebox.askokcancel("Asking ok", "ok?") #respone = True and False
    print(respone)

def askynpopup():
    respone = messagebox.askyesno("Y or N", "Yes or No") #respone = True and False
    print(respone)

def open_window_1():
    global window_1
    window_1 = tk.Toplevel()
    window_1.title("learn tkinter new window")
    window_1.iconbitmap("icon.ico")

    w_button = tk.Button(window_1, text="button on new window")
    button_close_window = tk.Button(window_1, text="close this window", command=window_1.destroy)
    w_button.pack(padx=30, pady=5)
    button_close_window.pack(padx=30, pady=5)

def requestphoto():
    global entry_photo_location
    global image_label
    global root
    global test_image_2
    root_filename = filedialog.askopenfilename(initialdir="", title="File?",filetypes=(("png files", "*.png"), ("All file tpyes", "*.*")))
    entry_photo_location.delete(0, tk.END)
    entry_photo_location.insert(0, root_filename)
    test_image_2 = ImageTk.PhotoImage(Image.open(root_filename))
    image_label.destroy()
    image_label = tk.Label(image=test_image_2)
    image_label.grid(row=9, column=0, columnspan=3)


root = tk.Tk()
root.resizable(False, False)
root.title("learn tkinter")
root.iconbitmap("icon.ico")
#root.geometry("1000x1000")

test_image = ImageTk.PhotoImage(Image.open("icon.png"))
image_label = tk.Label(image=test_image)

bar_status = tk.Label(root, text="status dummy", relief="raised")

frame = tk.LabelFrame(root, text="test frame",  width=450, height=50)

#padx=10, pady=10 for pack

entry = tk.Entry(root, width=50, bd=2, highlightcolor="#ff3343", bg="#664555", borderwidth=5)
entry.insert(0, "????????")
entry2 = tk.Entry(root, width=50, bd=2, highlightcolor="#ff3343", bg="#664555", borderwidth=3, state=tk.NORMAL,
                  disabledforeground ="#664555", disabledbackground ="#664555")
entry2.insert(0, "Read only")
entry2["state"]= tk.DISABLED

button = tk.Button(root, text="hide picture+ add 2 no clean", fg="#ff3343", bg="#fdfd22", command=lambda: [click_value_2(2), disappear_test_picture()], activebackground="#906933")
button_2 = tk.Button(root, text="show picture + clean to 3", fg="#ff3343", bg="#fdfd22", command=lambda: [click_value(3), show_test_picture()] )
button_clear = tk.Button(root, text="CLEAN", font=10, width=30, height=3, command=lambda: clean())
button_exit = tk.Button(root, text="Exit Program", command=root.quit)
tklabel = tk.Label(root, text ="asdasdasd")
tklabel_2 = tk.Label(root, text ="222asdasdasd")

button_ask_photo = tk.Button(root, text="select photo", font=10, width=30, height=3, command=lambda: requestphoto())


radio_var = tk.StringVar()
radio_var.set(2)
entry_photo_location=tk.Entry(root, text="",  width=50)
radio_label = tk.Label(root, text=radio_var.get())
radio_button_1 = tk.Radiobutton(root, text="1+2", variable=radio_var, value="3", command=lambda: radio_click(radio_var.get()))
radio_button_2 = tk.Radiobutton(root, text="1+1", variable=radio_var, value="2", command=lambda: radio_click(radio_var.get()))
radio_button_3 = tk.Radiobutton(root, text="abc", variable=radio_var, value="abc", command=lambda: radio_click(radio_var.get()))

radio_value = tk.Label(root, text="value  =")

radio_button_list = [[["2+1+1"],["4"]],
                     [["2+3"],["5"]],
                     [["3+3"],["6"]],
                     [["3+4"],["7"]]
                     ]

for (text, value),(n) in zip(radio_button_list, range(7,12)):
    tk.Radiobutton(root, text=text, variable=radio_var, value=value, command=lambda: radio_click(radio_var.get())).grid(row=n, column=12, columnspan=3)

button_infopopup = tk.Button(root, text="click to info popup", command=lambda:())
button_warningpopup = tk.Button(root, text="click to warning popup", command=lambda:warningpopup())
button_errorpopup = tk.Button(root, text="click to error popup", command=lambda:errorpopup())
button_askpopup = tk.Button(root, text="click to ask popup", command=lambda:askpopup())
button_askokpopup = tk.Button(root, text="click to ask ok popup", command=lambda:askokpopup())
button_askynpopup = tk.Button(root, text="click to ask Y or N popup", command=lambda:askynpopup())

button_new_window = tk.Button(root, text="open new window", command=lambda:open_window_1())

frame.grid(row=0, column=0, columnspan=3, sticky= tk.N+tk.S+tk.E+tk.W)


tklabel.grid(row=0,column=0)
tklabel_2.grid(row=1, column=0)
button.grid(row=2,column=0)
button_2.grid(row=2,column=1)
entry.grid(row=4, column=0, columnspan=5)
entry2.grid(row=5, column=0, columnspan=5)
button_clear.grid(row=6, column=0, columnspan=3, rowspan=2)
button_exit.grid(row=8, column=0, columnspan=3)
image_label.grid(row=9, column=0, columnspan=3)

radio_button_1.grid(row=7, column=7, columnspan=3)
radio_button_2.grid(row=8, column=7, columnspan=3)
radio_button_3.grid(row=9, column=7, columnspan=3)
radio_label.grid(row=9, column=11)
radio_value.grid(row=9, column=10)
button_infopopup.grid(row=10, column=0, columnspan=3)
button_warningpopup.grid(row=11, column=0, columnspan=3)
button_errorpopup.grid(row=12, column=0, columnspan=3)
button_askpopup.grid(row=13, column=0, columnspan=3)
button_askokpopup.grid(row=14, column=0, columnspan=3)
button_askynpopup.grid(row=15, column=0, columnspan=3)
button_new_window.grid(row=16, column=0, columnspan=3)
button_ask_photo.grid(row=17, column=0, columnspan=3)
entry_photo_location.grid(row=18, column=0, columnspan=3)

#bar_status.grid(row=11, column=0, columnspan=3, sticky=tk.W+tk.E)

#silder
def v_slide_v(n):
    label_slider_vertical = tk.Label(root, text=n)
    label_slider_vertical.grid(row=19, column=11)

def h_slide_v(n):
    label_slider_horizontal = tk.Label(root, text=n)
    label_slider_horizontal.grid(row=22, column=10)

slider_vertical = tk.Scale(root, from_=3, to=200, command=v_slide_v)
slider_horizontal = tk.Scale(root, from_=0, to=200, orient=tk.HORIZONTAL, command=h_slide_v)
label_slider_vertical = tk.Label(root, text=slider_vertical.get())
label_slider_horizontal = tk.Label(root, text=slider_horizontal.get())


slider_vertical.grid(row=19, column=10)
slider_horizontal.grid(row=20, column=10)
label_slider_vertical.grid(row=19, column=11)
label_slider_horizontal.grid(row=22, column=10)

#checkbox
def checkbox_click():
    global checkbox_var
    print(checkbox_var.get())
    label_checkbox = tk.Label(root, text=checkbox_var.get())
    label_checkbox.grid(row=24, column=11)

def checkbox_click_2():
    global checkbox_var_2
    print(checkbox_var_2.get())
    label_checkbox_2 = tk.Label(root, text=checkbox_var_2.get())
    label_checkbox_2.grid(row=26, column=11)

checkbox_var = tk.IntVar()
checkbox_var_2 = tk.StringVar()
checkbox_var_2.set("off")

checkbox = tk.Checkbutton(root, text="test checkbox", variable=checkbox_var, command=lambda:checkbox_click())
checkbox_2 = tk.Checkbutton(root, text="test checkbox 2", variable=checkbox_var_2, command=lambda:checkbox_click_2(), onvalue="ok", offvalue="off")
#checkbox_2.deselect()
label_checkbox = tk.Label(root, text=checkbox_var.get())
label_checkbox_2 = tk.Label(root, text=checkbox_var_2.get())

checkbox.grid(row=23, column=10)
label_checkbox.grid(row=24, column=11)
checkbox_2.grid(row=25, column=10)
label_checkbox_2.grid(row=26, column=11)

#dropdown menu
def dm_update(n):
    label_drop_menu_1 = tk.Label(root, text=n)
    label_drop_menu_1.grid(row=3, column=22)

dm_list = ["123", "213", "321"]
dm_var = tk.StringVar()
drop_menu_1 = tk.OptionMenu(root, dm_var, *dm_list, command=dm_update)
dm_var.set(dm_list[0])
label_drop_menu_1 = tk.Label(root, text=dm_var.get())

drop_menu_1.grid(row=3, column=20,)
label_drop_menu_1.grid(row=3, column=22)

# textbox with scrollbar
box_text = tk.Text(root, height=3)
scrollbar_box_text = tk.Scrollbar(root, orient=tk.VERTICAL)
box_text.configure(yscrollcommand = scrollbar_box_text.set)
scrollbar_box_text.config(command=box_text.yview)
scrollbar_box_text.grid(row=20, column=1, sticky=tk.S+tk.W+tk.N)

list_box_text_item=['1', '2', '3', '4', '5','6','7']
for i in list_box_text_item:
    box_text.insert(tk.END, "\n"+i)

box_text.grid(row=20, column=0)


root.mainloop()