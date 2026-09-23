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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82660;
     Object term82730;
     Object term83044;
     Object term83045;
     Object term83022;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82660 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term82730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82730, term82730.getClass(), "first", term82730);
        setField(term82730, term82730.getClass(), "next", term82730);
        setIntField(term82730, term82730.getClass(), "type", 52);
        term83044 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term83044, term83044.getClass(), "currentTraversal", null);
        term83045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83045, term83045.getClass(), "type", 52);
        setField(term83045, term83045.getClass(), "next", term83045);
        setField(term83045, term83045.getClass(), "first", term83045);
        setField(term83045, term83045.getClass(), "last", null);
        setField(term83045, term83045.getClass(), "propListHead", null);
        setIntField(term83045, term83045.getClass(), "sourcePosition", 0);
        setField(term83045, term83045.getClass(), "jsType", null);
        setField(term83045, term83045.getClass(), "parent", null);
        term83022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83022, term83022.getClass(), "type", 52);
        setField(term83022, term83022.getClass(), "next", term83022);
        setField(term83022, term83022.getClass(), "first", term83022);
        setField(term83022, term83022.getClass(), "last", null);
        setField(term83022, term83022.getClass(), "propListHead", null);
        setIntField(term83022, term83022.getClass(), "sourcePosition", 0);
        setField(term83022, term83022.getClass(), "jsType", null);
        setField(term83022, term83022.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term82730;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term82660, args);
        assertTrue(recursiveEquals(term82660, term83044));
        assertTrue(recursiveEquals(term82730, term83045));
        assertTrue(recursiveEquals(retValue, term83022));
    }

};


