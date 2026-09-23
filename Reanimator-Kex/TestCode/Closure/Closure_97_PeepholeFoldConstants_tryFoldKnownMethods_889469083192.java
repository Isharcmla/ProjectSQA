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

public class PeepholeFoldConstants_tryFoldKnownMethods_889469083192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36895;
     Object term36965;
     Object term36984;
     Object term36985;
     Object term36966;

    public PeepholeFoldConstants_tryFoldKnownMethods_889469083192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36895 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term36965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36965, term36965.getClass(), "first", null);
        setIntField(term36965, term36965.getClass(), "type", 37);
        term36984 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term36984, term36984.getClass(), "currentTraversal", null);
        term36985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36985, term36985.getClass(), "type", 37);
        setField(term36985, term36985.getClass(), "next", null);
        setField(term36985, term36985.getClass(), "first", null);
        setField(term36985, term36985.getClass(), "last", null);
        setField(term36985, term36985.getClass(), "propListHead", null);
        setIntField(term36985, term36985.getClass(), "sourcePosition", 0);
        setField(term36985, term36985.getClass(), "jsType", null);
        setField(term36985, term36985.getClass(), "parent", null);
        term36966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36966, term36966.getClass(), "type", 37);
        setField(term36966, term36966.getClass(), "next", null);
        setField(term36966, term36966.getClass(), "first", null);
        setField(term36966, term36966.getClass(), "last", null);
        setField(term36966, term36966.getClass(), "propListHead", null);
        setIntField(term36966, term36966.getClass(), "sourcePosition", 0);
        setField(term36966, term36966.getClass(), "jsType", null);
        setField(term36966, term36966.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36965;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term36895, args);
        assertTrue(recursiveEquals(term36895, term36984));
        assertTrue(recursiveEquals(term36965, term36985));
        assertTrue(recursiveEquals(retValue, term36966));
    }

};


