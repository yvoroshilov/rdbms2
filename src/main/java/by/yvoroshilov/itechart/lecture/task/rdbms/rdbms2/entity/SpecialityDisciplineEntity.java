package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "speciality_discipline")
@Data
public class SpecialityDisciplineEntity {

  @EmbeddedId
  @AttributeOverrides({
      @AttributeOverride(name = "specialityId", column = @Column(name = "speciality_id")),
      @AttributeOverride(name = "disciplineId", column = @Column(name = "discipline_id"))
  })
  private SpecialityDisciplineEntityPk id;

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

  @ManyToOne
  @JoinColumn(name = "discipline_id",
      unique = false,
      nullable = false,
      insertable = false,
      updatable = false)
  private DisciplineEntity discipline;

  @ManyToOne
  @JoinColumn(name = "speciality_id",
      unique = false,
      nullable = false,
      insertable = false,
      updatable = false)
  private SpecialityEntity speciality;
}
