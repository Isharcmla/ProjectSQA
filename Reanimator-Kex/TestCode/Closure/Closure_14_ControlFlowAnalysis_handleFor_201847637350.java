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

public class ControlFlowAnalysis_handleFor_201847637350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891;
     Object term948;

    public ControlFlowAnalysis_handleFor_201847637350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term893 = new HashMap();
        ArrayDeque term900 = new ArrayDeque();
        Object term906 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term906, term906.getClass(), "elementData", null);
        setIntField(term906, term906.getClass(), "size", 1460722225);
        setIntField(term906, term906.getClass(), "modCount", 1743224434);
        Object term909 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term909, term909.getClass(), "elementData", null);
        setIntField(term909, term909.getClass(), "size", 842904495);
        setIntField(term909, term909.getClass(), "modCount", 1008080511);
        Object term912 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term912, term912.getClass(), "elementData", null);
        setIntField(term912, term912.getClass(), "size", 1935707624);
        setIntField(term912, term912.getClass(), "modCount", 1507074215);
        Object term915 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term915, term915.getClass(), "elementData", null);
        setIntField(term915, term915.getClass(), "size", -282881827);
        setIntField(term915, term915.getClass(), "modCount", -1183353915);
        Object term918 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term918, term918.getClass(), "elementData", null);
        setIntField(term918, term918.getClass(), "size", -420030135);
        setIntField(term918, term918.getClass(), "modCount", 267763294);
        Object term921 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term921, term921.getClass(), "elementData", null);
        setIntField(term921, term921.getClass(), "size", -1497710478);
        setIntField(term921, term921.getClass(), "modCount", 49950830);
        ArrayDeque term904 = new ArrayDeque();
        ((ArrayDeque) term904).add(term906);
        ((ArrayDeque) term904).add(term909);
        ((ArrayDeque) term904).add(term912);
        ((ArrayDeque) term904).add(term915);
        ((ArrayDeque) term904).add(term918);
        ((ArrayDeque) term904).add(term921);
        HashMap term926 = new HashMap();
        HashMap term939 = new HashMap();
        term891 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term892 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term891, term891.getClass(), "compiler", null);
        setField(term892, term892.getClass(), "implicitReturn", null);
        setField(term892, term892.getClass(), "entry", null);
        setField(term892, term892.getClass(), "nodes", term893);
        setBooleanField(term892, term892.getClass(), "useNodeAnnotations", false);
        setBooleanField(term892, term892.getClass(), "useEdgeAnnotations", false);
        setField(term892, term892.getClass(), "nodeAnnotationStack", term900);
        setField(term892, term892.getClass(), "edgeAnnotationStack", term904);
        setField(term891, term891.getClass(), "cfg", term892);
        setField(term891, term891.getClass(), "astPosition", term926);
        setField(term891, term891.getClass(), "nodePriorities", term939);
        setField(term891, term891.getClass(), "priorityComparator", null);
        setIntField(term891, term891.getClass(), "astPositionCounter", 0);
        setIntField(term891, term891.getClass(), "priorityCounter", 0);
        setBooleanField(term891, term891.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term891, term891.getClass(), "edgeAnnotations", false);
        setField(term891, term891.getClass(), "root", null);
        setField(term891, term891.getClass(), "exceptionHandler", null);
        setField(term891, term891.getClass(), "finallyMap", null);
        term948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term948, term948.getClass(), "type", 1593461795);
        setIntField(term950, term950.getClass(), "type", 515182546);
        setIntField(term952, term952.getClass(), "type", -936895502);
        setIntField(term954, term954.getClass(), "type", -129547140);
        setIntField(term956, term956.getClass(), "type", 199287428);
        setField(term956, term956.getClass(), "next", null);
        setField(term956, term956.getClass(), "first", null);
        setField(term956, term956.getClass(), "last", null);
        setField(term956, term956.getClass(), "propListHead", null);
        setIntField(term956, term956.getClass(), "sourcePosition", 0);
        setField(term956, term956.getClass(), "jsType", null);
        setField(term956, term956.getClass(), "parent", null);
        setField(term954, term954.getClass(), "next", term956);
        setIntField(term959, term959.getClass(), "type", -1195339592);
        setField(term959, term959.getClass(), "next", null);
        setField(term959, term959.getClass(), "first", null);
        setField(term959, term959.getClass(), "last", term956);
        setField(term959, term959.getClass(), "propListHead", null);
        setIntField(term959, term959.getClass(), "sourcePosition", 0);
        setField(term959, term959.getClass(), "jsType", null);
        setField(term959, term959.getClass(), "parent", null);
        setField(term954, term954.getClass(), "first", term959);
        setField(term954, term954.getClass(), "last", term952);
        setField(term954, term954.getClass(), "propListHead", null);
        setIntField(term954, term954.getClass(), "sourcePosition", 0);
        setField(term954, term954.getClass(), "jsType", null);
        setField(term954, term954.getClass(), "parent", null);
        setField(term952, term952.getClass(), "next", term954);
        setField(term952, term952.getClass(), "first", term956);
        setIntField(term963, term963.getClass(), "type", 306847454);
        setIntField(term965, term965.getClass(), "type", 1745276158);
        setField(term965, term965.getClass(), "next", null);
        setField(term965, term965.getClass(), "first", term959);
        setField(term965, term965.getClass(), "last", term954);
        setField(term965, term965.getClass(), "propListHead", null);
        setIntField(term965, term965.getClass(), "sourcePosition", 0);
        setField(term965, term965.getClass(), "jsType", null);
        setField(term965, term965.getClass(), "parent", null);
        setField(term963, term963.getClass(), "next", term965);
        setField(term963, term963.getClass(), "first", term950);
        setField(term963, term963.getClass(), "last", term950);
        setField(term963, term963.getClass(), "propListHead", null);
        setIntField(term963, term963.getClass(), "sourcePosition", 0);
        setField(term963, term963.getClass(), "jsType", null);
        setField(term963, term963.getClass(), "parent", null);
        setField(term952, term952.getClass(), "last", term963);
        setField(term952, term952.getClass(), "propListHead", null);
        setIntField(term952, term952.getClass(), "sourcePosition", 0);
        setField(term952, term952.getClass(), "jsType", null);
        setField(term952, term952.getClass(), "parent", null);
        setField(term950, term950.getClass(), "next", term952);
        setIntField(term970, term970.getClass(), "type", 2009020256);
        setField(term970, term970.getClass(), "next", term963);
        setField(term970, term970.getClass(), "first", term965);
        setField(term970, term970.getClass(), "last", term948);
        setField(term970, term970.getClass(), "propListHead", null);
        setIntField(term970, term970.getClass(), "sourcePosition", 0);
        setField(term970, term970.getClass(), "jsType", null);
        setField(term970, term970.getClass(), "parent", null);
        setField(term950, term950.getClass(), "first", term970);
        setField(term950, term950.getClass(), "last", term970);
        setField(term950, term950.getClass(), "propListHead", null);
        setIntField(term950, term950.getClass(), "sourcePosition", 0);
        setField(term950, term950.getClass(), "jsType", null);
        setField(term950, term950.getClass(), "parent", null);
        setField(term948, term948.getClass(), "next", term950);
        setField(term948, term948.getClass(), "first", term954);
        setField(term948, term948.getClass(), "last", term956);
        setField(term948, term948.getClass(), "propListHead", null);
        setIntField(term948, term948.getClass(), "sourcePosition", 0);
        setField(term948, term948.getClass(), "jsType", null);
        setField(term948, term948.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term948;
        try {
            callMethod(klass, "handleFor", argTypes, term891, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


