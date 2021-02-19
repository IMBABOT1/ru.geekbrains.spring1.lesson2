package ru.geekbrains.spring1.lesson1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring1.lesson1.Model.Box;
import ru.geekbrains.spring1.lesson1.Repository.BoxRepository;

import java.util.List;

@Component
public class BoxService {
    private BoxRepository boxRepository;

    @Autowired
    public void setBoxRepository(BoxRepository boxRepository) {
        this.boxRepository = boxRepository;
    }

    public List<Box> getAllBoxes(){
        return boxRepository.getAllBoxes();
    }

    public void save(Box box){
        boxRepository.save(box);
    }

}
