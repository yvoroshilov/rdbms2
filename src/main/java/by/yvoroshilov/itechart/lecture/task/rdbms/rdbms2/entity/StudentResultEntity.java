package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.Data;

@Table(name = "student_result")
@Entity
@Data
public class StudentResultEntity {

  @Id
  @Column(name = "id",
      unique = true,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long id;

  @Column(name = "student_id",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long studentId;

  @Column(name = "discipline_id",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long disciplineId;

  @Column(name = "date",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private LocalDate date;

  @Column(name = "rating",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private Integer rating;

  @ManyToOne
  @JoinColumn(name = "student_id",
      unique = false,
      nullable = false,
      insertable = false,
      updatable = false)
  private StudentEntity student;

  @ManyToOne
  @JoinColumn(name = "discipline_id",
      unique = false,
      nullable = false,
      insertable = false,
      updatable = false)
  private DisciplineEntity discipline;
}
