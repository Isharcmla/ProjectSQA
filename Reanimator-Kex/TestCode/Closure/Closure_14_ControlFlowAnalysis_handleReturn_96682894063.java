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

public class ControlFlowAnalysis_handleReturn_96682894063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2025;
     Object term2094;

    public ControlFlowAnalysis_handleReturn_96682894063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2027 = new HashMap();
        Object term2036 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2036, term2036.getClass(), "elementData", null);
        setIntField(term2036, term2036.getClass(), "size", -573608449);
        setIntField(term2036, term2036.getClass(), "modCount", -1660057757);
        Object term2039 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2039, term2039.getClass(), "elementData", null);
        setIntField(term2039, term2039.getClass(), "size", 1816273440);
        setIntField(term2039, term2039.getClass(), "modCount", -96541009);
        Object term2042 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2042, term2042.getClass(), "elementData", null);
        setIntField(term2042, term2042.getClass(), "size", -43719302);
        setIntField(term2042, term2042.getClass(), "modCount", 1024134939);
        Object term2045 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2045, term2045.getClass(), "elementData", null);
        setIntField(term2045, term2045.getClass(), "size", 109078154);
        setIntField(term2045, term2045.getClass(), "modCount", -314165467);
        Object term2048 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2048, term2048.getClass(), "elementData", null);
        setIntField(term2048, term2048.getClass(), "size", 963694071);
        setIntField(term2048, term2048.getClass(), "modCount", -995785731);
        Object term2051 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2051, term2051.getClass(), "elementData", null);
        setIntField(term2051, term2051.getClass(), "size", 1349815364);
        setIntField(term2051, term2051.getClass(), "modCount", 2128383340);
        Object term2054 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2054, term2054.getClass(), "elementData", null);
        setIntField(term2054, term2054.getClass(), "size", 1238598518);
        setIntField(term2054, term2054.getClass(), "modCount", -558146961);
        Object term2057 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2057, term2057.getClass(), "elementData", null);
        setIntField(term2057, term2057.getClass(), "size", 1505480070);
        setIntField(term2057, term2057.getClass(), "modCount", -829088844);
        Object term2060 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2060, term2060.getClass(), "elementData", null);
        setIntField(term2060, term2060.getClass(), "size", -31751777);
        setIntField(term2060, term2060.getClass(), "modCount", -246967963);
        ArrayDeque term2034 = new ArrayDeque();
        ((ArrayDeque) term2034).add(term2036);
        ((ArrayDeque) term2034).add(term2039);
        ((ArrayDeque) term2034).add(term2042);
        ((ArrayDeque) term2034).add(term2045);
        ((ArrayDeque) term2034).add(term2048);
        ((ArrayDeque) term2034).add(term2051);
        ((ArrayDeque) term2034).add(term2054);
        ((ArrayDeque) term2034).add(term2057);
        ((ArrayDeque) term2034).add(term2060);
        Object term2067 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term2067, term2067.getClass(), "elementData", null);
        setIntField(term2067, term2067.getClass(), "size", -1777140369);
        setIntField(term2067, term2067.getClass(), "modCount", 993627098);
        ArrayDeque term2065 = new ArrayDeque();
        ((ArrayDeque) term2065).add(term2067);
        HashMap term2072 = new HashMap();
        HashMap term2085 = new HashMap();
        term2025 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term2026 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term2025, term2025.getClass(), "compiler", null);
        setField(term2026, term2026.getClass(), "implicitReturn", null);
        setField(term2026, term2026.getClass(), "entry", null);
        setField(term2026, term2026.getClass(), "nodes", term2027);
        setBooleanField(term2026, term2026.getClass(), "useNodeAnnotations", false);
        setBooleanField(term2026, term2026.getClass(), "useEdgeAnnotations", true);
        setField(term2026, term2026.getClass(), "nodeAnnotationStack", term2034);
        setField(term2026, term2026.getClass(), "edgeAnnotationStack", term2065);
        setField(term2025, term2025.getClass(), "cfg", term2026);
        setField(term2025, term2025.getClass(), "astPosition", term2072);
        setField(term2025, term2025.getClass(), "nodePriorities", term2085);
        setField(term2025, term2025.getClass(), "priorityComparator", null);
        setIntField(term2025, term2025.getClass(), "astPositionCounter", 0);
        setIntField(term2025, term2025.getClass(), "priorityCounter", 0);
        setBooleanField(term2025, term2025.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term2025, term2025.getClass(), "edgeAnnotations", false);
        setField(term2025, term2025.getClass(), "root", null);
        setField(term2025, term2025.getClass(), "exceptionHandler", null);
        setField(term2025, term2025.getClass(), "finallyMap", null);
        term2094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2094, term2094.getClass(), "type", 1104108112);
        setIntField(term2096, term2096.getClass(), "type", 1648665618);
        setIntField(term2098, term2098.getClass(), "type", 633765954);
        setIntField(term2100, term2100.getClass(), "type", 269110087);
        setIntField(term2102, term2102.getClass(), "type", 1545119095);
        setField(term2102, term2102.getClass(), "next", null);
        setField(term2102, term2102.getClass(), "first", null);
        setField(term2102, term2102.getClass(), "last", null);
        setField(term2102, term2102.getClass(), "propListHead", null);
        setIntField(term2102, term2102.getClass(), "sourcePosition", 0);
        setField(term2102, term2102.getClass(), "jsType", null);
        setField(term2102, term2102.getClass(), "parent", null);
        setField(term2100, term2100.getClass(), "next", term2102);
        setIntField(term2105, term2105.getClass(), "type", 1671229683);
        setField(term2105, term2105.getClass(), "next", null);
        setField(term2105, term2105.getClass(), "first", null);
        setField(term2105, term2105.getClass(), "last", term2102);
        setField(term2105, term2105.getClass(), "propListHead", null);
        setIntField(term2105, term2105.getClass(), "sourcePosition", 0);
        setField(term2105, term2105.getClass(), "jsType", null);
        setField(term2105, term2105.getClass(), "parent", null);
        setField(term2100, term2100.getClass(), "first", term2105);
        setField(term2100, term2100.getClass(), "last", term2098);
        setField(term2100, term2100.getClass(), "propListHead", null);
        setIntField(term2100, term2100.getClass(), "sourcePosition", 0);
        setField(term2100, term2100.getClass(), "jsType", null);
        setField(term2100, term2100.getClass(), "parent", null);
        setField(term2098, term2098.getClass(), "next", term2100);
        setField(term2098, term2098.getClass(), "first", term2102);
        setIntField(term2109, term2109.getClass(), "type", -514195141);
        setIntField(term2111, term2111.getClass(), "type", -297946422);
        setField(term2111, term2111.getClass(), "next", null);
        setField(term2111, term2111.getClass(), "first", term2105);
        setField(term2111, term2111.getClass(), "last", term2100);
        setField(term2111, term2111.getClass(), "propListHead", null);
        setIntField(term2111, term2111.getClass(), "sourcePosition", 0);
        setField(term2111, term2111.getClass(), "jsType", null);
        setField(term2111, term2111.getClass(), "parent", null);
        setField(term2109, term2109.getClass(), "next", term2111);
        setField(term2109, term2109.getClass(), "first", term2096);
        setField(term2109, term2109.getClass(), "last", term2096);
        setField(term2109, term2109.getClass(), "propListHead", null);
        setIntField(term2109, term2109.getClass(), "sourcePosition", 0);
        setField(term2109, term2109.getClass(), "jsType", null);
        setField(term2109, term2109.getClass(), "parent", null);
        setField(term2098, term2098.getClass(), "last", term2109);
        setField(term2098, term2098.getClass(), "propListHead", null);
        setIntField(term2098, term2098.getClass(), "sourcePosition", 0);
        setField(term2098, term2098.getClass(), "jsType", null);
        setField(term2098, term2098.getClass(), "parent", null);
        setField(term2096, term2096.getClass(), "next", term2098);
        setIntField(term2116, term2116.getClass(), "type", 385463636);
        setField(term2116, term2116.getClass(), "next", term2109);
        setField(term2116, term2116.getClass(), "first", term2111);
        setField(term2116, term2116.getClass(), "last", term2094);
        setField(term2116, term2116.getClass(), "propListHead", null);
        setIntField(term2116, term2116.getClass(), "sourcePosition", 0);
        setField(term2116, term2116.getClass(), "jsType", null);
        setField(term2116, term2116.getClass(), "parent", null);
        setField(term2096, term2096.getClass(), "first", term2116);
        setField(term2096, term2096.getClass(), "last", term2116);
        setField(term2096, term2096.getClass(), "propListHead", null);
        setIntField(term2096, term2096.getClass(), "sourcePosition", 0);
        setField(term2096, term2096.getClass(), "jsType", null);
        setField(term2096, term2096.getClass(), "parent", null);
        setField(term2094, term2094.getClass(), "next", term2096);
        setField(term2094, term2094.getClass(), "first", term2100);
        setField(term2094, term2094.getClass(), "last", term2102);
        setField(term2094, term2094.getClass(), "propListHead", null);
        setIntField(term2094, term2094.getClass(), "sourcePosition", 0);
        setField(term2094, term2094.getClass(), "jsType", null);
        setField(term2094, term2094.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2094;
        try {
            callMethod(klass, "handleReturn", argTypes, term2025, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


