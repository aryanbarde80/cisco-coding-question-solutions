#include <iostream>
using namespace std;

int main() {
    char str[] = "Hello, world!";
    int length = 0;

    while (str[length] != '\0') {
        length++;
    }

    cout << "Length of the string is: " << length << endl;
    return 0;
}
