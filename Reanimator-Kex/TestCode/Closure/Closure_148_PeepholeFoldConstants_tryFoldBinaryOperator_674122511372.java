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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75123;
     Object term75215;
     Object term75550;
     Object term75551;
     Object term75517;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75123 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term75215 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term75307 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term75399 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term75307, term75307.getClass(), "next", term75399);
        setIntField(term75307, term75307.getClass(), "type", 39);
        setField(term75215, term75215.getClass(), "first", term75307);
        setIntField(term75215, term75215.getClass(), "type", 11);
        term75550 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term75550, term75550.getClass(), "currentTraversal", null);
        term75551 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term75552 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term75553 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term75551, term75551.getClass(), "str", null);
        setIntField(term75551, term75551.getClass(), "type", 11);
        setField(term75551, term75551.getClass(), "next", null);
        setField(term75552, term75552.getClass(), "str", null);
        setIntField(term75552, term75552.getClass(), "type", 39);
        setField(term75553, term75553.getClass(), "str", null);
        setIntField(term75553, term75553.getClass(), "type", 0);
        setField(term75553, term75553.getClass(), "next", null);
        setField(term75553, term75553.getClass(), "first", null);
        setField(term75553, term75553.getClass(), "last", null);
        setField(term75553, term75553.getClass(), "propListHead", null);
        setIntField(term75553, term75553.getClass(), "sourcePosition", 0);
        setField(term75553, term75553.getClass(), "jsType", null);
        setField(term75553, term75553.getClass(), "parent", null);
        setField(term75552, term75552.getClass(), "next", term75553);
        setField(term75552, term75552.getClass(), "first", null);
        setField(term75552, term75552.getClass(), "last", null);
        setField(term75552, term75552.getClass(), "propListHead", null);
        setIntField(term75552, term75552.getClass(), "sourcePosition", 0);
        setField(term75552, term75552.getClass(), "jsType", null);
        setField(term75552, term75552.getClass(), "parent", null);
        setField(term75551, term75551.getClass(), "first", term75552);
        setField(term75551, term75551.getClass(), "last", null);
        setField(term75551, term75551.getClass(), "propListHead", null);
        setIntField(term75551, term75551.getClass(), "sourcePosition", 0);
        setField(term75551, term75551.getClass(), "jsType", null);
        setField(term75551, term75551.getClass(), "parent", null);
        term75517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term75519 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term75521 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term75517, term75517.getClass(), "str", null);
        setIntField(term75517, term75517.getClass(), "type", 11);
        setField(term75517, term75517.getClass(), "next", null);
        setField(term75519, term75519.getClass(), "str", null);
        setIntField(term75519, term75519.getClass(), "type", 39);
        setField(term75521, term75521.getClass(), "str", null);
        setIntField(term75521, term75521.getClass(), "type", 0);
        setField(term75521, term75521.getClass(), "next", null);
        setField(term75521, term75521.getClass(), "first", null);
        setField(term75521, term75521.getClass(), "last", null);
        setField(term75521, term75521.getClass(), "propListHead", null);
        setIntField(term75521, term75521.getClass(), "sourcePosition", 0);
        setField(term75521, term75521.getClass(), "jsType", null);
        setField(term75521, term75521.getClass(), "parent", null);
        setField(term75519, term75519.getClass(), "next", term75521);
        setField(term75519, term75519.getClass(), "first", null);
        setField(term75519, term75519.getClass(), "last", null);
        setField(term75519, term75519.getClass(), "propListHead", null);
        setIntField(term75519, term75519.getClass(), "sourcePosition", 0);
        setField(term75519, term75519.getClass(), "jsType", null);
        setField(term75519, term75519.getClass(), "parent", null);
        setField(term75517, term75517.getClass(), "first", term75519);
        setField(term75517, term75517.getClass(), "last", null);
        setField(term75517, term75517.getClass(), "propListHead", null);
        setIntField(term75517, term75517.getClass(), "sourcePosition", 0);
        setField(term75517, term75517.getClass(), "jsType", null);
        setField(term75517, term75517.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term75215;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term75123, args);
        assertTrue(recursiveEquals(term75123, term75550));
        assertTrue(recursiveEquals(term75215, term75551));
        assertTrue(recursiveEquals(retValue, term75517));
    }

};


