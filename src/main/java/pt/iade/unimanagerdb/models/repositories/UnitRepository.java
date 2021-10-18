package pt.iade.unimanagerdb.models.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.unimanagerdb.models.Unit; 

public interface UnitRepository extends CrudRepository<Unit,Integer> {

    @Query("SELECT * from students where extract(Year from AGE(NOW(), stu_bdate)) > 22")
    List<Unit> AllstudentMoreThen22Years(@Param("stu_bdate") String nomeCurso);
}
