#include <iostream>
#include <math.h>

int main() {
    double angulo {};
    std::cout << std::sin(angulo);
    std::cin >> angulo;
    double valorAproximado {
        (angulo*4*(180-angulo))
        /
        (40500-angulo*(180-angulo))
    };
    std::cout << "Valor aproximado do seno: " << valorAproximado;
}