#Test the Law Of Large Numbers for N random normally distributed numbers with mean = 0, stdev=1:
  
#Create an R script that will count how many of these numbers fall between -1 and 1 and divide by the total quantity of N

#You know that E(X) = 68.2%
#Check that Mean(Xn)->E(X) as you rerun your script while increasing N

#Hint:
#1. Initialize sample size
n<-100

#2. Initialize counter
  contador <-0
  resultado <-0
  
#3. loop for(i in rnorm(size))
for(i in 1:n)
{
  Norm <- rnorm(i, mean = 0, sd = 1)
  
#4. Check if the iterated variable falls
  
#5. Increase counter if the condition is true
  
#6. return a result <- counter / N
