package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.repo;

import by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity.ExamResultEntity;
import by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity.ExamResultEntityPk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamResultRepo extends CrudRepository<ExamResultEntity, ExamResultEntityPk> {

}
