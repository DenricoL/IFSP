#include <iostream>

float conversao (float f)
{
    float c = (f - 32)/1.8;
    return c;
}

int main (void)
{
    float f;

    std::cout << "Digite um valor em graus Fahrenheit: ";
    std::cin >> f;

    std::cout << "Valor em graus celsius: " << conversao(f);
    
    return 0;
}