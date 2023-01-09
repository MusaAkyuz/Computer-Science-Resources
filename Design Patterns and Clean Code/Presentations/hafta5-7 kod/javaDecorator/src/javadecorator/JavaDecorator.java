/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadecorator;

/**
 *
 * @author Önder Eyecioğlu
 */
public class JavaDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IDataSource dataSource = new FileDataSource("data.sql");
        IDataSource compressedDataSource = new ComporessionDecorator(dataSource);

        compressedDataSource.readData();
        compressedDataSource.writeData(new Object());

        // output:
        //      data.sql readed.
        //      Data compressed.
        //      Compressed data was written to data.sql
    }
    
}
