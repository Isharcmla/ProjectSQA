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

public class FoldConstants_tryFoldBlock_1167048042179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36963;
     Object term37033;
     Object term47182;
     Object term47183;

    public FoldConstants_tryFoldBlock_1167048042179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36963 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term37033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37103, term37103.getClass(), "next", term37033);
        setIntField(term37103, term37103.getClass(), "type", 75);
        setField(term37033, term37033.getClass(), "first", term37103);
        setField(term37033, term37033.getClass(), "next", term37173);
        setIntField(term37033, term37033.getClass(), "type", 34);
        term47182 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term47182, term47182.getClass(), "compiler", null);
        term47183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47183, term47183.getClass(), "type", 34);
        setIntField(term47184, term47184.getClass(), "type", 0);
        setField(term47184, term47184.getClass(), "next", null);
        setField(term47184, term47184.getClass(), "first", null);
        setField(term47184, term47184.getClass(), "last", null);
        setField(term47184, term47184.getClass(), "propListHead", null);
        setIntField(term47184, term47184.getClass(), "sourcePosition", 0);
        setField(term47184, term47184.getClass(), "jsType", null);
        setField(term47184, term47184.getClass(), "parent", null);
        setField(term47183, term47183.getClass(), "next", term47184);
        setIntField(term47185, term47185.getClass(), "type", 75);
        setField(term47185, term47185.getClass(), "next", term47183);
        setField(term47185, term47185.getClass(), "first", null);
        setField(term47185, term47185.getClass(), "last", null);
        setField(term47185, term47185.getClass(), "propListHead", null);
        setIntField(term47185, term47185.getClass(), "sourcePosition", 0);
        setField(term47185, term47185.getClass(), "jsType", null);
        setField(term47185, term47185.getClass(), "parent", null);
        setField(term47183, term47183.getClass(), "first", term47185);
        setField(term47183, term47183.getClass(), "last", null);
        setField(term47183, term47183.getClass(), "propListHead", null);
        setIntField(term47183, term47183.getClass(), "sourcePosition", 0);
        setField(term47183, term47183.getClass(), "jsType", null);
        setField(term47183, term47183.getClass(), "parent", null);
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
        args[1] = term37033;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term36963, args);
        assertTrue(recursiveEquals(term36963, term47182));
        assertTrue(recursiveEquals(term37033, null));
    }

};


