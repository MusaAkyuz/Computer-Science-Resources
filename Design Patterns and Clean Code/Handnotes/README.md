
# Tasarım Desenleri

# Week 2

Sınıf diyagarmları, nesen diyagramları, kalıtım, içerme, polimorphism, umd diyagramlarındaki gösterimleri

## Modulerlik 
	Divide and conqueror
	Büyük bir problemi mantıksal ve küçük parçalara bölerek çözmeye çalışmak
	Ekiplere görev paylaşımını sağlıyor
	Test edilebiliriği arttıyor
	Modüllerin farklı programlarda veya uygulamalrda kullanımına yarıyor
	Paketler ve kütüphaneler modülerliği sağlar
	
## Soyutlama (Abstraction)
	Kavramsallaştırma (conceptualization)
	Kavramlar soyut olarak ifade ediilmeye çalışır
	Sistem seviyesinde soyutlama alt sistemlerle ifade edilir
	Problemlere daha yukarıdan bir bakış açısı sağlar
	Genelleştirme ve özelleştirmeyi sağlar
	Nesneye yönelik programlamada kalıtım (inheritance) devreye girecek
	
## Genelleştirme ve Özelleştirme (Generalization and Specialization)
	Genelleme bir IS-A ilişkisidir
	Genelleme, özellemenin tam tersidir
	Genelleme aşağıdan yuları, özelleme yukarıdan aşağı yönlüdür.
	
## İçerme (Aggregation)
	
## Kalıtım (Inheritance)

	### Soyut Sınıflar (Abstract)
		Alt sınıflar için bir taban oluşturur
		Alt sınıfların ortak özellikleri ve metodları burada toplanır ama tanımlanmaz
		Methodları boş bırakılır sadece prototipleri vardır
		
	### Erişim Düzenleyicileri
		Public = + sembolü ile --- within the class, outside the class, within the package and outside the package.
		Private = - sembolü ile --- only within the class
		Protected = # sembolü ile --- within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
		Package = ~ sembolü ile ---  within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
		
	### Java Değişkenleri
		--- Instance variable (Nesne Değişkeni)
		--- Class variable (Sınıf Değişkeni)
		--- Local variable (Yerel Değişkeni)
		