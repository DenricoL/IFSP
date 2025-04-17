#include <iostream>

void potencia (int base, int exp)
{
    int resultado = 1;
    for(int i = 1; i <= exp; ++i)
    {
        resultado *= base;
    }
    std::cout << "Resultado: " << resultado;
}

int main (void)
{
    int n1, n2;
    std::cout << "- Calculadora de potencias -" << std::endl;
    std::cout << "Digite uma base: ";
    std::cin >> n1;
    std::cin.ignore(80, '\n');
    
    std::cout << "Digite um expoente: ";
    std::cin >> n2;
    std::cin.ignore(80, '\n');

    potencia(n1, n2);

    return 0;

}