# Week 1

## Sistem çağrıları

## Görevler (Process, Process management) single tasking, multitasking, process kontrol bloğu (pcb)
	-İplikler, iş parçacıkları (threat)
	-İş sıralama algoritmaları (process plan algorithms)
	-Semafor, monitor, bariyer uygulamaları, threat senkranizasyonu
	-Kritik bölge problemleri, filozofları doyurma problemi, tüketici üretici problemleri
	-Kilitlenme Problemleri
## Bellek yönetimi
	-Sayfalama segmentasyon
	-Sanal Bellek
## Dosya sistemi, erişim ve koruma mekanizmaları (Disk management)

## Protection and Security

İşletim sistemleri -> Bilgisayar -> Sistem
Donanım -> İşletim sistemleri -> Uygulama programları -> Kullanıcıları

## İşlemci (CPU) 
	Bellek adres kaydedicileri (MAR)
	Bellek veri kaydedicisi (MBR)
	I/O adres kaydedicisi (I/O AR)
	I/O tampon kaydedicisi (I/O BR)
	Program sayıcı (PC)
	Komut seti (IS)
	Program durum sözcüğü (PSW)
	Akümülator kaydedicsis (AC)
	
## Komut alma ve komut yürütme
	Getir -> Çöz -> Yürüt -> Bellek -> Yaz
	Fetch -> Decode -> Execute -> Memory -> Write
	
### Komut kesme (Interrupt)
		İşlemcinin normal yürütüm sırasını değiştirmek ve gereksinim duyulan başka bir iş varsa onu yerine getirmek için kesme programları kullanır
		Bir komut işlenirken bir zaman diliminde kesilir ve araya farklı komut girer.
		Zamandan tasaruf olmadan multitasking işlem yapılır.
		
### Kesme türleri
		-Program
			Aritmatik taşma
			Sıfıra bölme
			İllegal komut yürütme
			Buffer taşması
		-Zamanlayıcı
		-G/Ç (I/O)
		-Donanım hatası

# Week 2

## İşletim sistemleri hizmetleri

### Kullanıcı Arayüzü 
		Windowsta kullanıcı arayüzü gui olarak geçer,
		Unix sistemlerde uygulama katmanında çalışan bir uygulamadır.
		Grafik arayüzü (Graphical User Interface - GUI)
		Komut arayüzü (Command Line Interface)
		
### Koruma ve Güvenlik
		Koruma -- Kullanıcı veya bir process bir kaynağı kullanmak istiyorsa, farklı bir kullanıcı veya process de o kaynağı kullanmak istiyorsa, işletim sistemi bunu korumalı düzenlemeli
		Güvenlik -- Erişim ve izin kontrolü
		
### Kaynak Yönetimi
	
### Dosya Sistemi manipülasyonu
	
### Programın yönetilmesi
	
### Hata Tespiti
	
### Kayıt tutma
	
## Süreçler (Process)

	Süreçler arasında ata, çocuk ilişkisi vardır
	Process , parent process, child process
	Buna süreç ağacı deriz (Process tree)
	Bütün çalışabilir programlar bir süreçtir
	
	INCELE 
	COMMANDS
	ps -ax
	ipcs (Message Queues...)
	users
	adduser
	addgroup
	pwd

## Adres Uzayları

## Dosya Sistemi
	Tüm dosyalar, cihazlar, kullanıcılar tek bir kök diininin altındadır
	/ kök dizini
	/bin komutların tutulduğu dizini
	/etc konfigürasyonların tutulduğu dizin
	/dev cihazların bulunnduğu dizindir
	/home kullanıcıların ev dizinleridir, kullanıcılar bu dizinler içinde haklara sahiptirler
	
	Permissions
	- - - - - - - - - - 
 	d r w x r w x r w x 
	l r w x r w x r w x
      r w x r w x r w x
	  4 2 1 4 2 1 4 2 1

# Week3

## Sistem Çağrıları

	İşletim istemi ile kullanıcı programları arasındaki tanımlı olan arayüzdür
	İşletim sistemi tarafından tanımlanan bir prosedureler kümesidir.
	
### Unix için C kütüphaneleri mevcut	
		fctnl.h
		sys/types.h
	
### Veri tipleri
		off_t
		
### Sistem çağrıları
		write();
		creat();
		open();
		read();
		
## Processler ile ilgili sistem cağrıları
|Unix|Windows|
|-----|-----|
|fork();||
|waitpid();||
|exit(status);||
|execvev();||
|kill();||
|exec()||
	
	fork() unix sistemlerde yeni bir süreç oluşturur
	asıl sürecin birebir kopyasını oluşturur
	kopyalama işleminden sonra ana süreç ve çocuk süreç birbirinden ayrılır
	kullandıkları bilgiler kendine özgün olur

# Week 4

## Threads (İplikler)

	Kaynak gruplandırma ve yürütme işlemleri yapar.
	İş parçacıklarıdır.
	Threatleri processler yönetir.
	Kendi süreç bilgilerini saklarlar
	Süreç var olduğu sürece threatler varlar.
	Kendi veri bölgeleri yok.
	Her threat in yerel değişkeni bulunur
	Process içerisinde bağımsız yapılardır.
	Threathleri farklı kaynakalra yönlendirebliriz
	Adres alanını açık dosyaları ve diğer kaynakları açık oalarak paylaşır
	Kontrolü anlamsızdır.
	
	
