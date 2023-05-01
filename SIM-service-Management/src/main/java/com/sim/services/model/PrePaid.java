package com.sim.services.model;

public class PrePaid {
private int id;
private String name;
private String plan;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPlan() {
	return plan;
}
public void setPlan(String plan) {
	this.plan = plan;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("PostPaid [id=");
	builder.append(id);
	builder.append(", name=");
	builder.append(name);
	builder.append(", plan=");
	builder.append(plan);
	builder.append("]");
	return builder.toString();
}

}
