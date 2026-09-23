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

public class FoldConstants_tryFoldBlock_1167048042445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134491;
     Object term134561;

    public FoldConstants_tryFoldBlock_1167048042445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134491 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term134561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term134841, term134841.getClass(), "next", term134911);
        setIntField(term134841, term134841.getClass(), "type", 54);
        setField(term134771, term134771.getClass(), "next", term134841);
        setIntField(term134771, term134771.getClass(), "type", 73);
        setField(term134701, term134701.getClass(), "next", term134771);
        setIntField(term134701, term134701.getClass(), "type", 81);
        setField(term134631, term134631.getClass(), "next", term134701);
        setIntField(term134631, term134631.getClass(), "type", 103);
        setField(term134561, term134561.getClass(), "first", term134631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term134561;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term134491, args);
    }

};


