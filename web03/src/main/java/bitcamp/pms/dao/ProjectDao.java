package bitcamp.pms.dao;

import java.util.List;

import bitcamp.pms.vo.Project;

public interface ProjectDao {
  List<Project> selectList();
  int insert(Project project);
  Project selectOne(int no);
  int update(Project project);
  int delete(int no);

}
