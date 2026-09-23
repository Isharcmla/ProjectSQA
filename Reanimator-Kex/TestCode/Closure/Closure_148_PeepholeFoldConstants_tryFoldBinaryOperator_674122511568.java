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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123875;
     Object term123967;
     Object term124807;
     Object term124808;
     Object term124760;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123875 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term123967 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term124037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term123967, term123967.getClass(), "first", term123967);
        setField(term123967, term123967.getClass(), "next", term124037);
        setIntField(term123967, term123967.getClass(), "type", 100);
        term124807 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term124807, term124807.getClass(), "currentTraversal", null);
        term124808 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term124809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term124808, term124808.getClass(), "str", null);
        setIntField(term124808, term124808.getClass(), "type", 100);
        setIntField(term124809, term124809.getClass(), "type", 0);
        setField(term124809, term124809.getClass(), "next", null);
        setField(term124809, term124809.getClass(), "first", null);
        setField(term124809, term124809.getClass(), "last", null);
        setField(term124809, term124809.getClass(), "propListHead", null);
        setIntField(term124809, term124809.getClass(), "sourcePosition", 0);
        setField(term124809, term124809.getClass(), "jsType", null);
        setField(term124809, term124809.getClass(), "parent", null);
        setField(term124808, term124808.getClass(), "next", term124809);
        setField(term124808, term124808.getClass(), "first", term124808);
        setField(term124808, term124808.getClass(), "last", null);
        setField(term124808, term124808.getClass(), "propListHead", null);
        setIntField(term124808, term124808.getClass(), "sourcePosition", 0);
        setField(term124808, term124808.getClass(), "jsType", null);
        setField(term124808, term124808.getClass(), "parent", null);
        term124760 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term124762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term124760, term124760.getClass(), "str", null);
        setIntField(term124760, term124760.getClass(), "type", 100);
        setIntField(term124762, term124762.getClass(), "type", 0);
        setField(term124762, term124762.getClass(), "next", null);
        setField(term124762, term124762.getClass(), "first", null);
        setField(term124762, term124762.getClass(), "last", null);
        setField(term124762, term124762.getClass(), "propListHead", null);
        setIntField(term124762, term124762.getClass(), "sourcePosition", 0);
        setField(term124762, term124762.getClass(), "jsType", null);
        setField(term124762, term124762.getClass(), "parent", null);
        setField(term124760, term124760.getClass(), "next", term124762);
        setField(term124760, term124760.getClass(), "first", term124760);
        setField(term124760, term124760.getClass(), "last", null);
        setField(term124760, term124760.getClass(), "propListHead", null);
        setIntField(term124760, term124760.getClass(), "sourcePosition", 0);
        setField(term124760, term124760.getClass(), "jsType", null);
        setField(term124760, term124760.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term123967;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term123875, args);
        assertTrue(recursiveEquals(term123875, term124807));
        assertTrue(recursiveEquals(term123967, term124808));
        assertTrue(recursiveEquals(retValue, term124760));
    }

};


