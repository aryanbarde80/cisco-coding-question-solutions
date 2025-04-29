#include <iostream>
#include <stack>
using namespace std;

string removeBrackets(string expr) {
    stack<char> signStack;
    signStack.push('+'); // Assume overall expression starts with '+'
    string result = "";
    char currentSign = '+';

    for (int i = 0; i < expr.length(); i++) {
        if (expr[i] == '+' || expr[i] == '-') {
            currentSign = expr[i];
        } else if (expr[i] == '(') {
            if (currentSign == '-') {
                signStack.push(signStack.top() == '+' ? '-' : '+');
            } else {
                signStack.push(signStack.top());
            }
        } else if (expr[i] == ')') {
            signStack.pop();
        } else if (isalpha(expr[i])) {
            if (currentSign == '-') {
                result += (signStack.top() == '+' ? '-' : '+');
            } else {
                result += signStack.top();
            }
            result += expr[i];
        }
    }
    return result;
}

int main() {
    string expr = "a-(b+c-d)+e";
    string simplified = removeBrackets(expr);
    cout << "Simplified Expression: " << simplified << endl;
    return 0;
}
