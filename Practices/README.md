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
### Second Practice
```R
? rnorm ()
n <- 100
rnorm ( n , media  =  0 , sd  =  1 )

?C()
c ( 1 , 1 : 100 )

? seq ()
seq ( 30 , 3 , longitud.out  =  12 )
seq ( 3 , 30 , por  =  3 )

?reps()
representante ( 1 : 10 , 5 )
rep ( 1 : 4 , cada uno  =  40 )   
rep ( 1 : 4 , cada uno  =  2 , veces  =  2 )

?impresión()
t1  <- c ( 1 : 10 )
t2  <- seq ( 3 , 30 , por = 3 )
imprimir ( t1 + t2 )
imprimir ( t1 * t2 )
print (tabla ( t1 , t2 ), zero.print  =  " X " )

? is.numeric ()
is.numeric ( t1 )
is.numeric ( " -.1 2.7 B " )
as.numeric ( t1 )

? is.integer ()
x  <-  pi  * c ( 1 : 10 )
as.integer ( x )


? is.double ()
n <- 5
fibonnaci  <- (((((( 1 + sqrt ( 5 )) / 2 ) ^ n ) - (((( 1 - sqrt ( 5 )) / 2 ) ^ n ))) / sqrt ( 5 ))
is.double ( fibonnaci )

? is.character ()
Karen  <-  N  ~  o  +  h  +  e  ~  m  ~  i
como.carácter ( Karen )
is.character ( Karen )

?tipo de()
David  <-  D ~  A  +  V  +  I  + D 
typeof ( David )

? sqrt ()
a <- 10
b <- 24
c <- 3
fibonnaci  <- (((((( 1 + sqrt ( 5 )) / 2 ) ^ n ) - (((( 1 - sqrt ( 5 )) / 2 ) ^ n ))) / sqrt ( 5 ))
y <-  - b + sqrt ( b ^ 2 - ( 4 ( a * c ))) / 2 * a


# Practique encontrar 20 funciones más en R y haga un ejemplo de ello.
```
#1
>Functions to get or set the names of an object.

?names()

x <- c(2,4,6)  #Assign 3 values to the variable x
names(x) <- c("I","II","III")  # Assigns names to the previous 3 values
x

#2
> cat() # This function writes text and variables in the output.

x <- 2
y <- 4
cat(x,"elevado a",y,"es",x ^ y,"\n")

#3
>invisible () #Hide x in the return function so that the result is not visible.

suma <- function(a, b) {
  s <- a + b
  return(invisible(s))
}
suma(5,4)

#4
> length () # Shows the number of elements in a vector

x <- 1:20 # The numbers from 1 to 20 are saved in x
length (x) # Number of elements of x

#5
> trunc () # Remove decimals from a number

trunc (1.999999)

#6
>ceiling takes a single numeric argument x and returns a numeric vector containing the smallest integers not less than the corresponding elements of x.

round (x, decimals = 0) # Round a number with decimals

round (6.78) # By not indicating decimals the result is an approximate integer

round (6.78.1) # It is rounded with a decimal

#7
>sum returns the sum of all the values present in its argument
>
sum (x) #Add all the elements of a vector x

x <- runif (100,1,10) # 100 random numbers are generated between 1 and 10 and saved in the variable x
sum (x) # Sum of the 100 random numbers

#8
edad <- function() {
  r <- readline("Escribe tu edad : ")
  r <- as.integer(r)  # Convierte r en un entero. Si se desean decimales usar as.double()
  rmas1 <- r + 1
  cat("Dentro de un año tendrás",rmas1,"años\n")
  return(invisible(rmas1))
}

edad()

#9
> any () #Returns T if any element meets the condition Example:

x <- runif (10, -10, 100) # 10 random numbers between -10 and 100 are generated
if (any (x <0)) cat ("In x there are negative numbers \ n") # If any numbers of x are negative

#10 
> coef() #Coef is a generic function which extracts model coefficients from objects returned by modeling functions.

x <- 1:5; coef(lm(c(1:3, 7, 6) ~ x))

#11
hist(rnorm(200)) # Generate a histogram of the 200 random numbers with normal distribution

#12
> Returns the (regular or parallel) maxima and minima of the input values.
? min ()
m  <- runif ( 100 , 1 , 10 )
min ( m )

#13
> Returns the (regular or parallel) maxima and minima of the input values.
? max ()
max ( m )

