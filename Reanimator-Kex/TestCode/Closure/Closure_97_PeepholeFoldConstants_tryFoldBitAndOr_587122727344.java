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

public class PeepholeFoldConstants_tryFoldBitAndOr_587122727344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67469;
     Object term67574;
     Object term81390;
     Object term81391;
     Object term81392;
     Object term81379;

    public PeepholeFoldConstants_tryFoldBitAndOr_587122727344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67469 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term67574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67574, term67574.getClass(), "type", 9);
        term81390 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81390, term81390.getClass(), "currentTraversal", null);
        term81391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81391, term81391.getClass(), "type", 9);
        setField(term81391, term81391.getClass(), "next", null);
        setField(term81391, term81391.getClass(), "first", null);
        setField(term81391, term81391.getClass(), "last", null);
        setField(term81391, term81391.getClass(), "propListHead", null);
        setIntField(term81391, term81391.getClass(), "sourcePosition", 0);
        setField(term81391, term81391.getClass(), "jsType", null);
        setField(term81391, term81391.getClass(), "parent", null);
        term81392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81392, term81392.getClass(), "type", 9);
        setField(term81392, term81392.getClass(), "next", null);
        setField(term81392, term81392.getClass(), "first", null);
        setField(term81392, term81392.getClass(), "last", null);
        setField(term81392, term81392.getClass(), "propListHead", null);
        setIntField(term81392, term81392.getClass(), "sourcePosition", 0);
        setField(term81392, term81392.getClass(), "jsType", null);
        setField(term81392, term81392.getClass(), "parent", null);
        term81379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81379, term81379.getClass(), "type", 9);
        setField(term81379, term81379.getClass(), "next", null);
        setField(term81379, term81379.getClass(), "first", null);
        setField(term81379, term81379.getClass(), "last", null);
        setField(term81379, term81379.getClass(), "propListHead", null);
        setIntField(term81379, term81379.getClass(), "sourcePosition", 0);
        setField(term81379, term81379.getClass(), "jsType", null);
        setField(term81379, term81379.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term67574;
        args[1] = term67574;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldBitAndOr", argTypes, term67469, args);
        assertTrue(recursiveEquals(term67469, term81390));
        assertTrue(recursiveEquals(term67574, term81391));
        assertTrue(recursiveEquals(term67574, term81392));
        assertTrue(recursiveEquals(retValue, term81379));
    }

};


