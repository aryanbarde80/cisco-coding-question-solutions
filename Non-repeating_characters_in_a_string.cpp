#include <iostream>
#include <unordered_map>
using namespace std;

void printNonRepeating(string str) {
    unordered_map<char, int> freq;

    // Count frequency of each character
    for (char ch : str) {
        freq[ch]++;
    }

    // Print characters with frequency 1
    cout << "Non-repeating characters: ";
    for (char ch : str) {
        if (freq[ch] == 1) {
            cout << ch << " ";
        }
    }
    cout << endl;
}

int main() {
    string input = "programming";
    printNonRepeating(input);
    return 0;
}
