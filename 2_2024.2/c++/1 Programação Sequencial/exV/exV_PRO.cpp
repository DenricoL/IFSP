//exV - estilo PRO

#include <iostream>
#include <cmath>

using std::cout;
using std::cin;
using std::endl;

int main (void)
{
  int e, p, b;

  setlocale(LC_ALL, "Portuguese");

  std::cout << "Insira a base da pot�ncia: ";
  std::cin >> b;
  cin.ignore(80, '\n');

  std::cout << "Insira o expoente da pot�ncia: ";
  std::cin >> e;
  cin.ignore(80, '\n');

  p = pow(b, e);

  std::cout <<"Resultado da pot�ncia = " << p << endl;
  std::cout << endl;
  std::cout <<"Tecle <ENTER> para encerrar...";
  cin.get();
  return 0;
}
