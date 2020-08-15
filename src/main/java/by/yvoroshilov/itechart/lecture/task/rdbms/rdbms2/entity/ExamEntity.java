package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "exam")
@Data
public class ExamEntity {

  @Id
  @Column(name = "id",
      unique = true,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long id;

  @Column(name = "class_id",
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long classId;

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
  @JoinColumn(name = "class_id", updatable = false, insertable = false)
  private ClassEntity examClass;

  @ManyToOne
  @JoinColumns({
      @JoinColumn(name = "class_id", referencedColumnName = "class_id", updatable = false, insertable = false),
      @JoinColumn(name = "discipline_id", referencedColumnName = "discipline_id", updatable = false, insertable = false)
  })
  private ClassDisciplineEntity classDiscipline;

  @ManyToOne
  @JoinColumn(name = "discipline_id", updatable = false, insertable = false)
  private DisciplineEntity discipline;

  @OneToMany(mappedBy = "exam")
  private List<ExamResultEntity> results;
}
