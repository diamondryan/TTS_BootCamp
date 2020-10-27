int- Integer (int) is generally used as the default data type for whole number values. Example int total = 45, where total is the variable and the whole number 45 is the value.
int total = 45;
memory size: 4 bytes
values: -2147483648 to 2147483647

double- Double is generally used as the default data type for non-whole numbers (decimals).Example double tax = 10.33, where  tax is the variable and the decimal 10.33 is the value.
double price = 10.33;
memory size: 8 bytes
values: 5.0e^-324 to 1.8e^308

boolean- This data type is used for simple flags that track true/false conditions and only has two possible values: true or false
boolean tOrF = false'
memory size: 1 bit
values: true or false

char- Char data type is used to store any character - numbers, letter, punctuation, etc.
char letter = 'C';
memory size: 2 bytes
values: \uOOOO to \uFFFF

byte-
memory size: 1 byte
values: -128 to 128

short-
memory size: 2 bytes
values: -32768 to 32767

long-
memory size: 8 bytes
values: -2^63 to 2^63-1

float-
memory size: 4 bytes
values: 1.4e^-45 to 3.4e^38

INT & FLOAT

Integer + (or) - (or) * Integer = Integer
Integer / Integer = Integer
(even if not divisible)

Float + (or) - (or) * Float = Float
Float / Float = Float
(if divisible, #.0, so still a Float)

Integer + (or) - (or) * Float = Float
Integer / Float = Float
Float / Integer = Float

CASES
known as camel case, first word  lower case and subsequent words capitalized
int currentScoreOfGame;

known as Pascal case, first letter of each word capitalized
int FinalScoreOfGame;

leading underscore sometimes used for short-lived or special purpose names
int _membersOutOfTown;

Not used often in Java, more often in JavaScript to denote a variable tied to an event
int $amountOfBill;

All Caps with an underscore between words is a common convention for constant values
double TAX_RATE= 7.0;
