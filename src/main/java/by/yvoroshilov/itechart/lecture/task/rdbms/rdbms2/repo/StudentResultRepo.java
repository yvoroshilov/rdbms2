package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.repo;

import by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity.StudentResultEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentResultRepo extends CrudRepository<StudentResultEntity, Long> {

}
