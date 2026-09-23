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

public class PeepholeFoldConstants_compareToUndefined_1311665781140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23320;
     Object term23390;
     Object term23595;
     Object term23596;

    public PeepholeFoldConstants_compareToUndefined_1311665781140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23320 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term23390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23390, term23390.getClass(), "type", 0);
        term23595 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term23595, term23595.getClass(), "currentTraversal", null);
        term23596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23596, term23596.getClass(), "type", 0);
        setField(term23596, term23596.getClass(), "next", null);
        setField(term23596, term23596.getClass(), "first", null);
        setField(term23596, term23596.getClass(), "last", null);
        setField(term23596, term23596.getClass(), "propListHead", null);
        setIntField(term23596, term23596.getClass(), "sourcePosition", 0);
        setField(term23596, term23596.getClass(), "jsType", null);
        setField(term23596, term23596.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term23390;
        args[1] = 45;
        Object retValue = callMethod(klass, "compareToUndefined", argTypes, term23320, args);
        assertTrue(recursiveEquals(term23320, term23595));
        assertTrue(recursiveEquals(term23390, term23596));
        assertTrue(recursiveEquals(retValue, false));
    }

};


