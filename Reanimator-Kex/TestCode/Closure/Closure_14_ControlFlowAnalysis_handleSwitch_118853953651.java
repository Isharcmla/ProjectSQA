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
import java.util.ArrayDeque;

public class ControlFlowAnalysis_handleSwitch_118853953651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term975;
     Object term1035;

    public ControlFlowAnalysis_handleSwitch_118853953651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term977 = new HashMap();
        Object term986 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term986, term986.getClass(), "elementData", null);
        setIntField(term986, term986.getClass(), "size", 2049577015);
        setIntField(term986, term986.getClass(), "modCount", 1236004505);
        Object term989 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term989, term989.getClass(), "elementData", null);
        setIntField(term989, term989.getClass(), "size", 1050765721);
        setIntField(term989, term989.getClass(), "modCount", 474518942);
        Object term992 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term992, term992.getClass(), "elementData", null);
        setIntField(term992, term992.getClass(), "size", -1656687479);
        setIntField(term992, term992.getClass(), "modCount", -249614216);
        Object term995 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term995, term995.getClass(), "elementData", null);
        setIntField(term995, term995.getClass(), "size", 1870727665);
        setIntField(term995, term995.getClass(), "modCount", -519881101);
        Object term998 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term998, term998.getClass(), "elementData", null);
        setIntField(term998, term998.getClass(), "size", -680920524);
        setIntField(term998, term998.getClass(), "modCount", -916335264);
        Object term1001 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1001, term1001.getClass(), "elementData", null);
        setIntField(term1001, term1001.getClass(), "size", -919416536);
        setIntField(term1001, term1001.getClass(), "modCount", -43417861);
        Object term1004 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1004, term1004.getClass(), "elementData", null);
        setIntField(term1004, term1004.getClass(), "size", -1533843432);
        setIntField(term1004, term1004.getClass(), "modCount", -123338791);
        ArrayDeque term984 = new ArrayDeque();
        ((ArrayDeque) term984).add(term986);
        ((ArrayDeque) term984).add(term989);
        ((ArrayDeque) term984).add(term992);
        ((ArrayDeque) term984).add(term995);
        ((ArrayDeque) term984).add(term998);
        ((ArrayDeque) term984).add(term1001);
        ((ArrayDeque) term984).add(term1004);
        ArrayDeque term1009 = new ArrayDeque();
        HashMap term1013 = new HashMap();
        HashMap term1026 = new HashMap();
        term975 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term976 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term975, term975.getClass(), "compiler", null);
        setField(term976, term976.getClass(), "implicitReturn", null);
        setField(term976, term976.getClass(), "entry", null);
        setField(term976, term976.getClass(), "nodes", term977);
        setBooleanField(term976, term976.getClass(), "useNodeAnnotations", true);
        setBooleanField(term976, term976.getClass(), "useEdgeAnnotations", true);
        setField(term976, term976.getClass(), "nodeAnnotationStack", term984);
        setField(term976, term976.getClass(), "edgeAnnotationStack", term1009);
        setField(term975, term975.getClass(), "cfg", term976);
        setField(term975, term975.getClass(), "astPosition", term1013);
        setField(term975, term975.getClass(), "nodePriorities", term1026);
        setField(term975, term975.getClass(), "priorityComparator", null);
        setIntField(term975, term975.getClass(), "astPositionCounter", 0);
        setIntField(term975, term975.getClass(), "priorityCounter", 0);
        setBooleanField(term975, term975.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term975, term975.getClass(), "edgeAnnotations", false);
        setField(term975, term975.getClass(), "root", null);
        setField(term975, term975.getClass(), "exceptionHandler", null);
        setField(term975, term975.getClass(), "finallyMap", null);
        term1035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1035, term1035.getClass(), "type", 32185364);
        setIntField(term1037, term1037.getClass(), "type", 1768204942);
        setIntField(term1039, term1039.getClass(), "type", 1252951645);
        setIntField(term1041, term1041.getClass(), "type", 574481092);
        setIntField(term1043, term1043.getClass(), "type", -310528004);
        setField(term1043, term1043.getClass(), "next", null);
        setField(term1043, term1043.getClass(), "first", null);
        setField(term1043, term1043.getClass(), "last", null);
        setField(term1043, term1043.getClass(), "propListHead", null);
        setIntField(term1043, term1043.getClass(), "sourcePosition", 0);
        setField(term1043, term1043.getClass(), "jsType", null);
        setField(term1043, term1043.getClass(), "parent", null);
        setField(term1041, term1041.getClass(), "next", term1043);
        setIntField(term1046, term1046.getClass(), "type", -634976996);
        setField(term1046, term1046.getClass(), "next", null);
        setField(term1046, term1046.getClass(), "first", null);
        setField(term1046, term1046.getClass(), "last", term1043);
        setField(term1046, term1046.getClass(), "propListHead", null);
        setIntField(term1046, term1046.getClass(), "sourcePosition", 0);
        setField(term1046, term1046.getClass(), "jsType", null);
        setField(term1046, term1046.getClass(), "parent", null);
        setField(term1041, term1041.getClass(), "first", term1046);
        setField(term1041, term1041.getClass(), "last", term1039);
        setField(term1041, term1041.getClass(), "propListHead", null);
        setIntField(term1041, term1041.getClass(), "sourcePosition", 0);
        setField(term1041, term1041.getClass(), "jsType", null);
        setField(term1041, term1041.getClass(), "parent", null);
        setField(term1039, term1039.getClass(), "next", term1041);
        setField(term1039, term1039.getClass(), "first", term1043);
        setIntField(term1050, term1050.getClass(), "type", -49052672);
        setIntField(term1052, term1052.getClass(), "type", 339372704);
        setField(term1052, term1052.getClass(), "next", null);
        setField(term1052, term1052.getClass(), "first", term1046);
        setField(term1052, term1052.getClass(), "last", term1041);
        setField(term1052, term1052.getClass(), "propListHead", null);
        setIntField(term1052, term1052.getClass(), "sourcePosition", 0);
        setField(term1052, term1052.getClass(), "jsType", null);
        setField(term1052, term1052.getClass(), "parent", null);
        setField(term1050, term1050.getClass(), "next", term1052);
        setField(term1050, term1050.getClass(), "first", term1037);
        setField(term1050, term1050.getClass(), "last", term1037);
        setField(term1050, term1050.getClass(), "propListHead", null);
        setIntField(term1050, term1050.getClass(), "sourcePosition", 0);
        setField(term1050, term1050.getClass(), "jsType", null);
        setField(term1050, term1050.getClass(), "parent", null);
        setField(term1039, term1039.getClass(), "last", term1050);
        setField(term1039, term1039.getClass(), "propListHead", null);
        setIntField(term1039, term1039.getClass(), "sourcePosition", 0);
        setField(term1039, term1039.getClass(), "jsType", null);
        setField(term1039, term1039.getClass(), "parent", null);
        setField(term1037, term1037.getClass(), "next", term1039);
        setIntField(term1057, term1057.getClass(), "type", -851097944);
        setField(term1057, term1057.getClass(), "next", term1050);
        setField(term1057, term1057.getClass(), "first", term1052);
        setField(term1057, term1057.getClass(), "last", term1035);
        setField(term1057, term1057.getClass(), "propListHead", null);
        setIntField(term1057, term1057.getClass(), "sourcePosition", 0);
        setField(term1057, term1057.getClass(), "jsType", null);
        setField(term1057, term1057.getClass(), "parent", null);
        setField(term1037, term1037.getClass(), "first", term1057);
        setField(term1037, term1037.getClass(), "last", term1057);
        setField(term1037, term1037.getClass(), "propListHead", null);
        setIntField(term1037, term1037.getClass(), "sourcePosition", 0);
        setField(term1037, term1037.getClass(), "jsType", null);
        setField(term1037, term1037.getClass(), "parent", null);
        setField(term1035, term1035.getClass(), "next", term1037);
        setField(term1035, term1035.getClass(), "first", term1041);
        setField(term1035, term1035.getClass(), "last", term1043);
        setField(term1035, term1035.getClass(), "propListHead", null);
        setIntField(term1035, term1035.getClass(), "sourcePosition", 0);
        setField(term1035, term1035.getClass(), "jsType", null);
        setField(term1035, term1035.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1035;
        try {
            callMethod(klass, "handleSwitch", argTypes, term975, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


