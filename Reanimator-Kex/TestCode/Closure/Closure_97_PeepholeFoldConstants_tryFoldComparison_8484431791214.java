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

public class PeepholeFoldConstants_tryFoldComparison_8484431791214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369824;
     Object term369894;
     Object term369964;
     Object term370034;
     Object term370069;
     Object term370070;
     Object term370071;
     Object term370072;
     Object term370044;

    public PeepholeFoldConstants_tryFoldComparison_8484431791214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369824 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term369894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term369894, term369894.getClass(), "type", 14);
        term369964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term369964, term369964.getClass(), "type", 42);
        term370034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term370034, term370034.getClass(), "type", 14);
        term370069 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term370069, term370069.getClass(), "currentTraversal", null);
        term370070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term370070, term370070.getClass(), "type", 42);
        setField(term370070, term370070.getClass(), "next", null);
        setField(term370070, term370070.getClass(), "first", null);
        setField(term370070, term370070.getClass(), "last", null);
        setField(term370070, term370070.getClass(), "propListHead", null);
        setIntField(term370070, term370070.getClass(), "sourcePosition", 0);
        setField(term370070, term370070.getClass(), "jsType", null);
        setField(term370070, term370070.getClass(), "parent", null);
        term370071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term370071, term370071.getClass(), "type", 14);
        setField(term370071, term370071.getClass(), "next", null);
        setField(term370071, term370071.getClass(), "first", null);
        setField(term370071, term370071.getClass(), "last", null);
        setField(term370071, term370071.getClass(), "propListHead", null);
        setIntField(term370071, term370071.getClass(), "sourcePosition", 0);
        setField(term370071, term370071.getClass(), "jsType", null);
        setField(term370071, term370071.getClass(), "parent", null);
        term370072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term370072, term370072.getClass(), "type", 14);
        setField(term370072, term370072.getClass(), "next", null);
        setField(term370072, term370072.getClass(), "first", null);
        setField(term370072, term370072.getClass(), "last", null);
        setField(term370072, term370072.getClass(), "propListHead", null);
        setIntField(term370072, term370072.getClass(), "sourcePosition", 0);
        setField(term370072, term370072.getClass(), "jsType", null);
        setField(term370072, term370072.getClass(), "parent", null);
        term370044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term370044, term370044.getClass(), "type", 14);
        setField(term370044, term370044.getClass(), "next", null);
        setField(term370044, term370044.getClass(), "first", null);
        setField(term370044, term370044.getClass(), "last", null);
        setField(term370044, term370044.getClass(), "propListHead", null);
        setIntField(term370044, term370044.getClass(), "sourcePosition", 0);
        setField(term370044, term370044.getClass(), "jsType", null);
        setField(term370044, term370044.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term369894;
        args[1] = term369964;
        args[2] = term370034;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term369824, args);
        assertTrue(recursiveEquals(term369824, term370069));
        assertTrue(recursiveEquals(term369894, term370070));
        assertTrue(recursiveEquals(term369964, term370071));
        assertTrue(recursiveEquals(term370034, term370072));
        assertTrue(recursiveEquals(retValue, term370044));
    }

};


