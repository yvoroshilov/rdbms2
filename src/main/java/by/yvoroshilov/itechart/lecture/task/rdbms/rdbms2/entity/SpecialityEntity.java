package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "speciality")
@Data
public class SpecialityEntity {

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

  @OneToMany
  private List<SpecialityDisciplineEntity> specialityDisciplines;

  @OneToMany
  private List<ClassEntity> classEntities;
}
