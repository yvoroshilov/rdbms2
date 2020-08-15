package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class TeacherDisciplineEntityPk implements Serializable {

  private Long teacherId;

  private Long disciplineId;
}
