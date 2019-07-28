package moh.ask.restcrud.config;


import moh.ask.restcrud.model.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ModelRepository extends CrudRepository<Member,Integer> {


    @Override
    default <S extends Member> S save(S s) {
        return null;
    }
}
