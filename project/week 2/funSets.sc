type Set = Int => Boolean

def singleton(elem: Int): Set = set => set == elem

def union(s: Set, t: Set): Set = set => s(set) || t(set)

def intersection(s: Set, t: Set): Set = set => s(set) && t(set)

def diff(s: Set, t: Set): Set = set => s(set) && !t(set)

def filter(s: Set, p: Int => Boolean): Set = set => p(set) && s(set)

val x = 1000
def forall(s: Set, p: Int => Boolean): Boolean = {
  def inforall(i: Int): Boolean = {
    if (i > x) true
    else if (s(i) && !p(i)) false
    else inforall(i+1)
  }
  inforall(-x)
}

def exists(s: Set, p: Int => Boolean): Boolean = !forall(s, x => !p(x))

def map(s: Set, f: Int => Int): Set = (y: Int) => exists(s, x => f(x) == y)
