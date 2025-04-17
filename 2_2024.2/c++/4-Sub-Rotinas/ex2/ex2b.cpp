#include <iostream>

using namespace std;

void somatorio(int n)
{
    int soma = 0;

    for (int i = 1; i <= n; ++i)
    {
        soma += i;
    }

    cout << soma;
}

int main(void)
{
    int n;
    cin >> n;
    somatorio(n);
    return 0;
}
