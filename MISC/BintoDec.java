public class BintoDec {
    public static void pRange( int n)
    {
        for(int i =2; i<=n;i++)
        {
            if(pRange(i))
            return pRange;
        }
    }
    return false;
    public static void bintodec(int binNum)
    {
        int pow =0;
        int decNum= 0;
        while(binNum>0)
        {
            int lastDigit = decNum + (decNum *(int) math.pow(2, pow));
            pow ++;
            binNum = binNum%10;
        }
        System.out.println("decimal of " + binNum " = " );

    }
    
}
