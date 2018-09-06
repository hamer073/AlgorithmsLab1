Efficiency of algorithm in number of printed lines: n!=O(n!) by reflexivity of big-O. Also, for every increase by 1 in n, the number of permutations increases by a factor of n.

For n=10, runtime (on Multivac) is 22619 milliseconds. So, based on this and our big-O approximation, we can estimate runtime for n=15 and n=20 like so:
* timePerLine(n=10) := 22619/10! = 0.00623319003 ms
* runtime for n=15 is (15!)(timePerLine) = 8150982840 ms (approx 3 months)
* runtime for n=20 is (20!)(timePerLine) = 1.5164741e+16 ms (approx 47 millenia...)
