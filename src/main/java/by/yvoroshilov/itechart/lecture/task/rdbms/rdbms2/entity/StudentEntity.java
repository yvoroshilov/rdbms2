package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class StudentEntity {

  @Id
  @Column(name = "id",
      unique = true,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long id;

  @Column(name = "first_name", length = 40,
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private String firstName;

  @Column(name = "last_name", length = 40,
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
  private LocalDateTime dateOfBirth;

  @Enumerated(EnumType.STRING)
  @Column(name = "gender",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private GenderEnum gender;

  @Column(name = "hostel",
      unique = false,
      nullable = true,
      insertable = true,
      updatable = true)
  private Boolean hostel;

  @Column(name = "class_id",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long classId;

  @ManyToOne
  @JoinColumn(name = "class_id",
      unique = false,
      nullable = false,
      insertable = false,
      updatable = false)
  private ClassEntity studentClass;

  @OneToMany(mappedBy = "student")
  private List<StudentResultEntity> results;

  @OneToMany(mappedBy = "student")
  private List<ExamResultEntity> examResults;
}
