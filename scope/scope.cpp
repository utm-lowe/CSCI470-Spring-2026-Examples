#include <iostream>

using namespace std;

int main() 
{
    int x = 5;

    if(x == 5) {
        int x = 7;
        int y = 10;
        cout << "Inner x: " << x << endl;
        cout << "Inner y: " << y << endl;
    }

    cout << "Outer x: " << x << endl;
    cout << "Outer y: " << y << endl;
}