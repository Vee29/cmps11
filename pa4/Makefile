Roots: Roots.class
  echo Main-class: Roots > Manifest
  jar cvfm Roots Manifest Roots.class
  rm Manifest
  chmod u+x Roots
Roots: Roots.java
  javac -Xlint Roots.java
clean:
  rm -f Roots.class Roots
submit: Makefile Roots.java
  submit cmps011-pt.w16 pa4 Makefile Roots.java
