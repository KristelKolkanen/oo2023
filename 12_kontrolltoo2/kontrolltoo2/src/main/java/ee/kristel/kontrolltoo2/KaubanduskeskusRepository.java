package ee.kristel.kontrolltoo2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KaubanduskeskusRepository extends JpaRepository<Kaubanduskeskus, Long> {
    List<Kaubanduskeskus> findByNimetus(String nimetus);
}
