type Set = Int => Boolean

def singleton(elem: Int): Set = set => set == elem

def union(s: Set, t: Set): Set = set => s(set) || t(set)

def intersection(s: Set, t: Set): Set = set => s(set) && t(set)

def diff(s: Set, t: Set): Set = set => s(set) && !t(set)

def filter(s: Set, p: Int => Boolean): Set = set => p(set) && s(set)

def forall(s: Set, p: Int => Boolean): Boolean = {

  val x = -1000
  def inforall(x: Int, s: Set, p: Int => Boolean): Boolean =
    if(x == 1000)
}


