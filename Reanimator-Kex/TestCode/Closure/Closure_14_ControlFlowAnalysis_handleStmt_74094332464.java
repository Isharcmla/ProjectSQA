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

public class ControlFlowAnalysis_handleStmt_74094332464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2121;
     Object term2175;

    public ControlFlowAnalysis_handleStmt_74094332464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2123 = new HashMap();
        Object term2132 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2132, term2132.getClass(), "elementData", null);
        setIntField(term2132, term2132.getClass(), "size", -1677599962);
        setIntField(term2132, term2132.getClass(), "modCount", -1790275458);
        Object term2135 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2135, term2135.getClass(), "elementData", null);
        setIntField(term2135, term2135.getClass(), "size", -497534255);
        setIntField(term2135, term2135.getClass(), "modCount", 1588942911);
        Object term2138 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2138, term2138.getClass(), "elementData", null);
        setIntField(term2138, term2138.getClass(), "size", -2129828854);
        setIntField(term2138, term2138.getClass(), "modCount", -47438786);
        ArrayDeque term2130 = new ArrayDeque();
        ((ArrayDeque) term2130).add(term2132);
        ((ArrayDeque) term2130).add(term2135);
        ((ArrayDeque) term2130).add(term2138);
        Object term2145 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2145, term2145.getClass(), "elementData", null);
        setIntField(term2145, term2145.getClass(), "size", -1955400589);
        setIntField(term2145, term2145.getClass(), "modCount", 626179200);
        Object term2148 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2148, term2148.getClass(), "elementData", null);
        setIntField(term2148, term2148.getClass(), "size", -511077684);
        setIntField(term2148, term2148.getClass(), "modCount", -711507760);
        ArrayDeque term2143 = new ArrayDeque();
        ((ArrayDeque) term2143).add(term2145);
        ((ArrayDeque) term2143).add(term2148);
        HashMap term2153 = new HashMap();
        HashMap term2166 = new HashMap();
        term2121 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term2122 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term2121, term2121.getClass(), "compiler", null);
        setField(term2122, term2122.getClass(), "implicitReturn", null);
        setField(term2122, term2122.getClass(), "entry", null);
        setField(term2122, term2122.getClass(), "nodes", term2123);
        setBooleanField(term2122, term2122.getClass(), "useNodeAnnotations", true);
        setBooleanField(term2122, term2122.getClass(), "useEdgeAnnotations", true);
        setField(term2122, term2122.getClass(), "nodeAnnotationStack", term2130);
        setField(term2122, term2122.getClass(), "edgeAnnotationStack", term2143);
        setField(term2121, term2121.getClass(), "cfg", term2122);
        setField(term2121, term2121.getClass(), "astPosition", term2153);
        setField(term2121, term2121.getClass(), "nodePriorities", term2166);
        setField(term2121, term2121.getClass(), "priorityComparator", null);
        setIntField(term2121, term2121.getClass(), "astPositionCounter", 0);
        setIntField(term2121, term2121.getClass(), "priorityCounter", 0);
        setBooleanField(term2121, term2121.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term2121, term2121.getClass(), "edgeAnnotations", false);
        setField(term2121, term2121.getClass(), "root", null);
        setField(term2121, term2121.getClass(), "exceptionHandler", null);
        setField(term2121, term2121.getClass(), "finallyMap", null);
        term2175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2175, term2175.getClass(), "type", -1632929393);
        setIntField(term2177, term2177.getClass(), "type", -431440129);
        setIntField(term2179, term2179.getClass(), "type", -763576148);
        setIntField(term2181, term2181.getClass(), "type", 1568948514);
        setIntField(term2183, term2183.getClass(), "type", -1511130237);
        setField(term2183, term2183.getClass(), "next", null);
        setField(term2183, term2183.getClass(), "first", null);
        setField(term2183, term2183.getClass(), "last", null);
        setField(term2183, term2183.getClass(), "propListHead", null);
        setIntField(term2183, term2183.getClass(), "sourcePosition", 0);
        setField(term2183, term2183.getClass(), "jsType", null);
        setField(term2183, term2183.getClass(), "parent", null);
        setField(term2181, term2181.getClass(), "next", term2183);
        setIntField(term2186, term2186.getClass(), "type", 452088587);
        setField(term2186, term2186.getClass(), "next", null);
        setField(term2186, term2186.getClass(), "first", null);
        setField(term2186, term2186.getClass(), "last", term2183);
        setField(term2186, term2186.getClass(), "propListHead", null);
        setIntField(term2186, term2186.getClass(), "sourcePosition", 0);
        setField(term2186, term2186.getClass(), "jsType", null);
        setField(term2186, term2186.getClass(), "parent", null);
        setField(term2181, term2181.getClass(), "first", term2186);
        setField(term2181, term2181.getClass(), "last", term2179);
        setField(term2181, term2181.getClass(), "propListHead", null);
        setIntField(term2181, term2181.getClass(), "sourcePosition", 0);
        setField(term2181, term2181.getClass(), "jsType", null);
        setField(term2181, term2181.getClass(), "parent", null);
        setField(term2179, term2179.getClass(), "next", term2181);
        setField(term2179, term2179.getClass(), "first", term2183);
        setIntField(term2190, term2190.getClass(), "type", 1499735894);
        setIntField(term2192, term2192.getClass(), "type", 716486048);
        setField(term2192, term2192.getClass(), "next", null);
        setField(term2192, term2192.getClass(), "first", term2186);
        setField(term2192, term2192.getClass(), "last", term2181);
        setField(term2192, term2192.getClass(), "propListHead", null);
        setIntField(term2192, term2192.getClass(), "sourcePosition", 0);
        setField(term2192, term2192.getClass(), "jsType", null);
        setField(term2192, term2192.getClass(), "parent", null);
        setField(term2190, term2190.getClass(), "next", term2192);
        setField(term2190, term2190.getClass(), "first", term2177);
        setField(term2190, term2190.getClass(), "last", term2177);
        setField(term2190, term2190.getClass(), "propListHead", null);
        setIntField(term2190, term2190.getClass(), "sourcePosition", 0);
        setField(term2190, term2190.getClass(), "jsType", null);
        setField(term2190, term2190.getClass(), "parent", null);
        setField(term2179, term2179.getClass(), "last", term2190);
        setField(term2179, term2179.getClass(), "propListHead", null);
        setIntField(term2179, term2179.getClass(), "sourcePosition", 0);
        setField(term2179, term2179.getClass(), "jsType", null);
        setField(term2179, term2179.getClass(), "parent", null);
        setField(term2177, term2177.getClass(), "next", term2179);
        setIntField(term2197, term2197.getClass(), "type", -466708718);
        setField(term2197, term2197.getClass(), "next", term2190);
        setField(term2197, term2197.getClass(), "first", term2192);
        setField(term2197, term2197.getClass(), "last", term2175);
        setField(term2197, term2197.getClass(), "propListHead", null);
        setIntField(term2197, term2197.getClass(), "sourcePosition", 0);
        setField(term2197, term2197.getClass(), "jsType", null);
        setField(term2197, term2197.getClass(), "parent", null);
        setField(term2177, term2177.getClass(), "first", term2197);
        setField(term2177, term2177.getClass(), "last", term2197);
        setField(term2177, term2177.getClass(), "propListHead", null);
        setIntField(term2177, term2177.getClass(), "sourcePosition", 0);
        setField(term2177, term2177.getClass(), "jsType", null);
        setField(term2177, term2177.getClass(), "parent", null);
        setField(term2175, term2175.getClass(), "next", term2177);
        setField(term2175, term2175.getClass(), "first", term2181);
        setField(term2175, term2175.getClass(), "last", term2183);
        setField(term2175, term2175.getClass(), "propListHead", null);
        setIntField(term2175, term2175.getClass(), "sourcePosition", 0);
        setField(term2175, term2175.getClass(), "jsType", null);
        setField(term2175, term2175.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2175;
        try {
            callMethod(klass, "handleStmt", argTypes, term2121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


