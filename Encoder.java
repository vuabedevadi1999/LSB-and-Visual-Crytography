/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dopd.hvktmm;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.imageio.ImageIO;

/**
 *
 * @author Laptop88
 */
public class Encoder {

    public Encoder() {
    }
    
    public int ReplaceLSB(int value, String text, int i) {
        int n_red = value % 2;
        int pico=0;
        if (n_red == Integer.parseInt(text.charAt(i) + "")) {
            pico = value;
        } else {
            if (n_red == 1 && Integer.parseInt(text.charAt(i) + "") == 0) {
                pico = value - 1;
            } else if(n_red == 0 && Integer.parseInt(text.charAt(i) + "") == 1) {
                pico = value + 1;
            }
        }
        return pico;
    }
    public String encode(BufferedImage original ,String text) throws IOException{
        int i = 0;
        int j;
        BufferedImage img;
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\Laptop88\\Desktop\\anhgoc.txt")) {
            String result = Converter.convertByteArraysToBinary(text.getBytes(StandardCharsets.UTF_8));
            String binary = Converter.prettyBinary(result, 8, "");
            img = new BufferedImage(original.getWidth(), original.getHeight(),BufferedImage.TYPE_4BYTE_ABGR);
            //release all allocated memory for this image
            for (int y = 0; y < img.getHeight(); y++) {
                for (int x = 0; x < img.getWidth(); x++) {
                    int pixel = original.getRGB(x, y);
                    Color color = new Color(pixel, true);
                    int r = color.getRed();
                    int g = color.getGreen();
                    int b = color.getBlue();
                    int a = color.getAlpha();
                    fileWriter.append(r+":");
                    fileWriter.append(g+":");
                    fileWriter.append(b+":");
                    fileWriter.append(a+":");
                    fileWriter.append("\n");
                    fileWriter.flush();
                    if(i<binary.length()){
                        j=i;
                        r = ReplaceLSB(r, binary, j);
                        if(j+1<binary.length()){
                            g = ReplaceLSB(g, binary, j+1);
                        }
                        if(j+2<binary.length()){
                            b = ReplaceLSB(b, binary, j+2);
                        }
                        if(j+3<binary.length()){
                            a = ReplaceLSB(a, binary, j+3);
                        }
                    }
                    color = new Color(r, g, b,a);
                    img.setRGB(x, y, color.getRGB());  
                    int check = i+4;
                    if(check<binary.length()){
                        i=i+4;//11110001
                    }else{
                        i=i+3;
                    }
                }
            }
        }
        return createImage(img);
    }
    public String createImage(BufferedImage img){
        try{
            File ouptut = new File("C:\\Users\\Laptop88\\Desktop\\new2.png");
            ImageIO.write(img, "png", ouptut);
            return ouptut.getPath();
        }
        catch(IOException ex)
        {}
        return null;
    }
}
