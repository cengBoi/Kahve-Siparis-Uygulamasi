# Kahve Sipariş Uygulaması

Bu Java konsol uygulaması, kullanıcıların çeşitli kahve türlerinden sipariş vermesini sağlar. Kullanıcılar fiyat listesini görebilir veya doğrudan kahve kodunu girerek sipariş oluşturabilirler.

## Kullanılan Sınıflar

- [`Coffee`](Coffee.java): Kahve türlerini ve içeriklerini temsil eder.
- [`CoffeeHandler`](CoffeeHandler.java): Kullanıcı etkileşimini ve sipariş sürecini yönetir.
- [`Main`](Main.java): Uygulamanın başlangıç noktasıdır.

## Kurulum ve Çalıştırma

1. Proje dosyalarını aynı klasöre indirin:
    - [Coffee.java](Coffee.java)
    - [CoffeeHandler.java](CoffeeHandler.java)
    - [Main.java](Main.java)

2. Terminal veya komut satırında klasöre gidin.

3. Aşağıdaki komutla projeyi derleyin:
    ```sh
    javac Main.java
    ```

4. Uygulamayı başlatın:
    ```sh
    java Main
    ```

## Kullanım

- Uygulama açıldığında fiyat listesini görmek için Enter'a basabilir veya doğrudan kahve kodunu girebilirsiniz.
- Kod girildikten sonra seçtiğiniz kahvenin detayları gösterilir ve siparişiniz hazırlanır.

## Örnek Kahve Listesi

```
1. Espresso (20 TL)
2. Double Espresso (27 TL)
3. Cappuccino (28 TL)
4. Caffe Latte (28 TL)
5. Mocha (32 TL)
6. Americano (26 TL)
7. Hot Water (5 TL)
```
