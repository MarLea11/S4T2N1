package cat.itacademy.barcelonactiva.Pagliaruzza.Marcos.s04.t02.n01.S04T02N01PagliaruzzaMarcos.model.services;

import cat.itacademy.barcelonactiva.Pagliaruzza.Marcos.s04.t02.n01.S04T02N01PagliaruzzaMarcos.model.domain.Fruit;
import cat.itacademy.barcelonactiva.Pagliaruzza.Marcos.s04.t02.n01.S04T02N01PagliaruzzaMarcos.model.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public Fruit addFruit(Fruit fruit){
        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public void deleteFruit(int idFruit) {
        fruitRepository.deleteById(idFruit);
    }

    public Fruit getFruit(int idFruit) {
        Optional<Fruit> fruit = fruitRepository.findById(idFruit);
        return fruit.orElse(null);
    }

    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

}
