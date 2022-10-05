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