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

public class PeepholeFoldConstants_tryFoldBinaryOperator_67412251197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12855;
     Object term12925;
     Object term12984;
     Object term12985;
     Object term12959;

    public PeepholeFoldConstants_tryFoldBinaryOperator_67412251197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12855 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term12925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12925, term12925.getClass(), "first", term12925);
        setField(term12925, term12925.getClass(), "next", term12925);
        setIntField(term12925, term12925.getClass(), "type", 89);
        term12984 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term12984, term12984.getClass(), "late", false);
        setField(term12984, term12984.getClass(), "compiler", null);
        term12985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12985, term12985.getClass(), "type", 89);
        setField(term12985, term12985.getClass(), "next", term12985);
        setField(term12985, term12985.getClass(), "first", term12985);
        setField(term12985, term12985.getClass(), "last", null);
        setField(term12985, term12985.getClass(), "propListHead", null);
        setIntField(term12985, term12985.getClass(), "sourcePosition", 0);
        setField(term12985, term12985.getClass(), "jsType", null);
        setField(term12985, term12985.getClass(), "parent", null);
        term12959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12959, term12959.getClass(), "type", 89);
        setField(term12959, term12959.getClass(), "next", term12959);
        setField(term12959, term12959.getClass(), "first", term12959);
        setField(term12959, term12959.getClass(), "last", null);
        setField(term12959, term12959.getClass(), "propListHead", null);
        setIntField(term12959, term12959.getClass(), "sourcePosition", 0);
        setField(term12959, term12959.getClass(), "jsType", null);
        setField(term12959, term12959.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12925;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term12855, args);
        assertTrue(recursiveEquals(term12855, term12984));
        assertTrue(recursiveEquals(term12925, term12985));
        assertTrue(recursiveEquals(retValue, term12959));
    }

};


