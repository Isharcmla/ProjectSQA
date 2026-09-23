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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916823;
     Object term916915;
     Object term917584;
     Object term917585;
     Object term917509;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term916823 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term916915 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term917007 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term917099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term917169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term917099, term917099.getClass(), "type", 64);
        setField(term917007, term917007.getClass(), "next", term917099);
        setIntField(term917007, term917007.getClass(), "type", 0);
        setField(term916915, term916915.getClass(), "first", term917007);
        setIntField(term916915, term916915.getClass(), "type", 101);
        setField(term916915, term916915.getClass(), "parent", term917169);
        term917584 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term917584, term917584.getClass(), "currentTraversal", null);
        term917585 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term917586 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term917587 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term917588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term917585, term917585.getClass(), "number", 0.0);
        setIntField(term917585, term917585.getClass(), "type", 101);
        setField(term917585, term917585.getClass(), "next", null);
        setDoubleField(term917586, term917586.getClass(), "number", 0.0);
        setIntField(term917586, term917586.getClass(), "type", 0);
        setDoubleField(term917587, term917587.getClass(), "number", 0.0);
        setIntField(term917587, term917587.getClass(), "type", 64);
        setField(term917587, term917587.getClass(), "next", null);
        setField(term917587, term917587.getClass(), "first", null);
        setField(term917587, term917587.getClass(), "last", null);
        setField(term917587, term917587.getClass(), "propListHead", null);
        setIntField(term917587, term917587.getClass(), "sourcePosition", 0);
        setField(term917587, term917587.getClass(), "jsType", null);
        setField(term917587, term917587.getClass(), "parent", null);
        setField(term917586, term917586.getClass(), "next", term917587);
        setField(term917586, term917586.getClass(), "first", null);
        setField(term917586, term917586.getClass(), "last", null);
        setField(term917586, term917586.getClass(), "propListHead", null);
        setIntField(term917586, term917586.getClass(), "sourcePosition", 0);
        setField(term917586, term917586.getClass(), "jsType", null);
        setField(term917586, term917586.getClass(), "parent", null);
        setField(term917585, term917585.getClass(), "first", term917586);
        setField(term917585, term917585.getClass(), "last", null);
        setField(term917585, term917585.getClass(), "propListHead", null);
        setIntField(term917585, term917585.getClass(), "sourcePosition", 0);
        setField(term917585, term917585.getClass(), "jsType", null);
        setIntField(term917588, term917588.getClass(), "type", 0);
        setField(term917588, term917588.getClass(), "next", null);
        setField(term917588, term917588.getClass(), "first", null);
        setField(term917588, term917588.getClass(), "last", null);
        setField(term917588, term917588.getClass(), "propListHead", null);
        setIntField(term917588, term917588.getClass(), "sourcePosition", 0);
        setField(term917588, term917588.getClass(), "jsType", null);
        setField(term917588, term917588.getClass(), "parent", null);
        setField(term917585, term917585.getClass(), "parent", term917588);
        term917509 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term917512 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term917515 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term917521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term917509, term917509.getClass(), "number", 0.0);
        setIntField(term917509, term917509.getClass(), "type", 101);
        setField(term917509, term917509.getClass(), "next", null);
        setDoubleField(term917512, term917512.getClass(), "number", 0.0);
        setIntField(term917512, term917512.getClass(), "type", 0);
        setDoubleField(term917515, term917515.getClass(), "number", 0.0);
        setIntField(term917515, term917515.getClass(), "type", 64);
        setField(term917515, term917515.getClass(), "next", null);
        setField(term917515, term917515.getClass(), "first", null);
        setField(term917515, term917515.getClass(), "last", null);
        setField(term917515, term917515.getClass(), "propListHead", null);
        setIntField(term917515, term917515.getClass(), "sourcePosition", 0);
        setField(term917515, term917515.getClass(), "jsType", null);
        setField(term917515, term917515.getClass(), "parent", null);
        setField(term917512, term917512.getClass(), "next", term917515);
        setField(term917512, term917512.getClass(), "first", null);
        setField(term917512, term917512.getClass(), "last", null);
        setField(term917512, term917512.getClass(), "propListHead", null);
        setIntField(term917512, term917512.getClass(), "sourcePosition", 0);
        setField(term917512, term917512.getClass(), "jsType", null);
        setField(term917512, term917512.getClass(), "parent", null);
        setField(term917509, term917509.getClass(), "first", term917512);
        setField(term917509, term917509.getClass(), "last", null);
        setField(term917509, term917509.getClass(), "propListHead", null);
        setIntField(term917509, term917509.getClass(), "sourcePosition", 0);
        setField(term917509, term917509.getClass(), "jsType", null);
        setIntField(term917521, term917521.getClass(), "type", 0);
        setField(term917521, term917521.getClass(), "next", null);
        setField(term917521, term917521.getClass(), "first", null);
        setField(term917521, term917521.getClass(), "last", null);
        setField(term917521, term917521.getClass(), "propListHead", null);
        setIntField(term917521, term917521.getClass(), "sourcePosition", 0);
        setField(term917521, term917521.getClass(), "jsType", null);
        setField(term917521, term917521.getClass(), "parent", null);
        setField(term917509, term917509.getClass(), "parent", term917521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term916915;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term916823, args);
        assertTrue(recursiveEquals(term916823, term917584));
        assertTrue(recursiveEquals(term916915, term917585));
        assertTrue(recursiveEquals(retValue, term917509));
    }

};


