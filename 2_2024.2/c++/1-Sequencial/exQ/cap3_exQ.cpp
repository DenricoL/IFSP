//exercicio Q capitulo 3 - area circunferencia

#include <iostream>
#include <cmath>

using namespace std;

int main (void)
{
  float R, A;

  setlocale(LC_ALL, "Portuguese");

  cout <<"Digite o raio da circunfer�ncia: ";
  cin >> R;
  cin.ignore(80, '\n');

  A = 3.14159265 * pow(R,2);

  cout <<"�rea = " << A << endl;
  cout << endl;

  cout <<"Tecle <ENTER> para encerrar...";
  cin.get();
  return 0;
}
