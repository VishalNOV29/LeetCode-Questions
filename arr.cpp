#include <iostream>
#include "IntList"
using namespace std;
int main()
{
    cout << "Hello world";
    IntList list;
    list.push_front(15);
    list.push_back(28);
    list.push_front(30);
    list.push_front(2);
    list.push_back(45);
    list.push_front(38);
    list.push_back(25);
    list.pop_front();
    list.push_front(18);
    list.pop_front();
    list.pop_front();
    list.display();
    return 0;
}