/* Sphere.c
 * lab7
 * Prints out volume and surface area of a sphere */
#include<stdio.h>
#include<math.h>

int main() {
  const double pi = 3.141592654;
  double r, sa, v;
  
  printf("Ender the radius of the sphere");
  scanf(" %lf", &r);
  v = (4.0/3.0)*pi*pow(r, 3);
  sa = (4.0)*pi*pow(r, 2);
  printf("The volume is %lf ", v);
  printf("and the surface area is %lf\n", sa);
  return 0;
}
