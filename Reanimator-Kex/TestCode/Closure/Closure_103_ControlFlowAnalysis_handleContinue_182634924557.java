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

public class ControlFlowAnalysis_handleContinue_182634924557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1828;
     Object term1894;

    public ControlFlowAnalysis_handleContinue_182634924557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1830 = new HashMap();
        Object term1837 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1837, term1837.getClass(), "elementData", null);
        setIntField(term1837, term1837.getClass(), "size", 633765954);
        setIntField(term1837, term1837.getClass(), "modCount", 269110087);
        Object term1840 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1840, term1840.getClass(), "elementData", null);
        setIntField(term1840, term1840.getClass(), "size", 1545119095);
        setIntField(term1840, term1840.getClass(), "modCount", 1671229683);
        Object term1843 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1843, term1843.getClass(), "elementData", null);
        setIntField(term1843, term1843.getClass(), "size", 34167717);
        setIntField(term1843, term1843.getClass(), "modCount", -514195141);
        Object term1846 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1846, term1846.getClass(), "elementData", null);
        setIntField(term1846, term1846.getClass(), "size", -297946422);
        setIntField(term1846, term1846.getClass(), "modCount", 385463636);
        Object term1849 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1849, term1849.getClass(), "elementData", null);
        setIntField(term1849, term1849.getClass(), "size", -1677599962);
        setIntField(term1849, term1849.getClass(), "modCount", -1790275458);
        ArrayDeque term1835 = new ArrayDeque();
        ((ArrayDeque) term1835).add(term1837);
        ((ArrayDeque) term1835).add(term1840);
        ((ArrayDeque) term1835).add(term1843);
        ((ArrayDeque) term1835).add(term1846);
        ((ArrayDeque) term1835).add(term1849);
        Object term1856 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1856, term1856.getClass(), "elementData", null);
        setIntField(term1856, term1856.getClass(), "size", -497534255);
        setIntField(term1856, term1856.getClass(), "modCount", 1588942911);
        Object term1859 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1859, term1859.getClass(), "elementData", null);
        setIntField(term1859, term1859.getClass(), "size", -2129828854);
        setIntField(term1859, term1859.getClass(), "modCount", -47438786);
        Object term1862 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1862, term1862.getClass(), "elementData", null);
        setIntField(term1862, term1862.getClass(), "size", -1955400589);
        setIntField(term1862, term1862.getClass(), "modCount", 626179200);
        Object term1865 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1865, term1865.getClass(), "elementData", null);
        setIntField(term1865, term1865.getClass(), "size", -511077684);
        setIntField(term1865, term1865.getClass(), "modCount", -711507760);
        Object term1868 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1868, term1868.getClass(), "elementData", null);
        setIntField(term1868, term1868.getClass(), "size", 1053773809);
        setIntField(term1868, term1868.getClass(), "modCount", 924127883);
        ArrayDeque term1854 = new ArrayDeque();
        ((ArrayDeque) term1854).add(term1856);
        ((ArrayDeque) term1854).add(term1859);
        ((ArrayDeque) term1854).add(term1862);
        ((ArrayDeque) term1854).add(term1865);
        ((ArrayDeque) term1854).add(term1868);
        ((ArrayDeque) term1854).add(term1868);
        ((ArrayDeque) term1854).add(term1846);
        ((ArrayDeque) term1854).add(term1849);
        ((ArrayDeque) term1854).add(term1849);
        HashMap term1873 = new HashMap();
        HashMap term1886 = new HashMap();
        term1828 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1829 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1828, term1828.getClass(), "compiler", null);
        setField(term1829, term1829.getClass(), "implicitReturn", null);
        setField(term1829, term1829.getClass(), "entry", null);
        setField(term1829, term1829.getClass(), "nodes", term1830);
        setField(term1829, term1829.getClass(), "nodeAnnotationStack", term1835);
        setField(term1829, term1829.getClass(), "edgeAnnotationStack", term1854);
        setField(term1828, term1828.getClass(), "cfg", term1829);
        setField(term1828, term1828.getClass(), "astPosition", term1873);
        setField(term1828, term1828.getClass(), "nodePriorities", term1886);
        setField(term1828, term1828.getClass(), "priorityComparator", null);
        setIntField(term1828, term1828.getClass(), "astPositionCounter", 0);
        setIntField(term1828, term1828.getClass(), "priorityCounter", 0);
        setBooleanField(term1828, term1828.getClass(), "shouldTraverseFunctions", false);
        setField(term1828, term1828.getClass(), "root", null);
        setField(term1828, term1828.getClass(), "exceptionHandler", null);
        setField(term1828, term1828.getClass(), "finallyMap", null);
        term1894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1907 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1917 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1894, term1894.getClass(), "type", -1630069454);
        setIntField(term1896, term1896.getClass(), "type", 1038029515);
        setIntField(term1898, term1898.getClass(), "type", 0);
        setField(term1898, term1898.getClass(), "next", null);
        setField(term1898, term1898.getClass(), "first", null);
        setField(term1898, term1898.getClass(), "last", null);
        setField(term1898, term1898.getClass(), "propListHead", null);
        setIntField(term1898, term1898.getClass(), "sourcePosition", 0);
        setField(term1898, term1898.getClass(), "jsType", null);
        setField(term1898, term1898.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "next", term1898);
        setIntField(term1901, term1901.getClass(), "type", 0);
        setField(term1901, term1901.getClass(), "next", null);
        setField(term1901, term1901.getClass(), "first", null);
        setField(term1901, term1901.getClass(), "last", null);
        setField(term1901, term1901.getClass(), "propListHead", null);
        setIntField(term1901, term1901.getClass(), "sourcePosition", 0);
        setField(term1901, term1901.getClass(), "jsType", null);
        setField(term1901, term1901.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "first", term1901);
        setIntField(term1904, term1904.getClass(), "type", 0);
        setField(term1904, term1904.getClass(), "next", null);
        setField(term1904, term1904.getClass(), "first", null);
        setField(term1904, term1904.getClass(), "last", null);
        setField(term1904, term1904.getClass(), "propListHead", null);
        setIntField(term1904, term1904.getClass(), "sourcePosition", 0);
        setField(term1904, term1904.getClass(), "jsType", null);
        setField(term1904, term1904.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "last", term1904);
        setField(term1907, term1907.getClass(), "next", null);
        setIntField(term1907, term1907.getClass(), "type", 0);
        setIntField(term1907, term1907.getClass(), "intValue", 0);
        setField(term1907, term1907.getClass(), "objectValue", null);
        setField(term1896, term1896.getClass(), "propListHead", term1907);
        setIntField(term1896, term1896.getClass(), "sourcePosition", 296568835);
        setField(term1896, term1896.getClass(), "jsType", null);
        setField(term1896, term1896.getClass(), "parent", null);
        setField(term1894, term1894.getClass(), "next", term1896);
        setIntField(term1911, term1911.getClass(), "type", 0);
        setField(term1911, term1911.getClass(), "next", null);
        setField(term1911, term1911.getClass(), "first", null);
        setField(term1911, term1911.getClass(), "last", null);
        setField(term1911, term1911.getClass(), "propListHead", null);
        setIntField(term1911, term1911.getClass(), "sourcePosition", 0);
        setField(term1911, term1911.getClass(), "jsType", null);
        setField(term1911, term1911.getClass(), "parent", null);
        setField(term1894, term1894.getClass(), "first", term1911);
        setIntField(term1914, term1914.getClass(), "type", 0);
        setField(term1914, term1914.getClass(), "next", null);
        setField(term1914, term1914.getClass(), "first", null);
        setField(term1914, term1914.getClass(), "last", null);
        setField(term1914, term1914.getClass(), "propListHead", null);
        setIntField(term1914, term1914.getClass(), "sourcePosition", 0);
        setField(term1914, term1914.getClass(), "jsType", null);
        setField(term1914, term1914.getClass(), "parent", null);
        setField(term1894, term1894.getClass(), "last", term1914);
        setField(term1917, term1917.getClass(), "next", null);
        setIntField(term1917, term1917.getClass(), "type", 0);
        setIntField(term1917, term1917.getClass(), "intValue", 0);
        setField(term1917, term1917.getClass(), "objectValue", null);
        setField(term1894, term1894.getClass(), "propListHead", term1917);
        setIntField(term1894, term1894.getClass(), "sourcePosition", 1431951992);
        setField(term1894, term1894.getClass(), "jsType", null);
        setField(term1894, term1894.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1894;
        try {
            callMethod(klass, "handleContinue", argTypes, term1828, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


