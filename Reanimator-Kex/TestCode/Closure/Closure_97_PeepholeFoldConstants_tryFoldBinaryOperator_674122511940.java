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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277176;
     Object term277246;
     Object term303259;
     Object term303260;
     Object term303230;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277176 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term277246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term277316, term277316.getClass(), "next", term277386);
        setIntField(term277316, term277316.getClass(), "type", 39);
        setField(term277246, term277246.getClass(), "first", term277316);
        setIntField(term277246, term277246.getClass(), "type", 19);
        term303259 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term303259, term303259.getClass(), "currentTraversal", null);
        term303260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term303260, term303260.getClass(), "type", 19);
        setField(term303260, term303260.getClass(), "next", null);
        setIntField(term303261, term303261.getClass(), "type", 39);
        setIntField(term303262, term303262.getClass(), "type", 0);
        setField(term303262, term303262.getClass(), "next", null);
        setField(term303262, term303262.getClass(), "first", null);
        setField(term303262, term303262.getClass(), "last", null);
        setField(term303262, term303262.getClass(), "propListHead", null);
        setIntField(term303262, term303262.getClass(), "sourcePosition", 0);
        setField(term303262, term303262.getClass(), "jsType", null);
        setField(term303262, term303262.getClass(), "parent", null);
        setField(term303261, term303261.getClass(), "next", term303262);
        setField(term303261, term303261.getClass(), "first", null);
        setField(term303261, term303261.getClass(), "last", null);
        setField(term303261, term303261.getClass(), "propListHead", null);
        setIntField(term303261, term303261.getClass(), "sourcePosition", 0);
        setField(term303261, term303261.getClass(), "jsType", null);
        setField(term303261, term303261.getClass(), "parent", null);
        setField(term303260, term303260.getClass(), "first", term303261);
        setField(term303260, term303260.getClass(), "last", null);
        setField(term303260, term303260.getClass(), "propListHead", null);
        setIntField(term303260, term303260.getClass(), "sourcePosition", 0);
        setField(term303260, term303260.getClass(), "jsType", null);
        setField(term303260, term303260.getClass(), "parent", null);
        term303230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term303230, term303230.getClass(), "type", 19);
        setField(term303230, term303230.getClass(), "next", null);
        setIntField(term303232, term303232.getClass(), "type", 39);
        setIntField(term303234, term303234.getClass(), "type", 0);
        setField(term303234, term303234.getClass(), "next", null);
        setField(term303234, term303234.getClass(), "first", null);
        setField(term303234, term303234.getClass(), "last", null);
        setField(term303234, term303234.getClass(), "propListHead", null);
        setIntField(term303234, term303234.getClass(), "sourcePosition", 0);
        setField(term303234, term303234.getClass(), "jsType", null);
        setField(term303234, term303234.getClass(), "parent", null);
        setField(term303232, term303232.getClass(), "next", term303234);
        setField(term303232, term303232.getClass(), "first", null);
        setField(term303232, term303232.getClass(), "last", null);
        setField(term303232, term303232.getClass(), "propListHead", null);
        setIntField(term303232, term303232.getClass(), "sourcePosition", 0);
        setField(term303232, term303232.getClass(), "jsType", null);
        setField(term303232, term303232.getClass(), "parent", null);
        setField(term303230, term303230.getClass(), "first", term303232);
        setField(term303230, term303230.getClass(), "last", null);
        setField(term303230, term303230.getClass(), "propListHead", null);
        setIntField(term303230, term303230.getClass(), "sourcePosition", 0);
        setField(term303230, term303230.getClass(), "jsType", null);
        setField(term303230, term303230.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term277246;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term277176, args);
        assertTrue(recursiveEquals(term277176, term303259));
        assertTrue(recursiveEquals(term277246, term303260));
        assertTrue(recursiveEquals(retValue, term303230));
    }

};


