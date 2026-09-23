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

public class PeepholeFoldConstants_tryFoldBitAndOr_5871227272004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536696;
     Object term536766;
     Object term536836;
     Object term536906;
     Object term536925;
     Object term536926;
     Object term536927;
     Object term536928;
     Object term536908;

    public PeepholeFoldConstants_tryFoldBitAndOr_5871227272004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term536696 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term536766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term536766, term536766.getClass(), "type", 11);
        term536836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term536836, term536836.getClass(), "type", 39);
        term536906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term536925 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term536925, term536925.getClass(), "currentTraversal", null);
        term536926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term536926, term536926.getClass(), "type", 11);
        setField(term536926, term536926.getClass(), "next", null);
        setField(term536926, term536926.getClass(), "first", null);
        setField(term536926, term536926.getClass(), "last", null);
        setField(term536926, term536926.getClass(), "propListHead", null);
        setIntField(term536926, term536926.getClass(), "sourcePosition", 0);
        setField(term536926, term536926.getClass(), "jsType", null);
        setField(term536926, term536926.getClass(), "parent", null);
        term536927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term536927, term536927.getClass(), "type", 39);
        setField(term536927, term536927.getClass(), "next", null);
        setField(term536927, term536927.getClass(), "first", null);
        setField(term536927, term536927.getClass(), "last", null);
        setField(term536927, term536927.getClass(), "propListHead", null);
        setIntField(term536927, term536927.getClass(), "sourcePosition", 0);
        setField(term536927, term536927.getClass(), "jsType", null);
        setField(term536927, term536927.getClass(), "parent", null);
        term536928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term536928, term536928.getClass(), "type", 0);
        setField(term536928, term536928.getClass(), "next", null);
        setField(term536928, term536928.getClass(), "first", null);
        setField(term536928, term536928.getClass(), "last", null);
        setField(term536928, term536928.getClass(), "propListHead", null);
        setIntField(term536928, term536928.getClass(), "sourcePosition", 0);
        setField(term536928, term536928.getClass(), "jsType", null);
        setField(term536928, term536928.getClass(), "parent", null);
        term536908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term536908, term536908.getClass(), "type", 11);
        setField(term536908, term536908.getClass(), "next", null);
        setField(term536908, term536908.getClass(), "first", null);
        setField(term536908, term536908.getClass(), "last", null);
        setField(term536908, term536908.getClass(), "propListHead", null);
        setIntField(term536908, term536908.getClass(), "sourcePosition", 0);
        setField(term536908, term536908.getClass(), "jsType", null);
        setField(term536908, term536908.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term536766;
        args[1] = term536836;
        args[2] = term536906;
        Object retValue = callMethod(klass, "tryFoldBitAndOr", argTypes, term536696, args);
        assertTrue(recursiveEquals(term536696, term536925));
        assertTrue(recursiveEquals(term536766, term536926));
        assertTrue(recursiveEquals(term536836, term536927));
        assertTrue(recursiveEquals(term536906, term536928));
        assertTrue(recursiveEquals(retValue, term536908));
    }

};


