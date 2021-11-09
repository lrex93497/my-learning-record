a = [23,42,1,4,5]
b = [2,34,56,1,4,4,5]

print(a,b)

#Type your code here

if (a[0]==b[0] and a[-1]==b[-1]):
  print('Both lists start and end the same.')
elif (a[-1]==b[-1]):
  print('Both lists end the same.')
elif (a[0]==b[0]):
  print('Both lists start the same.') 
else:
  print('Both lists start and end differently.')