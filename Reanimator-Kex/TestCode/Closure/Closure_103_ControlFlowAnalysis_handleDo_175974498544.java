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

public class ControlFlowAnalysis_handleDo_175974498544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733;
     Object term799;

    public ControlFlowAnalysis_handleDo_175974498544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term735 = new HashMap();
        Object term742 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term742, term742.getClass(), "elementData", null);
        setIntField(term742, term742.getClass(), "size", -1111249833);
        setIntField(term742, term742.getClass(), "modCount", -1692331299);
        Object term745 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term745, term745.getClass(), "elementData", null);
        setIntField(term745, term745.getClass(), "size", 479531250);
        setIntField(term745, term745.getClass(), "modCount", 1320570890);
        Object term748 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term748, term748.getClass(), "elementData", null);
        setIntField(term748, term748.getClass(), "size", -130649791);
        setIntField(term748, term748.getClass(), "modCount", 534834644);
        Object term751 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term751, term751.getClass(), "elementData", null);
        setIntField(term751, term751.getClass(), "size", 1959097203);
        setIntField(term751, term751.getClass(), "modCount", -209654048);
        Object term754 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term754, term754.getClass(), "elementData", null);
        setIntField(term754, term754.getClass(), "size", 477625804);
        setIntField(term754, term754.getClass(), "modCount", 252575029);
        Object term757 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term757, term757.getClass(), "elementData", null);
        setIntField(term757, term757.getClass(), "size", 57189932);
        setIntField(term757, term757.getClass(), "modCount", 1460722225);
        Object term760 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term760, term760.getClass(), "elementData", null);
        setIntField(term760, term760.getClass(), "size", 1743224434);
        setIntField(term760, term760.getClass(), "modCount", 842904495);
        Object term763 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term763, term763.getClass(), "elementData", null);
        setIntField(term763, term763.getClass(), "size", 1008080511);
        setIntField(term763, term763.getClass(), "modCount", 1935707624);
        Object term766 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term766, term766.getClass(), "elementData", null);
        setIntField(term766, term766.getClass(), "size", 1507074215);
        setIntField(term766, term766.getClass(), "modCount", -282881827);
        ArrayDeque term740 = new ArrayDeque();
        ((ArrayDeque) term740).add(term742);
        ((ArrayDeque) term740).add(term745);
        ((ArrayDeque) term740).add(term748);
        ((ArrayDeque) term740).add(term751);
        ((ArrayDeque) term740).add(term754);
        ((ArrayDeque) term740).add(term757);
        ((ArrayDeque) term740).add(term760);
        ((ArrayDeque) term740).add(term763);
        ((ArrayDeque) term740).add(term766);
        Object term773 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term773, term773.getClass(), "elementData", null);
        setIntField(term773, term773.getClass(), "size", -1183353915);
        setIntField(term773, term773.getClass(), "modCount", -420030135);
        ArrayDeque term771 = new ArrayDeque();
        ((ArrayDeque) term771).add(term773);
        ((ArrayDeque) term771).add(term763);
        ((ArrayDeque) term771).add(term766);
        ((ArrayDeque) term771).add(term748);
        ((ArrayDeque) term771).add(term745);
        HashMap term778 = new HashMap();
        HashMap term791 = new HashMap();
        term733 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term734 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term733, term733.getClass(), "compiler", null);
        setField(term734, term734.getClass(), "implicitReturn", null);
        setField(term734, term734.getClass(), "entry", null);
        setField(term734, term734.getClass(), "nodes", term735);
        setField(term734, term734.getClass(), "nodeAnnotationStack", term740);
        setField(term734, term734.getClass(), "edgeAnnotationStack", term771);
        setField(term733, term733.getClass(), "cfg", term734);
        setField(term733, term733.getClass(), "astPosition", term778);
        setField(term733, term733.getClass(), "nodePriorities", term791);
        setField(term733, term733.getClass(), "priorityComparator", null);
        setIntField(term733, term733.getClass(), "astPositionCounter", 0);
        setIntField(term733, term733.getClass(), "priorityCounter", 0);
        setBooleanField(term733, term733.getClass(), "shouldTraverseFunctions", false);
        setField(term733, term733.getClass(), "root", null);
        setField(term733, term733.getClass(), "exceptionHandler", null);
        setField(term733, term733.getClass(), "finallyMap", null);
        term799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term799, term799.getClass(), "type", 515182546);
        setIntField(term801, term801.getClass(), "type", -1195339592);
        setIntField(term803, term803.getClass(), "type", 0);
        setField(term803, term803.getClass(), "next", null);
        setField(term803, term803.getClass(), "first", null);
        setField(term803, term803.getClass(), "last", null);
        setField(term803, term803.getClass(), "propListHead", null);
        setIntField(term803, term803.getClass(), "sourcePosition", 0);
        setField(term803, term803.getClass(), "jsType", null);
        setField(term803, term803.getClass(), "parent", null);
        setField(term801, term801.getClass(), "next", term803);
        setIntField(term806, term806.getClass(), "type", 0);
        setField(term806, term806.getClass(), "next", null);
        setField(term806, term806.getClass(), "first", null);
        setField(term806, term806.getClass(), "last", null);
        setField(term806, term806.getClass(), "propListHead", null);
        setIntField(term806, term806.getClass(), "sourcePosition", 0);
        setField(term806, term806.getClass(), "jsType", null);
        setField(term806, term806.getClass(), "parent", null);
        setField(term801, term801.getClass(), "first", term806);
        setIntField(term809, term809.getClass(), "type", 0);
        setField(term809, term809.getClass(), "next", null);
        setField(term809, term809.getClass(), "first", null);
        setField(term809, term809.getClass(), "last", null);
        setField(term809, term809.getClass(), "propListHead", null);
        setIntField(term809, term809.getClass(), "sourcePosition", 0);
        setField(term809, term809.getClass(), "jsType", null);
        setField(term809, term809.getClass(), "parent", null);
        setField(term801, term801.getClass(), "last", term809);
        setField(term812, term812.getClass(), "next", null);
        setIntField(term812, term812.getClass(), "type", 0);
        setIntField(term812, term812.getClass(), "intValue", 0);
        setField(term812, term812.getClass(), "objectValue", null);
        setField(term801, term801.getClass(), "propListHead", term812);
        setIntField(term801, term801.getClass(), "sourcePosition", 1745276158);
        setField(term801, term801.getClass(), "jsType", null);
        setField(term801, term801.getClass(), "parent", null);
        setField(term799, term799.getClass(), "next", term801);
        setIntField(term816, term816.getClass(), "type", 0);
        setField(term816, term816.getClass(), "next", null);
        setField(term816, term816.getClass(), "first", null);
        setField(term816, term816.getClass(), "last", null);
        setField(term816, term816.getClass(), "propListHead", null);
        setIntField(term816, term816.getClass(), "sourcePosition", 0);
        setField(term816, term816.getClass(), "jsType", null);
        setField(term816, term816.getClass(), "parent", null);
        setField(term799, term799.getClass(), "first", term816);
        setIntField(term819, term819.getClass(), "type", 0);
        setField(term819, term819.getClass(), "next", null);
        setField(term819, term819.getClass(), "first", null);
        setField(term819, term819.getClass(), "last", null);
        setField(term819, term819.getClass(), "propListHead", null);
        setIntField(term819, term819.getClass(), "sourcePosition", 0);
        setField(term819, term819.getClass(), "jsType", null);
        setField(term819, term819.getClass(), "parent", null);
        setField(term799, term799.getClass(), "last", term819);
        setField(term822, term822.getClass(), "next", null);
        setIntField(term822, term822.getClass(), "type", 0);
        setIntField(term822, term822.getClass(), "intValue", 0);
        setField(term822, term822.getClass(), "objectValue", null);
        setField(term799, term799.getClass(), "propListHead", term822);
        setIntField(term799, term799.getClass(), "sourcePosition", 2009020256);
        setField(term799, term799.getClass(), "jsType", null);
        setField(term799, term799.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term799;
        try {
            callMethod(klass, "handleDo", argTypes, term733, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


