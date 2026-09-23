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

public class ControlFlowAnalysis_handleStmt_74094332459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2014;
     Object term2065;

    public ControlFlowAnalysis_handleStmt_74094332459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2016 = new HashMap();
        Object term2023 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2023, term2023.getClass(), "elementData", null);
        setIntField(term2023, term2023.getClass(), "size", 529625347);
        setIntField(term2023, term2023.getClass(), "modCount", 1409095253);
        Object term2026 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2026, term2026.getClass(), "elementData", null);
        setIntField(term2026, term2026.getClass(), "size", 315179039);
        setIntField(term2026, term2026.getClass(), "modCount", -1835923897);
        Object term2029 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2029, term2029.getClass(), "elementData", null);
        setIntField(term2029, term2029.getClass(), "size", -341287775);
        setIntField(term2029, term2029.getClass(), "modCount", -1651110911);
        ArrayDeque term2021 = new ArrayDeque();
        ((ArrayDeque) term2021).add(term2023);
        ((ArrayDeque) term2021).add(term2026);
        ((ArrayDeque) term2021).add(term2029);
        Object term2036 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2036, term2036.getClass(), "elementData", null);
        setIntField(term2036, term2036.getClass(), "size", -1934033808);
        setIntField(term2036, term2036.getClass(), "modCount", 950322609);
        Object term2039 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2039, term2039.getClass(), "elementData", null);
        setIntField(term2039, term2039.getClass(), "size", -2023791789);
        setIntField(term2039, term2039.getClass(), "modCount", 353974456);
        ArrayDeque term2034 = new ArrayDeque();
        ((ArrayDeque) term2034).add(term2036);
        ((ArrayDeque) term2034).add(term2039);
        HashMap term2044 = new HashMap();
        HashMap term2057 = new HashMap();
        term2014 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term2015 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term2014, term2014.getClass(), "compiler", null);
        setField(term2015, term2015.getClass(), "implicitReturn", null);
        setField(term2015, term2015.getClass(), "entry", null);
        setField(term2015, term2015.getClass(), "nodes", term2016);
        setField(term2015, term2015.getClass(), "nodeAnnotationStack", term2021);
        setField(term2015, term2015.getClass(), "edgeAnnotationStack", term2034);
        setField(term2014, term2014.getClass(), "cfg", term2015);
        setField(term2014, term2014.getClass(), "astPosition", term2044);
        setField(term2014, term2014.getClass(), "nodePriorities", term2057);
        setField(term2014, term2014.getClass(), "priorityComparator", null);
        setIntField(term2014, term2014.getClass(), "astPositionCounter", 0);
        setIntField(term2014, term2014.getClass(), "priorityCounter", 0);
        setBooleanField(term2014, term2014.getClass(), "shouldTraverseFunctions", false);
        setField(term2014, term2014.getClass(), "root", null);
        setField(term2014, term2014.getClass(), "exceptionHandler", null);
        setField(term2014, term2014.getClass(), "finallyMap", null);
        term2065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2078 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2088 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2065, term2065.getClass(), "type", -1933419449);
        setIntField(term2067, term2067.getClass(), "type", 335780735);
        setIntField(term2069, term2069.getClass(), "type", 0);
        setField(term2069, term2069.getClass(), "next", null);
        setField(term2069, term2069.getClass(), "first", null);
        setField(term2069, term2069.getClass(), "last", null);
        setField(term2069, term2069.getClass(), "propListHead", null);
        setIntField(term2069, term2069.getClass(), "sourcePosition", 0);
        setField(term2069, term2069.getClass(), "jsType", null);
        setField(term2069, term2069.getClass(), "parent", null);
        setField(term2067, term2067.getClass(), "next", term2069);
        setIntField(term2072, term2072.getClass(), "type", 0);
        setField(term2072, term2072.getClass(), "next", null);
        setField(term2072, term2072.getClass(), "first", null);
        setField(term2072, term2072.getClass(), "last", null);
        setField(term2072, term2072.getClass(), "propListHead", null);
        setIntField(term2072, term2072.getClass(), "sourcePosition", 0);
        setField(term2072, term2072.getClass(), "jsType", null);
        setField(term2072, term2072.getClass(), "parent", null);
        setField(term2067, term2067.getClass(), "first", term2072);
        setIntField(term2075, term2075.getClass(), "type", 0);
        setField(term2075, term2075.getClass(), "next", null);
        setField(term2075, term2075.getClass(), "first", null);
        setField(term2075, term2075.getClass(), "last", null);
        setField(term2075, term2075.getClass(), "propListHead", null);
        setIntField(term2075, term2075.getClass(), "sourcePosition", 0);
        setField(term2075, term2075.getClass(), "jsType", null);
        setField(term2075, term2075.getClass(), "parent", null);
        setField(term2067, term2067.getClass(), "last", term2075);
        setField(term2078, term2078.getClass(), "next", null);
        setIntField(term2078, term2078.getClass(), "type", 0);
        setIntField(term2078, term2078.getClass(), "intValue", 0);
        setField(term2078, term2078.getClass(), "objectValue", null);
        setField(term2067, term2067.getClass(), "propListHead", term2078);
        setIntField(term2067, term2067.getClass(), "sourcePosition", 2059896693);
        setField(term2067, term2067.getClass(), "jsType", null);
        setField(term2067, term2067.getClass(), "parent", null);
        setField(term2065, term2065.getClass(), "next", term2067);
        setIntField(term2082, term2082.getClass(), "type", 0);
        setField(term2082, term2082.getClass(), "next", null);
        setField(term2082, term2082.getClass(), "first", null);
        setField(term2082, term2082.getClass(), "last", null);
        setField(term2082, term2082.getClass(), "propListHead", null);
        setIntField(term2082, term2082.getClass(), "sourcePosition", 0);
        setField(term2082, term2082.getClass(), "jsType", null);
        setField(term2082, term2082.getClass(), "parent", null);
        setField(term2065, term2065.getClass(), "first", term2082);
        setIntField(term2085, term2085.getClass(), "type", 0);
        setField(term2085, term2085.getClass(), "next", null);
        setField(term2085, term2085.getClass(), "first", null);
        setField(term2085, term2085.getClass(), "last", null);
        setField(term2085, term2085.getClass(), "propListHead", null);
        setIntField(term2085, term2085.getClass(), "sourcePosition", 0);
        setField(term2085, term2085.getClass(), "jsType", null);
        setField(term2085, term2085.getClass(), "parent", null);
        setField(term2065, term2065.getClass(), "last", term2085);
        setField(term2088, term2088.getClass(), "next", null);
        setIntField(term2088, term2088.getClass(), "type", 0);
        setIntField(term2088, term2088.getClass(), "intValue", 0);
        setField(term2088, term2088.getClass(), "objectValue", null);
        setField(term2065, term2065.getClass(), "propListHead", term2088);
        setIntField(term2065, term2065.getClass(), "sourcePosition", 2109912812);
        setField(term2065, term2065.getClass(), "jsType", null);
        setField(term2065, term2065.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2065;
        try {
            callMethod(klass, "handleStmt", argTypes, term2014, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


