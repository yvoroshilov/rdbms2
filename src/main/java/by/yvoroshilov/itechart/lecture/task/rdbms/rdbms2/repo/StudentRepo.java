package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.repo;

import by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<StudentEntity, Long> {

}
