#Practice
#Filter countries by Low income
filter <-stats$Income.Group == "Low income"
stats[filter,]
stats[filter,"Country.Name"]
#Filter countries by Lower middle income
filter <-stats$Income.Group == "middle income"
stats[filter,"Country.Name"]
stats[stats$Income.Group == "middle income","Country.Name"]

#Filter countries by Low income
stats[stats$Income.Group == "Low income","Country.Name"]
