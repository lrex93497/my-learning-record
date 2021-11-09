import pandas as pd

datafile = 'chopstick-effectiveness.csv'

df = pd.read_csv(datafile)

lenght_180 = df[df['Chopstick.Length']==180]
lenght_210 = df[df['Chopstick.Length']==210]
lenght_240 = df[df['Chopstick.Length']==240]
lenght_270 = df[df['Chopstick.Length']==270]
lenght_300 = df[df['Chopstick.Length']==300]
lenght_330 = df[df['Chopstick.Length']==330]

mean_180 = lenght_180['Food.Pinching.Efficiency'].mean()
mean_210 = lenght_210['Food.Pinching.Efficiency'].mean()
mean_240 = lenght_240['Food.Pinching.Efficiency'].mean()
mean_270 = lenght_270['Food.Pinching.Efficiency'].mean()
mean_300 = lenght_300['Food.Pinching.Efficiency'].mean()
mean_330 = lenght_330['Food.Pinching.Efficiency'].mean()

means_all = {mean_180:'180', mean_210:'210', mean_240:'240', mean_270:'270', mean_300:'300', mean_330:'330'}

print('According to the computed result, chopsticks at {}mm has the highest food pinching efficiency at {}, while {}mm has the lowest at {}.'.format(means_all.get(max(means_all)), max(means_all), means_all.get(min(means_all)), min(means_all)))
print('Thus, optimum chopstick length is {}mm'.format(means_all.get(max(means_all))))