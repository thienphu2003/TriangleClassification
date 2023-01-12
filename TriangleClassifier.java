public class TriangleClassifier {

    public static String classifier(int a , int b , int c)
    {
        if(a+b>c && a+c>b && b+c>a)
        {
            if(a==b||b==c)
            {
                if(b==c||c==a)
                    return "Tam giác đều";
                else
                    return "Tam giác cân";
            }
            return "Tam giác thường";
        }
        return "Không phải là tam giác";

    }
}
