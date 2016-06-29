def parentBal(chars: List[Char]): Boolean = {

  def isBal(c: List[Char], x: List[Char]): Boolean =
    if(c.isEmpty) {
      if (x.isEmpty)
        true
      else
        false
    }
    else {
      if (c.head == '(')
        isBal(c.tail, c.head +: x)
      else if (c.head == ')')
          if(x.isEmpty)
            false
          else
            isBal(c.tail, x.tail)
      else
        isBal(c.tail, x)
    }

  isBal(chars, List())
}

parentBal(":-)".toList)
