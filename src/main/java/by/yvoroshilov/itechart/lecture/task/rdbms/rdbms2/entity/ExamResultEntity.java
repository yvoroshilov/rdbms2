package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "exam_result")
@Data
public class ExamResultEntity {

  @EmbeddedId
  @AttributeOverrides({
      @AttributeOverride(name = "studentId", column = @Column(name = "student_id")),
      @AttributeOverride(name = "examId", column = @Column(name = "exam_id"))
  })
  private ExamResultEntityPk id;

  @Column(name = "rating",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private Integer rating;

  @Column(name = "date",
      unique = false,
      nullable = true,
      insertable = true,
      updatable = true)
  private LocalDate date;

  @ManyToOne
  @JoinColumn(name = "student_id",
      unique = false,
      nullable = false,
      insertable = false,
      updatable = false)
  private StudentEntity student;

  @ManyToOne
  @JoinColumn(name = "exam_id",
      unique = false,
      nullable = false,
      insertable = false,
      updatable = false)
  private ExamEntity exam;
}
