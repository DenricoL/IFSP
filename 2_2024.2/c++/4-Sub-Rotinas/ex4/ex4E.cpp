#include <iostream>
#include <cmath>

float soma (float a, float b, float c)
{
    float r = pow(a,2) + pow(a,2) + pow(a,2);
    return r; 
}

int main (void)
{
    float valor1, valor2, valor3;

    std::cout << "Digite o primeiro valor: ";
    std::cin >> valor1;
    std::cout << "Digite o segundo valor: ";
    std::cin >> valor2;
    std::cout << "Digite o terceiro valor: ";
    std::cin >> valor3;

    std::cout << "Soma dos quadrados dos valores: " << soma(valor1, valor2, valor3);

    return 0;
}