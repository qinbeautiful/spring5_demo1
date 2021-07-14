package com.atqin.spring5.coll;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {

    private String[] cous;

    private List<String> list;

    private Map<String,String> maps;

    private Set<String> sets;

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }



    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getCous() {
        return cous;
    }

    public void setCous(String[] cous) {
        this.cous = cous;
    }



    public void test(){
        System.out.println(Arrays.toString(cous));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
    }
}
