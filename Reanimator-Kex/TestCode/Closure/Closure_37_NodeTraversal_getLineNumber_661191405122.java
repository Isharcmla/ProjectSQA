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

public class NodeTraversal_getLineNumber_661191405122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23836;
     Object term23923;

    public NodeTraversal_getLineNumber_661191405122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23836 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term23906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23836, term23836.getClass(), "curNode", term23906);
        term23923 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term23924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23923, term23923.getClass(), "compiler", null);
        setField(term23923, term23923.getClass(), "callback", null);
        setIntField(term23924, term23924.getClass(), "type", 0);
        setField(term23924, term23924.getClass(), "next", null);
        setField(term23924, term23924.getClass(), "first", null);
        setField(term23924, term23924.getClass(), "last", null);
        setField(term23924, term23924.getClass(), "propListHead", null);
        setIntField(term23924, term23924.getClass(), "sourcePosition", 0);
        setField(term23924, term23924.getClass(), "jsType", null);
        setField(term23924, term23924.getClass(), "parent", null);
        setField(term23923, term23923.getClass(), "curNode", term23924);
        setField(term23923, term23923.getClass(), "scopes", null);
        setField(term23923, term23923.getClass(), "scopeRoots", null);
        setField(term23923, term23923.getClass(), "cfgs", null);
        setField(term23923, term23923.getClass(), "sourceName", null);
        setField(term23923, term23923.getClass(), "inputId", null);
        setField(term23923, term23923.getClass(), "scopeCreator", null);
        setField(term23923, term23923.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLineNumber", argTypes, term23836, args);
        assertTrue(recursiveEquals(term23836, term23923));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


