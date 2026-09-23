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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term867281;
     Object term867373;
     Object term868014;
     Object term868015;
     Object term867991;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term867281 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term867373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term867443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term867373, term867373.getClass(), "first", term867373);
        setField(term867373, term867373.getClass(), "next", term867443);
        setIntField(term867373, term867373.getClass(), "type", 18);
        term868014 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term868014, term868014.getClass(), "currentTraversal", null);
        term868015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term868016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term868015, term868015.getClass(), "number", 0.0);
        setIntField(term868015, term868015.getClass(), "type", 18);
        setIntField(term868016, term868016.getClass(), "type", 0);
        setField(term868016, term868016.getClass(), "next", null);
        setField(term868016, term868016.getClass(), "first", null);
        setField(term868016, term868016.getClass(), "last", null);
        setField(term868016, term868016.getClass(), "propListHead", null);
        setIntField(term868016, term868016.getClass(), "sourcePosition", 0);
        setField(term868016, term868016.getClass(), "jsType", null);
        setField(term868016, term868016.getClass(), "parent", null);
        setField(term868015, term868015.getClass(), "next", term868016);
        setField(term868015, term868015.getClass(), "first", term868015);
        setField(term868015, term868015.getClass(), "last", null);
        setField(term868015, term868015.getClass(), "propListHead", null);
        setIntField(term868015, term868015.getClass(), "sourcePosition", 0);
        setField(term868015, term868015.getClass(), "jsType", null);
        setField(term868015, term868015.getClass(), "parent", null);
        term867991 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term867994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term867991, term867991.getClass(), "number", 0.0);
        setIntField(term867991, term867991.getClass(), "type", 18);
        setIntField(term867994, term867994.getClass(), "type", 0);
        setField(term867994, term867994.getClass(), "next", null);
        setField(term867994, term867994.getClass(), "first", null);
        setField(term867994, term867994.getClass(), "last", null);
        setField(term867994, term867994.getClass(), "propListHead", null);
        setIntField(term867994, term867994.getClass(), "sourcePosition", 0);
        setField(term867994, term867994.getClass(), "jsType", null);
        setField(term867994, term867994.getClass(), "parent", null);
        setField(term867991, term867991.getClass(), "next", term867994);
        setField(term867991, term867991.getClass(), "first", term867991);
        setField(term867991, term867991.getClass(), "last", null);
        setField(term867991, term867991.getClass(), "propListHead", null);
        setIntField(term867991, term867991.getClass(), "sourcePosition", 0);
        setField(term867991, term867991.getClass(), "jsType", null);
        setField(term867991, term867991.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term867373;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term867281, args);
        assertTrue(recursiveEquals(term867281, term868014));
        assertTrue(recursiveEquals(term867373, term868015));
        assertTrue(recursiveEquals(retValue, term867991));
    }

};


