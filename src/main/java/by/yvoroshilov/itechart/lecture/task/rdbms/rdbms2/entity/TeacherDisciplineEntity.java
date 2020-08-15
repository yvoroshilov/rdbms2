package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "teacher_discipline")
@Data
public class TeacherDisciplineEntity {

  @EmbeddedId
  @AttributeOverrides({
      @AttributeOverride(name = "teacherId", column = @Column(name = "teacher_id")),
      @AttributeOverride(name = "disciplineId", column = @Column(name = "discipline_id"))
  })
  private TeacherDisciplineEntityPk teacherId;

  @Column(name = "begin_date",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private LocalDate beginDate;

  @Column(name = "end_date",
      unique = false,
      nullable = true,
      insertable = true,
      updatable = true)
  private LocalDate endDate;

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

  @OneToMany(mappedBy = "teacherDiscipline")
  private List<ClassDisciplineEntity> classDiscipline;
}
