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

public class NodeUtil_isFunctionAnonymous_1907643444458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37162;
     Object term37763;

    public NodeUtil_isFunctionAnonymous_1907643444458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37162, term37162.getClass(), "parent", term37232);
        term37763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37763, term37763.getClass(), "type", 0);
        setField(term37763, term37763.getClass(), "next", null);
        setField(term37763, term37763.getClass(), "first", null);
        setField(term37763, term37763.getClass(), "last", null);
        setField(term37763, term37763.getClass(), "propListHead", null);
        setIntField(term37763, term37763.getClass(), "sourcePosition", 0);
        setField(term37763, term37763.getClass(), "jsType", null);
        setIntField(term37764, term37764.getClass(), "type", 0);
        setField(term37764, term37764.getClass(), "next", null);
        setField(term37764, term37764.getClass(), "first", null);
        setField(term37764, term37764.getClass(), "last", null);
        setField(term37764, term37764.getClass(), "propListHead", null);
        setIntField(term37764, term37764.getClass(), "sourcePosition", 0);
        setField(term37764, term37764.getClass(), "jsType", null);
        setField(term37764, term37764.getClass(), "parent", null);
        setField(term37763, term37763.getClass(), "parent", term37764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37162;
        Object retValue = callMethod(klass, "isFunctionAnonymous", argTypes, null, args);
        assertTrue(recursiveEquals(term37162, term37763));
        assertTrue(recursiveEquals(retValue, true));
    }

};


