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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46329;
     Object term46421;
     Object term46747;
     Object term46748;
     Object term46689;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46329 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term46421 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46583 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term46491, term46491.getClass(), "next", term46583);
        setIntField(term46491, term46491.getClass(), "type", 0);
        setField(term46421, term46421.getClass(), "first", term46491);
        setIntField(term46421, term46421.getClass(), "type", 100);
        setField(term46421, term46421.getClass(), "parent", null);
        term46747 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term46747, term46747.getClass(), "currentTraversal", null);
        term46748 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46750 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term46748, term46748.getClass(), "number", 0.0);
        setIntField(term46748, term46748.getClass(), "type", 100);
        setField(term46748, term46748.getClass(), "next", null);
        setIntField(term46749, term46749.getClass(), "type", 0);
        setDoubleField(term46750, term46750.getClass(), "number", 0.0);
        setIntField(term46750, term46750.getClass(), "type", 0);
        setField(term46750, term46750.getClass(), "next", null);
        setField(term46750, term46750.getClass(), "first", null);
        setField(term46750, term46750.getClass(), "last", null);
        setField(term46750, term46750.getClass(), "propListHead", null);
        setIntField(term46750, term46750.getClass(), "sourcePosition", 0);
        setField(term46750, term46750.getClass(), "jsType", null);
        setField(term46750, term46750.getClass(), "parent", null);
        setField(term46749, term46749.getClass(), "next", term46750);
        setField(term46749, term46749.getClass(), "first", null);
        setField(term46749, term46749.getClass(), "last", null);
        setField(term46749, term46749.getClass(), "propListHead", null);
        setIntField(term46749, term46749.getClass(), "sourcePosition", 0);
        setField(term46749, term46749.getClass(), "jsType", null);
        setField(term46749, term46749.getClass(), "parent", null);
        setField(term46748, term46748.getClass(), "first", term46749);
        setField(term46748, term46748.getClass(), "last", null);
        setField(term46748, term46748.getClass(), "propListHead", null);
        setIntField(term46748, term46748.getClass(), "sourcePosition", 0);
        setField(term46748, term46748.getClass(), "jsType", null);
        setField(term46748, term46748.getClass(), "parent", null);
        term46689 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term46689, term46689.getClass(), "number", 0.0);
        setIntField(term46689, term46689.getClass(), "type", 100);
        setField(term46689, term46689.getClass(), "next", null);
        setIntField(term46692, term46692.getClass(), "type", 0);
        setDoubleField(term46694, term46694.getClass(), "number", 0.0);
        setIntField(term46694, term46694.getClass(), "type", 0);
        setField(term46694, term46694.getClass(), "next", null);
        setField(term46694, term46694.getClass(), "first", null);
        setField(term46694, term46694.getClass(), "last", null);
        setField(term46694, term46694.getClass(), "propListHead", null);
        setIntField(term46694, term46694.getClass(), "sourcePosition", 0);
        setField(term46694, term46694.getClass(), "jsType", null);
        setField(term46694, term46694.getClass(), "parent", null);
        setField(term46692, term46692.getClass(), "next", term46694);
        setField(term46692, term46692.getClass(), "first", null);
        setField(term46692, term46692.getClass(), "last", null);
        setField(term46692, term46692.getClass(), "propListHead", null);
        setIntField(term46692, term46692.getClass(), "sourcePosition", 0);
        setField(term46692, term46692.getClass(), "jsType", null);
        setField(term46692, term46692.getClass(), "parent", null);
        setField(term46689, term46689.getClass(), "first", term46692);
        setField(term46689, term46689.getClass(), "last", null);
        setField(term46689, term46689.getClass(), "propListHead", null);
        setIntField(term46689, term46689.getClass(), "sourcePosition", 0);
        setField(term46689, term46689.getClass(), "jsType", null);
        setField(term46689, term46689.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46421;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term46329, args);
        assertTrue(recursiveEquals(term46329, term46747));
        assertTrue(recursiveEquals(term46421, term46748));
        assertTrue(recursiveEquals(retValue, term46689));
    }

};


