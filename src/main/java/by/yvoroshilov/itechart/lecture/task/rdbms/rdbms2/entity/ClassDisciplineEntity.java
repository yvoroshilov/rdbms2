package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "class_discipline")
@Data
public class ClassDisciplineEntity {

  @EmbeddedId
  @AttributeOverrides({
      @AttributeOverride(name = "classId", column = @Column(name = "class_id")),
      @AttributeOverride(name = "disciplineId", column = @Column(name = "discipline_id"))
  })
  private ClassDisciplineEntityPk id;

  @Column(name = "teacher_id",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long teacherId;

  @Column(name = "begin_date",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private LocalDate beginDate;

  @Column(name = "end_date",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private LocalDate endDate;

  @ManyToOne
  @JoinColumn(name = "class_id",
      unique = false,
      nullable = false,
      insertable = false,
      updatable = false)
  private ClassEntity clazz;

  @ManyToOne
  @JoinColumn(name = "discipline_id",
      unique = false,
      nullable = false,
      insertable = false,
      updatable = false)
  private DisciplineEntity discipline;

  @ManyToOne
  @JoinColumn(name = "teacher_id",
      unique = false,
      nullable = false,
      insertable = false,
      updatable = false)
  private TeacherEntity teacher;

  @ManyToOne
  @JoinColumns({
      @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id",
          unique = false,
          nullable = false,
          insertable = false,
          updatable = false),
      @JoinColumn(name = "discipline_id", referencedColumnName = "discipline_id",
          unique = false,
          nullable = false,
          insertable = false,
          updatable = false)
  })
  private TeacherDisciplineEntity teacherDiscipline;

  @OneToMany(mappedBy = "classDiscipline")
  private List<ExamEntity> exams;
}
