temperature = float(input("What is the temperature today?"))
weather = input("Is is sunny, rainy or cloudy today?")

#conditional if-elif-else statement to check for different weather possibilities (e.g. cold or rainy -> stay in, hot and sunny -> beach)
if temperature <34 and temperature >10 and weather == "sunny":
  print("Perfect day for the beach!")

elif weather == "cloudy" and temperature <34 and temperature >10:
  print("Good gym room for gym!")

elif weather == "rainy" and temperature <34 and temperature >10:
  print("Go shopping and bring an umbrella.")

else:
  print("Stay in home.")