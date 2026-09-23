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

public class FoldConstants_tryFoldBlock_1167048042299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80399;
     Object term80469;

    public FoldConstants_tryFoldBlock_1167048042299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80399 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term80469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term80679, term80679.getClass(), "next", term80749);
        setIntField(term80679, term80679.getClass(), "type", 93);
        setField(term80609, term80609.getClass(), "next", term80679);
        setIntField(term80609, term80609.getClass(), "type", 103);
        setField(term80539, term80539.getClass(), "next", term80609);
        setIntField(term80539, term80539.getClass(), "type", 103);
        setField(term80469, term80469.getClass(), "first", term80539);
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
        args[1] = term80469;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term80399, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


