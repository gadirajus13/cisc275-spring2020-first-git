import java.util.*;

class Animal{
    String name;
    int legs;

    public static void main(String[] args){
    }
    public int getLegs(){
        return this.legs;
    }
}

class AnimalCompare implements Comparator<Animal>{
    public int compare(Animal a1, Animal a2){
        if(a1.name.compareTo(a2.name) == 0)
            return (a1.legs - a2.legs);
        else
            return a1.name.compareTo(a2.name);    

    }
}

class Dog extends Animal implements Comparable<Dog>{
    public Dog(String n, int l){
        this.name = n;
        this.legs = l;
    }

    public String toString(){
        return this.name + this.legs;
    }

    public int compareTo(Dog d){
        if(this.legs > d.legs)
            return 1;
        else if(this.legs < d.legs)
            return -1;
        else
            return this.name.compareTo(d.name);    

    }

    public static void main(String[] args){
        ArrayList<Dog> herd = new ArrayList<Dog>();
        herd.add(new Dog("Fido", 4));
        herd.add(new Dog("Spot", 4));
        herd.add(new Dog("Fido", 5));

        System.out.println(herd);

        Collections.sort(herd);
        System.out.println(herd);

        Collections.sort(herd, new AnimalCompare());
        System.out.println(herd);
    }
}


