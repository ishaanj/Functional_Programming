def sum (f: Int => Int) (a: Int, b: Int): Int =
  if(a>b) 0 else f(a) + sum(f)(a+1, b)
sum(x=>x*x)(1,1000)

def prod (f: Int => Int) (a: Int, b: Int): Int =
  if(a>b) 1 else f(a) * prod(f)(a+1, b)
prod(x=>x*x)(3,4)

def fact(n: Int) = prod(x=>x)(1, n)
fact(5)

def mapReduce(f: Int => Int, combine: (Int,Int) => Int, l_bound: Int)(a: Int, b: Int): Int =
  if(a > b) l_bound
  else combine(f(a), mapReduce(f, combine, l_bound)(a+1, b))

def augProd(f: Int => Int) (a: Int, b: Int): Int =
  mapReduce(f, (x, y) => x*y, 1)(a, b)
def augSum(f: Int => Int) (a: Int, b: Int): Int =
  mapReduce(f, (x, y) => x+y, 0)(a, b)

augProd(x=>x*x)(3,4)
augSum(x=>x*x)(1,1000)