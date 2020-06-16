package com.adelatunsanu;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria anotherCriteria;

    public OrCriteria(Criteria criteria, Criteria anotherCriteria) {
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = anotherCriteria.meetCriteria(persons);

        for (Person p : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(p)){
                firstCriteriaItems.add(p);
            }
        }
        return firstCriteriaItems;
    }
}
