package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.entity;

import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "teacher_degree")
@Data
public class TeacherDegreeEntity {

  @Id
  @Column(name = "id",
      unique = true,
      nullable = false,
      insertable = true,
      updatable = true)
  private Long id;

  @Column(name = "name", length = 20,
      unique = false,
      nullable = false,
      insertable = true,
      updatable = true)
  private String name;

  @OneToMany
  private List<TeacherEntity> teachers;
}
