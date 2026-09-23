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

public class NodeUtil_canBeSideEffected_2078426861329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29444;
     Object term29534;

    public NodeUtil_canBeSideEffected_2078426861329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29444, term29444.getClass(), "type", 30);
        term29534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29534, term29534.getClass(), "type", 30);
        setField(term29534, term29534.getClass(), "next", null);
        setField(term29534, term29534.getClass(), "first", null);
        setField(term29534, term29534.getClass(), "last", null);
        setField(term29534, term29534.getClass(), "propListHead", null);
        setIntField(term29534, term29534.getClass(), "sourcePosition", 0);
        setField(term29534, term29534.getClass(), "jsType", null);
        setField(term29534, term29534.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term29444;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term29444, term29534));
        assertTrue(recursiveEquals(retValue, true));
    }

};


