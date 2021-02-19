package ru.geekbrains.spring1.lesson1.Repository;

import org.springframework.stereotype.Component;
import ru.geekbrains.spring1.lesson1.Model.Box;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class BoxRepository {
    private List<Box> boxes;

    @PostConstruct
    public void init(){
        boxes = new ArrayList<>();
        boxes.add(new Box(1l, "White", 5));
        boxes.add(new Box(2l, "Red", 15));
        boxes.add(new Box(3l, "Yellow", 25));
        boxes.add(new Box(4l, "Yellow", 5));
    }

    public List<Box> getAllBoxes(){
        return Collections.unmodifiableList(boxes);
    }

    public void save(Box box){
        boxes.add(box);
    }
}