#14
> Applies linear filtering to a univariate time series or to each series separately of a multivariate time series.
?filter()
x  <-  1 : 100
filter ( x , rep ( 1 , 5 ))

#15
> var, cov and cor compute the variance of x and the covariance or correlation of x and y if these are vectors. If x and y are matrices then the covariances (or correlations) between the columns of x and the columns of y are computed.
? cor ()
cor ( 1 : 10 , 2 : 11 )

#16
> Plot time series against lagged versions of themselves. Helps visualizing ‘auto-dependence’ even when auto-correlations vanish.

? lag.plot ()
lag.plot ( freeny.x , lags  =  3 )

#18
> Density, distribution function, quantile function and random generation for the Cauchy distribution with location parameter location and scale parameter scale.
? rcauchy ()
rcauchy ( n , ubicación  =  0 , escala  =  1 )

#19
> Subsets of x[] are averaged, where each subset consist of those observations with the same factor levels.

?ave()
ave ( 1 : 4 )

#20
> var, cov and cor compute the variance of x and the covariance or correlation of x and y if these are vectors. If x and y are matrices then the covariances (or correlations) between the columns of x and the columns of y are computed.

? cor ()
cor ( 1 : 10 , 2 : 11 )

#21
f  <-  función ( x , a ) ( x  -  b ) ^ 2
xmin  <- optimize ( f , c ( 0 , 1 ), tol  =  0,0001 , un  =  1 / 3 )

### Third Practice

Scenario: You are a Data Scientist working for a consulting firm. One of your colleagues from the Auditing Department has asked you to help them assess the financial statement of organization X.

You have been supplied with two vector of data: mounthly revenue and expenses for the financial year in quiestion. Your task is to calculate the following financial matrics:

- profit for each mounth
- profit after tax for each month (the tax rate is 30%)
- profit margin for each month - equal to profit after tax divided by revenue
- good months - where the profit after tax was greater than the mean for the year
- bad months - where the profit after tax was less then the mean for years
- the best month - where the profit after tax was max for the year
- the worst month - where the profit after tax was min for the year

All results need to be presented as vectors.

Results for dollar values need to be calculate with $0.01 precision, but need to be presented in Units of $1,000(i.e. 1k) with no decimal point.

Results for the profit margin ratio needed to be presented in units of % with no decimal points.

Note: Your collegue has warned you that it is okay for tax for any given month to be negative (in accounting terms, negative tax translates into a deferred tax asset).

```
Hint 1
Use:
round()
mean()
max ()
min ()
```
```
#Data
ingresos <- c (14574.49, 7606.46, 8611.41, 9175.41, 8058.65, 8105.44, 11496.28, 9766.09, 10305.32, 14379.96, 10713.97, 15433.50)
gastos <- c (12051.82, 5695.07, 12319.20, 12089.72, 8658.57, 840.20, 3285.73, 5821.12, 6976.93, 16618.61, 10054.37, 3803.96)

#Solution
profit <-ingresos -gastos
profit

# Calculate the tax as 30% of the profit and round to 2 decimal points
tax <- round(0.30 * profit, 2)
tax


# Calculate remaining earnings after deducting taxes
profit.after.tax <- profit - tax
profit.after.tax

# Calculate profit margin as profit after income taxes
# Rounded to 2 decimal points, then multiply by 100 to get%
#
profit.margin <- round(profit.after.tax/ingresos, 2) * 100
profit.margin

# Calculate the average after-tax benefit for the 12 months
mean_pat <- mean(profit.after.tax)
mean_pat

#Find the months with higher than average earnings after taxes
good.months <- max(profit, mean_pat)
good.months
# Bad months are the opposite of good months!
bad.months <-  min(profit, mean_pat)
bad.months

# 8 The Best Month Is Where Profit After Tax Was Equal To The Maximum
best.month <- profit.after.tax == max(profit.after.tax)
best.month

# 9 The Worst Month Is Where Profit After Tax Was Equal To The Minimum
worst.month <- profit.after.tax == min(profit.after.tax)
worst.month

# 10 Convert All Calculations To Units Of One Thousand Dollars
revenue.1000 <- round(revenue / 1000, 0)
expenses.1000 <- round(expenses/ 1000, 0)
profit.1000 <- round(profit/1000,0)
profit.after.tax.1000 <- round(profit.after.tax/1000, 0)
```
### Fourth Practice

