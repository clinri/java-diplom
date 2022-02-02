package ru.netology.graphics.image;

public class ColorSchema implements TextColorSchema{
    //'#', '$', '@', '%', '*', '+', '-', '''
    @Override
    public char convert(int color) {
        String imgString = "#$@%*+-'";
        char[] chars = imgString.toCharArray();
        return chars[color/(256/chars.length)];
    }

}
