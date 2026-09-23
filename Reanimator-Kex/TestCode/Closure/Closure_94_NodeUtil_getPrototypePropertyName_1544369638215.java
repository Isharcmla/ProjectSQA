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

public class NodeUtil_getPrototypePropertyName_1544369638215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2887;

    public NodeUtil_getPrototypePropertyName_1544369638215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2900 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2910 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2887, term2887.getClass(), "type", 1676254730);
        setIntField(term2889, term2889.getClass(), "type", -1174440096);
        setIntField(term2891, term2891.getClass(), "type", 0);
        setField(term2891, term2891.getClass(), "next", null);
        setField(term2891, term2891.getClass(), "first", null);
        setField(term2891, term2891.getClass(), "last", null);
        setField(term2891, term2891.getClass(), "propListHead", null);
        setIntField(term2891, term2891.getClass(), "sourcePosition", 0);
        setField(term2891, term2891.getClass(), "jsType", null);
        setField(term2891, term2891.getClass(), "parent", null);
        setField(term2889, term2889.getClass(), "next", term2891);
        setIntField(term2894, term2894.getClass(), "type", 0);
        setField(term2894, term2894.getClass(), "next", null);
        setField(term2894, term2894.getClass(), "first", null);
        setField(term2894, term2894.getClass(), "last", null);
        setField(term2894, term2894.getClass(), "propListHead", null);
        setIntField(term2894, term2894.getClass(), "sourcePosition", 0);
        setField(term2894, term2894.getClass(), "jsType", null);
        setField(term2894, term2894.getClass(), "parent", null);
        setField(term2889, term2889.getClass(), "first", term2894);
        setIntField(term2897, term2897.getClass(), "type", 0);
        setField(term2897, term2897.getClass(), "next", null);
        setField(term2897, term2897.getClass(), "first", null);
        setField(term2897, term2897.getClass(), "last", null);
        setField(term2897, term2897.getClass(), "propListHead", null);
        setIntField(term2897, term2897.getClass(), "sourcePosition", 0);
        setField(term2897, term2897.getClass(), "jsType", null);
        setField(term2897, term2897.getClass(), "parent", null);
        setField(term2889, term2889.getClass(), "last", term2897);
        setField(term2900, term2900.getClass(), "next", null);
        setIntField(term2900, term2900.getClass(), "type", 0);
        setIntField(term2900, term2900.getClass(), "intValue", 0);
        setField(term2900, term2900.getClass(), "objectValue", null);
        setField(term2889, term2889.getClass(), "propListHead", term2900);
        setIntField(term2889, term2889.getClass(), "sourcePosition", -1809928454);
        setField(term2889, term2889.getClass(), "jsType", null);
        setField(term2889, term2889.getClass(), "parent", null);
        setField(term2887, term2887.getClass(), "next", term2889);
        setIntField(term2904, term2904.getClass(), "type", 0);
        setField(term2904, term2904.getClass(), "next", null);
        setField(term2904, term2904.getClass(), "first", null);
        setField(term2904, term2904.getClass(), "last", null);
        setField(term2904, term2904.getClass(), "propListHead", null);
        setIntField(term2904, term2904.getClass(), "sourcePosition", 0);
        setField(term2904, term2904.getClass(), "jsType", null);
        setField(term2904, term2904.getClass(), "parent", null);
        setField(term2887, term2887.getClass(), "first", term2904);
        setIntField(term2907, term2907.getClass(), "type", 0);
        setField(term2907, term2907.getClass(), "next", null);
        setField(term2907, term2907.getClass(), "first", null);
        setField(term2907, term2907.getClass(), "last", null);
        setField(term2907, term2907.getClass(), "propListHead", null);
        setIntField(term2907, term2907.getClass(), "sourcePosition", 0);
        setField(term2907, term2907.getClass(), "jsType", null);
        setField(term2907, term2907.getClass(), "parent", null);
        setField(term2887, term2887.getClass(), "last", term2907);
        setField(term2910, term2910.getClass(), "next", null);
        setIntField(term2910, term2910.getClass(), "type", 0);
        setIntField(term2910, term2910.getClass(), "intValue", 0);
        setField(term2910, term2910.getClass(), "objectValue", null);
        setField(term2887, term2887.getClass(), "propListHead", term2910);
        setIntField(term2887, term2887.getClass(), "sourcePosition", -191639503);
        setField(term2887, term2887.getClass(), "jsType", null);
        setField(term2887, term2887.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2887;
        try {
            callMethod(klass, "getPrototypePropertyName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


