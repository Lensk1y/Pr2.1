fun Whereis (str: String, num:Char) : Boolean
{
    for (ch in str){if (num == ch){return false;}}
    return true;
}

fun main()
{
    print ("Input count of rows: "); val rows = readln().toInt();
    print ("Input count of columns: "); val cols = readln().toInt();
    var nums = "";
    var tabl: Array<Array<String>> = Array(rows, {Array(cols, {"0"})});
    for (i in 1 .. rows)
    {
        for (j in 1 .. cols)
        {
            print("YourArray[$i][$j] = ");
            for (g in tabl[i-1][j-1])
            {
                if (Whereis(nums, g))
                {
                    nums += g.toString();
                }
            }

        }
        println();
    }

    for (i in 1 .. rows)
    {
        for (j in 1 .. cols)
        {
            print(tabl[i-1][j-1] + " ");
        }
        println();
    }

    print("There are " + nums.length.toString() + " numbers used");
}