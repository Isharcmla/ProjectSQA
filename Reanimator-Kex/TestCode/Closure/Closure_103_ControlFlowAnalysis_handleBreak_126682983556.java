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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayDeque;

public class ControlFlowAnalysis_handleBreak_126682983556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1750;
     Object term1801;

    public ControlFlowAnalysis_handleBreak_126682983556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1752 = new HashMap();
        Object term1759 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1759, term1759.getClass(), "elementData", null);
        setIntField(term1759, term1759.getClass(), "size", 255145822);
        setIntField(term1759, term1759.getClass(), "modCount", -573608449);
        ArrayDeque term1757 = new ArrayDeque();
        ((ArrayDeque) term1757).add(term1759);
        Object term1766 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1766, term1766.getClass(), "elementData", null);
        setIntField(term1766, term1766.getClass(), "size", -1660057757);
        setIntField(term1766, term1766.getClass(), "modCount", 1816273440);
        Object term1769 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1769, term1769.getClass(), "elementData", null);
        setIntField(term1769, term1769.getClass(), "size", -96541009);
        setIntField(term1769, term1769.getClass(), "modCount", -43719302);
        Object term1772 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1772, term1772.getClass(), "elementData", null);
        setIntField(term1772, term1772.getClass(), "size", 1024134939);
        setIntField(term1772, term1772.getClass(), "modCount", 109078154);
        Object term1775 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1775, term1775.getClass(), "elementData", null);
        setIntField(term1775, term1775.getClass(), "size", -314165467);
        setIntField(term1775, term1775.getClass(), "modCount", 963694071);
        ArrayDeque term1764 = new ArrayDeque();
        ((ArrayDeque) term1764).add(term1766);
        ((ArrayDeque) term1764).add(term1769);
        ((ArrayDeque) term1764).add(term1772);
        ((ArrayDeque) term1764).add(term1775);
        HashMap term1780 = new HashMap();
        HashMap term1793 = new HashMap();
        term1750 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1751 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1750, term1750.getClass(), "compiler", null);
        setField(term1751, term1751.getClass(), "implicitReturn", null);
        setField(term1751, term1751.getClass(), "entry", null);
        setField(term1751, term1751.getClass(), "nodes", term1752);
        setField(term1751, term1751.getClass(), "nodeAnnotationStack", term1757);
        setField(term1751, term1751.getClass(), "edgeAnnotationStack", term1764);
        setField(term1750, term1750.getClass(), "cfg", term1751);
        setField(term1750, term1750.getClass(), "astPosition", term1780);
        setField(term1750, term1750.getClass(), "nodePriorities", term1793);
        setField(term1750, term1750.getClass(), "priorityComparator", null);
        setIntField(term1750, term1750.getClass(), "astPositionCounter", 0);
        setIntField(term1750, term1750.getClass(), "priorityCounter", 0);
        setBooleanField(term1750, term1750.getClass(), "shouldTraverseFunctions", false);
        setField(term1750, term1750.getClass(), "root", null);
        setField(term1750, term1750.getClass(), "exceptionHandler", null);
        setField(term1750, term1750.getClass(), "finallyMap", null);
        term1801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1814 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1824 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1801, term1801.getClass(), "type", 993627098);
        setIntField(term1803, term1803.getClass(), "type", 27043781);
        setIntField(term1805, term1805.getClass(), "type", 0);
        setField(term1805, term1805.getClass(), "next", null);
        setField(term1805, term1805.getClass(), "first", null);
        setField(term1805, term1805.getClass(), "last", null);
        setField(term1805, term1805.getClass(), "propListHead", null);
        setIntField(term1805, term1805.getClass(), "sourcePosition", 0);
        setField(term1805, term1805.getClass(), "jsType", null);
        setField(term1805, term1805.getClass(), "parent", null);
        setField(term1803, term1803.getClass(), "next", term1805);
        setIntField(term1808, term1808.getClass(), "type", 0);
        setField(term1808, term1808.getClass(), "next", null);
        setField(term1808, term1808.getClass(), "first", null);
        setField(term1808, term1808.getClass(), "last", null);
        setField(term1808, term1808.getClass(), "propListHead", null);
        setIntField(term1808, term1808.getClass(), "sourcePosition", 0);
        setField(term1808, term1808.getClass(), "jsType", null);
        setField(term1808, term1808.getClass(), "parent", null);
        setField(term1803, term1803.getClass(), "first", term1808);
        setIntField(term1811, term1811.getClass(), "type", 0);
        setField(term1811, term1811.getClass(), "next", null);
        setField(term1811, term1811.getClass(), "first", null);
        setField(term1811, term1811.getClass(), "last", null);
        setField(term1811, term1811.getClass(), "propListHead", null);
        setIntField(term1811, term1811.getClass(), "sourcePosition", 0);
        setField(term1811, term1811.getClass(), "jsType", null);
        setField(term1811, term1811.getClass(), "parent", null);
        setField(term1803, term1803.getClass(), "last", term1811);
        setField(term1814, term1814.getClass(), "next", null);
        setIntField(term1814, term1814.getClass(), "type", 0);
        setIntField(term1814, term1814.getClass(), "intValue", 0);
        setField(term1814, term1814.getClass(), "objectValue", null);
        setField(term1803, term1803.getClass(), "propListHead", term1814);
        setIntField(term1803, term1803.getClass(), "sourcePosition", 1104108112);
        setField(term1803, term1803.getClass(), "jsType", null);
        setField(term1803, term1803.getClass(), "parent", null);
        setField(term1801, term1801.getClass(), "next", term1803);
        setIntField(term1818, term1818.getClass(), "type", 0);
        setField(term1818, term1818.getClass(), "next", null);
        setField(term1818, term1818.getClass(), "first", null);
        setField(term1818, term1818.getClass(), "last", null);
        setField(term1818, term1818.getClass(), "propListHead", null);
        setIntField(term1818, term1818.getClass(), "sourcePosition", 0);
        setField(term1818, term1818.getClass(), "jsType", null);
        setField(term1818, term1818.getClass(), "parent", null);
        setField(term1801, term1801.getClass(), "first", term1818);
        setIntField(term1821, term1821.getClass(), "type", 0);
        setField(term1821, term1821.getClass(), "next", null);
        setField(term1821, term1821.getClass(), "first", null);
        setField(term1821, term1821.getClass(), "last", null);
        setField(term1821, term1821.getClass(), "propListHead", null);
        setIntField(term1821, term1821.getClass(), "sourcePosition", 0);
        setField(term1821, term1821.getClass(), "jsType", null);
        setField(term1821, term1821.getClass(), "parent", null);
        setField(term1801, term1801.getClass(), "last", term1821);
        setField(term1824, term1824.getClass(), "next", null);
        setIntField(term1824, term1824.getClass(), "type", 0);
        setIntField(term1824, term1824.getClass(), "intValue", 0);
        setField(term1824, term1824.getClass(), "objectValue", null);
        setField(term1801, term1801.getClass(), "propListHead", term1824);
        setIntField(term1801, term1801.getClass(), "sourcePosition", 1648665618);
        setField(term1801, term1801.getClass(), "jsType", null);
        setField(term1801, term1801.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1801;
        try {
            callMethod(klass, "handleBreak", argTypes, term1750, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


