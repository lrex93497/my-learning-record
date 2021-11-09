filepath = 'test.txt'

poem_file = open(filepath, 'r')
words_count = 0

for line in poem_file:
  lines = line.split()
  words_count += len(lines)

poem_file.close()

print("This file has {} words.".format(words_count))