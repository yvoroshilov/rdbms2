package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class SpecialityDisciplineEntityPk implements Serializable {

  private Long specialityId;

  private Long disciplineId;
}
