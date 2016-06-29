def pascTri (col: Int, row: Int): Int =
  if(col == 0 || col == row)
    1
  else
    pascTri(col - 1, row - 1) + pascTri(col, row - 1)

pascTri(2, 4)
