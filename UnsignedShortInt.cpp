//Unsigned short int converted to other datat types ( hexadecimal, bianry)
#include <iostream>
#include <bitset>
#include <Windows.h>
using namespace std;

void format_ASCII(unsigned short int b1);

int main ()
{

	//declare variables 
	unsigned short int c1;
	unsigned short int uc1;
	for (int x = 1; x <= 4; x++) {
		cout << "Input a Unsigned Short Integer: \n";
		cin >> c1;

		// Call format ASCII function for a transaction

		format_ASCII(c1);

		cin >> c1;
		format_ASCII(c1);

	}

	return 0;
}

void format_ASCII(unsigned short int b1)
{
	//data type of char b1
	cout << "_____________Datatype of Short Int_________" << endl;

	//display the storage size in byte(s) of a char
	cout << "The storage size in byte(s) of short int " << b1 << " is " << sizeof(b1) << " byte(s)" << endl;

	//A bitset shortIntBits is a dataset that stores the bits of short int b1
	bitset<8 * sizeof(b1) >ShortIntBits(b1);

	//Display the value in hexadecimal format
	cout << "The converted hexadecimal value of the unsigned short int is : 0x" << hex << (b1 & 0xff) << endl;

	//display the value on binary format
	cout << "The converted binary value of the unsigned short int is : " << ShortIntBits << endl;

	//display the value in decimal format
	cout << "The converted decimal value of the short int is: " << dec << b1 << endl;


	cout << "The maximum value of a unsigned short int is: " << dec << USHRT_MAX << endl;

}
