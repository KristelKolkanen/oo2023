package ee.kristel.kontrolltoo2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PoodRepository extends JpaRepository<Pood, Long> {

    List<Pood> findPoodByAvamineAndSulgemine(int avamine, int sulgemine);
    List<Pood> findPoodByAvamine(int avamine);
    List<Pood> findPoodByKylastajad(int kylastajad);
}
