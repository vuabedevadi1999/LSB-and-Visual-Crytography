/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dopd.hvktmm;

import com.sun.org.apache.bcel.internal.classfile.Code;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Laptop88
 */
public class Share {
    public String generateShare(String pathOriginal) throws IOException{
        Random random = new Random();
        File  file = new File(pathOriginal);
        Color color1;
        File  file2;
        FileWriter fileWriterGoc = new FileWriter("C:\\Users\\Laptop88\\Desktop\\goc.txt");
        FileWriter fileWriter1 = new FileWriter("C:\\Users\\Laptop88\\Desktop\\share1.txt");
        FileWriter fileWriter2 = new FileWriter("C:\\Users\\Laptop88\\Desktop\\share2.txt");
        try {
            BufferedImage image = ImageIO.read(file);
            BufferedImage share1 = new BufferedImage(image.getWidth(), image.getHeight(),BufferedImage.TYPE_4BYTE_ABGR);
            BufferedImage share2 = new BufferedImage(image.getWidth(), image.getHeight(),BufferedImage.TYPE_4BYTE_ABGR);
            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                        int rgb = image.getRGB(x, y);
                        Color color = new Color(rgb, true);
                        int r = color.getRed();
                        int g = color.getGreen();
                        int b = color.getBlue();
                        int a = color.getAlpha();
                        fileWriterGoc.append(r+":");
                        fileWriterGoc.append(g+":");
                        fileWriterGoc.append(b+":");
                        fileWriterGoc.append(a+":");
                        fileWriterGoc.append("\n");
                        fileWriterGoc.flush();
                }
            }
            fileWriterGoc.close();
            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                        int r = random.nextInt(255);
                        int g = random.nextInt(255);
                        int b = random.nextInt(255);
                        int a = random.nextInt(255);
                        color1 = new Color(r,g,b,a);
                        fileWriter1.append(r+":");
                        fileWriter1.append(g+":");
                        fileWriter1.append(b+":");
                        fileWriter1.append(a+":");
                        fileWriter1.append("\n");
                        fileWriter1.flush();
                        share1.setRGB(x, y, color1.getRGB());
                }
            }
            fileWriter1.close();
            File file1 = new File("C:\\Users\\Laptop88\\Desktop\\share1.png");
            ImageIO.write(share1, "png", file1);
            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                    //share2 = image - share1
                    int coordinateOriginal = image.getRGB(x, y);
                    Color colorOri = new Color(coordinateOriginal,true);
                    //tọa độ màu gốc
                    int g_r = colorOri.getRed();
                    int g_g = colorOri.getGreen();
                    int g_b = colorOri.getBlue();
                    int g_a = colorOri.getAlpha();
                    //tọa độ share1
                    int coordinateShare1 = share1.getRGB(x, y);
                    Color colorShare1 = new Color(coordinateShare1,true);
                    int s1_r = colorShare1.getRed();
                    int s1_g = colorShare1.getGreen();
                    int s1_b = colorShare1.getBlue();
                    int s1_a = colorShare1.getAlpha();
                    //set màu cho tọa độ ảnh share2
                    
                    int s2_r = g_r^s1_r ;//Math.floorMod(g_r - s1_r,255);
                    //setColorS2(g_r, g_r, s1_r);//Math.floorMod(g_r - s1_r,255);
                    int s2_g = g_g^s1_g;//Math.floorMod(g_g - s1_g,255);
                    //setColorS2(g_g, g_g, s1_g);//Math.floorMod(g_g - s1_g,255);
                    int s2_b = g_b^s1_b; Math.floorMod(g_b - s1_b,255);
                    //setColorS2(g_b, g_b, s1_b);//Math.floorMod(g_b - s1_b,255);
                    int s2_a = g_a^s1_a; Math.floorMod(g_a - s1_a,255);
                    //setColorS2(g_a, g_a, s1_a); //Math.floorMod(g_a - s1_a,255);
                    Color colorShare2 = new Color(s2_r, s2_g, s2_b, s2_a);
                    fileWriter2.append(s2_r+":");
                    fileWriter2.append(s2_g+":");
                    fileWriter2.append(s2_b+":");
                    fileWriter2.append(s2_a+":");
                    fileWriter2.append("\n");
                    fileWriter2.flush();
                    share2.setRGB(x, y, colorShare2.getRGB());
                }
            }
            fileWriter2.close();
            file2 = new File("C:\\Users\\Laptop88\\Desktop\\share2.png");
            ImageIO.write(share2, "png", file2);
            String pathShare = "C:\\Users\\Laptop88\\Desktop\\share2.png"+"$"+"C:\\Users\\Laptop88\\Desktop\\share1.png";
            return pathShare;
        } catch (IOException ex) {
            Logger.getLogger(Share.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public String overLapping(String share1,String share2) throws IOException{
            File  file1 = new File(share1);
            File  file2 = new File(share2);
            Color color1;
            Color color2;
            FileWriter fileWriter0 = new FileWriter("C:\\Users\\Laptop88\\Desktop\\secretimage.txt");
            try {
                BufferedImage readshare1 = ImageIO.read(file1);
                BufferedImage readshare2 = ImageIO.read(file2);
                BufferedImage original = new BufferedImage(readshare1.getWidth(), readshare1.getHeight(),BufferedImage.TYPE_4BYTE_ABGR);
                for (int y = 0; y < readshare1.getHeight(); y++) {
                    for (int x = 0; x < readshare1.getWidth(); x++) {
                        int coordinateSharel = readshare1.getRGB(x, y);
                        int coordinateShare2 = readshare2.getRGB(x, y);
                        color1 = new Color(coordinateSharel, true);
                        color2 = new Color(coordinateShare2, true);
                        //get color share1
                        int s1_r = color1.getRed();
                        int s1_g = color1.getGreen();
                        int s1_b = color1.getBlue();
                        int s1_a = color1.getAlpha();
                        //get color share2
                        int s2_r = color2.getRed();
                        int s2_g = color2.getGreen();
                        int s2_b = color2.getBlue();
                        int s2_a = color2.getAlpha();
                        //create color image original
                        int r = s1_r^s2_r;
                        int g = s1_g^s2_g;
                        int b = s1_b^s2_b;
                        int a = s1_a^s2_a;
                        Color colorOri = new Color(r, g, b, a);
                        fileWriter0.append(r+":");
                        fileWriter0.append(g+":");
                        fileWriter0.append(b+":");
                        fileWriter0.append(a+":");
                        fileWriter0.append("\n");
                        fileWriter0.flush();
                        original.setRGB(x,y,colorOri.getRGB());
                    }
                }
                fileWriter0.close();
                file2 = new File("C:\\Users\\Laptop88\\Desktop\\overlapping.png");
                ImageIO.write(original, "png", file2);
                String pathOverlap = "C:\\Users\\Laptop88\\Desktop\\overlapping.png";
                return pathOverlap;
        } catch (IOException ex) {
            Logger.getLogger(Share.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
}
