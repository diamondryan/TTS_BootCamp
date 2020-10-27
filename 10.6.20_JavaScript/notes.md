variables should be written in camel case
- thisIsCamelCase

; signifies end of line

var x = 1;
var y = 2;
var z = true;
console.log(x)

String - character and numbers in quotes
- "Hello World"

Number- Actual numbers
- 1
- 10
- 1000

boolean - true or false

/* used
for
multiline
comment*/

var z = 1;
console.log("Line 31" + z);
z = 'abc' //changes values to 'abc'
console.log(z);

new convention for delcaring variables
let z = 1;
const z = 1; sets a value and it can't change

coersion

- implicit - implied type change by the computer
7 + 7 + 7 = 21
7 + 7 +"7"= 147
"7" + 7 + 7= 777

- explicit - type change determined by the programmer

Null- assignment value, representation of "nothing"
- var a = null;

Undefined- variable hasn't been assigned a value, "it's of no use to you"
- var b;
	
// foo does not exist, it is not defined and has never been initialized:
foo; // "ReferenceError: foo is not defined"
 
// foo is known to exist now but it has no type or value:
let foo = null; 
foo// "null"

FLOW CONTROL

IF STATEMENTS-
- run off boolean (true or false)

if(true){
    run this code
}

if(false){
    don't run this code
}

if(x>5){
console.log("x>5")
}

//Simple if statement
let x = true;
if(x) {
	console.log(true);
} else if (x == true) {
	console.log("this won't run");
} else {
	console.log(false);
}

COMPARISON OPERATORS
<	Less than
>	Greater than
<=	Less than or equal
>=	Greater than or equal
==	Loose equality (only compare values)
===	Strict equality (value AND type)
!=	Values do not equal
!==	Same type, but values not equal

compares value on left to value on right
let temp = 60;

if (temp > 45) {
    console.log("I'm going hiking!");
} else {
    console.log("It's too cold to go hiking);
}

- EXAMPLE:
var cups = 5;

if (cups < 3){
    console.log("Yes, I'll take another cup of coffee");
} else {
    console.log("I think I'm okay for now");
}

- LOOSE EQUALITY
var x = 10;
//Type coersion is happening here!
if(x == '10') {
	console.log("equals string 10"); //true
}

if(x === '10') {
	console.log("equals string 10"); //false
}

Truthy and Falsey-
Everything is true, except for Only falsey values: false, 0, null or undefined evaluate to false

COMBINING CONDITIONALS
true && true 	// true
true && false 	// false
false && true 	// false
false && false 	// false

*as long as 1 of strings are true, it will be true
true || true 	// true
true || false 	// true
false || true 	// true
false || false 	// false

if(5+10=15 && true || false && 11-6==6 || "dog" && 5){
    console.log("I ran")
}
I ran

Short circuit Evaluation
-As soon as the interpreter knows that a statement will evaluate to true or false, the rest of the statement is not executed.

Challenge 2
1. var temp= 80
2. console.log("The temerature is "+ temp +" degrees);
3. if(temp>80){
    console.log("Time to swim");
}
4. var precipitation= false
5. if(temp>80 && !precipitation){
    console.log("Time to swim");
}
6. var precipitation= raining
if(!precipitation){
    console.log("Time to swim)
}
7. var indoors= true
8. if(indoors){
    console.log("Time to swim");
}

example:
let temp = 85;
let precipitation = false;
let indoors = true;

console.log("The temperature is " + temp + " degrees");

if (temp > 80 && precipitation === false) {
  console.log("time to swim!");
} else if (indoors) {
  console.log("time to swim!");
}

ITERATION: For Loop
for (let i = 0; i <= 9; i++) {
    console.log( i );
}

Challenge 3: 99 Bottles
for (let bottle= 99; bottle>=0; bottle--) {
    if(bottle === 0){
        console.log("Hey more booze please");
    } else {
    console.log(i + "bottles of beer on the wall");
}

WHILE LOOP