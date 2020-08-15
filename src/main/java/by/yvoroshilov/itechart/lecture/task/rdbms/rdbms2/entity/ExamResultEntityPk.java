package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class ExamResultEntityPk implements Serializable {

  private Long studentId;

  private Long examId;
}
