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

public class NodeUtil_isNameReferenced_1680890329198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2807;

    public NodeUtil_isNameReferenced_1680890329198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2820 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2830 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2807, term2807.getClass(), "type", -1870339027);
        setIntField(term2809, term2809.getClass(), "type", -1644358555);
        setIntField(term2811, term2811.getClass(), "type", 0);
        setField(term2811, term2811.getClass(), "next", null);
        setField(term2811, term2811.getClass(), "first", null);
        setField(term2811, term2811.getClass(), "last", null);
        setField(term2811, term2811.getClass(), "propListHead", null);
        setIntField(term2811, term2811.getClass(), "sourcePosition", 0);
        setField(term2811, term2811.getClass(), "jsType", null);
        setField(term2811, term2811.getClass(), "parent", null);
        setField(term2809, term2809.getClass(), "next", term2811);
        setIntField(term2814, term2814.getClass(), "type", 0);
        setField(term2814, term2814.getClass(), "next", null);
        setField(term2814, term2814.getClass(), "first", null);
        setField(term2814, term2814.getClass(), "last", null);
        setField(term2814, term2814.getClass(), "propListHead", null);
        setIntField(term2814, term2814.getClass(), "sourcePosition", 0);
        setField(term2814, term2814.getClass(), "jsType", null);
        setField(term2814, term2814.getClass(), "parent", null);
        setField(term2809, term2809.getClass(), "first", term2814);
        setIntField(term2817, term2817.getClass(), "type", 0);
        setField(term2817, term2817.getClass(), "next", null);
        setField(term2817, term2817.getClass(), "first", null);
        setField(term2817, term2817.getClass(), "last", null);
        setField(term2817, term2817.getClass(), "propListHead", null);
        setIntField(term2817, term2817.getClass(), "sourcePosition", 0);
        setField(term2817, term2817.getClass(), "jsType", null);
        setField(term2817, term2817.getClass(), "parent", null);
        setField(term2809, term2809.getClass(), "last", term2817);
        setField(term2820, term2820.getClass(), "next", null);
        setIntField(term2820, term2820.getClass(), "type", 0);
        setIntField(term2820, term2820.getClass(), "intValue", 0);
        setField(term2820, term2820.getClass(), "objectValue", null);
        setField(term2809, term2809.getClass(), "propListHead", term2820);
        setIntField(term2809, term2809.getClass(), "sourcePosition", 1677994069);
        setField(term2809, term2809.getClass(), "jsType", null);
        setField(term2809, term2809.getClass(), "parent", null);
        setField(term2807, term2807.getClass(), "next", term2809);
        setIntField(term2824, term2824.getClass(), "type", 0);
        setField(term2824, term2824.getClass(), "next", null);
        setField(term2824, term2824.getClass(), "first", null);
        setField(term2824, term2824.getClass(), "last", null);
        setField(term2824, term2824.getClass(), "propListHead", null);
        setIntField(term2824, term2824.getClass(), "sourcePosition", 0);
        setField(term2824, term2824.getClass(), "jsType", null);
        setField(term2824, term2824.getClass(), "parent", null);
        setField(term2807, term2807.getClass(), "first", term2824);
        setIntField(term2827, term2827.getClass(), "type", 0);
        setField(term2827, term2827.getClass(), "next", null);
        setField(term2827, term2827.getClass(), "first", null);
        setField(term2827, term2827.getClass(), "last", null);
        setField(term2827, term2827.getClass(), "propListHead", null);
        setIntField(term2827, term2827.getClass(), "sourcePosition", 0);
        setField(term2827, term2827.getClass(), "jsType", null);
        setField(term2827, term2827.getClass(), "parent", null);
        setField(term2807, term2807.getClass(), "last", term2827);
        setField(term2830, term2830.getClass(), "next", null);
        setIntField(term2830, term2830.getClass(), "type", 0);
        setIntField(term2830, term2830.getClass(), "intValue", 0);
        setField(term2830, term2830.getClass(), "objectValue", null);
        setField(term2807, term2807.getClass(), "propListHead", term2830);
        setIntField(term2807, term2807.getClass(), "sourcePosition", -439999692);
        setField(term2807, term2807.getClass(), "jsType", null);
        setField(term2807, term2807.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2807;
        args[1] = "eZFUvlxvGV";
        args[2] = null;
        try {
            callMethod(klass, "isNameReferenced", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


