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
import java.lang.Double;

public class NodeUtil_getNumberValue_42027968325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26985;
     Object term27250;
     Object term27248;

    public NodeUtil_getNumberValue_42027968325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26985, term26985.getClass(), "type", 43);
        term27250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27250, term27250.getClass(), "type", 43);
        setField(term27250, term27250.getClass(), "next", null);
        setField(term27250, term27250.getClass(), "first", null);
        setField(term27250, term27250.getClass(), "last", null);
        setField(term27250, term27250.getClass(), "propListHead", null);
        setIntField(term27250, term27250.getClass(), "sourcePosition", 0);
        setField(term27250, term27250.getClass(), "jsType", null);
        setField(term27250, term27250.getClass(), "parent", null);
        term27248 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26985;
        Object retValue = callMethod(klass, "getNumberValue", argTypes, null, args);
        assertTrue(recursiveEquals(term26985, term27250));
        assertTrue(recursiveEquals(retValue, term27248));
    }

};


