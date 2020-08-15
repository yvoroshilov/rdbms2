package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.repo;

import by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity.ClassDisciplineEntity;
import by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity.ClassDisciplineEntityPk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassDisciplineRepo extends CrudRepository<ClassDisciplineEntity, ClassDisciplineEntityPk> {

}
