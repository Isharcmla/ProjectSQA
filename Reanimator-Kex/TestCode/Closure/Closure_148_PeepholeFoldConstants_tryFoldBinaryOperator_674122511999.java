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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233602;
     Object term233694;
     Object term234316;
     Object term234317;
     Object term234289;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233602 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term233694 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term233786 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term233878 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term233786, term233786.getClass(), "next", term233878);
        setField(term233694, term233694.getClass(), "first", term233786);
        setIntField(term233694, term233694.getClass(), "type", 22);
        term234316 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term234316, term234316.getClass(), "currentTraversal", null);
        term234317 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term234318 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term234319 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term234317, term234317.getClass(), "str", null);
        setIntField(term234317, term234317.getClass(), "type", 22);
        setField(term234317, term234317.getClass(), "next", null);
        setField(term234318, term234318.getClass(), "str", null);
        setIntField(term234318, term234318.getClass(), "type", 0);
        setField(term234319, term234319.getClass(), "str", null);
        setIntField(term234319, term234319.getClass(), "type", 0);
        setField(term234319, term234319.getClass(), "next", null);
        setField(term234319, term234319.getClass(), "first", null);
        setField(term234319, term234319.getClass(), "last", null);
        setField(term234319, term234319.getClass(), "propListHead", null);
        setIntField(term234319, term234319.getClass(), "sourcePosition", 0);
        setField(term234319, term234319.getClass(), "jsType", null);
        setField(term234319, term234319.getClass(), "parent", null);
        setField(term234318, term234318.getClass(), "next", term234319);
        setField(term234318, term234318.getClass(), "first", null);
        setField(term234318, term234318.getClass(), "last", null);
        setField(term234318, term234318.getClass(), "propListHead", null);
        setIntField(term234318, term234318.getClass(), "sourcePosition", 0);
        setField(term234318, term234318.getClass(), "jsType", null);
        setField(term234318, term234318.getClass(), "parent", null);
        setField(term234317, term234317.getClass(), "first", term234318);
        setField(term234317, term234317.getClass(), "last", null);
        setField(term234317, term234317.getClass(), "propListHead", null);
        setIntField(term234317, term234317.getClass(), "sourcePosition", 0);
        setField(term234317, term234317.getClass(), "jsType", null);
        setField(term234317, term234317.getClass(), "parent", null);
        term234289 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term234291 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term234293 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term234289, term234289.getClass(), "str", null);
        setIntField(term234289, term234289.getClass(), "type", 22);
        setField(term234289, term234289.getClass(), "next", null);
        setField(term234291, term234291.getClass(), "str", null);
        setIntField(term234291, term234291.getClass(), "type", 0);
        setField(term234293, term234293.getClass(), "str", null);
        setIntField(term234293, term234293.getClass(), "type", 0);
        setField(term234293, term234293.getClass(), "next", null);
        setField(term234293, term234293.getClass(), "first", null);
        setField(term234293, term234293.getClass(), "last", null);
        setField(term234293, term234293.getClass(), "propListHead", null);
        setIntField(term234293, term234293.getClass(), "sourcePosition", 0);
        setField(term234293, term234293.getClass(), "jsType", null);
        setField(term234293, term234293.getClass(), "parent", null);
        setField(term234291, term234291.getClass(), "next", term234293);
        setField(term234291, term234291.getClass(), "first", null);
        setField(term234291, term234291.getClass(), "last", null);
        setField(term234291, term234291.getClass(), "propListHead", null);
        setIntField(term234291, term234291.getClass(), "sourcePosition", 0);
        setField(term234291, term234291.getClass(), "jsType", null);
        setField(term234291, term234291.getClass(), "parent", null);
        setField(term234289, term234289.getClass(), "first", term234291);
        setField(term234289, term234289.getClass(), "last", null);
        setField(term234289, term234289.getClass(), "propListHead", null);
        setIntField(term234289, term234289.getClass(), "sourcePosition", 0);
        setField(term234289, term234289.getClass(), "jsType", null);
        setField(term234289, term234289.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term233694;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term233602, args);
        assertTrue(recursiveEquals(term233602, term234316));
        assertTrue(recursiveEquals(term233694, term234317));
        assertTrue(recursiveEquals(retValue, term234289));
    }

};


