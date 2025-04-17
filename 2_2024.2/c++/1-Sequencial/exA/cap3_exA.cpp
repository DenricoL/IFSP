//exercicio A, capitulo 3 - converter graus Celsius para Fahrenheint

#include <iostream>

using namespace std;

int main (void)
{
  float cel, faren;
  cout << "|Conversor de graus Celsius para Fahrenheint|" << endl << endl;

  cout << "Digite a temperatura em graus Celsius: "; cin >> cel;

  faren = cel * 9/5 + 32;

  cout << "Temperatura em graus Fahrenheint: " << faren;
  return 0;
}
