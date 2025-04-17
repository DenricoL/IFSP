#include <iostream>

int main (void)
{
    int ATUAL = 0, ANTERIOR = 1, PROXIMO;

    for (int i = 0; i <= 15; ++i)
    {
        std::cout << "Termo: " << i << ", valor: " << ATUAL << std::endl;

        PROXIMO = ATUAL + ANTERIOR;
        ANTERIOR = ATUAL;
        ATUAL = PROXIMO;
    }
    return 0;
}