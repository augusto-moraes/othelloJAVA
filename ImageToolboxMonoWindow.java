import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import javax.swing.JFrame;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

// DANS CETTE CLASSE SONT FOURNIES DES METHODES UTILITAIRES
// POUR AFFICHER UNE IMAGE ET POUR ECRIRE UNE IMAGE DANS UN FICHIER.
// CES METHODES SONT APPELEES DANS LES DIFFERENTS EXEMPLES DISTRIBUES.

////////////////////////////////////////////////////////////////////////
// IL N'EST PAS NECESSAIRE DE LIRE LE CONTENU DE CE FICHIER POUR l'APP
////////////////////////////////////////////////////////////////////////



/* Class ImageToolbox v01.3
 * 
 * Images are specified as three 2D arrays [row][column] of int.
 * One array for each R, G and B component.
 * 
 * Methods:
 * - to convert an image to format BufferedImage (the java.awt standard image format).
 * - to write an image in a file in jpeg format.
 * - to display an image without rescaling.
 * - to display a projection of an image with rescaling to fit the window size.
 * Resizing the window triggers image rescaling to fit new window size.
 */

public class ImageToolboxMonoWindow {
    
    public ImageToolboxMonoWindow(){}

    public BufferedImage RGBarrays2BufferedImage(int[][] arrayR,
                                        int[][] arrayG, int[][] arrayB) {
        
        int nbCols = arrayR[0].length;
        int nbRows = arrayR.length;
        BufferedImage image = new BufferedImage(nbCols, nbRows,  BufferedImage.TYPE_INT_RGB);;
        
        for(int i = 0; i < nbRows; i++){
            for(int j = 0; j < nbCols; j++){
                int red = arrayR[i][j];
                int green = arrayG[i][j];
                int blue = arrayB[i][j];
                
                image.setRGB(j, i, (new Color(red,green,blue)).getRGB());
                
            }
        }
        return(image);
    }


    public void writeRGBarrays(String fileName, int[][] arrayR,
                                        int[][] arrayG, int[][] arrayB) {
        
        BufferedImage imageOut;
        imageOut = RGBarrays2BufferedImage(arrayR, arrayG, arrayB);
        
        try {
            String fileFormat ="JPG";
			ImageIO.write(imageOut, fileFormat, new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }


    private static JFrame frame = null;
    public void visuRGBarrays(String nom, int[][] arrayR, int[][] arrayG, int[][] arrayB,
                            int windowWidth, int windowHeight) {
        
        BufferedImage image;
        image = RGBarrays2BufferedImage(arrayR, arrayG, arrayB);
        
        JPanel containerPrincipal = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, this.getWidth()-1, this.getHeight()-1, null);
            }
        };
        


        if(frame==null){
            frame = new JFrame();
            frame.setSize(windowWidth, windowHeight);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle(nom);
            frame.setContentPane(containerPrincipal);
            frame.setVisible(true);
        } else {
            frame.setContentPane(containerPrincipal);
            frame.revalidate();
            frame.repaint();
        }
        
    }


    public void visuRGBarrays(String nom, int[][] arrayR, int[][] arrayG, int[][] arrayB) {
        int nbCols = arrayR[0].length;
        int nbRows = arrayR.length;
        visuRGBarrays(nom, arrayR, arrayG, arrayB, nbCols, nbRows);
    }

    
    public int[][][] readImagetoRGBarrays(String nom) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(nom));
        } catch (IOException e) {
        }
        
        int nbRows = img.getHeight(); 
        int nbCols = img.getWidth(); 
        
        // image[0]: arrayR; image[1]: arrayG; image[2]: arrayB
        int[][][] image = new int[3][nbRows][nbCols];
        
        int[] rgbValues;

        for(int i = 0; i < nbRows; i++){ // loop over rows
            for(int j = 0; j < nbCols; j++){ // loop over columns
                rgbValues = convert(img.getRGB(j, i)); // get RGB value at pixel (i,j)
                image[0][i][j] = rgbValues[0];
                image[1][i][j] = rgbValues[1];
                image[2][i][j] = rgbValues[2];
            }
        }
        return image;
    }

    public int[] convert(int p) {
        int[] rgbValues = new int[3];
        // get red 
        rgbValues[0] = (p>>16) & 0xff; 
        // get green 
        rgbValues[1] = (p>>8) & 0xff; 
        // get blue 
        rgbValues[2] = p & 0xff; 
        return rgbValues;
    }
}
