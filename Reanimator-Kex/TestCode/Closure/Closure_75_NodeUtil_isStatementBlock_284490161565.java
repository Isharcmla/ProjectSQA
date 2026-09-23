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

public class NodeUtil_isStatementBlock_284490161565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44516;
     Object term82653;

    public NodeUtil_isStatementBlock_284490161565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44516, term44516.getClass(), "type", 132);
        term82653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82653, term82653.getClass(), "type", 132);
        setField(term82653, term82653.getClass(), "next", null);
        setField(term82653, term82653.getClass(), "first", null);
        setField(term82653, term82653.getClass(), "last", null);
        setField(term82653, term82653.getClass(), "propListHead", null);
        setIntField(term82653, term82653.getClass(), "sourcePosition", 0);
        setField(term82653, term82653.getClass(), "jsType", null);
        setField(term82653, term82653.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44516;
        Object retValue = callMethod(klass, "isStatementBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term44516, term82653));
        assertTrue(recursiveEquals(retValue, true));
    }

};


