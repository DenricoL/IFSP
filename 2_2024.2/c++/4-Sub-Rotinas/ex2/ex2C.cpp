//procedimento FIBONACCI
#include <iostream>

void fibonacci(int n)
{
    int anterior, proximo, atual = 1;

    std::cout << "Sequencia de Fibonacci ate " << n << ": " << std::endl;
    for(int i = 0; i < n; ++i)
    {
        if(i == n - 1)
        {
            std::cout << atual << ".";
        }
        else
        {
            std::cout << atual << ", ";
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;
        }
    }
}

int main (void)
{
    int n;
    std::cout << "Entre o numero de termos da sequencia: ";
    std::cin >> n;

    fibonacci(n);

    return 0;
}