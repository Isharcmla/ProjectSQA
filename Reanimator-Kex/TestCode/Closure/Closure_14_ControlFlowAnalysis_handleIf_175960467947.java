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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayDeque;

public class ControlFlowAnalysis_handleIf_175960467947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627;
     Object term696;

    public ControlFlowAnalysis_handleIf_175960467947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term629 = new HashMap();
        Object term638 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term638, term638.getClass(), "elementData", null);
        setIntField(term638, term638.getClass(), "size", 1830648570);
        setIntField(term638, term638.getClass(), "modCount", -227365013);
        Object term641 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term641, term641.getClass(), "elementData", null);
        setIntField(term641, term641.getClass(), "size", 11724947);
        setIntField(term641, term641.getClass(), "modCount", 1953277050);
        Object term644 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term644, term644.getClass(), "elementData", null);
        setIntField(term644, term644.getClass(), "size", 1283079251);
        setIntField(term644, term644.getClass(), "modCount", -523949691);
        Object term647 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term647, term647.getClass(), "elementData", null);
        setIntField(term647, term647.getClass(), "size", 1398204340);
        setIntField(term647, term647.getClass(), "modCount", 229204365);
        Object term650 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term650, term650.getClass(), "elementData", null);
        setIntField(term650, term650.getClass(), "size", -461771056);
        setIntField(term650, term650.getClass(), "modCount", -243422082);
        Object term653 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term653, term653.getClass(), "elementData", null);
        setIntField(term653, term653.getClass(), "size", 1384592638);
        setIntField(term653, term653.getClass(), "modCount", -1002370457);
        ArrayDeque term636 = new ArrayDeque();
        ((ArrayDeque) term636).add(term638);
        ((ArrayDeque) term636).add(term641);
        ((ArrayDeque) term636).add(term644);
        ((ArrayDeque) term636).add(term647);
        ((ArrayDeque) term636).add(term650);
        ((ArrayDeque) term636).add(term653);
        Object term660 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term660, term660.getClass(), "elementData", null);
        setIntField(term660, term660.getClass(), "size", -2014576105);
        setIntField(term660, term660.getClass(), "modCount", 1296895584);
        Object term663 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term663, term663.getClass(), "elementData", null);
        setIntField(term663, term663.getClass(), "size", 628918458);
        setIntField(term663, term663.getClass(), "modCount", -1274456137);
        Object term666 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term666, term666.getClass(), "elementData", null);
        setIntField(term666, term666.getClass(), "size", 1041916673);
        setIntField(term666, term666.getClass(), "modCount", -601863069);
        Object term669 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term669, term669.getClass(), "elementData", null);
        setIntField(term669, term669.getClass(), "size", 663292551);
        setIntField(term669, term669.getClass(), "modCount", -1885090354);
        ArrayDeque term658 = new ArrayDeque();
        ((ArrayDeque) term658).add(term660);
        ((ArrayDeque) term658).add(term663);
        ((ArrayDeque) term658).add(term666);
        ((ArrayDeque) term658).add(term669);
        ((ArrayDeque) term658).add(term669);
        ((ArrayDeque) term658).add(term641);
        ((ArrayDeque) term658).add(term650);
        HashMap term674 = new HashMap();
        HashMap term687 = new HashMap();
        term627 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term628 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term627, term627.getClass(), "compiler", null);
        setField(term628, term628.getClass(), "implicitReturn", null);
        setField(term628, term628.getClass(), "entry", null);
        setField(term628, term628.getClass(), "nodes", term629);
        setBooleanField(term628, term628.getClass(), "useNodeAnnotations", false);
        setBooleanField(term628, term628.getClass(), "useEdgeAnnotations", true);
        setField(term628, term628.getClass(), "nodeAnnotationStack", term636);
        setField(term628, term628.getClass(), "edgeAnnotationStack", term658);
        setField(term627, term627.getClass(), "cfg", term628);
        setField(term627, term627.getClass(), "astPosition", term674);
        setField(term627, term627.getClass(), "nodePriorities", term687);
        setField(term627, term627.getClass(), "priorityComparator", null);
        setIntField(term627, term627.getClass(), "astPositionCounter", 0);
        setIntField(term627, term627.getClass(), "priorityCounter", 0);
        setBooleanField(term627, term627.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term627, term627.getClass(), "edgeAnnotations", false);
        setField(term627, term627.getClass(), "root", null);
        setField(term627, term627.getClass(), "exceptionHandler", null);
        setField(term627, term627.getClass(), "finallyMap", null);
        term696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term696, term696.getClass(), "type", 1358829571);
        setIntField(term698, term698.getClass(), "type", 991356662);
        setIntField(term700, term700.getClass(), "type", -506958186);
        setIntField(term702, term702.getClass(), "type", -507387516);
        setIntField(term704, term704.getClass(), "type", -1970452551);
        setField(term704, term704.getClass(), "next", null);
        setField(term704, term704.getClass(), "first", null);
        setField(term704, term704.getClass(), "last", null);
        setField(term704, term704.getClass(), "propListHead", null);
        setIntField(term704, term704.getClass(), "sourcePosition", 0);
        setField(term704, term704.getClass(), "jsType", null);
        setField(term704, term704.getClass(), "parent", null);
        setField(term702, term702.getClass(), "next", term704);
        setIntField(term707, term707.getClass(), "type", -1896376975);
        setField(term707, term707.getClass(), "next", null);
        setField(term707, term707.getClass(), "first", null);
        setField(term707, term707.getClass(), "last", term704);
        setField(term707, term707.getClass(), "propListHead", null);
        setIntField(term707, term707.getClass(), "sourcePosition", 0);
        setField(term707, term707.getClass(), "jsType", null);
        setField(term707, term707.getClass(), "parent", null);
        setField(term702, term702.getClass(), "first", term707);
        setField(term702, term702.getClass(), "last", term700);
        setField(term702, term702.getClass(), "propListHead", null);
        setIntField(term702, term702.getClass(), "sourcePosition", 0);
        setField(term702, term702.getClass(), "jsType", null);
        setField(term702, term702.getClass(), "parent", null);
        setField(term700, term700.getClass(), "next", term702);
        setField(term700, term700.getClass(), "first", term704);
        setIntField(term711, term711.getClass(), "type", 114754804);
        setIntField(term713, term713.getClass(), "type", 1687361082);
        setField(term713, term713.getClass(), "next", null);
        setField(term713, term713.getClass(), "first", term707);
        setField(term713, term713.getClass(), "last", term702);
        setField(term713, term713.getClass(), "propListHead", null);
        setIntField(term713, term713.getClass(), "sourcePosition", 0);
        setField(term713, term713.getClass(), "jsType", null);
        setField(term713, term713.getClass(), "parent", null);
        setField(term711, term711.getClass(), "next", term713);
        setField(term711, term711.getClass(), "first", term698);
        setField(term711, term711.getClass(), "last", term698);
        setField(term711, term711.getClass(), "propListHead", null);
        setIntField(term711, term711.getClass(), "sourcePosition", 0);
        setField(term711, term711.getClass(), "jsType", null);
        setField(term711, term711.getClass(), "parent", null);
        setField(term700, term700.getClass(), "last", term711);
        setField(term700, term700.getClass(), "propListHead", null);
        setIntField(term700, term700.getClass(), "sourcePosition", 0);
        setField(term700, term700.getClass(), "jsType", null);
        setField(term700, term700.getClass(), "parent", null);
        setField(term698, term698.getClass(), "next", term700);
        setIntField(term718, term718.getClass(), "type", 584893196);
        setField(term718, term718.getClass(), "next", term711);
        setField(term718, term718.getClass(), "first", term713);
        setField(term718, term718.getClass(), "last", term696);
        setField(term718, term718.getClass(), "propListHead", null);
        setIntField(term718, term718.getClass(), "sourcePosition", 0);
        setField(term718, term718.getClass(), "jsType", null);
        setField(term718, term718.getClass(), "parent", null);
        setField(term698, term698.getClass(), "first", term718);
        setField(term698, term698.getClass(), "last", term718);
        setField(term698, term698.getClass(), "propListHead", null);
        setIntField(term698, term698.getClass(), "sourcePosition", 0);
        setField(term698, term698.getClass(), "jsType", null);
        setField(term698, term698.getClass(), "parent", null);
        setField(term696, term696.getClass(), "next", term698);
        setField(term696, term696.getClass(), "first", term702);
        setField(term696, term696.getClass(), "last", term704);
        setField(term696, term696.getClass(), "propListHead", null);
        setIntField(term696, term696.getClass(), "sourcePosition", 0);
        setField(term696, term696.getClass(), "jsType", null);
        setField(term696, term696.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term696;
        try {
            callMethod(klass, "handleIf", argTypes, term627, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


