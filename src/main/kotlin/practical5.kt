fun main()
{
    println("enter the no x:")
    var x  = readLine()!!.toInt()
    when(x)
    {
        1->{
            println("jan")
        }
        2->{
            println("feb")
        }
        3->{
            println("march")
        }
        4->{
            println("april")
        }
        5->{
            println("may")
        }
        6->{
            println("june")
        }
        7->{
            println("july")
        }
        8->{
            println("august")
        }
        9->{
            println("sep")
        }
        10->{
            println("oct")
        }
        11->{
            println("nov")
        }
        12->{
            println("des")
        }
        else->{
            println("enter the invalid number")
        }
    }
}
