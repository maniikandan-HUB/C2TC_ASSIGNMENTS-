package com.tnsif.assignment_1.employees;

public class Developer extends Employee {
	private String programmingLanguage;
    private String githubHandle;

    public Developer(String name, String employeeId, double salary,
                     String programmingLanguage, String githubHandle) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
        this.githubHandle = githubHandle;
    }

    public String getProgrammingLanguage() { return programmingLanguage; }
    public void setProgrammingLanguage(String programmingLanguage) { this.programmingLanguage = programmingLanguage; }

    public String getGithubHandle() { return githubHandle; }
    public void setGithubHandle(String githubHandle) { this.githubHandle = githubHandle; }

    @Override
    public String getBasicInfo() {
        return super.getBasicInfo() + String.format(" | Role: Developer | Lang: %s | Git: %s",
                programmingLanguage, githubHandle);
    }

}
