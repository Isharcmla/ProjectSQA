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

public class NodeUtil_maybeAddFinally_1429693753243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2033;

    public NodeUtil_maybeAddFinally_1429693753243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2033, term2033.getClass(), "type", -796934571);
        setIntField(term2035, term2035.getClass(), "type", 405295896);
        setIntField(term2037, term2037.getClass(), "type", -814977075);
        setIntField(term2039, term2039.getClass(), "type", 808614267);
        setIntField(term2041, term2041.getClass(), "type", 1611734632);
        setField(term2041, term2041.getClass(), "next", null);
        setField(term2041, term2041.getClass(), "first", null);
        setField(term2041, term2041.getClass(), "last", null);
        setField(term2041, term2041.getClass(), "propListHead", null);
        setIntField(term2041, term2041.getClass(), "sourcePosition", 0);
        setField(term2041, term2041.getClass(), "jsType", null);
        setField(term2041, term2041.getClass(), "parent", null);
        setField(term2039, term2039.getClass(), "next", term2041);
        setIntField(term2044, term2044.getClass(), "type", 868908117);
        setField(term2044, term2044.getClass(), "next", null);
        setField(term2044, term2044.getClass(), "first", null);
        setField(term2044, term2044.getClass(), "last", term2041);
        setField(term2044, term2044.getClass(), "propListHead", null);
        setIntField(term2044, term2044.getClass(), "sourcePosition", 0);
        setField(term2044, term2044.getClass(), "jsType", null);
        setField(term2044, term2044.getClass(), "parent", null);
        setField(term2039, term2039.getClass(), "first", term2044);
        setField(term2039, term2039.getClass(), "last", term2037);
        setField(term2039, term2039.getClass(), "propListHead", null);
        setIntField(term2039, term2039.getClass(), "sourcePosition", 0);
        setField(term2039, term2039.getClass(), "jsType", null);
        setField(term2039, term2039.getClass(), "parent", null);
        setField(term2037, term2037.getClass(), "next", term2039);
        setField(term2037, term2037.getClass(), "first", term2041);
        setIntField(term2048, term2048.getClass(), "type", 2145528170);
        setIntField(term2050, term2050.getClass(), "type", -585773976);
        setField(term2050, term2050.getClass(), "next", null);
        setField(term2050, term2050.getClass(), "first", term2044);
        setField(term2050, term2050.getClass(), "last", term2039);
        setField(term2050, term2050.getClass(), "propListHead", null);
        setIntField(term2050, term2050.getClass(), "sourcePosition", 0);
        setField(term2050, term2050.getClass(), "jsType", null);
        setField(term2050, term2050.getClass(), "parent", null);
        setField(term2048, term2048.getClass(), "next", term2050);
        setField(term2048, term2048.getClass(), "first", term2035);
        setField(term2048, term2048.getClass(), "last", term2035);
        setField(term2048, term2048.getClass(), "propListHead", null);
        setIntField(term2048, term2048.getClass(), "sourcePosition", 0);
        setField(term2048, term2048.getClass(), "jsType", null);
        setField(term2048, term2048.getClass(), "parent", null);
        setField(term2037, term2037.getClass(), "last", term2048);
        setField(term2037, term2037.getClass(), "propListHead", null);
        setIntField(term2037, term2037.getClass(), "sourcePosition", 0);
        setField(term2037, term2037.getClass(), "jsType", null);
        setField(term2037, term2037.getClass(), "parent", null);
        setField(term2035, term2035.getClass(), "next", term2037);
        setIntField(term2055, term2055.getClass(), "type", 852806940);
        setField(term2055, term2055.getClass(), "next", term2048);
        setField(term2055, term2055.getClass(), "first", term2050);
        setField(term2055, term2055.getClass(), "last", term2033);
        setField(term2055, term2055.getClass(), "propListHead", null);
        setIntField(term2055, term2055.getClass(), "sourcePosition", 0);
        setField(term2055, term2055.getClass(), "jsType", null);
        setField(term2055, term2055.getClass(), "parent", null);
        setField(term2035, term2035.getClass(), "first", term2055);
        setField(term2035, term2035.getClass(), "last", term2055);
        setField(term2035, term2035.getClass(), "propListHead", null);
        setIntField(term2035, term2035.getClass(), "sourcePosition", 0);
        setField(term2035, term2035.getClass(), "jsType", null);
        setField(term2035, term2035.getClass(), "parent", null);
        setField(term2033, term2033.getClass(), "next", term2035);
        setField(term2033, term2033.getClass(), "first", term2039);
        setField(term2033, term2033.getClass(), "last", term2041);
        setField(term2033, term2033.getClass(), "propListHead", null);
        setIntField(term2033, term2033.getClass(), "sourcePosition", 0);
        setField(term2033, term2033.getClass(), "jsType", null);
        setField(term2033, term2033.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2033;
        try {
            callMethod(klass, "maybeAddFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


