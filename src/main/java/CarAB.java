/**
 * Created by Saeniel on 29.03.2018.
 */
public class CarAB {

    private  String
            brand,          // марка
            model,          // модель
            image,          // ссылка на изображение
            price,          // цена в грн
            color,          // цвет
            capacity,       // объем двигателя
            mileage,        // пробег (тыс. км)
            bodyType,       // тип кузова
            fuel,           // тип топлива
            gearBox,        // тип коробки
            city,           // город
            phone,          // номер телефон
            site,           // сайт-источник
            datePublicated, // дата публикации объявления
            postId;         // id объявления

    public CarAB(String brand, String model, String image, String price, String color,
                 String capacity, String mileage, String bodyType, String fuel,
                 String gearBox, String city, String phone, String datePublicated, String postId) {
        this.brand = brand;
        this.model = model;
        this.image = image;
        this.price = price;
        this.color = color;
        this.capacity = capacity;
        this.mileage = mileage;
        this.bodyType = bodyType;
        this.fuel = fuel;
        this.gearBox = gearBox;
        this.city = city;
        this.phone = phone;
        this.site = "https://ab.ua";
        this.datePublicated = datePublicated;
        this.postId = postId;
    }

    public void writeToDatabase() {

    }
}
