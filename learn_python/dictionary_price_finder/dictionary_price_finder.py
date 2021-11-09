stationery = {'pen':5.30, 'pencil': 1.50, 'eraser': 2.50, 'notepad': 10.20} #dictionary for product prices

#print out a list of products
print('Items for sale:')
for item in stationery:
  print(item)
#Write a loop that asks for and retrieves product prices. 
#Make sure to create a way to exit this loop.

print('\nIf at any point you would like to exit, enter "E".\n')

while True:
  item = input('What item do you want to check?')

  if item.lower() in stationery:
    print('The price of a(n) {} is ${:0.2f}\n'.format(item, stationery[item.lower()]))
  elif item.lower() == 'e':
    print('Program closing.')
    break
  else:
    print("Sorry, {} not found. Please try again.\n".format(item))