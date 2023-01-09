/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadecorator;

/**
 *
 * @author Önder Eyecioğlu
 */
// Temel işlemlerin tanımlandığı IDataSource arayüzünü uygulayan sınıftır.
// UML diyagramındaki ConcreteComponent sınıfına denk gelmektedir.
class FileDataSource implements IDataSource {
    private String _fileName;

    public FileDataSource(String fileName) {
        _fileName = fileName;
    }
    @Override
    public String getFileName() {
        return _fileName;
    }
    @Override
    public void readData() {
        System.out.println(_fileName + " readed.");
    }
    @Override
    public void writeData(Object data) {
        System.out.println("data was written to " + _fileName);
    }
}
