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
import javax.imageio.ImageIO;

/**
 *
 * @author Laptop88
 */
public class Decoder {

    public Decoder() {
    }
    public String decode(BufferedImage img,int lenght) throws IOException{
        String text = "";
        outerloop:
        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                int pixel = img.getRGB(x, y);
                Color color = new Color(pixel, true);
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                int alpha = color.getAlpha();
                String r = red%2+"";
                String g = green%2+"";
                String b = blue%2+"";
                String a = alpha%2+"";
                text = text + r + g + b + a;
                if(text.length() >= lenght){
                    break outerloop;
                }
            }
        }  
        return text.substring(0, lenght);
    }
    public BufferedImage getImage(String pathEncode){
        try{
            File ouptut = new File(pathEncode);
            BufferedImage img;
            try (FileWriter fileWriter = new FileWriter("C:\\Users\\Laptop88\\Desktop\\anhmoi.txt")) {
                img = ImageIO.read(ouptut);
                for (int y = 0; y < img.getHeight(); y++) {
                    for (int x = 0; x < img.getWidth(); x++) {
                        int pixel = img.getRGB(x, y);
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
                    }
                }
            }
            return img;
        }
        catch(IOException ex)
        {}
        return null;
    }
}
