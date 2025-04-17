#include <iostream>

int main (void)
{
    int atual = 0, anterior = 1, proximo, i = 0;

    while (i <= 15)
    {
        std::cout << "Termo: " << i << ", valor: " << atual << std::endl;

        proximo = atual + anterior;
        anterior = atual;
        atual = proximo;
        ++i;
    }
    return 0;
}
