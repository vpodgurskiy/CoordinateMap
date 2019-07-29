package com.coordinateMap;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.dadata.api.DaData;
import ru.dadata.api.entity.Address;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}




//{"detail":"Учетные данные не были предоставлены."}



//"curl -X POST \\\n"+
//        "    -H \"Content-Type: application/json\" \\\n"+
//        "    -H \"Authorization: Token 897a0e0054d36f938c29e51a944540e3c24b6db3\" \\\n"+
//        "    -H \"X-Secret: a19f63b36fb9c75548edf0610cbbb1b6aef6d67f\" \\\n"+
//        "    -d '[ \"мск сухонска 11/-89\" ]' \\\n"+
//        "    https://dadata.ru/api/v2/clean/address"