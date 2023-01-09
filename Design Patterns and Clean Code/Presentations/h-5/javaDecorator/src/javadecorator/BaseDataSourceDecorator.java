/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadecorator;

/**
 *
 * @author Önder Eyecioğlu
 */
// UML diyagramındaki Component (IDataSource) arayüzünü uygular.
// Constructor sayesinde özellikleri değiştirilmesi istenen nesnenin referansı tutulur.
// Bu sınıftan türeyen sınıfların uygulamasını, değiştirilmesini istediğimiz metotları abstract anahtar kelimesi ile işaretledik.
// UML diyagramındaki BaseDecorator yapısına denk gelmektedir.
abstract class BaseDataSourceDecorator implements IDataSource {
    protected IDataSource dataSource;

    public BaseDataSourceDecorator(IDataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public abstract String getFileName();
    @Override
    public abstract void readData();
    @Override
    public abstract void writeData(Object data);
}
