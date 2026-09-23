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

public class ControlFlowAnalysis_handleBreak_126682983561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1848;
     Object term1902;

    public ControlFlowAnalysis_handleBreak_126682983561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1850 = new HashMap();
        Object term1859 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1859, term1859.getClass(), "elementData", null);
        setIntField(term1859, term1859.getClass(), "size", -1626451656);
        setIntField(term1859, term1859.getClass(), "modCount", 173952451);
        ArrayDeque term1857 = new ArrayDeque();
        ((ArrayDeque) term1857).add(term1859);
        Object term1866 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1866, term1866.getClass(), "elementData", null);
        setIntField(term1866, term1866.getClass(), "size", -1972033388);
        setIntField(term1866, term1866.getClass(), "modCount", -1005024758);
        Object term1869 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1869, term1869.getClass(), "elementData", null);
        setIntField(term1869, term1869.getClass(), "size", 2634669);
        setIntField(term1869, term1869.getClass(), "modCount", -1912429941);
        Object term1872 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1872, term1872.getClass(), "elementData", null);
        setIntField(term1872, term1872.getClass(), "size", 1801052257);
        setIntField(term1872, term1872.getClass(), "modCount", -2110556060);
        Object term1875 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1875, term1875.getClass(), "elementData", null);
        setIntField(term1875, term1875.getClass(), "size", 313459791);
        setIntField(term1875, term1875.getClass(), "modCount", 752615112);
        ArrayDeque term1864 = new ArrayDeque();
        ((ArrayDeque) term1864).add(term1866);
        ((ArrayDeque) term1864).add(term1869);
        ((ArrayDeque) term1864).add(term1872);
        ((ArrayDeque) term1864).add(term1875);
        HashMap term1880 = new HashMap();
        HashMap term1893 = new HashMap();
        term1848 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1849 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1848, term1848.getClass(), "compiler", null);
        setField(term1849, term1849.getClass(), "implicitReturn", null);
        setField(term1849, term1849.getClass(), "entry", null);
        setField(term1849, term1849.getClass(), "nodes", term1850);
        setBooleanField(term1849, term1849.getClass(), "useNodeAnnotations", false);
        setBooleanField(term1849, term1849.getClass(), "useEdgeAnnotations", false);
        setField(term1849, term1849.getClass(), "nodeAnnotationStack", term1857);
        setField(term1849, term1849.getClass(), "edgeAnnotationStack", term1864);
        setField(term1848, term1848.getClass(), "cfg", term1849);
        setField(term1848, term1848.getClass(), "astPosition", term1880);
        setField(term1848, term1848.getClass(), "nodePriorities", term1893);
        setField(term1848, term1848.getClass(), "priorityComparator", null);
        setIntField(term1848, term1848.getClass(), "astPositionCounter", 0);
        setIntField(term1848, term1848.getClass(), "priorityCounter", 0);
        setBooleanField(term1848, term1848.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term1848, term1848.getClass(), "edgeAnnotations", false);
        setField(term1848, term1848.getClass(), "root", null);
        setField(term1848, term1848.getClass(), "exceptionHandler", null);
        setField(term1848, term1848.getClass(), "finallyMap", null);
        term1902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1902, term1902.getClass(), "type", -344907703);
        setIntField(term1904, term1904.getClass(), "type", 824341437);
        setIntField(term1906, term1906.getClass(), "type", -1794965320);
        setIntField(term1908, term1908.getClass(), "type", 520504102);
        setIntField(term1910, term1910.getClass(), "type", -457396133);
        setField(term1910, term1910.getClass(), "next", null);
        setField(term1910, term1910.getClass(), "first", null);
        setField(term1910, term1910.getClass(), "last", null);
        setField(term1910, term1910.getClass(), "propListHead", null);
        setIntField(term1910, term1910.getClass(), "sourcePosition", 0);
        setField(term1910, term1910.getClass(), "jsType", null);
        setField(term1910, term1910.getClass(), "parent", null);
        setField(term1908, term1908.getClass(), "next", term1910);
        setIntField(term1913, term1913.getClass(), "type", -1793950607);
        setField(term1913, term1913.getClass(), "next", null);
        setField(term1913, term1913.getClass(), "first", null);
        setField(term1913, term1913.getClass(), "last", term1910);
        setField(term1913, term1913.getClass(), "propListHead", null);
        setIntField(term1913, term1913.getClass(), "sourcePosition", 0);
        setField(term1913, term1913.getClass(), "jsType", null);
        setField(term1913, term1913.getClass(), "parent", null);
        setField(term1908, term1908.getClass(), "first", term1913);
        setField(term1908, term1908.getClass(), "last", term1906);
        setField(term1908, term1908.getClass(), "propListHead", null);
        setIntField(term1908, term1908.getClass(), "sourcePosition", 0);
        setField(term1908, term1908.getClass(), "jsType", null);
        setField(term1908, term1908.getClass(), "parent", null);
        setField(term1906, term1906.getClass(), "next", term1908);
        setField(term1906, term1906.getClass(), "first", term1910);
        setIntField(term1917, term1917.getClass(), "type", 1895143076);
        setIntField(term1919, term1919.getClass(), "type", 1981860404);
        setField(term1919, term1919.getClass(), "next", null);
        setField(term1919, term1919.getClass(), "first", term1913);
        setField(term1919, term1919.getClass(), "last", term1908);
        setField(term1919, term1919.getClass(), "propListHead", null);
        setIntField(term1919, term1919.getClass(), "sourcePosition", 0);
        setField(term1919, term1919.getClass(), "jsType", null);
        setField(term1919, term1919.getClass(), "parent", null);
        setField(term1917, term1917.getClass(), "next", term1919);
        setField(term1917, term1917.getClass(), "first", term1904);
        setField(term1917, term1917.getClass(), "last", term1904);
        setField(term1917, term1917.getClass(), "propListHead", null);
        setIntField(term1917, term1917.getClass(), "sourcePosition", 0);
        setField(term1917, term1917.getClass(), "jsType", null);
        setField(term1917, term1917.getClass(), "parent", null);
        setField(term1906, term1906.getClass(), "last", term1917);
        setField(term1906, term1906.getClass(), "propListHead", null);
        setIntField(term1906, term1906.getClass(), "sourcePosition", 0);
        setField(term1906, term1906.getClass(), "jsType", null);
        setField(term1906, term1906.getClass(), "parent", null);
        setField(term1904, term1904.getClass(), "next", term1906);
        setIntField(term1924, term1924.getClass(), "type", 732174235);
        setField(term1924, term1924.getClass(), "next", term1917);
        setField(term1924, term1924.getClass(), "first", term1919);
        setField(term1924, term1924.getClass(), "last", term1902);
        setField(term1924, term1924.getClass(), "propListHead", null);
        setIntField(term1924, term1924.getClass(), "sourcePosition", 0);
        setField(term1924, term1924.getClass(), "jsType", null);
        setField(term1924, term1924.getClass(), "parent", null);
        setField(term1904, term1904.getClass(), "first", term1924);
        setField(term1904, term1904.getClass(), "last", term1924);
        setField(term1904, term1904.getClass(), "propListHead", null);
        setIntField(term1904, term1904.getClass(), "sourcePosition", 0);
        setField(term1904, term1904.getClass(), "jsType", null);
        setField(term1904, term1904.getClass(), "parent", null);
        setField(term1902, term1902.getClass(), "next", term1904);
        setField(term1902, term1902.getClass(), "first", term1908);
        setField(term1902, term1902.getClass(), "last", term1910);
        setField(term1902, term1902.getClass(), "propListHead", null);
        setIntField(term1902, term1902.getClass(), "sourcePosition", 0);
        setField(term1902, term1902.getClass(), "jsType", null);
        setField(term1902, term1902.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1902;
        try {
            callMethod(klass, "handleBreak", argTypes, term1848, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


