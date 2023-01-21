package ru.golubev.springcourse.beanfactory;

public class BookwormOracle implements Oracle {
    private Encyclopedia encyclopedia;

    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are а waste of money - go " + "see the world instead";
    }

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }


}
