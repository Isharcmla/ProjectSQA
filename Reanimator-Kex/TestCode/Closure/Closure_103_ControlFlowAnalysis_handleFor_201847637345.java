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

public class ControlFlowAnalysis_handleFor_201847637345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term826;
     Object term880;

    public ControlFlowAnalysis_handleFor_201847637345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term828 = new HashMap();
        ArrayDeque term833 = new ArrayDeque();
        Object term839 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term839, term839.getClass(), "elementData", null);
        setIntField(term839, term839.getClass(), "size", 2049577015);
        setIntField(term839, term839.getClass(), "modCount", 1236004505);
        Object term842 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term842, term842.getClass(), "elementData", null);
        setIntField(term842, term842.getClass(), "size", 1050765721);
        setIntField(term842, term842.getClass(), "modCount", 474518942);
        Object term845 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term845, term845.getClass(), "elementData", null);
        setIntField(term845, term845.getClass(), "size", -1656687479);
        setIntField(term845, term845.getClass(), "modCount", -249614216);
        Object term848 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term848, term848.getClass(), "elementData", null);
        setIntField(term848, term848.getClass(), "size", 1870727665);
        setIntField(term848, term848.getClass(), "modCount", -519881101);
        Object term851 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term851, term851.getClass(), "elementData", null);
        setIntField(term851, term851.getClass(), "size", -680920524);
        setIntField(term851, term851.getClass(), "modCount", -916335264);
        Object term854 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term854, term854.getClass(), "elementData", null);
        setIntField(term854, term854.getClass(), "size", -919416536);
        setIntField(term854, term854.getClass(), "modCount", -43417861);
        ArrayDeque term837 = new ArrayDeque();
        ((ArrayDeque) term837).add(term839);
        ((ArrayDeque) term837).add(term842);
        ((ArrayDeque) term837).add(term845);
        ((ArrayDeque) term837).add(term848);
        ((ArrayDeque) term837).add(term851);
        ((ArrayDeque) term837).add(term854);
        HashMap term859 = new HashMap();
        HashMap term872 = new HashMap();
        term826 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term827 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term826, term826.getClass(), "compiler", null);
        setField(term827, term827.getClass(), "implicitReturn", null);
        setField(term827, term827.getClass(), "entry", null);
        setField(term827, term827.getClass(), "nodes", term828);
        setField(term827, term827.getClass(), "nodeAnnotationStack", term833);
        setField(term827, term827.getClass(), "edgeAnnotationStack", term837);
        setField(term826, term826.getClass(), "cfg", term827);
        setField(term826, term826.getClass(), "astPosition", term859);
        setField(term826, term826.getClass(), "nodePriorities", term872);
        setField(term826, term826.getClass(), "priorityComparator", null);
        setIntField(term826, term826.getClass(), "astPositionCounter", 0);
        setIntField(term826, term826.getClass(), "priorityCounter", 0);
        setBooleanField(term826, term826.getClass(), "shouldTraverseFunctions", false);
        setField(term826, term826.getClass(), "root", null);
        setField(term826, term826.getClass(), "exceptionHandler", null);
        setField(term826, term826.getClass(), "finallyMap", null);
        term880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term893 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term903 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term880, term880.getClass(), "type", 1252951645);
        setIntField(term882, term882.getClass(), "type", -1015274146);
        setIntField(term884, term884.getClass(), "type", 0);
        setField(term884, term884.getClass(), "next", null);
        setField(term884, term884.getClass(), "first", null);
        setField(term884, term884.getClass(), "last", null);
        setField(term884, term884.getClass(), "propListHead", null);
        setIntField(term884, term884.getClass(), "sourcePosition", 0);
        setField(term884, term884.getClass(), "jsType", null);
        setField(term884, term884.getClass(), "parent", null);
        setField(term882, term882.getClass(), "next", term884);
        setIntField(term887, term887.getClass(), "type", 0);
        setField(term887, term887.getClass(), "next", null);
        setField(term887, term887.getClass(), "first", null);
        setField(term887, term887.getClass(), "last", null);
        setField(term887, term887.getClass(), "propListHead", null);
        setIntField(term887, term887.getClass(), "sourcePosition", 0);
        setField(term887, term887.getClass(), "jsType", null);
        setField(term887, term887.getClass(), "parent", null);
        setField(term882, term882.getClass(), "first", term887);
        setIntField(term890, term890.getClass(), "type", 0);
        setField(term890, term890.getClass(), "next", null);
        setField(term890, term890.getClass(), "first", null);
        setField(term890, term890.getClass(), "last", null);
        setField(term890, term890.getClass(), "propListHead", null);
        setIntField(term890, term890.getClass(), "sourcePosition", 0);
        setField(term890, term890.getClass(), "jsType", null);
        setField(term890, term890.getClass(), "parent", null);
        setField(term882, term882.getClass(), "last", term890);
        setField(term893, term893.getClass(), "next", null);
        setIntField(term893, term893.getClass(), "type", 0);
        setIntField(term893, term893.getClass(), "intValue", 0);
        setField(term893, term893.getClass(), "objectValue", null);
        setField(term882, term882.getClass(), "propListHead", term893);
        setIntField(term882, term882.getClass(), "sourcePosition", -851097944);
        setField(term882, term882.getClass(), "jsType", null);
        setField(term882, term882.getClass(), "parent", null);
        setField(term880, term880.getClass(), "next", term882);
        setIntField(term897, term897.getClass(), "type", 0);
        setField(term897, term897.getClass(), "next", null);
        setField(term897, term897.getClass(), "first", null);
        setField(term897, term897.getClass(), "last", null);
        setField(term897, term897.getClass(), "propListHead", null);
        setIntField(term897, term897.getClass(), "sourcePosition", 0);
        setField(term897, term897.getClass(), "jsType", null);
        setField(term897, term897.getClass(), "parent", null);
        setField(term880, term880.getClass(), "first", term897);
        setIntField(term900, term900.getClass(), "type", 0);
        setField(term900, term900.getClass(), "next", null);
        setField(term900, term900.getClass(), "first", null);
        setField(term900, term900.getClass(), "last", null);
        setField(term900, term900.getClass(), "propListHead", null);
        setIntField(term900, term900.getClass(), "sourcePosition", 0);
        setField(term900, term900.getClass(), "jsType", null);
        setField(term900, term900.getClass(), "parent", null);
        setField(term880, term880.getClass(), "last", term900);
        setField(term903, term903.getClass(), "next", null);
        setIntField(term903, term903.getClass(), "type", 0);
        setIntField(term903, term903.getClass(), "intValue", 0);
        setField(term903, term903.getClass(), "objectValue", null);
        setField(term880, term880.getClass(), "propListHead", term903);
        setIntField(term880, term880.getClass(), "sourcePosition", 803925431);
        setField(term880, term880.getClass(), "jsType", null);
        setField(term880, term880.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term880;
        try {
            callMethod(klass, "handleFor", argTypes, term826, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


