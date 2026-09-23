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

public class PeepholeFoldConstants_compareToUndefined_1311665781188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28887;
     Object term28957;
     Object term29163;
     Object term29164;

    public PeepholeFoldConstants_compareToUndefined_1311665781188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28887 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term28957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28957, term28957.getClass(), "type", 0);
        term29163 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term29163, term29163.getClass(), "currentTraversal", null);
        term29164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29164, term29164.getClass(), "type", 0);
        setField(term29164, term29164.getClass(), "next", null);
        setField(term29164, term29164.getClass(), "first", null);
        setField(term29164, term29164.getClass(), "last", null);
        setField(term29164, term29164.getClass(), "propListHead", null);
        setIntField(term29164, term29164.getClass(), "sourcePosition", 0);
        setField(term29164, term29164.getClass(), "jsType", null);
        setField(term29164, term29164.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term28957;
        args[1] = 13;
        Object retValue = callMethod(klass, "compareToUndefined", argTypes, term28887, args);
        assertTrue(recursiveEquals(term28887, term29163));
        assertTrue(recursiveEquals(term28957, term29164));
        assertTrue(recursiveEquals(retValue, true));
    }

};


