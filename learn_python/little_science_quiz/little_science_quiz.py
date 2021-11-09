import time

questions = [ 'Na is the atomic symbol of which element? >>' , 'K is the atomic symbol of which element? >>' , 'How many stable isotope(s) do iron have? >>' , 'What is short name of deoxyribonucleic acid? >>' , 'What visible light color has the lowest frequency? >>' ]
ans = [ 'sodium' , 'potassium' , '4' , 'dna' , 'red' ]
q_no = -1
q_true = 0

print('Welcome to the little Science quiz.\n')
tstart = time.time()

for q in questions:
  q_no += 1
  print('Q{}. {}'.format(q_no+1,q))
  ans_in = input()
  if(ans_in.lower() == ans[q_no]):
    print('Correct!')
    q_true += 1
  else:
    print('Incorrect!')
  print('\n')

tend = time.time()
score = int(q_true) *100 // int(len(questions))

print('\n***Quiz Completed***')
print('Correct Answers: {}/{}'.format( q_true, len(questions)))
print('Elapsed time: {} seconds'.format(tend - tstart))
print('Score: {}'.format(score))