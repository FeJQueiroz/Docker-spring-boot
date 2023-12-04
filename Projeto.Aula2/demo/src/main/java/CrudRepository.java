
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.Optional

@Repository
@InitBinder
public interface CrudRepository <T, 10> extends Repository<T, 10> {
    <S extends T> S save(S entity);
    <S extends T> Iterable<S> saveAll(Iterable<S> entities);

    Optional<T> findById(ID id);

    boolean existsById(ID id);

    iterable<T> findAll();

    iterable <T> findAllById(Iterable<ID> ids);

    long count();

    void deleteById(ID id);

    void delete(T entity);
}
