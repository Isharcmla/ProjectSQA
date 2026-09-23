package com.google.javascript.jscomp;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term980;
     Object term997;
     Object term1024;

    public DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term983 = new HashMap();
        term980 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        Object term981 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term982 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term989 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term980, term980.getClass(), "compiler", null);
        setField(term982, term982.getClass(), "vars", term983);
        setField(term989, term989.getClass(), "vars", null);
        setField(term989, term989.getClass(), "parent", null);
        setIntField(term989, term989.getClass(), "depth", 0);
        setField(term989, term989.getClass(), "rootNode", null);
        setField(term989, term989.getClass(), "thisType", null);
        setBooleanField(term989, term989.getClass(), "isBottom", false);
        setField(term982, term982.getClass(), "parent", term989);
        setIntField(term982, term982.getClass(), "depth", 1743224434);
        setIntField(term993, term993.getClass(), "type", 0);
        setField(term993, term993.getClass(), "next", null);
        setField(term993, term993.getClass(), "first", null);
        setField(term993, term993.getClass(), "last", null);
        setField(term993, term993.getClass(), "propListHead", null);
        setIntField(term993, term993.getClass(), "sourcePosition", 0);
        setField(term993, term993.getClass(), "jsType", null);
        setField(term993, term993.getClass(), "parent", null);
        setField(term982, term982.getClass(), "rootNode", term993);
        setField(term982, term982.getClass(), "thisType", null);
        setBooleanField(term982, term982.getClass(), "isBottom", false);
        setField(term981, term981.getClass(), "jsScope", term982);
        setField(term981, term981.getClass(), "escaped", null);
        setField(term981, term981.getClass(), "cfg", null);
        setField(term981, term981.getClass(), "joinOp", null);
        setField(term981, term981.getClass(), "orderedWorkSet", null);
        setField(term980, term980.getClass(), "liveness", term981);
        term997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1010 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1020 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term997, term997.getClass(), "type", 1507074215);
        setIntField(term999, term999.getClass(), "type", 267763294);
        setIntField(term1001, term1001.getClass(), "type", 0);
        setField(term1001, term1001.getClass(), "next", null);
        setField(term1001, term1001.getClass(), "first", null);
        setField(term1001, term1001.getClass(), "last", null);
        setField(term1001, term1001.getClass(), "propListHead", null);
        setIntField(term1001, term1001.getClass(), "sourcePosition", 0);
        setField(term1001, term1001.getClass(), "jsType", null);
        setField(term1001, term1001.getClass(), "parent", null);
        setField(term999, term999.getClass(), "next", term1001);
        setIntField(term1004, term1004.getClass(), "type", 0);
        setField(term1004, term1004.getClass(), "next", null);
        setField(term1004, term1004.getClass(), "first", null);
        setField(term1004, term1004.getClass(), "last", null);
        setField(term1004, term1004.getClass(), "propListHead", null);
        setIntField(term1004, term1004.getClass(), "sourcePosition", 0);
        setField(term1004, term1004.getClass(), "jsType", null);
        setField(term1004, term1004.getClass(), "parent", null);
        setField(term999, term999.getClass(), "first", term1004);
        setIntField(term1007, term1007.getClass(), "type", 0);
        setField(term1007, term1007.getClass(), "next", null);
        setField(term1007, term1007.getClass(), "first", null);
        setField(term1007, term1007.getClass(), "last", null);
        setField(term1007, term1007.getClass(), "propListHead", null);
        setIntField(term1007, term1007.getClass(), "sourcePosition", 0);
        setField(term1007, term1007.getClass(), "jsType", null);
        setField(term1007, term1007.getClass(), "parent", null);
        setField(term999, term999.getClass(), "last", term1007);
        setField(term1010, term1010.getClass(), "next", null);
        setIntField(term1010, term1010.getClass(), "type", 0);
        setIntField(term1010, term1010.getClass(), "intValue", 0);
        setField(term1010, term1010.getClass(), "objectValue", null);
        setField(term999, term999.getClass(), "propListHead", term1010);
        setIntField(term999, term999.getClass(), "sourcePosition", -525257914);
        setField(term999, term999.getClass(), "jsType", null);
        setField(term999, term999.getClass(), "parent", null);
        setField(term997, term997.getClass(), "next", term999);
        setIntField(term1014, term1014.getClass(), "type", 0);
        setField(term1014, term1014.getClass(), "next", null);
        setField(term1014, term1014.getClass(), "first", null);
        setField(term1014, term1014.getClass(), "last", null);
        setField(term1014, term1014.getClass(), "propListHead", null);
        setIntField(term1014, term1014.getClass(), "sourcePosition", 0);
        setField(term1014, term1014.getClass(), "jsType", null);
        setField(term1014, term1014.getClass(), "parent", null);
        setField(term997, term997.getClass(), "first", term1014);
        setIntField(term1017, term1017.getClass(), "type", 0);
        setField(term1017, term1017.getClass(), "next", null);
        setField(term1017, term1017.getClass(), "first", null);
        setField(term1017, term1017.getClass(), "last", null);
        setField(term1017, term1017.getClass(), "propListHead", null);
        setIntField(term1017, term1017.getClass(), "sourcePosition", 0);
        setField(term1017, term1017.getClass(), "jsType", null);
        setField(term1017, term1017.getClass(), "parent", null);
        setField(term997, term997.getClass(), "last", term1017);
        setField(term1020, term1020.getClass(), "next", null);
        setIntField(term1020, term1020.getClass(), "type", 0);
        setIntField(term1020, term1020.getClass(), "intValue", 0);
        setField(term1020, term1020.getClass(), "objectValue", null);
        setField(term997, term997.getClass(), "propListHead", term1020);
        setIntField(term997, term997.getClass(), "sourcePosition", 147209682);
        setField(term997, term997.getClass(), "jsType", null);
        setField(term997, term997.getClass(), "parent", null);
        term1024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1037 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1047 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1024, term1024.getClass(), "type", -945116798);
        setIntField(term1026, term1026.getClass(), "type", -129547140);
        setIntField(term1028, term1028.getClass(), "type", 0);
        setField(term1028, term1028.getClass(), "next", null);
        setField(term1028, term1028.getClass(), "first", null);
        setField(term1028, term1028.getClass(), "last", null);
        setField(term1028, term1028.getClass(), "propListHead", null);
        setIntField(term1028, term1028.getClass(), "sourcePosition", 0);
        setField(term1028, term1028.getClass(), "jsType", null);
        setField(term1028, term1028.getClass(), "parent", null);
        setField(term1026, term1026.getClass(), "next", term1028);
        setIntField(term1031, term1031.getClass(), "type", 0);
        setField(term1031, term1031.getClass(), "next", null);
        setField(term1031, term1031.getClass(), "first", null);
        setField(term1031, term1031.getClass(), "last", null);
        setField(term1031, term1031.getClass(), "propListHead", null);
        setIntField(term1031, term1031.getClass(), "sourcePosition", 0);
        setField(term1031, term1031.getClass(), "jsType", null);
        setField(term1031, term1031.getClass(), "parent", null);
        setField(term1026, term1026.getClass(), "first", term1031);
        setIntField(term1034, term1034.getClass(), "type", 0);
        setField(term1034, term1034.getClass(), "next", null);
        setField(term1034, term1034.getClass(), "first", null);
        setField(term1034, term1034.getClass(), "last", null);
        setField(term1034, term1034.getClass(), "propListHead", null);
        setIntField(term1034, term1034.getClass(), "sourcePosition", 0);
        setField(term1034, term1034.getClass(), "jsType", null);
        setField(term1034, term1034.getClass(), "parent", null);
        setField(term1026, term1026.getClass(), "last", term1034);
        setField(term1037, term1037.getClass(), "next", null);
        setIntField(term1037, term1037.getClass(), "type", 0);
        setIntField(term1037, term1037.getClass(), "intValue", 0);
        setField(term1037, term1037.getClass(), "objectValue", null);
        setField(term1026, term1026.getClass(), "propListHead", term1037);
        setIntField(term1026, term1026.getClass(), "sourcePosition", -376422566);
        setField(term1026, term1026.getClass(), "jsType", null);
        setField(term1026, term1026.getClass(), "parent", null);
        setField(term1024, term1024.getClass(), "next", term1026);
        setIntField(term1041, term1041.getClass(), "type", 0);
        setField(term1041, term1041.getClass(), "next", null);
        setField(term1041, term1041.getClass(), "first", null);
        setField(term1041, term1041.getClass(), "last", null);
        setField(term1041, term1041.getClass(), "propListHead", null);
        setIntField(term1041, term1041.getClass(), "sourcePosition", 0);
        setField(term1041, term1041.getClass(), "jsType", null);
        setField(term1041, term1041.getClass(), "parent", null);
        setField(term1024, term1024.getClass(), "first", term1041);
        setIntField(term1044, term1044.getClass(), "type", 0);
        setField(term1044, term1044.getClass(), "next", null);
        setField(term1044, term1044.getClass(), "first", null);
        setField(term1044, term1044.getClass(), "last", null);
        setField(term1044, term1044.getClass(), "propListHead", null);
        setIntField(term1044, term1044.getClass(), "sourcePosition", 0);
        setField(term1044, term1044.getClass(), "jsType", null);
        setField(term1044, term1044.getClass(), "parent", null);
        setField(term1024, term1024.getClass(), "last", term1044);
        setField(term1047, term1047.getClass(), "next", null);
        setIntField(term1047, term1047.getClass(), "type", 0);
        setIntField(term1047, term1047.getClass(), "intValue", 0);
        setField(term1047, term1047.getClass(), "objectValue", null);
        setField(term1024, term1024.getClass(), "propListHead", term1047);
        setIntField(term1024, term1024.getClass(), "sourcePosition", 306847454);
        setField(term1024, term1024.getClass(), "jsType", null);
        setField(term1024, term1024.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term997;
        args[1] = term1024;
        args[2] = "IoAlmYsBwc";
        try {
            callMethod(klass, "checkHookBranchReadBeforeKill", argTypes, term980, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


