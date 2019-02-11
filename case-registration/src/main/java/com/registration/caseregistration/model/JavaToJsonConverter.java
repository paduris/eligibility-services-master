//package com.registration.caseregistration.model;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class JavaToJsonConverter {
//
//    public static void main(String[] a) {
//        ObjectMapper mapper = new ObjectMapper();
//
//        Case caseo = new Case();
//        caseo.setCaseNumber("00100002");
//
//
//        CasePerson cp = new CasePerson();
//        cp.setCaseId(Long.valueOf(1212121));
//        cp.setPersCIN("030040");
//
//        CasePerson cp1 = new CasePerson();
//        cp1.setCaseId(Long.valueOf(1212131));
//        cp1.setPersCIN("030041");
//
//        caseo.getCasePers().add(cp);
//        caseo.getCasePers().add(cp1);
//
//        try {
//            System.out.println(mapper.writeValueAsString(caseo));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}
