package com.masai.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Planter;

@Repository
public interface PlanterDao extends JpaRepository<Planter, Integer> {

	public List<Planter> findByPlanterShape(String planterShape);
	public List<Planter> findByPlanterCostBetween(Double start,Double end);
}