NOT : Multi-tasking gibi Multi-Threading işletim sistemlerinin yeteneklerindendir.

### Multithreading Model

	Çoktan bire model
	-----------------
	Birden bire model
	-----------------
	Çoktan çoğa model
	
NOT: Windows işletim sistemi birden bire modeli uygular.

	NOT: 
	UNIX LİBRARY POSIX PTHREATHS
	WİNDOWS WİN32
	JAVA

### PThread kütüphanesi 

	Posix standartları ailesine ait bir kütüphane
	Süreç yönetimi ve süreç senkronizasyonu ile ilgili fonksiyonları içerir
	
	Pthread.create()
	
# Week 5

## Görev Çizelgeleme (CPU planlaması)

	Tek çekirdekli bir işlemci aynı anda tek bir işlemi yapabilir.
	Birden çok işlemi aynı yapabilmesi için işler zamana yayar
	Bir işlemin tamamlanmasını beklemeden bir kesme işlemi yapılır ve diğer işlemler çalışır
	Görev çizelgeleme algoritmaları sayesinde bu süreç yürütülür
	Çok hızlı çalışıyor olması gerekiyor
	
	Aktüf olacağı zamanlar : 
	Çalışır durumundan bekleme durumuna
	Bekleme durumundan hazır duruma geçtiğinde
	Bir işlem sonlandığında
	
NOT : İşlem veya threath(işlemcik)ler bir kaynağa erişmeye çalıştıklarında erişim kontrolünün yapılmasının senkronizasyonu çok önemlidir

	
### Önleyici olmayan (Nonpreemptive)

	Bir süreç seçer ve bitmesini bekleyene kadar çalışmasına izin verir

### Önleyici (preemptive)

	Bir süreç seçer ve en fazla sabit bir süre boyunca çalışmasına izin verir.
	Zaman bitince işleme ara verir
	
### İşlemci çizelgeleme türleri

	Kısa süreli zamanlayıcı tarafından seçilen işleme işlemçinin pozisyonunu veren fonksiyonua dağıtıcı, dispatcher denir
	İş sıralama yöntemi dengeli olmalıdır (Adaletli)
	Yanıt süresi, çıktı ve işlemci verimliliğine göre sistem hedeflerini karşılamyacak şekilde atamaktadır.
	
	JOB SCHEDULER TYPES
	+ Kısa zamanlı çizelgeleme (cpu zamanlayıcısı olarak tanımlanır, uzun vadeli zamanlayıcıdan daha hızlıdır)
	+ Orta zamanlı çizelgeleme (işlemleri bellekten kaldırır, değişen processleri yönetmekten sorumludur)
	+ Uzun zamanlı çizelgeleme (bütün kontrol işlem komutları arasında karar verir)
	
### Planlama Algoritmaları

	+ FCFS (FIRST COME FIRST SERVED) (ilk gelen ilk servis edilir)
	+ SJF veya SRTF (SHORTEST JOB FIRST) (en kısa çalışan ilk servis edilir) (SHORTEST REMAİNING TİME FIRST)
		- Kesilmesiz SJF
		- Kesilmeli SJF
	+ Çok Kuyruklu Planlama Algoritması
	+ Öncelikli Planlama Algoritması
	+ RR (ROUND ROBİN) (Döngülü planlama Algoritması)
	
## Süreçler Arası İletişim

	Kaynak paylaşımı (dosya, i-o aygıtı)
	Karşılıklı haberleşme
	Senkranizasyon
	
# Week 6

## Thread lerin problemleri

### Race Condition (Yarış Durumu)
	
	Hangi threat in hangi sırayla geleceğini ve hangisinin önce çalışacağını bilemiyıruz
	Bu nedenle global bir değişken üzerinde değişiklik yaparlarsa ortalık karışır.
	Örneğin arttırma ve azaltma thread leri olsun
	İkisi de x = 10 değişkeni üzerinde arttırma azaltma yaparlarsa daha birinin çalışması bitmeden yani arttırma
	işlemini yapamadan diğeri azaltma işlemini yapar 10 -> 11 -> 10 olması gereken yerde 10 -> 11 -> 9 olur
	
	Önlemek için bir thread geldiğinde diğer threadi bekletecek sistem yapılmalı
	Bunu mutex ile yapabiliriz
	Kilit mekanizması oluşturulur.
	
Not: İKİLİ SEMAFORLARA MUTEX DENİR

### Kritik Bölge Problemi

### Üretici Tüketici Problemleri

	Yine bir yarış koşulu problemidir. Aynı zamanda kritik bölge probleminidir.
	Mutex ile bu problemi çözemeyiz
	Bunun için semafor kullanacağız
	Yoğun bekleme gerektirmeyen süreç sayısından bağımsız bir yöntemdir
	Temel olarak down ve up olarak iki metodu bulunmaktadır

### Açlık Problemleri

### Ölümcül Kilitlenme Problemi

### Filozofları Doyurma Problemi

	Sınırlı kaynakların bri grup sürece kilitlenmeden ve açlıktan arındırılmış şekilde
	paylaştırılmasını içerir.
	
	
	
	
	

	