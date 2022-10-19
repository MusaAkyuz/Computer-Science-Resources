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
	|-----|----|
	|fork();||
	|waitpid();||
	|exit(status);||
	|execvev();||
	|kill();||
	
	fork() unix sistemlerde yeni bir süreç oluşturur
	asıl sürecin birebir kopyasını oluşturur
	kopyalama işleminden sonra ana süreç ve çocuk süreç birbirinden ayrılır
	kullandıkları bilgiler kendine özgün olur