class Rational {
	// Fields
	int numerator, denominator;

	Rational(int n, int d) {
		if(d==0)
			throw new RuntimeException("zero denominator");
		numerator = n; denominator = d;
	}

	Rational plus(Rational Q) {
		return new Rational(this.numerator+Q.numerator, this.denominator+Q.denominator);
	}

	Rational times(Rational Q) {
      double a = Q.numerator;
      double b = Q.denominator;
      double c = this.numerator;
      double d = this.denominator;
      double i = (a*c-d*b);
      double j = (a*d+b*c);
      return new Rational(i, j);
   	}

	Rational String toString() {
      double d = denominator;
      double n = numerator;
      if ( d > 0 && n > 0)
        return n+"+"+d+"i";
      else if (d == 0 && n > 0)
        return n+" ";
      else if (d < 0 && n > 0)
        return +n+"-"+(-d)+"i";         
      else if ( d > 0 && n < 0)
        return n+"+"+d+"i";
      else if (d == 0 && n < 0)
        return n+" ";
      else if (d < 0 && n < 0)
        return +n+"-"+(-d)+"i";
      return +d+"i";
	}

	public boolean equals(Object x) {
		Rational k = (Rational) x;
		return (this.numerator==k.numerator && this.denominator==k.denominator);
	}
}