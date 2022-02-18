# Pattern 1 
```
  #
  ##
  ###
  ####
  #####
  ######
  #######
  ```
  
As an Example, we will use 7 rows, 7 columns for this pattern.
There will be two loops.
One for the row and one for column.
```
for(let i=1; i<=7; i++)
   for (let j=1; j<=i; j++)
   document.write('#')
 document.write('</br>')  
```
The outer ``for loop with i variable`` is for the row.
The inner `` for loop with j variable`` is for the column.
After one row by row, the column is increasing proportionally with row.
That's why , `` j<=i ``

### Output in Console (code will be....)
```
for(let i='#'; i.length<8; i+='#')
   console.log('i')
```

Or 
```
for(let i=1; i<8; i++)
   console.log('#'.repeat(i));
```
