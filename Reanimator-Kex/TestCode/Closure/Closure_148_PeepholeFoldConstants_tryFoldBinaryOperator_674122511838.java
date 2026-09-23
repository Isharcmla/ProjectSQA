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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191216;
     Object term191308;
     Object term191550;
     Object term191551;
     Object term191501;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191216 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term191308 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term191400 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term191492 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term191400, term191400.getClass(), "next", term191492);
        setIntField(term191400, term191400.getClass(), "type", 16);
        setField(term191308, term191308.getClass(), "first", term191400);
        setIntField(term191308, term191308.getClass(), "type", 16);
        term191550 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term191550, term191550.getClass(), "currentTraversal", null);
        term191551 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term191552 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term191553 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term191551, term191551.getClass(), "number", 0.0);
        setIntField(term191551, term191551.getClass(), "type", 16);
        setField(term191551, term191551.getClass(), "next", null);
        setDoubleField(term191552, term191552.getClass(), "number", 0.0);
        setIntField(term191552, term191552.getClass(), "type", 16);
        setDoubleField(term191553, term191553.getClass(), "number", 0.0);
        setIntField(term191553, term191553.getClass(), "type", 0);
        setField(term191553, term191553.getClass(), "next", null);
        setField(term191553, term191553.getClass(), "first", null);
        setField(term191553, term191553.getClass(), "last", null);
        setField(term191553, term191553.getClass(), "propListHead", null);
        setIntField(term191553, term191553.getClass(), "sourcePosition", 0);
        setField(term191553, term191553.getClass(), "jsType", null);
        setField(term191553, term191553.getClass(), "parent", null);
        setField(term191552, term191552.getClass(), "next", term191553);
        setField(term191552, term191552.getClass(), "first", null);
        setField(term191552, term191552.getClass(), "last", null);
        setField(term191552, term191552.getClass(), "propListHead", null);
        setIntField(term191552, term191552.getClass(), "sourcePosition", 0);
        setField(term191552, term191552.getClass(), "jsType", null);
        setField(term191552, term191552.getClass(), "parent", null);
        setField(term191551, term191551.getClass(), "first", term191552);
        setField(term191551, term191551.getClass(), "last", null);
        setField(term191551, term191551.getClass(), "propListHead", null);
        setIntField(term191551, term191551.getClass(), "sourcePosition", 0);
        setField(term191551, term191551.getClass(), "jsType", null);
        setField(term191551, term191551.getClass(), "parent", null);
        term191501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term191504 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term191507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term191501, term191501.getClass(), "number", 0.0);
        setIntField(term191501, term191501.getClass(), "type", 16);
        setField(term191501, term191501.getClass(), "next", null);
        setDoubleField(term191504, term191504.getClass(), "number", 0.0);
        setIntField(term191504, term191504.getClass(), "type", 16);
        setDoubleField(term191507, term191507.getClass(), "number", 0.0);
        setIntField(term191507, term191507.getClass(), "type", 0);
        setField(term191507, term191507.getClass(), "next", null);
        setField(term191507, term191507.getClass(), "first", null);
        setField(term191507, term191507.getClass(), "last", null);
        setField(term191507, term191507.getClass(), "propListHead", null);
        setIntField(term191507, term191507.getClass(), "sourcePosition", 0);
        setField(term191507, term191507.getClass(), "jsType", null);
        setField(term191507, term191507.getClass(), "parent", null);
        setField(term191504, term191504.getClass(), "next", term191507);
        setField(term191504, term191504.getClass(), "first", null);
        setField(term191504, term191504.getClass(), "last", null);
        setField(term191504, term191504.getClass(), "propListHead", null);
        setIntField(term191504, term191504.getClass(), "sourcePosition", 0);
        setField(term191504, term191504.getClass(), "jsType", null);
        setField(term191504, term191504.getClass(), "parent", null);
        setField(term191501, term191501.getClass(), "first", term191504);
        setField(term191501, term191501.getClass(), "last", null);
        setField(term191501, term191501.getClass(), "propListHead", null);
        setIntField(term191501, term191501.getClass(), "sourcePosition", 0);
        setField(term191501, term191501.getClass(), "jsType", null);
        setField(term191501, term191501.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term191308;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term191216, args);
        assertTrue(recursiveEquals(term191216, term191550));
        assertTrue(recursiveEquals(term191308, term191551));
        assertTrue(recursiveEquals(retValue, term191501));
    }

};


