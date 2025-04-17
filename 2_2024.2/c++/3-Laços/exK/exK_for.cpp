#include <iostream>

int main (void)
{
    int atual = 1, anterior = 1, proximo, s = 0;

    for (int i = 1; i <= 64; ++i)
    {
        s += atual;
        std::cout << "Quadro: " << i << ", graos: " << atual << std::endl;

        proximo = anterior * 2;
        anterior = atual;
        atual = proximo;
    }

    std::cout << std::endl;
    std::cout << "Somatorio: " << s;
    
}