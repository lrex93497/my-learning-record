name1 = input("What is the first person name?")
age1 = int(input("What is the first person age?"))
name2 = input("What is the second person name?")
age2 = int(input("What is the second person age?"))

# find the difference and compare the ages
if age1==age2:
  print("{} and {} are in same age.".format(name1, name2))

elif age1>age2:
  different = age1-age2
  print("{} is older than {} by {} year(s)".format(name1, name2, different))

else :

  different = age2-age1
  print("{} is older than {} by {} year(s)".format(name2, name1, different))
