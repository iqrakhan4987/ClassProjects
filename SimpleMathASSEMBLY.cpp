// Using in-line assembly code to add and subtract two numbers 

#include <iostream>
#include <Windows.h> //to use the date & time
using namespace std;


int main(void)
{
	// declare your variables
	short int x, y, sum, diff;

	//A. Find the sum and difference of two integers 
	cout << "Enter two integers from a keyboard \n";
	cin >> x >> y;

	_asm
	{
		MOV AX, x; //move x into EAX;
		MOV BX, y; //move y into EBX;
		MOV CX, AX;
		ADD CX, BX; //add EBX to ECX
		MOV sum, CX;
	}

	_asm
	{
		MOV AX, x; //move x into EAX;
		MOV BX, y; //move y into EBX;
		MOV CX, AX;
		SUB CX, BX; //add EBX to ECX
		MOV diff, CX;
	}

	//sum = x + y;
	//diff = x - y;
	cout << "Addition result = " << sum << endl;
	cout << "Subtraction = " << diff;


	return 0;
}
