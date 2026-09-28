public class IgualGenerico
{
    public static <T> boolean esIgualA(T val1, T val2)
    {
        if (val1 == null && val2 == null)
        {
            return  true;
        }
        if (val1 == null || val2 == null)
        {
            return false;
        }
        return val1.equals(val2);
    }
}