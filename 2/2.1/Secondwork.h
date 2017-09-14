#pragma once
#ifndef SECONDWORK_H
#define SECONDWORK_H

class person
{
	char *name;
	int age;

public:
	person();
	~person();
};

class man:public person
{	
	int sex;

public:
	man();
	~man();
};

class teacher :public man
{
	char *sebject;
public:
	teacher();
	~teacher();
};

#endif