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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328716;
     Object term328808;
     Object term329034;
     Object term329035;
     Object term328999;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328716 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term328808 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term328900 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term328992 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term328900, term328900.getClass(), "next", term328992);
        setIntField(term328900, term328900.getClass(), "type", 39);
        setField(term328808, term328808.getClass(), "first", term328900);
        setIntField(term328808, term328808.getClass(), "type", 9);
        term329034 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term329034, term329034.getClass(), "currentTraversal", null);
        term329035 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term329036 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term329037 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term329035, term329035.getClass(), "str", null);
        setIntField(term329035, term329035.getClass(), "type", 9);
        setField(term329035, term329035.getClass(), "next", null);
        setField(term329036, term329036.getClass(), "str", null);
        setIntField(term329036, term329036.getClass(), "type", 39);
        setField(term329037, term329037.getClass(), "str", null);
        setIntField(term329037, term329037.getClass(), "type", 0);
        setField(term329037, term329037.getClass(), "next", null);
        setField(term329037, term329037.getClass(), "first", null);
        setField(term329037, term329037.getClass(), "last", null);
        setField(term329037, term329037.getClass(), "propListHead", null);
        setIntField(term329037, term329037.getClass(), "sourcePosition", 0);
        setField(term329037, term329037.getClass(), "jsType", null);
        setField(term329037, term329037.getClass(), "parent", null);
        setField(term329036, term329036.getClass(), "next", term329037);
        setField(term329036, term329036.getClass(), "first", null);
        setField(term329036, term329036.getClass(), "last", null);
        setField(term329036, term329036.getClass(), "propListHead", null);
        setIntField(term329036, term329036.getClass(), "sourcePosition", 0);
        setField(term329036, term329036.getClass(), "jsType", null);
        setField(term329036, term329036.getClass(), "parent", null);
        setField(term329035, term329035.getClass(), "first", term329036);
        setField(term329035, term329035.getClass(), "last", null);
        setField(term329035, term329035.getClass(), "propListHead", null);
        setIntField(term329035, term329035.getClass(), "sourcePosition", 0);
        setField(term329035, term329035.getClass(), "jsType", null);
        setField(term329035, term329035.getClass(), "parent", null);
        term328999 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term329001 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term329003 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term328999, term328999.getClass(), "str", null);
        setIntField(term328999, term328999.getClass(), "type", 9);
        setField(term328999, term328999.getClass(), "next", null);
        setField(term329001, term329001.getClass(), "str", null);
        setIntField(term329001, term329001.getClass(), "type", 39);
        setField(term329003, term329003.getClass(), "str", null);
        setIntField(term329003, term329003.getClass(), "type", 0);
        setField(term329003, term329003.getClass(), "next", null);
        setField(term329003, term329003.getClass(), "first", null);
        setField(term329003, term329003.getClass(), "last", null);
        setField(term329003, term329003.getClass(), "propListHead", null);
        setIntField(term329003, term329003.getClass(), "sourcePosition", 0);
        setField(term329003, term329003.getClass(), "jsType", null);
        setField(term329003, term329003.getClass(), "parent", null);
        setField(term329001, term329001.getClass(), "next", term329003);
        setField(term329001, term329001.getClass(), "first", null);
        setField(term329001, term329001.getClass(), "last", null);
        setField(term329001, term329001.getClass(), "propListHead", null);
        setIntField(term329001, term329001.getClass(), "sourcePosition", 0);
        setField(term329001, term329001.getClass(), "jsType", null);
        setField(term329001, term329001.getClass(), "parent", null);
        setField(term328999, term328999.getClass(), "first", term329001);
        setField(term328999, term328999.getClass(), "last", null);
        setField(term328999, term328999.getClass(), "propListHead", null);
        setIntField(term328999, term328999.getClass(), "sourcePosition", 0);
        setField(term328999, term328999.getClass(), "jsType", null);
        setField(term328999, term328999.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term328808;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term328716, args);
        assertTrue(recursiveEquals(term328716, term329034));
        assertTrue(recursiveEquals(term328808, term329035));
        assertTrue(recursiveEquals(retValue, term328999));
    }

};


