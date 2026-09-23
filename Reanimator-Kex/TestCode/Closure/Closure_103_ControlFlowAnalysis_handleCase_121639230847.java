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

public class ControlFlowAnalysis_handleCase_121639230847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term991;
     Object term1057;

    public ControlFlowAnalysis_handleCase_121639230847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term993 = new HashMap();
        Object term1000 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1000, term1000.getClass(), "elementData", null);
        setIntField(term1000, term1000.getClass(), "size", 798043553);
        setIntField(term1000, term1000.getClass(), "modCount", 533197381);
        Object term1003 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1003, term1003.getClass(), "elementData", null);
        setIntField(term1003, term1003.getClass(), "size", 1048271679);
        setIntField(term1003, term1003.getClass(), "modCount", -1529797673);
        Object term1006 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1006, term1006.getClass(), "elementData", null);
        setIntField(term1006, term1006.getClass(), "size", -868676396);
        setIntField(term1006, term1006.getClass(), "modCount", 1922684808);
        Object term1009 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1009, term1009.getClass(), "elementData", null);
        setIntField(term1009, term1009.getClass(), "size", -2005784375);
        setIntField(term1009, term1009.getClass(), "modCount", -288604325);
        Object term1012 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1012, term1012.getClass(), "elementData", null);
        setIntField(term1012, term1012.getClass(), "size", -1268314569);
        setIntField(term1012, term1012.getClass(), "modCount", 877649659);
        Object term1015 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1015, term1015.getClass(), "elementData", null);
        setIntField(term1015, term1015.getClass(), "size", -1332748804);
        setIntField(term1015, term1015.getClass(), "modCount", 1774507971);
        Object term1018 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1018, term1018.getClass(), "elementData", null);
        setIntField(term1018, term1018.getClass(), "size", -1420269858);
        setIntField(term1018, term1018.getClass(), "modCount", -2119545015);
        Object term1021 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1021, term1021.getClass(), "elementData", null);
        setIntField(term1021, term1021.getClass(), "size", 1272542218);
        setIntField(term1021, term1021.getClass(), "modCount", 1209799204);
        Object term1024 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1024, term1024.getClass(), "elementData", null);
        setIntField(term1024, term1024.getClass(), "size", 1094107751);
        setIntField(term1024, term1024.getClass(), "modCount", 844222656);
        ArrayDeque term998 = new ArrayDeque();
        ((ArrayDeque) term998).add(term1000);
        ((ArrayDeque) term998).add(term1003);
        ((ArrayDeque) term998).add(term1006);
        ((ArrayDeque) term998).add(term1009);
        ((ArrayDeque) term998).add(term1012);
        ((ArrayDeque) term998).add(term1015);
        ((ArrayDeque) term998).add(term1018);
        ((ArrayDeque) term998).add(term1021);
        ((ArrayDeque) term998).add(term1024);
        Object term1031 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1031, term1031.getClass(), "elementData", null);
        setIntField(term1031, term1031.getClass(), "size", -18216811);
        setIntField(term1031, term1031.getClass(), "modCount", -1813280137);
        ArrayDeque term1029 = new ArrayDeque();
        ((ArrayDeque) term1029).add(term1031);
        ((ArrayDeque) term1029).add(term1012);
        ((ArrayDeque) term1029).add(term1015);
        ((ArrayDeque) term1029).add(term1003);
        ((ArrayDeque) term1029).add(term1021);
        ((ArrayDeque) term1029).add(term1024);
        HashMap term1036 = new HashMap();
        HashMap term1049 = new HashMap();
        term991 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term992 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term991, term991.getClass(), "compiler", null);
        setField(term992, term992.getClass(), "implicitReturn", null);
        setField(term992, term992.getClass(), "entry", null);
        setField(term992, term992.getClass(), "nodes", term993);
        setField(term992, term992.getClass(), "nodeAnnotationStack", term998);
        setField(term992, term992.getClass(), "edgeAnnotationStack", term1029);
        setField(term991, term991.getClass(), "cfg", term992);
        setField(term991, term991.getClass(), "astPosition", term1036);
        setField(term991, term991.getClass(), "nodePriorities", term1049);
        setField(term991, term991.getClass(), "priorityComparator", null);
        setIntField(term991, term991.getClass(), "astPositionCounter", 0);
        setIntField(term991, term991.getClass(), "priorityCounter", 0);
        setBooleanField(term991, term991.getClass(), "shouldTraverseFunctions", false);
        setField(term991, term991.getClass(), "root", null);
        setField(term991, term991.getClass(), "exceptionHandler", null);
        setField(term991, term991.getClass(), "finallyMap", null);
        term1057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1070 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1080 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1057, term1057.getClass(), "type", -1553893255);
        setIntField(term1059, term1059.getClass(), "type", 1559605714);
        setIntField(term1061, term1061.getClass(), "type", 0);
        setField(term1061, term1061.getClass(), "next", null);
        setField(term1061, term1061.getClass(), "first", null);
        setField(term1061, term1061.getClass(), "last", null);
        setField(term1061, term1061.getClass(), "propListHead", null);
        setIntField(term1061, term1061.getClass(), "sourcePosition", 0);
        setField(term1061, term1061.getClass(), "jsType", null);
        setField(term1061, term1061.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "next", term1061);
        setIntField(term1064, term1064.getClass(), "type", 0);
        setField(term1064, term1064.getClass(), "next", null);
        setField(term1064, term1064.getClass(), "first", null);
        setField(term1064, term1064.getClass(), "last", null);
        setField(term1064, term1064.getClass(), "propListHead", null);
        setIntField(term1064, term1064.getClass(), "sourcePosition", 0);
        setField(term1064, term1064.getClass(), "jsType", null);
        setField(term1064, term1064.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "first", term1064);
        setIntField(term1067, term1067.getClass(), "type", 0);
        setField(term1067, term1067.getClass(), "next", null);
        setField(term1067, term1067.getClass(), "first", null);
        setField(term1067, term1067.getClass(), "last", null);
        setField(term1067, term1067.getClass(), "propListHead", null);
        setIntField(term1067, term1067.getClass(), "sourcePosition", 0);
        setField(term1067, term1067.getClass(), "jsType", null);
        setField(term1067, term1067.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "last", term1067);
        setField(term1070, term1070.getClass(), "next", null);
        setIntField(term1070, term1070.getClass(), "type", 0);
        setIntField(term1070, term1070.getClass(), "intValue", 0);
        setField(term1070, term1070.getClass(), "objectValue", null);
        setField(term1059, term1059.getClass(), "propListHead", term1070);
        setIntField(term1059, term1059.getClass(), "sourcePosition", -1629418973);
        setField(term1059, term1059.getClass(), "jsType", null);
        setField(term1059, term1059.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "next", term1059);
        setIntField(term1074, term1074.getClass(), "type", 0);
        setField(term1074, term1074.getClass(), "next", null);
        setField(term1074, term1074.getClass(), "first", null);
        setField(term1074, term1074.getClass(), "last", null);
        setField(term1074, term1074.getClass(), "propListHead", null);
        setIntField(term1074, term1074.getClass(), "sourcePosition", 0);
        setField(term1074, term1074.getClass(), "jsType", null);
        setField(term1074, term1074.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "first", term1074);
        setIntField(term1077, term1077.getClass(), "type", 0);
        setField(term1077, term1077.getClass(), "next", null);
        setField(term1077, term1077.getClass(), "first", null);
        setField(term1077, term1077.getClass(), "last", null);
        setField(term1077, term1077.getClass(), "propListHead", null);
        setIntField(term1077, term1077.getClass(), "sourcePosition", 0);
        setField(term1077, term1077.getClass(), "jsType", null);
        setField(term1077, term1077.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "last", term1077);
        setField(term1080, term1080.getClass(), "next", null);
        setIntField(term1080, term1080.getClass(), "type", 0);
        setIntField(term1080, term1080.getClass(), "intValue", 0);
        setField(term1080, term1080.getClass(), "objectValue", null);
        setField(term1057, term1057.getClass(), "propListHead", term1080);
        setIntField(term1057, term1057.getClass(), "sourcePosition", -100825168);
        setField(term1057, term1057.getClass(), "jsType", null);
        setField(term1057, term1057.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1057;
        try {
            callMethod(klass, "handleCase", argTypes, term991, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


