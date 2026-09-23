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
     Object term247544;
     Object term247636;
     Object term248216;
     Object term248217;
     Object term248182;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247544 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term247636 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term247728 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term247820 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term247728, term247728.getClass(), "next", term247820);
        setField(term247636, term247636.getClass(), "first", term247728);
        setIntField(term247636, term247636.getClass(), "type", 46);
        term248216 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term248216, term248216.getClass(), "currentTraversal", null);
        term248217 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term248218 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term248219 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term248217, term248217.getClass(), "str", null);
        setIntField(term248217, term248217.getClass(), "type", 46);
        setField(term248217, term248217.getClass(), "next", null);
        setField(term248218, term248218.getClass(), "str", null);
        setIntField(term248218, term248218.getClass(), "type", 0);
        setField(term248219, term248219.getClass(), "str", null);
        setIntField(term248219, term248219.getClass(), "type", 0);
        setField(term248219, term248219.getClass(), "next", null);
        setField(term248219, term248219.getClass(), "first", null);
        setField(term248219, term248219.getClass(), "last", null);
        setField(term248219, term248219.getClass(), "propListHead", null);
        setIntField(term248219, term248219.getClass(), "sourcePosition", 0);
        setField(term248219, term248219.getClass(), "jsType", null);
        setField(term248219, term248219.getClass(), "parent", null);
        setField(term248218, term248218.getClass(), "next", term248219);
        setField(term248218, term248218.getClass(), "first", null);
        setField(term248218, term248218.getClass(), "last", null);
        setField(term248218, term248218.getClass(), "propListHead", null);
        setIntField(term248218, term248218.getClass(), "sourcePosition", 0);
        setField(term248218, term248218.getClass(), "jsType", null);
        setField(term248218, term248218.getClass(), "parent", null);
        setField(term248217, term248217.getClass(), "first", term248218);
        setField(term248217, term248217.getClass(), "last", null);
        setField(term248217, term248217.getClass(), "propListHead", null);
        setIntField(term248217, term248217.getClass(), "sourcePosition", 0);
        setField(term248217, term248217.getClass(), "jsType", null);
        setField(term248217, term248217.getClass(), "parent", null);
        term248182 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term248184 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term248186 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term248182, term248182.getClass(), "str", null);
        setIntField(term248182, term248182.getClass(), "type", 46);
        setField(term248182, term248182.getClass(), "next", null);
        setField(term248184, term248184.getClass(), "str", null);
        setIntField(term248184, term248184.getClass(), "type", 0);
        setField(term248186, term248186.getClass(), "str", null);
        setIntField(term248186, term248186.getClass(), "type", 0);
        setField(term248186, term248186.getClass(), "next", null);
        setField(term248186, term248186.getClass(), "first", null);
        setField(term248186, term248186.getClass(), "last", null);
        setField(term248186, term248186.getClass(), "propListHead", null);
        setIntField(term248186, term248186.getClass(), "sourcePosition", 0);
        setField(term248186, term248186.getClass(), "jsType", null);
        setField(term248186, term248186.getClass(), "parent", null);
        setField(term248184, term248184.getClass(), "next", term248186);
        setField(term248184, term248184.getClass(), "first", null);
        setField(term248184, term248184.getClass(), "last", null);
        setField(term248184, term248184.getClass(), "propListHead", null);
        setIntField(term248184, term248184.getClass(), "sourcePosition", 0);
        setField(term248184, term248184.getClass(), "jsType", null);
        setField(term248184, term248184.getClass(), "parent", null);
        setField(term248182, term248182.getClass(), "first", term248184);
        setField(term248182, term248182.getClass(), "last", null);
        setField(term248182, term248182.getClass(), "propListHead", null);
        setIntField(term248182, term248182.getClass(), "sourcePosition", 0);
        setField(term248182, term248182.getClass(), "jsType", null);
        setField(term248182, term248182.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term247636;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term247544, args);
        assertTrue(recursiveEquals(term247544, term248216));
        assertTrue(recursiveEquals(term247636, term248217));
        assertTrue(recursiveEquals(retValue, term248182));
    }

};


