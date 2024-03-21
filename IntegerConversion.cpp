//File name: IntegerConversion.cpp
#include <iostream>
#include <bitset>
#include <Windows.h>
using namespace std;

void format_ASCII( int b1);

int main()
{
	
	//declare variables 
	short int c;
	cout << "________ ASCII code for Integers_______"<< endl;
	cout << "Input a Integer: \n";
	cin >> c;

	// Call format ASCII function for a transaction
	format_ASCII(c);

	cin >> c;
	format_ASCII(c);

	return 0;
}

void format_ASCII(int b1)
{
	//data type of char b1
	cout << "_____________Datatype of Int_________" << endl;

	//display the storage size in byte(s) of a char
	cout << "The storage size in byte(s) of int " << b1 << " is " << sizeof(b1) << " byte(s)" << endl;

	//A bitset shortIntBits is a dataset that stores the bits of short int b1
	bitset<8 * sizeof(b1) >IntBits(b1);

	//Display the value in hexadecimal format
	cout << "The converted hexadecimal valueof the character is : 0x" << hex << (b1 & 0xff) << endl;

	//display the value on binary format
	cout << "The converted binary value of the charaxter is : " << IntBits << endl;

	//display the value in decimal format
	cout << "The converted decimal value of the character is: " << dec << b1 << endl;

	cout << "the minimum value of an int is: " << dec << INT_MIN << endl;
	cout << "The maximum value of an int is: " << dec << INT_MAX << endl;

}
