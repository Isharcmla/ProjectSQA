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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209543;
     Object term209635;
     Object term210253;
     Object term210254;
     Object term210220;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209543 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term209635 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term209727 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term209819 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term209727, term209727.getClass(), "next", term209819);
        setIntField(term209727, term209727.getClass(), "type", 39);
        setField(term209635, term209635.getClass(), "first", term209727);
        setIntField(term209635, term209635.getClass(), "type", 20);
        term210253 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term210253, term210253.getClass(), "currentTraversal", null);
        term210254 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term210255 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term210256 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term210254, term210254.getClass(), "number", 0.0);
        setIntField(term210254, term210254.getClass(), "type", 20);
        setField(term210254, term210254.getClass(), "next", null);
        setDoubleField(term210255, term210255.getClass(), "number", 0.0);
        setIntField(term210255, term210255.getClass(), "type", 39);
        setField(term210256, term210256.getClass(), "str", null);
        setIntField(term210256, term210256.getClass(), "type", 0);
        setField(term210256, term210256.getClass(), "next", null);
        setField(term210256, term210256.getClass(), "first", null);
        setField(term210256, term210256.getClass(), "last", null);
        setField(term210256, term210256.getClass(), "propListHead", null);
        setIntField(term210256, term210256.getClass(), "sourcePosition", 0);
        setField(term210256, term210256.getClass(), "jsType", null);
        setField(term210256, term210256.getClass(), "parent", null);
        setField(term210255, term210255.getClass(), "next", term210256);
        setField(term210255, term210255.getClass(), "first", null);
        setField(term210255, term210255.getClass(), "last", null);
        setField(term210255, term210255.getClass(), "propListHead", null);
        setIntField(term210255, term210255.getClass(), "sourcePosition", 0);
        setField(term210255, term210255.getClass(), "jsType", null);
        setField(term210255, term210255.getClass(), "parent", null);
        setField(term210254, term210254.getClass(), "first", term210255);
        setField(term210254, term210254.getClass(), "last", null);
        setField(term210254, term210254.getClass(), "propListHead", null);
        setIntField(term210254, term210254.getClass(), "sourcePosition", 0);
        setField(term210254, term210254.getClass(), "jsType", null);
        setField(term210254, term210254.getClass(), "parent", null);
        term210220 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term210223 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term210226 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term210220, term210220.getClass(), "number", 0.0);
        setIntField(term210220, term210220.getClass(), "type", 20);
        setField(term210220, term210220.getClass(), "next", null);
        setDoubleField(term210223, term210223.getClass(), "number", 0.0);
        setIntField(term210223, term210223.getClass(), "type", 39);
        setField(term210226, term210226.getClass(), "str", null);
        setIntField(term210226, term210226.getClass(), "type", 0);
        setField(term210226, term210226.getClass(), "next", null);
        setField(term210226, term210226.getClass(), "first", null);
        setField(term210226, term210226.getClass(), "last", null);
        setField(term210226, term210226.getClass(), "propListHead", null);
        setIntField(term210226, term210226.getClass(), "sourcePosition", 0);
        setField(term210226, term210226.getClass(), "jsType", null);
        setField(term210226, term210226.getClass(), "parent", null);
        setField(term210223, term210223.getClass(), "next", term210226);
        setField(term210223, term210223.getClass(), "first", null);
        setField(term210223, term210223.getClass(), "last", null);
        setField(term210223, term210223.getClass(), "propListHead", null);
        setIntField(term210223, term210223.getClass(), "sourcePosition", 0);
        setField(term210223, term210223.getClass(), "jsType", null);
        setField(term210223, term210223.getClass(), "parent", null);
        setField(term210220, term210220.getClass(), "first", term210223);
        setField(term210220, term210220.getClass(), "last", null);
        setField(term210220, term210220.getClass(), "propListHead", null);
        setIntField(term210220, term210220.getClass(), "sourcePosition", 0);
        setField(term210220, term210220.getClass(), "jsType", null);
        setField(term210220, term210220.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term209635;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term209543, args);
        assertTrue(recursiveEquals(term209543, term210253));
        assertTrue(recursiveEquals(term209635, term210254));
        assertTrue(recursiveEquals(retValue, term210220));
    }

};


