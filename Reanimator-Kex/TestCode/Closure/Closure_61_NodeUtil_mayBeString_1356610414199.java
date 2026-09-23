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
import java.lang.Boolean;

public class NodeUtil_mayBeString_1356610414199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term904;
     Object term925;
     Object term9893;

    public NodeUtil_mayBeString_1356610414199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term904, term904.getClass(), "type", 1221443226);
        setIntField(term906, term906.getClass(), "type", -1702055571);
        setIntField(term908, term908.getClass(), "type", 0);
        setField(term908, term908.getClass(), "next", null);
        setField(term908, term908.getClass(), "first", null);
        setField(term908, term908.getClass(), "last", null);
        setField(term908, term908.getClass(), "propListHead", null);
        setIntField(term908, term908.getClass(), "sourcePosition", 0);
        setField(term908, term908.getClass(), "jsType", null);
        setField(term908, term908.getClass(), "parent", null);
        setField(term906, term906.getClass(), "next", term908);
        setIntField(term911, term911.getClass(), "type", 0);
        setField(term911, term911.getClass(), "next", null);
        setField(term911, term911.getClass(), "first", null);
        setField(term911, term911.getClass(), "last", null);
        setField(term911, term911.getClass(), "propListHead", null);
        setIntField(term911, term911.getClass(), "sourcePosition", 0);
        setField(term911, term911.getClass(), "jsType", null);
        setField(term911, term911.getClass(), "parent", null);
        setField(term906, term906.getClass(), "first", term911);
        setIntField(term914, term914.getClass(), "type", 0);
        setField(term914, term914.getClass(), "next", null);
        setField(term914, term914.getClass(), "first", null);
        setField(term914, term914.getClass(), "last", null);
        setField(term914, term914.getClass(), "propListHead", null);
        setIntField(term914, term914.getClass(), "sourcePosition", 0);
        setField(term914, term914.getClass(), "jsType", null);
        setField(term914, term914.getClass(), "parent", null);
        setField(term906, term906.getClass(), "last", term914);
        setField(term906, term906.getClass(), "propListHead", null);
        setIntField(term906, term906.getClass(), "sourcePosition", 0);
        setField(term906, term906.getClass(), "jsType", null);
        setField(term906, term906.getClass(), "parent", null);
        setField(term904, term904.getClass(), "next", term906);
        setIntField(term918, term918.getClass(), "type", 0);
        setField(term918, term918.getClass(), "next", null);
        setField(term918, term918.getClass(), "first", null);
        setField(term918, term918.getClass(), "last", null);
        setField(term918, term918.getClass(), "propListHead", null);
        setIntField(term918, term918.getClass(), "sourcePosition", 0);
        setField(term918, term918.getClass(), "jsType", null);
        setField(term918, term918.getClass(), "parent", null);
        setField(term904, term904.getClass(), "first", term918);
        setIntField(term921, term921.getClass(), "type", 0);
        setField(term921, term921.getClass(), "next", null);
        setField(term921, term921.getClass(), "first", null);
        setField(term921, term921.getClass(), "last", null);
        setField(term921, term921.getClass(), "propListHead", null);
        setIntField(term921, term921.getClass(), "sourcePosition", 0);
        setField(term921, term921.getClass(), "jsType", null);
        setField(term921, term921.getClass(), "parent", null);
        setField(term904, term904.getClass(), "last", term921);
        setField(term904, term904.getClass(), "propListHead", null);
        setIntField(term904, term904.getClass(), "sourcePosition", 0);
        setField(term904, term904.getClass(), "jsType", null);
        setField(term904, term904.getClass(), "parent", null);
        term925 = new Boolean(false);
        term9893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9893, term9893.getClass(), "type", 1221443226);
        setIntField(term9894, term9894.getClass(), "type", -1702055571);
        setIntField(term9895, term9895.getClass(), "type", 0);
        setField(term9895, term9895.getClass(), "next", null);
        setField(term9895, term9895.getClass(), "first", null);
        setField(term9895, term9895.getClass(), "last", null);
        setField(term9895, term9895.getClass(), "propListHead", null);
        setIntField(term9895, term9895.getClass(), "sourcePosition", 0);
        setField(term9895, term9895.getClass(), "jsType", null);
        setField(term9895, term9895.getClass(), "parent", null);
        setField(term9894, term9894.getClass(), "next", term9895);
        setIntField(term9896, term9896.getClass(), "type", 0);
        setField(term9896, term9896.getClass(), "next", null);
        setField(term9896, term9896.getClass(), "first", null);
        setField(term9896, term9896.getClass(), "last", null);
        setField(term9896, term9896.getClass(), "propListHead", null);
        setIntField(term9896, term9896.getClass(), "sourcePosition", 0);
        setField(term9896, term9896.getClass(), "jsType", null);
        setField(term9896, term9896.getClass(), "parent", null);
        setField(term9894, term9894.getClass(), "first", term9896);
        setIntField(term9897, term9897.getClass(), "type", 0);
        setField(term9897, term9897.getClass(), "next", null);
        setField(term9897, term9897.getClass(), "first", null);
        setField(term9897, term9897.getClass(), "last", null);
        setField(term9897, term9897.getClass(), "propListHead", null);
        setIntField(term9897, term9897.getClass(), "sourcePosition", 0);
        setField(term9897, term9897.getClass(), "jsType", null);
        setField(term9897, term9897.getClass(), "parent", null);
        setField(term9894, term9894.getClass(), "last", term9897);
        setField(term9894, term9894.getClass(), "propListHead", null);
        setIntField(term9894, term9894.getClass(), "sourcePosition", 0);
        setField(term9894, term9894.getClass(), "jsType", null);
        setField(term9894, term9894.getClass(), "parent", null);
        setField(term9893, term9893.getClass(), "next", term9894);
        setIntField(term9898, term9898.getClass(), "type", 0);
        setField(term9898, term9898.getClass(), "next", null);
        setField(term9898, term9898.getClass(), "first", null);
        setField(term9898, term9898.getClass(), "last", null);
        setField(term9898, term9898.getClass(), "propListHead", null);
        setIntField(term9898, term9898.getClass(), "sourcePosition", 0);
        setField(term9898, term9898.getClass(), "jsType", null);
        setField(term9898, term9898.getClass(), "parent", null);
        setField(term9893, term9893.getClass(), "first", term9898);
        setIntField(term9899, term9899.getClass(), "type", 0);
        setField(term9899, term9899.getClass(), "next", null);
        setField(term9899, term9899.getClass(), "first", null);
        setField(term9899, term9899.getClass(), "last", null);
        setField(term9899, term9899.getClass(), "propListHead", null);
        setIntField(term9899, term9899.getClass(), "sourcePosition", 0);
        setField(term9899, term9899.getClass(), "jsType", null);
        setField(term9899, term9899.getClass(), "parent", null);
        setField(term9893, term9893.getClass(), "last", term9899);
        setField(term9893, term9893.getClass(), "propListHead", null);
        setIntField(term9893, term9893.getClass(), "sourcePosition", 0);
        setField(term9893, term9893.getClass(), "jsType", null);
        setField(term9893, term9893.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term904;
        args[1] = term925;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term904, term9893));
        assertTrue(recursiveEquals(term925, false));
    }

};


