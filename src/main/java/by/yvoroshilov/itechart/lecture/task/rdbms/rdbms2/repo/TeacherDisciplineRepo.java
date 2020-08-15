package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.repo;

import by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity.TeacherDisciplineEntity;
import by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity.TeacherDisciplineEntityPk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDisciplineRepo extends CrudRepository<TeacherDisciplineEntity, TeacherDisciplineEntityPk> {

}
