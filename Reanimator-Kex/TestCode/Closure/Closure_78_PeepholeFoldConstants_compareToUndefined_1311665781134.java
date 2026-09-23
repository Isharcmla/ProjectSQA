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

public class PeepholeFoldConstants_compareToUndefined_1311665781134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22455;
     Object term22525;
     Object term22731;
     Object term22732;

    public PeepholeFoldConstants_compareToUndefined_1311665781134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22455 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term22525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22525, term22525.getClass(), "type", 0);
        term22731 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term22731, term22731.getClass(), "currentTraversal", null);
        term22732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22732, term22732.getClass(), "type", 0);
        setField(term22732, term22732.getClass(), "next", null);
        setField(term22732, term22732.getClass(), "first", null);
        setField(term22732, term22732.getClass(), "last", null);
        setField(term22732, term22732.getClass(), "propListHead", null);
        setIntField(term22732, term22732.getClass(), "sourcePosition", 0);
        setField(term22732, term22732.getClass(), "jsType", null);
        setField(term22732, term22732.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term22525;
        args[1] = 46;
        Object retValue = callMethod(klass, "compareToUndefined", argTypes, term22455, args);
        assertTrue(recursiveEquals(term22455, term22731));
        assertTrue(recursiveEquals(term22525, term22732));
        assertTrue(recursiveEquals(retValue, true));
    }

};


