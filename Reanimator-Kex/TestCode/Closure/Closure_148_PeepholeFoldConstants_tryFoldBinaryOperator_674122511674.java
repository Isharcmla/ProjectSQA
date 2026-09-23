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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149240;
     Object term149332;
     Object term149554;
     Object term149555;
     Object term149523;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149240 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term149332 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149424 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149516 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term149424, term149424.getClass(), "next", term149516);
        setField(term149332, term149332.getClass(), "first", term149424);
        setIntField(term149332, term149332.getClass(), "type", 35);
        term149554 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term149554, term149554.getClass(), "currentTraversal", null);
        term149555 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149557 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term149555, term149555.getClass(), "str", null);
        setIntField(term149555, term149555.getClass(), "type", 35);
        setField(term149555, term149555.getClass(), "next", null);
        setField(term149556, term149556.getClass(), "str", null);
        setIntField(term149556, term149556.getClass(), "type", 0);
        setField(term149557, term149557.getClass(), "str", null);
        setIntField(term149557, term149557.getClass(), "type", 0);
        setField(term149557, term149557.getClass(), "next", null);
        setField(term149557, term149557.getClass(), "first", null);
        setField(term149557, term149557.getClass(), "last", null);
        setField(term149557, term149557.getClass(), "propListHead", null);
        setIntField(term149557, term149557.getClass(), "sourcePosition", 0);
        setField(term149557, term149557.getClass(), "jsType", null);
        setField(term149557, term149557.getClass(), "parent", null);
        setField(term149556, term149556.getClass(), "next", term149557);
        setField(term149556, term149556.getClass(), "first", null);
        setField(term149556, term149556.getClass(), "last", null);
        setField(term149556, term149556.getClass(), "propListHead", null);
        setIntField(term149556, term149556.getClass(), "sourcePosition", 0);
        setField(term149556, term149556.getClass(), "jsType", null);
        setField(term149556, term149556.getClass(), "parent", null);
        setField(term149555, term149555.getClass(), "first", term149556);
        setField(term149555, term149555.getClass(), "last", null);
        setField(term149555, term149555.getClass(), "propListHead", null);
        setIntField(term149555, term149555.getClass(), "sourcePosition", 0);
        setField(term149555, term149555.getClass(), "jsType", null);
        setField(term149555, term149555.getClass(), "parent", null);
        term149523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149525 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149527 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term149523, term149523.getClass(), "str", null);
        setIntField(term149523, term149523.getClass(), "type", 35);
        setField(term149523, term149523.getClass(), "next", null);
        setField(term149525, term149525.getClass(), "str", null);
        setIntField(term149525, term149525.getClass(), "type", 0);
        setField(term149527, term149527.getClass(), "str", null);
        setIntField(term149527, term149527.getClass(), "type", 0);
        setField(term149527, term149527.getClass(), "next", null);
        setField(term149527, term149527.getClass(), "first", null);
        setField(term149527, term149527.getClass(), "last", null);
        setField(term149527, term149527.getClass(), "propListHead", null);
        setIntField(term149527, term149527.getClass(), "sourcePosition", 0);
        setField(term149527, term149527.getClass(), "jsType", null);
        setField(term149527, term149527.getClass(), "parent", null);
        setField(term149525, term149525.getClass(), "next", term149527);
        setField(term149525, term149525.getClass(), "first", null);
        setField(term149525, term149525.getClass(), "last", null);
        setField(term149525, term149525.getClass(), "propListHead", null);
        setIntField(term149525, term149525.getClass(), "sourcePosition", 0);
        setField(term149525, term149525.getClass(), "jsType", null);
        setField(term149525, term149525.getClass(), "parent", null);
        setField(term149523, term149523.getClass(), "first", term149525);
        setField(term149523, term149523.getClass(), "last", null);
        setField(term149523, term149523.getClass(), "propListHead", null);
        setIntField(term149523, term149523.getClass(), "sourcePosition", 0);
        setField(term149523, term149523.getClass(), "jsType", null);
        setField(term149523, term149523.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term149332;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term149240, args);
        assertTrue(recursiveEquals(term149240, term149554));
        assertTrue(recursiveEquals(term149332, term149555));
        assertTrue(recursiveEquals(retValue, term149523));
    }

};


