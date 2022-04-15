## Population growth model

Let's imagine some animal specie _X_.

The following rules were proven statistically for _X_:
- _X_ "creates" new _X_ every 7 days

Let's assume we defined population of _Xs_ like:
```
3,4,3,1,2
```
meaning populations has 5 individuals and the number represents reproduction "timer":
- every day timer goes down by 1
- when timer reaches 0 _new X_ is born
- _X_ timer switches to 6
- _new X_ initial "timer" is 8
```
3,4,3,1,2       <-- initial population
2,3,2,0,1       <-- day 1
1,2,1,6,0,8     <-- day 2
0,1,0,5,6,7,8   <-- day 3
```
### Let's predict day 15 population


