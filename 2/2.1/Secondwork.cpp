#include "Secondwork.h"

#include <iostream>
using namespace std;

person::person()
{
	cout << "Grandfather constructing" << endl;
}

person::~person()
{
	cout << "Grandfather destructing" << endl;
}

man::man()
{
	cout << "Father constructing" << endl;
}

man::~man()
{
	cout << "Father destructing" << endl;
}

teacher::teacher()
{
	cout << "Son constructing" << endl;
}

teacher::~teacher()
{
	cout << "Son destructing" << endl;
}
