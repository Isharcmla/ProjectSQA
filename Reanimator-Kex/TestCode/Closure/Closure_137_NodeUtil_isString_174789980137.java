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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_isString_174789980137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term841;
     Object term6872;

    public NodeUtil_isString_174789980137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term854 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term864 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term841, term841.getClass(), "type", 1272542218);
        setIntField(term843, term843.getClass(), "type", -18216811);
        setIntField(term845, term845.getClass(), "type", 0);
        setField(term845, term845.getClass(), "next", null);
        setField(term845, term845.getClass(), "first", null);
        setField(term845, term845.getClass(), "last", null);
        setField(term845, term845.getClass(), "propListHead", null);
        setIntField(term845, term845.getClass(), "sourcePosition", 0);
        setField(term845, term845.getClass(), "jsType", null);
        setField(term845, term845.getClass(), "parent", null);
        setField(term843, term843.getClass(), "next", term845);
        setIntField(term848, term848.getClass(), "type", 0);
        setField(term848, term848.getClass(), "next", null);
        setField(term848, term848.getClass(), "first", null);
        setField(term848, term848.getClass(), "last", null);
        setField(term848, term848.getClass(), "propListHead", null);
        setIntField(term848, term848.getClass(), "sourcePosition", 0);
        setField(term848, term848.getClass(), "jsType", null);
        setField(term848, term848.getClass(), "parent", null);
        setField(term843, term843.getClass(), "first", term848);
        setIntField(term851, term851.getClass(), "type", 0);
        setField(term851, term851.getClass(), "next", null);
        setField(term851, term851.getClass(), "first", null);
        setField(term851, term851.getClass(), "last", null);
        setField(term851, term851.getClass(), "propListHead", null);
        setIntField(term851, term851.getClass(), "sourcePosition", 0);
        setField(term851, term851.getClass(), "jsType", null);
        setField(term851, term851.getClass(), "parent", null);
        setField(term843, term843.getClass(), "last", term851);
        setField(term854, term854.getClass(), "next", null);
        setIntField(term854, term854.getClass(), "type", 0);
        setIntField(term854, term854.getClass(), "intValue", 0);
        setField(term854, term854.getClass(), "objectValue", null);
        setField(term843, term843.getClass(), "propListHead", term854);
        setIntField(term843, term843.getClass(), "sourcePosition", -1516995753);
        setField(term843, term843.getClass(), "jsType", null);
        setField(term843, term843.getClass(), "parent", null);
        setField(term841, term841.getClass(), "next", term843);
        setIntField(term858, term858.getClass(), "type", 0);
        setField(term858, term858.getClass(), "next", null);
        setField(term858, term858.getClass(), "first", null);
        setField(term858, term858.getClass(), "last", null);
        setField(term858, term858.getClass(), "propListHead", null);
        setIntField(term858, term858.getClass(), "sourcePosition", 0);
        setField(term858, term858.getClass(), "jsType", null);
        setField(term858, term858.getClass(), "parent", null);
        setField(term841, term841.getClass(), "first", term858);
        setIntField(term861, term861.getClass(), "type", 0);
        setField(term861, term861.getClass(), "next", null);
        setField(term861, term861.getClass(), "first", null);
        setField(term861, term861.getClass(), "last", null);
        setField(term861, term861.getClass(), "propListHead", null);
        setIntField(term861, term861.getClass(), "sourcePosition", 0);
        setField(term861, term861.getClass(), "jsType", null);
        setField(term861, term861.getClass(), "parent", null);
        setField(term841, term841.getClass(), "last", term861);
        setField(term864, term864.getClass(), "next", null);
        setIntField(term864, term864.getClass(), "type", 0);
        setIntField(term864, term864.getClass(), "intValue", 0);
        setField(term864, term864.getClass(), "objectValue", null);
        setField(term841, term841.getClass(), "propListHead", term864);
        setIntField(term841, term841.getClass(), "sourcePosition", -390501023);
        setField(term841, term841.getClass(), "jsType", null);
        setField(term841, term841.getClass(), "parent", null);
        term6872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6877 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6880 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6872, term6872.getClass(), "type", 1272542218);
        setIntField(term6873, term6873.getClass(), "type", -18216811);
        setIntField(term6874, term6874.getClass(), "type", 0);
        setField(term6874, term6874.getClass(), "next", null);
        setField(term6874, term6874.getClass(), "first", null);
        setField(term6874, term6874.getClass(), "last", null);
        setField(term6874, term6874.getClass(), "propListHead", null);
        setIntField(term6874, term6874.getClass(), "sourcePosition", 0);
        setField(term6874, term6874.getClass(), "jsType", null);
        setField(term6874, term6874.getClass(), "parent", null);
        setField(term6873, term6873.getClass(), "next", term6874);
        setIntField(term6875, term6875.getClass(), "type", 0);
        setField(term6875, term6875.getClass(), "next", null);
        setField(term6875, term6875.getClass(), "first", null);
        setField(term6875, term6875.getClass(), "last", null);
        setField(term6875, term6875.getClass(), "propListHead", null);
        setIntField(term6875, term6875.getClass(), "sourcePosition", 0);
        setField(term6875, term6875.getClass(), "jsType", null);
        setField(term6875, term6875.getClass(), "parent", null);
        setField(term6873, term6873.getClass(), "first", term6875);
        setIntField(term6876, term6876.getClass(), "type", 0);
        setField(term6876, term6876.getClass(), "next", null);
        setField(term6876, term6876.getClass(), "first", null);
        setField(term6876, term6876.getClass(), "last", null);
        setField(term6876, term6876.getClass(), "propListHead", null);
        setIntField(term6876, term6876.getClass(), "sourcePosition", 0);
        setField(term6876, term6876.getClass(), "jsType", null);
        setField(term6876, term6876.getClass(), "parent", null);
        setField(term6873, term6873.getClass(), "last", term6876);
        setField(term6877, term6877.getClass(), "next", null);
        setIntField(term6877, term6877.getClass(), "type", 0);
        setIntField(term6877, term6877.getClass(), "intValue", 0);
        setField(term6877, term6877.getClass(), "objectValue", null);
        setField(term6873, term6873.getClass(), "propListHead", term6877);
        setIntField(term6873, term6873.getClass(), "sourcePosition", -1516995753);
        setField(term6873, term6873.getClass(), "jsType", null);
        setField(term6873, term6873.getClass(), "parent", null);
        setField(term6872, term6872.getClass(), "next", term6873);
        setIntField(term6878, term6878.getClass(), "type", 0);
        setField(term6878, term6878.getClass(), "next", null);
        setField(term6878, term6878.getClass(), "first", null);
        setField(term6878, term6878.getClass(), "last", null);
        setField(term6878, term6878.getClass(), "propListHead", null);
        setIntField(term6878, term6878.getClass(), "sourcePosition", 0);
        setField(term6878, term6878.getClass(), "jsType", null);
        setField(term6878, term6878.getClass(), "parent", null);
        setField(term6872, term6872.getClass(), "first", term6878);
        setIntField(term6879, term6879.getClass(), "type", 0);
        setField(term6879, term6879.getClass(), "next", null);
        setField(term6879, term6879.getClass(), "first", null);
        setField(term6879, term6879.getClass(), "last", null);
        setField(term6879, term6879.getClass(), "propListHead", null);
        setIntField(term6879, term6879.getClass(), "sourcePosition", 0);
        setField(term6879, term6879.getClass(), "jsType", null);
        setField(term6879, term6879.getClass(), "parent", null);
        setField(term6872, term6872.getClass(), "last", term6879);
        setField(term6880, term6880.getClass(), "next", null);
        setIntField(term6880, term6880.getClass(), "type", 0);
        setIntField(term6880, term6880.getClass(), "intValue", 0);
        setField(term6880, term6880.getClass(), "objectValue", null);
        setField(term6872, term6872.getClass(), "propListHead", term6880);
        setIntField(term6872, term6872.getClass(), "sourcePosition", -390501023);
        setField(term6872, term6872.getClass(), "jsType", null);
        setField(term6872, term6872.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term841;
        Object retValue = callMethod(klass, "isString", argTypes, null, args);
        assertTrue(recursiveEquals(term841, term6872));
        assertTrue(recursiveEquals(retValue, false));
    }

};


