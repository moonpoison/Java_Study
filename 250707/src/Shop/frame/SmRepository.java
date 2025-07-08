package Shop.frame;

import java.util.List;

public interface SmRepository<V, K> {
    // Database에 CRUD 기능을 정의함
    void insert(V v);
    void update(V v);
    void delete(K k);
    List<V> selectAll();
    V select(K k);
}
