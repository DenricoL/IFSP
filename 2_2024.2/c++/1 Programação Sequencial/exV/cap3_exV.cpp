//ex V capitulo 3 - potencia de base e expoente lidas

#include <iostream>
#include <cmath>

using namespace std;

int main (void)
{
  int b, e, p;

  setlocale (LC_ALL, "Portuguese");

  cout <<"Insira a base da pot�ncia: ";
  cin >> b;
  cin.ignore(80, '\n');

  cout <<"Insira o expoente da pot�ncia: ";
  cin >> e;
  cin.ignore(80, '\n');

  p = pow(b, e);

  cout <<"Resultado da pot�ncia = " << p << endl;
  cout << endl;
  cout <<"Tecle <ENTER> para encerrar...";
  cin.get();
  return 0;
}
