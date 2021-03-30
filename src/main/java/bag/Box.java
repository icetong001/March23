package bag;

public  abstract class Box {

    int lengh;
    int width;
    int height;

    public boolean validate(int a, int b, int c) {
        return (a <= lengh && b <= width && c <= height);
    }

    public abstract String getName();

    public abstract int getPrice();
}