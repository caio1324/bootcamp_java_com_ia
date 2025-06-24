package br.com.desafio.dominio;

public class Course extends Content{
    private int workload;

    @Override
    public double calcXP() {
        return DEFAULT_XP * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }
}
