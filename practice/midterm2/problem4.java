static int sum(int n) {
	if(n == 1)
		return 1;
	else
		n = n + sum(n-1);
	return sum;
}