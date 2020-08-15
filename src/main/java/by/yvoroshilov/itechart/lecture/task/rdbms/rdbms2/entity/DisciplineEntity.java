package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "discipline")
@Data
public class DisciplineEntity {

  @Id
  @Column(name = "id",
      unique = true,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long id;

  @Column(name = "name", length = 40,
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private String name;

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

  @OneToMany
  private List<StudentResultEntity> studentResults;

  @OneToMany
  private List<ExamEntity> exams;

  @OneToMany
  private List<ClassDisciplineEntity> classDisciplines;

  @OneToMany
  private List<TeacherDisciplineEntity> teacherDisciplines;

  @OneToMany
  private List<SpecialityDisciplineEntity> specialityDisciplines;
}
