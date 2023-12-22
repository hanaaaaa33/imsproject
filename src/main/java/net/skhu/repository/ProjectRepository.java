package net.skhu.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.entity.ProjectEntity;


public interface ProjectRepository extends JpaRepository<ProjectEntity,String>{
	@Override
	List<ProjectEntity> findAll();
}