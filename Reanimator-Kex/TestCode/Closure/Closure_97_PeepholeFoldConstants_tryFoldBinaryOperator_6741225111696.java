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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671674;
     Object term671766;
     Object term671986;
     Object term671987;
     Object term671957;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term671674 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term671766 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term671858 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term671950 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term671858, term671858.getClass(), "next", term671950);
        setIntField(term671858, term671858.getClass(), "type", 39);
        setField(term671766, term671766.getClass(), "first", term671858);
        setIntField(term671766, term671766.getClass(), "type", 23);
        term671986 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term671986, term671986.getClass(), "currentTraversal", null);
        term671987 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term671988 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term671989 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term671987, term671987.getClass(), "str", null);
        setIntField(term671987, term671987.getClass(), "type", 23);
        setField(term671987, term671987.getClass(), "next", null);
        setField(term671988, term671988.getClass(), "str", null);
        setIntField(term671988, term671988.getClass(), "type", 39);
        setField(term671989, term671989.getClass(), "str", null);
        setIntField(term671989, term671989.getClass(), "type", 0);
        setField(term671989, term671989.getClass(), "next", null);
        setField(term671989, term671989.getClass(), "first", null);
        setField(term671989, term671989.getClass(), "last", null);
        setField(term671989, term671989.getClass(), "propListHead", null);
        setIntField(term671989, term671989.getClass(), "sourcePosition", 0);
        setField(term671989, term671989.getClass(), "jsType", null);
        setField(term671989, term671989.getClass(), "parent", null);
        setField(term671988, term671988.getClass(), "next", term671989);
        setField(term671988, term671988.getClass(), "first", null);
        setField(term671988, term671988.getClass(), "last", null);
        setField(term671988, term671988.getClass(), "propListHead", null);
        setIntField(term671988, term671988.getClass(), "sourcePosition", 0);
        setField(term671988, term671988.getClass(), "jsType", null);
        setField(term671988, term671988.getClass(), "parent", null);
        setField(term671987, term671987.getClass(), "first", term671988);
        setField(term671987, term671987.getClass(), "last", null);
        setField(term671987, term671987.getClass(), "propListHead", null);
        setIntField(term671987, term671987.getClass(), "sourcePosition", 0);
        setField(term671987, term671987.getClass(), "jsType", null);
        setField(term671987, term671987.getClass(), "parent", null);
        term671957 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term671959 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term671961 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term671957, term671957.getClass(), "str", null);
        setIntField(term671957, term671957.getClass(), "type", 23);
        setField(term671957, term671957.getClass(), "next", null);
        setField(term671959, term671959.getClass(), "str", null);
        setIntField(term671959, term671959.getClass(), "type", 39);
        setField(term671961, term671961.getClass(), "str", null);
        setIntField(term671961, term671961.getClass(), "type", 0);
        setField(term671961, term671961.getClass(), "next", null);
        setField(term671961, term671961.getClass(), "first", null);
        setField(term671961, term671961.getClass(), "last", null);
        setField(term671961, term671961.getClass(), "propListHead", null);
        setIntField(term671961, term671961.getClass(), "sourcePosition", 0);
        setField(term671961, term671961.getClass(), "jsType", null);
        setField(term671961, term671961.getClass(), "parent", null);
        setField(term671959, term671959.getClass(), "next", term671961);
        setField(term671959, term671959.getClass(), "first", null);
        setField(term671959, term671959.getClass(), "last", null);
        setField(term671959, term671959.getClass(), "propListHead", null);
        setIntField(term671959, term671959.getClass(), "sourcePosition", 0);
        setField(term671959, term671959.getClass(), "jsType", null);
        setField(term671959, term671959.getClass(), "parent", null);
        setField(term671957, term671957.getClass(), "first", term671959);
        setField(term671957, term671957.getClass(), "last", null);
        setField(term671957, term671957.getClass(), "propListHead", null);
        setIntField(term671957, term671957.getClass(), "sourcePosition", 0);
        setField(term671957, term671957.getClass(), "jsType", null);
        setField(term671957, term671957.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term671766;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term671674, args);
        assertTrue(recursiveEquals(term671674, term671986));
        assertTrue(recursiveEquals(term671766, term671987));
        assertTrue(recursiveEquals(retValue, term671957));
    }

};


