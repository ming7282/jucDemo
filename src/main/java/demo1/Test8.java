package demo1;

public class Test8 {
    public static void main(String[] args) throws Exception
    {
        Student student = new Student();
        student.setAge(24);
        student.setName("niesong");
        Student student2 = (Student)student.clone();
        //����ǵ���������Ǹ�������Ȼ�������������Clone��student
        System.out.println("Age:" + student2.getAge() + " " + "Name:" + student2.getName());
        System.out.println(student==student2);
        System.out.println("---------------------");
        student2.setAge(23);
        //��¡��õ�����һ���µĶ�����������д����student2��������ֵ

        System.out.println(student.getAge());
        System.out.println(student2.getAge());
    }


}
//��¡�Ķ������ʵ��Cloneable����ӿڣ�������Ҫ��дclone����

class Student implements Cloneable
{
    private int age;
    //����Ϊprivate˵�������Ա����ֻ�ܱ�����ǰ���з��ʣ�����ⲿ��Ҫ��ã���ô��ֻ��ͨ��getAge�������л�ȡ
    private String name;
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;

    }
}
