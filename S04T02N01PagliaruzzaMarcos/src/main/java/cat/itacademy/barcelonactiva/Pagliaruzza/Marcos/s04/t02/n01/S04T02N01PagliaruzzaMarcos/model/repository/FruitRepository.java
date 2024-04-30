package cat.itacademy.barcelonactiva.Pagliaruzza.Marcos.s04.t02.n01.S04T02N01PagliaruzzaMarcos.model.repository;

import cat.itacademy.barcelonactiva.Pagliaruzza.Marcos.s04.t02.n01.S04T02N01PagliaruzzaMarcos.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {

}
