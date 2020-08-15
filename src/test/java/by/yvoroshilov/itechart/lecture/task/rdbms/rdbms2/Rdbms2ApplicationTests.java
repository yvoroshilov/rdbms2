package by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2;

import by.yvoroshilov.itechart.lecture.task.rdbms.rdbms2.repo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Rdbms2ApplicationTests {

  @Autowired
  private ClassRepo classRepo;

  @Autowired
  private ClassDisciplineRepo classDisciplineRepo;

  @Autowired
  private DisciplineRepo disciplineRepo;

  @Autowired
  private ExamRepo examRepo;

  @Autowired
  private ExamResultRepo examResultRepo;

  @Autowired
  private SpecialityRepo specialityRepo;

  @Autowired
  private StudentRepo studentRepo;

  @Autowired
  private StudentResultRepo studentResultRepo;

  @Autowired
  private TeacherRepo teacherRepo;

  @Autowired
  private TeacherDegreeRepo teacherDegreeRepo;

  @Autowired
  private TeacherDisciplineRepo teacherDisciplineRepo;

  @Test
  void findAll_classDisciplineRepo_noException() {
    classDisciplineRepo.findAll();
  }

  @Test
  void findAll_classRepo_noException() {
    classRepo.findAll();
  }

  @Test
  void findAll_disciplineRepo_noException() {
    disciplineRepo.findAll();
  }

  @Test
  void findAll_examRepo_noException() {
    examRepo.findAll();
  }

  @Test
  void findAll_examResultRepo_noException() {
    examResultRepo.findAll();
  }

  @Test
  void findAll_specialityRepo_noException() {
    specialityRepo.findAll();
  }

  @Test
  void findAll_studentRepo_noException() {
    studentRepo.findAll();
  }

  @Test
  void findAll_studentResultRepo_noException() {
    studentResultRepo.findAll();
  }

  @Test
  void findAll_teacherDegreeRepo_noException() {
    teacherDegreeRepo.findAll();
  }

  @Test
  void findAll_teacherDisciplineRepo_noException() {
    teacherDisciplineRepo.findAll();
  }

  @Test
  void findAll_teacherRepo_noException() {
    teacherRepo.findAll();
  }

}
