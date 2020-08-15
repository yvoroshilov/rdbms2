package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "teacher")
@Data
public class TeacherEntity {

  @Id
  @Column(name = "id",
      unique = true,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long id;

  @Column(name = "first_name", length = 20,
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private String firstName;

  @Column(name = "last_name", length = 20,
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private String lastName;

  @Column(name = "date_of_birth",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private LocalDate dateOfBirth;

  @Column(name = "teacher_degree_id",
      unique = false,
      nullable = true,
      insertable = true,
      updatable = true)
  private Long teacherDegreeId;

  @Column(name = "created",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private LocalDateTime created;

  @Column(name = "deleted",
      unique = false,
      nullable = true,
      insertable = true,
      updatable = true)
  private LocalDateTime deleted;

  @ManyToOne
  @JoinColumn(name = "teacher_degree_id",
      unique = false,
      nullable = false,
      insertable = false,
      updatable = false)
  private TeacherDegreeEntity teacherDegree;
}
