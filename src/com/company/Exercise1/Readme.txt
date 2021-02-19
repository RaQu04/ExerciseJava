a) Implement the function int convert(string s) and a helper function int ABS(char ch). The
task of this function is to sum ABS of the upper case letters and divide it by the sum of ABS
of the lower case letters. The function needs to work with ANY input. The result should be
rounded according to math rules ex. 2.4 is 2, 2.5 is 3. If for some reason the result cannot be
calculated the function should return −1.
Definitions:
ASCII charset Char codes (chc): chc(A) = 65 chc(a) = 97
ABS(chr) = chc(chr) - chc(A) for upper case ABS(chr) = chr(chr) - chc(a) for lower case
Examples:

1 ABS( ’A’ ) = 0

2 ABS( ’ b ’ ) = 1

3 conve r t ( ”AcCb” ) = (ABS( ’A’ ) + ABS( ’C’ ) ) / (ABS( ’ c ’ ) + ABS( ’ b ’ ) ) = 1

4 conve r t ( ”BAcAb” ) = 0
