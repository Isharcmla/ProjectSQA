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

public class FoldConstants_tryFoldBlock_1167048042448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136131;
     Object term136201;

    public FoldConstants_tryFoldBlock_1167048042448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136131 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term136201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term136481, term136481.getClass(), "next", term136551);
        setIntField(term136481, term136481.getClass(), "type", 58);
        setField(term136411, term136411.getClass(), "next", term136481);
        setIntField(term136411, term136411.getClass(), "type", 74);
        setField(term136341, term136341.getClass(), "next", term136411);
        setIntField(term136341, term136341.getClass(), "type", 79);
        setField(term136271, term136271.getClass(), "next", term136341);
        setIntField(term136271, term136271.getClass(), "type", 60);
        setField(term136201, term136201.getClass(), "first", term136271);
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
        args[1] = term136201;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term136131, args);
    }

};


