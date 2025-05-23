/*
 Copyright (c) 2014, 2025 Jyrki Oraskari, RWTH AAáchen University (oraskarii [at] ip.rwth-aachen [dot] de)
 Copyright (c) 2014 Pieter Pauwels, Ghent University (modifications - pipauwel [dot] pauwels [at] ugent [dot] be / pipauwel [at] gmail [dot] com)
 Copyright (c) 2016 Lewis John McGibbney, Apache (mavenized - lewismc [at] apache [dot] org)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
 
 package com.buildingsmart.tech.ifcowl.vo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


// IFC value object describing one line of an IFC  STEP file

public class IFCVO {

    private Long  stepLineNum;
    //private String fullLineAfterNum;  // uses unnecessary memory
    private String name = null;
    private LinkedList<Object> slot_list = new LinkedList<>();
    private Map<String, LinkedList<IFCVO>> inversePointerSets = new HashMap<>();

    public IFCVO() {
        //default constructor
    }

    /*public String getFullLineAfterNum() {
        return fullLineAfterNum;
    }

    public void setFullLineAfterNum(String fullLineAfterNum) {
        this.fullLineAfterNum = fullLineAfterNum;
    }*/

    public Long getLineNum() {
        return stepLineNum;
    }

    public void setLineNum(Long lineNum) {
        this.stepLineNum = lineNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getObjectList() {
        return slot_list;
    }

    public void setList(List<Object> list) {
        this.slot_list = (LinkedList<Object>) list;
    }

    public Map<String, LinkedList<IFCVO>> getInversePointerSets() {
        return inversePointerSets;
    }

    public void setInversePointerSets(Map<String, LinkedList<IFCVO>> inversePointerSets) {
        this.inversePointerSets = inversePointerSets;
    }
}