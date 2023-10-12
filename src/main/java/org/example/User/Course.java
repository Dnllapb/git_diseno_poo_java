package org.example.User;

public class Course implements ICourse {
    private String name;

    private String code;

    int credits;

    public Course(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", credits=" + credits +
                '}';
    }

    public void mostrarCurso()
    {
        System.out.println("El curso a realizar es :" + getName());
    }

    @Override
    public void calcularNotas() {

        if(getCredits() > 170)
        System.out.println("Sus creditos son :" + getCredits());
        else
        {
            System.out.println("Debe registrar nuevamente el curso y aprobar todos los creditos ");
        }

    }
}
