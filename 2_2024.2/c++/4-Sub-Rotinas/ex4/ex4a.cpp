#include <iostream>

int somatorio (int n)
{
    int soma = 0;
    for(int i = 1; i <= n; ++i)
    {
        soma += i;
    }
    return soma;
}

int main(void)
{
    int n;
    std::cout << "Digite o limite do somatorio: ";
    std::cin >> n;
    std::cout << "Somatorio de 1 a " << n << ": " << somatorio(n);
    return 0;
}