You have been supplied data for two more additional in-game statistics:
* Free Throws
* Free Throws Attempts
```R
#Seasons
Seasons <- c("2005","2006","2007","2008","2009","2010","2011","2012","2013","2014")

#Players
Players <- c("KobeBryant","JoeJohnson","LeBronJames","CarmeloAnthony","DwightHoward","ChrisBosh","ChrisPaul","KevinDurant","DerrickRose","DwayneWade")

#Free Throws
KobeBryant_FT <- c(696,667,623,483,439,483,381,525,18,196)
JoeJohnson_FT <- c(261,235,316,299,220,195,158,132,159,141)
LeBronJames_FT <- c(601,489,549,594,593,503,387,403,439,375)
CarmeloAnthony_FT <- c(573,459,464,371,508,507,295,425,459,189)
DwightHoward_FT <- c(356,390,529,504,483,546,281,355,349,143)
ChrisBosh_FT <- c(474,463,472,504,470,384,229,241,223,179)
ChrisPaul_FT <- c(394,292,332,455,161,337,260,286,295,289)
KevinDurant_FT <- c(209,209,391,452,756,594,431,679,703,146)
DerrickRose_FT <- c(146,146,146,197,259,476,194,0,27,152)
DwayneWade_FT <- c(629,432,354,590,534,494,235,308,189,284)

#Free Throw Attempts
KobeBryant_FTA <- c(819,768,742,564,541,583,451,626,21,241)
JoeJohnson_FTA <- c(330,314,379,362,269,243,186,161,195,176)
LeBronJames_FTA <- c(814,701,771,762,773,663,502,535,585,528)
CarmeloAnthony_FTA <- c(709,568,590,468,612,605,367,512,541,237)
DwightHoward_FTA <- c(598,666,897,849,816,916,572,721,638,271)
ChrisBosh_FTA <- c(581,590,559,617,590,471,279,302,272,232)
ChrisPaul_FTA <- c(465,357,390,524,190,384,302,323,345,321)
KevinDurant_FTA <- c(256,256,448,524,840,675,501,750,805,171)
DerrickRose_FTA <- c(205,205,205,250,338,555,239,0,32,187)
DwayneWade_FTA <- c(803,535,467,771,702,652,297,425,258,370)

#Matrix
# *** You have been provided data for two additional in-game stats:
#**Free shots
# Link the given vectors to form the matrix
FreeThrows  <-  rbind(KobeBryant_FT, JoeJohnson_FT, LeBronJames_FT, CarmeloAnthony_FT, DwightHoward_FT, ChrisBosh_FT, ChrisPaul_FT, KevinDurant_FT, DerrickRose_FT, DwayneWade_FT)
#Delete vectors: we don't need them anymore
rm( KobeBryant_FT, JoeJohnson_FT, CarmeloAnthony_FT, DwightHoward_FT, ChrisBosh_FT, LeBronJames_FT, ChrisPaul_FT, DerrickRose_FT, DwayneWade_FT, KevinDurant_FT)
# Rename the columns
colnames(FreeThrows) <-  Seasons
# Rename the rows
rownames(FreeThrows) <-  Players

#Check the matrix
FreeThrows


# * Free throw attempts
# Matrix for free kick attempts
# Link the given vectors to form the matrix
FreeThrowAttempts  <-  rbind(KobeBryant_FTA, JoeJohnson_FTA, LeBronJames_FTA, CarmeloAnthony_FTA , DwightHoward_FTA , ChrisBosh_FTA , ChrisPaul_FTA , KevinDurant_FTA , DerrickRose_FTA , DwayneWade_FTA )
# Delete vectors: we don't need them anymore
rm( KobeBryant_FTA , JoeJohnson_FTA , CarmeloAnthony_FTA , DwightHoward_FTA , ChrisBosh_FTA , LeBronJames_FTA , ChrisPaul_FTA , DerrickRose_FTA , DwayneWade_FTA , KevinDurant_FTA )
    
# Rename the columns
colnames (FreeThrowAttempts) <- Seasons
# Rename the rows
rownames (FreeThrowAttempts) <- Players
# Check the matrix
FreeThrowAttempts


# You must create three paths that show the following ideas:
# View the new matrices
    
FreeThrows
rownames(FreeThrows)
colnames(FreeThrows)

FreeThrowAttempts
rownames(FreeThrowAttempts)
colnames(FreeThrowAttempts)
 
- Free launch attempts per game
- Part 1 - Free Launch Attempts Per Game
- (You will need the Games matrix)
#Games 
KobeBryant_G <- c(80,77,82,82,73,82,58,78,6,35)
JoeJohnson_G <- c(82,57,82,79,76,72,60,72,79,80)
LeBronJames_G <- c(79,78,75,81,76,79,62,76,77,69)
CarmeloAnthony_G <- c(80,65,77,66,69,77,55,67,77,40)
DwightHoward_G <- c(82,82,82,79,82,78,54,76,71,41)
ChrisBosh_G <- c(70,69,67,77,70,77,57,74,79,44)
ChrisPaul_G <- c(78,64,80,78,45,80,60,70,62,82)
KevinDurant_G <- c(35,35,80,74,82,78,66,81,81,27)
DerrickRose_G <- c(40,40,40,81,78,81,39,0,10,51)
DwayneWade_G <- c(75,51,51,79,77,76,49,69,54,62)
    
#Matrix
Games <- rbind(KobeBryant_G, JoeJohnson_G, LeBronJames_G, CarmeloAnthony_G, DwightHoward_G, ChrisBosh_G, ChrisPaul_G, KevinDurant_G, DerrickRose_G, DwayneWade_G)
rm(KobeBryant_G, JoeJohnson_G, CarmeloAnthony_G, DwightHoward_G, ChrisBosh_G, LeBronJames_G, ChrisPaul_G, DerrickRose_G, DwayneWade_G, KevinDurant_G)
      
colnames(Games) <- Seasons
rownames(Games) <- Players
myplot(FreeThrowAttempts / Games)

# Notice how Chris Paul gets few tries per game
# Re-create the plot function
                   
myplot <- function(z, who=1:10) {
  matplot(t(z[who,,drop=F]), type="b", pch=15:18, col=c(1:4,6), main="Basketball Players Analysis")
  legend("bottomleft", inset=0.01, legend=Players[who], col=c(1:4,6), pch=15:18, horiz=F)
}
```
#### 
- Free throw accuracy
- Part 2 - Free Kick Accuracy myplot (FieldGoalAttempts / Games)
-And yet Chris Paul's accuracy is one of the highest
- Your team is likely to get more points if it had more TLC
- Also note that Dwight Howard's FT accuracy is extremely poor
- compared to other players. If you remember, Dwight Howard's
- The accuracy of the field objective was exceptional:
- myplot (FieldGoals / FieldGoalAttempts)
- How can this be? Why is there such a drastic difference?
- We will see now ...

