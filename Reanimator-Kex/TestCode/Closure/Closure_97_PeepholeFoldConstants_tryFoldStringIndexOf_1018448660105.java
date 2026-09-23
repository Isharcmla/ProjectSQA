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

public class PeepholeFoldConstants_tryFoldStringIndexOf_1018448660105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19630;
     Object term19700;
     Object term19906;
     Object term19907;
     Object term19891;

    public PeepholeFoldConstants_tryFoldStringIndexOf_1018448660105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19630 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term19700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19700, term19700.getClass(), "type", 37);
        setField(term19700, term19700.getClass(), "first", term19700);
        term19906 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term19906, term19906.getClass(), "currentTraversal", null);
        term19907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19907, term19907.getClass(), "type", 37);
        setField(term19907, term19907.getClass(), "next", null);
        setField(term19907, term19907.getClass(), "first", term19907);
        setField(term19907, term19907.getClass(), "last", null);
        setField(term19907, term19907.getClass(), "propListHead", null);
        setIntField(term19907, term19907.getClass(), "sourcePosition", 0);
        setField(term19907, term19907.getClass(), "jsType", null);
        setField(term19907, term19907.getClass(), "parent", null);
        term19891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19891, term19891.getClass(), "type", 37);
        setField(term19891, term19891.getClass(), "next", null);
        setField(term19891, term19891.getClass(), "first", term19891);
        setField(term19891, term19891.getClass(), "last", null);
        setField(term19891, term19891.getClass(), "propListHead", null);
        setIntField(term19891, term19891.getClass(), "sourcePosition", 0);
        setField(term19891, term19891.getClass(), "jsType", null);
        setField(term19891, term19891.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19700;
        Object retValue = callMethod(klass, "tryFoldStringIndexOf", argTypes, term19630, args);
        assertTrue(recursiveEquals(term19630, term19906));
        assertTrue(recursiveEquals(term19700, term19907));
        assertTrue(recursiveEquals(retValue, term19891));
    }

};


