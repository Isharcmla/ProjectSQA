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

public class NodeUtil_isFunctionAnonymous_1907643444419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32788;
     Object term32887;

    public NodeUtil_isFunctionAnonymous_1907643444419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32788, term32788.getClass(), "parent", term32858);
        term32887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32887, term32887.getClass(), "type", 0);
        setField(term32887, term32887.getClass(), "next", null);
        setField(term32887, term32887.getClass(), "first", null);
        setField(term32887, term32887.getClass(), "last", null);
        setField(term32887, term32887.getClass(), "propListHead", null);
        setIntField(term32887, term32887.getClass(), "sourcePosition", 0);
        setField(term32887, term32887.getClass(), "jsType", null);
        setIntField(term32888, term32888.getClass(), "type", 0);
        setField(term32888, term32888.getClass(), "next", null);
        setField(term32888, term32888.getClass(), "first", null);
        setField(term32888, term32888.getClass(), "last", null);
        setField(term32888, term32888.getClass(), "propListHead", null);
        setIntField(term32888, term32888.getClass(), "sourcePosition", 0);
        setField(term32888, term32888.getClass(), "jsType", null);
        setField(term32888, term32888.getClass(), "parent", null);
        setField(term32887, term32887.getClass(), "parent", term32888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term32788;
        Object retValue = callMethod(klass, "isFunctionAnonymous", argTypes, null, args);
        assertTrue(recursiveEquals(term32788, term32887));
        assertTrue(recursiveEquals(retValue, true));
    }

};


