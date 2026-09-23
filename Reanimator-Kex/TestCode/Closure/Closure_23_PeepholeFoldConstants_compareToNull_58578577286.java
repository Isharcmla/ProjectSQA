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

public class PeepholeFoldConstants_compareToNull_58578577286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10193;
     Object term10263;
     Object term11416;
     Object term11417;

    public PeepholeFoldConstants_compareToNull_58578577286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10193 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term10263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10263, term10263.getClass(), "type", 0);
        term11416 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term11416, term11416.getClass(), "late", false);
        setField(term11416, term11416.getClass(), "compiler", null);
        term11417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11417, term11417.getClass(), "type", 0);
        setField(term11417, term11417.getClass(), "next", null);
        setField(term11417, term11417.getClass(), "first", null);
        setField(term11417, term11417.getClass(), "last", null);
        setField(term11417, term11417.getClass(), "propListHead", null);
        setIntField(term11417, term11417.getClass(), "sourcePosition", 0);
        setField(term11417, term11417.getClass(), "jsType", null);
        setField(term11417, term11417.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10263;
        args[1] = 46;
        Object retValue = callMethod(klass, "compareToNull", argTypes, term10193, args);
        assertTrue(recursiveEquals(term10193, term11416));
        assertTrue(recursiveEquals(term10263, term11417));
        assertTrue(recursiveEquals(retValue, true));
    }

};


