package xyz.jelly.composite;

/**
 * 组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 *
 * 这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
 *
 * 我们通过下面的实例来演示组合模式的用法。实例演示了一个组织中员工的层次结构。
 */
public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 3000);

        Employee headSales = new Employee("Robert", "Head Sales", 2000);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 2000);

        Employee clerk1 = new Employee("Laura", "Marketing", 1000);
        Employee clerk2 = new Employee("Bob", "Marketing", 1000);

        Employee saleExecutive1 = new Employee("Richard", "Sales", 1000);
        Employee saleExecutive2 = new Employee("Rob", "Sales", 1000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(saleExecutive1);
        headSales.add(saleExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);

        for (Employee e :
                CEO.getSubordinates()) {
            System.out.println(e);
            for (Employee e2 :
                    e.getSubordinates()) {
                System.out.println(e2);
            }
        }
    }
}
