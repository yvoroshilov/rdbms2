package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "class")
@Data
public class ClassEntity {

  @Id
  @Column(name = "id",
      unique = true,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long id;

  @Column(name = "name",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private String name;

  @Column(name = "begin_date",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private LocalDate beginDate;

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

  @Column(name = "speciality_id",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long specialityId;

  @ManyToOne
  @JoinColumn(name = "speciality_id",
      unique = false,
      nullable = false,
      insertable = false,
      updatable = false)
  private SpecialityEntity speciality;

  @OneToMany
  private List<ClassDisciplineEntity> classDisciplines;

  @OneToMany
  private List<StudentEntity> students;

  @OneToMany
  private List<ExamEntity> exams;

}
