# Mineria-de-datos



## Index
- [First Practice (Nomral Distribition)](#first-practice)
- [Second Practice (20 Functions in R)](#second-practice)
- [Third Practice (Financial Statement)](#third-practice)
- [Fourth Practice (Basketball Data)](#fourth-practice)
- [Fifth Practice (Filters)](#fifth-practice)



### First Practice
```
#Test the Law Of Large Numbers for N random normally distributed numbers with mean = 0, stdev=1:

#Create an R script that will count how many of these numbers fall between -1 and 1 and divide by the total quantity of N

#You know that E(X) = 68.2%
#Check that Mean(Xn)->E(X) as you rerun your script while increasing N

#Hint:
#1. Initialize sample size
n<-10000

#2. Initialize counter
contador <-0
resultado <-0

#3. loop for(i in rnorm(size))
for(i in 1:n)
{
  Norm <- rnorm(i, mean = 0, sd = 1)
 
  #4. Check if the iterated variable falls
  if(Norm >=-1 && Norm  <=1){
    #5. Increase the counter if the condition is true
    contador<- contador+1
    
  }
}
```
