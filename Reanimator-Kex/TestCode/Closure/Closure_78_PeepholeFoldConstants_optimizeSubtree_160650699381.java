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

public class PeepholeFoldConstants_optimizeSubtree_160650699381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14040;
     Object term14110;
     Object term14412;
     Object term14413;
     Object term14403;

    public PeepholeFoldConstants_optimizeSubtree_160650699381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14040 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term14110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14110, term14110.getClass(), "type", 69);
        term14412 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term14412, term14412.getClass(), "currentTraversal", null);
        term14413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14413, term14413.getClass(), "type", 69);
        setField(term14413, term14413.getClass(), "next", null);
        setField(term14413, term14413.getClass(), "first", null);
        setField(term14413, term14413.getClass(), "last", null);
        setField(term14413, term14413.getClass(), "propListHead", null);
        setIntField(term14413, term14413.getClass(), "sourcePosition", 0);
        setField(term14413, term14413.getClass(), "jsType", null);
        setField(term14413, term14413.getClass(), "parent", null);
        term14403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14403, term14403.getClass(), "type", 69);
        setField(term14403, term14403.getClass(), "next", null);
        setField(term14403, term14403.getClass(), "first", null);
        setField(term14403, term14403.getClass(), "last", null);
        setField(term14403, term14403.getClass(), "propListHead", null);
        setIntField(term14403, term14403.getClass(), "sourcePosition", 0);
        setField(term14403, term14403.getClass(), "jsType", null);
        setField(term14403, term14403.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14110;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term14040, args);
        assertTrue(recursiveEquals(term14040, term14412));
        assertTrue(recursiveEquals(term14110, term14413));
        assertTrue(recursiveEquals(retValue, term14403));
    }

};


