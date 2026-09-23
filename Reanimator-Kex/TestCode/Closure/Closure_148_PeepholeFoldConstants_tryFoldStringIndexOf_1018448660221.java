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

public class PeepholeFoldConstants_tryFoldStringIndexOf_1018448660221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41833;
     Object term41903;
     Object term42221;
     Object term42222;
     Object term42206;

    public PeepholeFoldConstants_tryFoldStringIndexOf_1018448660221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41833 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term41903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41903, term41903.getClass(), "type", 37);
        setField(term41903, term41903.getClass(), "first", term41903);
        term42221 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term42221, term42221.getClass(), "currentTraversal", null);
        term42222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42222, term42222.getClass(), "type", 37);
        setField(term42222, term42222.getClass(), "next", null);
        setField(term42222, term42222.getClass(), "first", term42222);
        setField(term42222, term42222.getClass(), "last", null);
        setField(term42222, term42222.getClass(), "propListHead", null);
        setIntField(term42222, term42222.getClass(), "sourcePosition", 0);
        setField(term42222, term42222.getClass(), "jsType", null);
        setField(term42222, term42222.getClass(), "parent", null);
        term42206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42206, term42206.getClass(), "type", 37);
        setField(term42206, term42206.getClass(), "next", null);
        setField(term42206, term42206.getClass(), "first", term42206);
        setField(term42206, term42206.getClass(), "last", null);
        setField(term42206, term42206.getClass(), "propListHead", null);
        setIntField(term42206, term42206.getClass(), "sourcePosition", 0);
        setField(term42206, term42206.getClass(), "jsType", null);
        setField(term42206, term42206.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41903;
        Object retValue = callMethod(klass, "tryFoldStringIndexOf", argTypes, term41833, args);
        assertTrue(recursiveEquals(term41833, term42221));
        assertTrue(recursiveEquals(term41903, term42222));
        assertTrue(recursiveEquals(retValue, term42206));
    }

};


