#include <iostream>
#include <unordered_map>
using namespace std;

bool areAnagrams(string str1, string str2) {
    if (str1.length() != str2.length())
        return false;

    unordered_map<char, int> count;

    for (char c : str1) count[c]++;
    for (char c : str2) count[c]--;

    for (auto pair : count) {
        if (pair.second != 0)
            return false;
    }

    return true;
}

int main() {
    string s1 = "listen", s2 = "silent";

    if (areAnagrams(s1, s2))
        cout << "Anagram" << endl;
    else
        cout << "Not an Anagram" << endl;

    return 0;
}
