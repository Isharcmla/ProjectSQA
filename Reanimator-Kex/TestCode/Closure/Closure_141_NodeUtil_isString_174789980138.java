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

public class NodeUtil_isString_174789980138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term841;
     Object term6899;

    public NodeUtil_isString_174789980138() {
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
        term6899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6904 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6907 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6899, term6899.getClass(), "type", 1272542218);
        setIntField(term6900, term6900.getClass(), "type", -18216811);
        setIntField(term6901, term6901.getClass(), "type", 0);
        setField(term6901, term6901.getClass(), "next", null);
        setField(term6901, term6901.getClass(), "first", null);
        setField(term6901, term6901.getClass(), "last", null);
        setField(term6901, term6901.getClass(), "propListHead", null);
        setIntField(term6901, term6901.getClass(), "sourcePosition", 0);
        setField(term6901, term6901.getClass(), "jsType", null);
        setField(term6901, term6901.getClass(), "parent", null);
        setField(term6900, term6900.getClass(), "next", term6901);
        setIntField(term6902, term6902.getClass(), "type", 0);
        setField(term6902, term6902.getClass(), "next", null);
        setField(term6902, term6902.getClass(), "first", null);
        setField(term6902, term6902.getClass(), "last", null);
        setField(term6902, term6902.getClass(), "propListHead", null);
        setIntField(term6902, term6902.getClass(), "sourcePosition", 0);
        setField(term6902, term6902.getClass(), "jsType", null);
        setField(term6902, term6902.getClass(), "parent", null);
        setField(term6900, term6900.getClass(), "first", term6902);
        setIntField(term6903, term6903.getClass(), "type", 0);
        setField(term6903, term6903.getClass(), "next", null);
        setField(term6903, term6903.getClass(), "first", null);
        setField(term6903, term6903.getClass(), "last", null);
        setField(term6903, term6903.getClass(), "propListHead", null);
        setIntField(term6903, term6903.getClass(), "sourcePosition", 0);
        setField(term6903, term6903.getClass(), "jsType", null);
        setField(term6903, term6903.getClass(), "parent", null);
        setField(term6900, term6900.getClass(), "last", term6903);
        setField(term6904, term6904.getClass(), "next", null);
        setIntField(term6904, term6904.getClass(), "type", 0);
        setIntField(term6904, term6904.getClass(), "intValue", 0);
        setField(term6904, term6904.getClass(), "objectValue", null);
        setField(term6900, term6900.getClass(), "propListHead", term6904);
        setIntField(term6900, term6900.getClass(), "sourcePosition", -1516995753);
        setField(term6900, term6900.getClass(), "jsType", null);
        setField(term6900, term6900.getClass(), "parent", null);
        setField(term6899, term6899.getClass(), "next", term6900);
        setIntField(term6905, term6905.getClass(), "type", 0);
        setField(term6905, term6905.getClass(), "next", null);
        setField(term6905, term6905.getClass(), "first", null);
        setField(term6905, term6905.getClass(), "last", null);
        setField(term6905, term6905.getClass(), "propListHead", null);
        setIntField(term6905, term6905.getClass(), "sourcePosition", 0);
        setField(term6905, term6905.getClass(), "jsType", null);
        setField(term6905, term6905.getClass(), "parent", null);
        setField(term6899, term6899.getClass(), "first", term6905);
        setIntField(term6906, term6906.getClass(), "type", 0);
        setField(term6906, term6906.getClass(), "next", null);
        setField(term6906, term6906.getClass(), "first", null);
        setField(term6906, term6906.getClass(), "last", null);
        setField(term6906, term6906.getClass(), "propListHead", null);
        setIntField(term6906, term6906.getClass(), "sourcePosition", 0);
        setField(term6906, term6906.getClass(), "jsType", null);
        setField(term6906, term6906.getClass(), "parent", null);
        setField(term6899, term6899.getClass(), "last", term6906);
        setField(term6907, term6907.getClass(), "next", null);
        setIntField(term6907, term6907.getClass(), "type", 0);
        setIntField(term6907, term6907.getClass(), "intValue", 0);
        setField(term6907, term6907.getClass(), "objectValue", null);
        setField(term6899, term6899.getClass(), "propListHead", term6907);
        setIntField(term6899, term6899.getClass(), "sourcePosition", -390501023);
        setField(term6899, term6899.getClass(), "jsType", null);
        setField(term6899, term6899.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term841;
        Object retValue = callMethod(klass, "isString", argTypes, null, args);
        assertTrue(recursiveEquals(term841, term6899));
        assertTrue(recursiveEquals(retValue, false));
    }

};


