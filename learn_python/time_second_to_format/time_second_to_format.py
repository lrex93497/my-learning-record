def convert_seconds(seconds):

  hours = seconds // 3600
  minutes = seconds % 3600 // 60
  seconds = seconds % 3600 % 60

  return "{:02d}:{:02d}:{:02d}".format(hours, minutes, seconds)

#-------------------------------------------------------
my_time = 51234 
print("Result of {} seconds: ".format(my_time))
print(convert_seconds(my_time))