- Player style of play (2 vs. 3 point preference) excluding free throws
- Part 3 - Player style patterns excluding free throws
myplot ((FieldGoalAttempts - FreeThrows) / Games)
- Because we have excluded free kicks, this plot now shows us
- the true representation of the player's change in style. We can verify
- that this is the case because all brands without exception
- in this graph are between 2 and 3. This is due to field goals
- can only be for 2 points or for 3 points.
- Insights:
- 1. You can see how players prefer 2 or 3 point shots
- changes throughout your career. We can see that almost all
- players in this dataset who experiment with their style throughout
- their careers. Perhaps the most drastic change in style has
- experienced by Joe Johnson.
- 2. There is an exception. You can see that a player does not have
- change his style, he almost always scores only 2 points.
- Who is this mystert player? It's Dwight Howard!
- Now that explains a lot. The reason why Dwight Howard's
- The accuracy of the field target is so good because almost always
- scores only 2 points. That means it may be close to the basket
- or even contact him. Free kicks, on the other hand affected
- the player must be 15 feet (4.57m) from the ring. That's
- probably why Dwight Howard's free kick accuracy is poor.
- Each free throw is worth 1 point
- The data has been supplied in vector form. You will have to create
- two matrices before proceeding with the analysis.

### Fifth-Practice
```
#Filter countries by Low income
stats[stats$Income.Group=="Low income",]

#Filter countries by Lower middle income
stats[stats$Income.Group=="Lower middle income",]

#Filter countries by Upper middle income
stats[stats$Income.Group=="Upper middle income",]

#Filter by countrie Malta
stats[stats$Country.Name=="Malta",]

#Filter by countrie Qatar
stats[stats$Country.Name== "Qatar",]

#Filter by countrie Netherlands
stats[stats$Country.Name== "Netherlands",]

#Filter by countrie Norway
stats[stats$Country.Name== "Norway",]
```

