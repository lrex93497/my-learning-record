filepath = 'test.txt'

poem_file = open(filepath, 'r')

lines = poem_file.readlines()
lines_count = len(lines)

poem_file.close()

print("This file has {} lines.".format(lines_count))