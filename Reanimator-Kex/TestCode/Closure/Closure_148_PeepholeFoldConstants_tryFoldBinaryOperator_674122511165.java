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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30238;
     Object term30308;
     Object term30855;
     Object term30856;
     Object term30826;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term30308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term30378, term30378.getClass(), "next", term30448);
        setIntField(term30378, term30378.getClass(), "type", 39);
        setField(term30308, term30308.getClass(), "first", term30378);
        setIntField(term30308, term30308.getClass(), "type", 20);
        term30855 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term30855, term30855.getClass(), "currentTraversal", null);
        term30856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30856, term30856.getClass(), "type", 20);
        setField(term30856, term30856.getClass(), "next", null);
        setIntField(term30857, term30857.getClass(), "type", 39);
        setIntField(term30858, term30858.getClass(), "type", 0);
        setField(term30858, term30858.getClass(), "next", null);
        setField(term30858, term30858.getClass(), "first", null);
        setField(term30858, term30858.getClass(), "last", null);
        setField(term30858, term30858.getClass(), "propListHead", null);
        setIntField(term30858, term30858.getClass(), "sourcePosition", 0);
        setField(term30858, term30858.getClass(), "jsType", null);
        setField(term30858, term30858.getClass(), "parent", null);
        setField(term30857, term30857.getClass(), "next", term30858);
        setField(term30857, term30857.getClass(), "first", null);
        setField(term30857, term30857.getClass(), "last", null);
        setField(term30857, term30857.getClass(), "propListHead", null);
        setIntField(term30857, term30857.getClass(), "sourcePosition", 0);
        setField(term30857, term30857.getClass(), "jsType", null);
        setField(term30857, term30857.getClass(), "parent", null);
        setField(term30856, term30856.getClass(), "first", term30857);
        setField(term30856, term30856.getClass(), "last", null);
        setField(term30856, term30856.getClass(), "propListHead", null);
        setIntField(term30856, term30856.getClass(), "sourcePosition", 0);
        setField(term30856, term30856.getClass(), "jsType", null);
        setField(term30856, term30856.getClass(), "parent", null);
        term30826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30826, term30826.getClass(), "type", 20);
        setField(term30826, term30826.getClass(), "next", null);
        setIntField(term30828, term30828.getClass(), "type", 39);
        setIntField(term30830, term30830.getClass(), "type", 0);
        setField(term30830, term30830.getClass(), "next", null);
        setField(term30830, term30830.getClass(), "first", null);
        setField(term30830, term30830.getClass(), "last", null);
        setField(term30830, term30830.getClass(), "propListHead", null);
        setIntField(term30830, term30830.getClass(), "sourcePosition", 0);
        setField(term30830, term30830.getClass(), "jsType", null);
        setField(term30830, term30830.getClass(), "parent", null);
        setField(term30828, term30828.getClass(), "next", term30830);
        setField(term30828, term30828.getClass(), "first", null);
        setField(term30828, term30828.getClass(), "last", null);
        setField(term30828, term30828.getClass(), "propListHead", null);
        setIntField(term30828, term30828.getClass(), "sourcePosition", 0);
        setField(term30828, term30828.getClass(), "jsType", null);
        setField(term30828, term30828.getClass(), "parent", null);
        setField(term30826, term30826.getClass(), "first", term30828);
        setField(term30826, term30826.getClass(), "last", null);
        setField(term30826, term30826.getClass(), "propListHead", null);
        setIntField(term30826, term30826.getClass(), "sourcePosition", 0);
        setField(term30826, term30826.getClass(), "jsType", null);
        setField(term30826, term30826.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30308;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term30238, args);
        assertTrue(recursiveEquals(term30238, term30855));
        assertTrue(recursiveEquals(term30308, term30856));
        assertTrue(recursiveEquals(retValue, term30826));
    }

};


