// div por 4 e menor que 200

#include <iostream>
using namespace std;

int main (void)
{
  int I = 1, R;
  setlocale(LC_ALL, "Portuguese");
  cout <<"N�meros menores que 200 divis�veis por 4: " << endl;

  while (I < 200)
  {
    R = I - 4 * (I/4);
    if (R == 0)
      cout << I << endl;
    ++I;
  }
  return 0;
}
