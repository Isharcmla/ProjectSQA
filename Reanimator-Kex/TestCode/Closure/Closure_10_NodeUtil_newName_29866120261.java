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

public class NodeUtil_newName_29866120261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2966;

    public NodeUtil_newName_29866120261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2966, term2966.getClass(), "type", 1054887169);
        setIntField(term2968, term2968.getClass(), "type", 692873905);
        setIntField(term2970, term2970.getClass(), "type", 1734759369);
        setIntField(term2972, term2972.getClass(), "type", 1841493736);
        setIntField(term2974, term2974.getClass(), "type", 320739944);
        setField(term2974, term2974.getClass(), "next", null);
        setField(term2974, term2974.getClass(), "first", null);
        setField(term2974, term2974.getClass(), "last", null);
        setField(term2974, term2974.getClass(), "propListHead", null);
        setIntField(term2974, term2974.getClass(), "sourcePosition", 0);
        setField(term2974, term2974.getClass(), "jsType", null);
        setField(term2974, term2974.getClass(), "parent", null);
        setField(term2972, term2972.getClass(), "next", term2974);
        setIntField(term2977, term2977.getClass(), "type", 760218111);
        setField(term2977, term2977.getClass(), "next", null);
        setField(term2977, term2977.getClass(), "first", null);
        setField(term2977, term2977.getClass(), "last", term2974);
        setField(term2977, term2977.getClass(), "propListHead", null);
        setIntField(term2977, term2977.getClass(), "sourcePosition", 0);
        setField(term2977, term2977.getClass(), "jsType", null);
        setField(term2977, term2977.getClass(), "parent", null);
        setField(term2972, term2972.getClass(), "first", term2977);
        setField(term2972, term2972.getClass(), "last", term2970);
        setField(term2972, term2972.getClass(), "propListHead", null);
        setIntField(term2972, term2972.getClass(), "sourcePosition", 0);
        setField(term2972, term2972.getClass(), "jsType", null);
        setField(term2972, term2972.getClass(), "parent", null);
        setField(term2970, term2970.getClass(), "next", term2972);
        setField(term2970, term2970.getClass(), "first", term2974);
        setIntField(term2981, term2981.getClass(), "type", -1963228619);
        setIntField(term2983, term2983.getClass(), "type", -709868952);
        setField(term2983, term2983.getClass(), "next", null);
        setField(term2983, term2983.getClass(), "first", term2977);
        setField(term2983, term2983.getClass(), "last", term2972);
        setField(term2983, term2983.getClass(), "propListHead", null);
        setIntField(term2983, term2983.getClass(), "sourcePosition", 0);
        setField(term2983, term2983.getClass(), "jsType", null);
        setField(term2983, term2983.getClass(), "parent", null);
        setField(term2981, term2981.getClass(), "next", term2983);
        setField(term2981, term2981.getClass(), "first", term2968);
        setField(term2981, term2981.getClass(), "last", term2968);
        setField(term2981, term2981.getClass(), "propListHead", null);
        setIntField(term2981, term2981.getClass(), "sourcePosition", 0);
        setField(term2981, term2981.getClass(), "jsType", null);
        setField(term2981, term2981.getClass(), "parent", null);
        setField(term2970, term2970.getClass(), "last", term2981);
        setField(term2970, term2970.getClass(), "propListHead", null);
        setIntField(term2970, term2970.getClass(), "sourcePosition", 0);
        setField(term2970, term2970.getClass(), "jsType", null);
        setField(term2970, term2970.getClass(), "parent", null);
        setField(term2968, term2968.getClass(), "next", term2970);
        setIntField(term2988, term2988.getClass(), "type", 847207929);
        setField(term2988, term2988.getClass(), "next", term2981);
        setField(term2988, term2988.getClass(), "first", term2983);
        setField(term2988, term2988.getClass(), "last", term2966);
        setField(term2988, term2988.getClass(), "propListHead", null);
        setIntField(term2988, term2988.getClass(), "sourcePosition", 0);
        setField(term2988, term2988.getClass(), "jsType", null);
        setField(term2988, term2988.getClass(), "parent", null);
        setField(term2968, term2968.getClass(), "first", term2988);
        setField(term2968, term2968.getClass(), "last", term2988);
        setField(term2968, term2968.getClass(), "propListHead", null);
        setIntField(term2968, term2968.getClass(), "sourcePosition", 0);
        setField(term2968, term2968.getClass(), "jsType", null);
        setField(term2968, term2968.getClass(), "parent", null);
        setField(term2966, term2966.getClass(), "next", term2968);
        setField(term2966, term2966.getClass(), "first", term2972);
        setField(term2966, term2966.getClass(), "last", term2974);
        setField(term2966, term2966.getClass(), "propListHead", null);
        setIntField(term2966, term2966.getClass(), "sourcePosition", 0);
        setField(term2966, term2966.getClass(), "jsType", null);
        setField(term2966, term2966.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "pCTimMblYc";
        args[2] = term2966;
        try {
            callMethod(klass, "newName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


