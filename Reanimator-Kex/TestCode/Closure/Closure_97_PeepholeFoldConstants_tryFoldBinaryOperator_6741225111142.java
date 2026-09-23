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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351615;
     Object term351707;
     Object term351983;
     Object term351984;
     Object term351950;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351615 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term351707 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351799 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351891 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term351799, term351799.getClass(), "next", term351891);
        setIntField(term351799, term351799.getClass(), "type", 63);
        setField(term351707, term351707.getClass(), "first", term351799);
        setIntField(term351707, term351707.getClass(), "type", 35);
        term351983 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term351983, term351983.getClass(), "currentTraversal", null);
        term351984 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351985 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351986 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term351984, term351984.getClass(), "str", null);
        setIntField(term351984, term351984.getClass(), "type", 35);
        setField(term351984, term351984.getClass(), "next", null);
        setField(term351985, term351985.getClass(), "str", null);
        setIntField(term351985, term351985.getClass(), "type", 63);
        setField(term351986, term351986.getClass(), "str", null);
        setIntField(term351986, term351986.getClass(), "type", 0);
        setField(term351986, term351986.getClass(), "next", null);
        setField(term351986, term351986.getClass(), "first", null);
        setField(term351986, term351986.getClass(), "last", null);
        setField(term351986, term351986.getClass(), "propListHead", null);
        setIntField(term351986, term351986.getClass(), "sourcePosition", 0);
        setField(term351986, term351986.getClass(), "jsType", null);
        setField(term351986, term351986.getClass(), "parent", null);
        setField(term351985, term351985.getClass(), "next", term351986);
        setField(term351985, term351985.getClass(), "first", null);
        setField(term351985, term351985.getClass(), "last", null);
        setField(term351985, term351985.getClass(), "propListHead", null);
        setIntField(term351985, term351985.getClass(), "sourcePosition", 0);
        setField(term351985, term351985.getClass(), "jsType", null);
        setField(term351985, term351985.getClass(), "parent", null);
        setField(term351984, term351984.getClass(), "first", term351985);
        setField(term351984, term351984.getClass(), "last", null);
        setField(term351984, term351984.getClass(), "propListHead", null);
        setIntField(term351984, term351984.getClass(), "sourcePosition", 0);
        setField(term351984, term351984.getClass(), "jsType", null);
        setField(term351984, term351984.getClass(), "parent", null);
        term351950 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351952 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351954 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term351950, term351950.getClass(), "str", null);
        setIntField(term351950, term351950.getClass(), "type", 35);
        setField(term351950, term351950.getClass(), "next", null);
        setField(term351952, term351952.getClass(), "str", null);
        setIntField(term351952, term351952.getClass(), "type", 63);
        setField(term351954, term351954.getClass(), "str", null);
        setIntField(term351954, term351954.getClass(), "type", 0);
        setField(term351954, term351954.getClass(), "next", null);
        setField(term351954, term351954.getClass(), "first", null);
        setField(term351954, term351954.getClass(), "last", null);
        setField(term351954, term351954.getClass(), "propListHead", null);
        setIntField(term351954, term351954.getClass(), "sourcePosition", 0);
        setField(term351954, term351954.getClass(), "jsType", null);
        setField(term351954, term351954.getClass(), "parent", null);
        setField(term351952, term351952.getClass(), "next", term351954);
        setField(term351952, term351952.getClass(), "first", null);
        setField(term351952, term351952.getClass(), "last", null);
        setField(term351952, term351952.getClass(), "propListHead", null);
        setIntField(term351952, term351952.getClass(), "sourcePosition", 0);
        setField(term351952, term351952.getClass(), "jsType", null);
        setField(term351952, term351952.getClass(), "parent", null);
        setField(term351950, term351950.getClass(), "first", term351952);
        setField(term351950, term351950.getClass(), "last", null);
        setField(term351950, term351950.getClass(), "propListHead", null);
        setIntField(term351950, term351950.getClass(), "sourcePosition", 0);
        setField(term351950, term351950.getClass(), "jsType", null);
        setField(term351950, term351950.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term351707;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term351615, args);
        assertTrue(recursiveEquals(term351615, term351983));
        assertTrue(recursiveEquals(term351707, term351984));
        assertTrue(recursiveEquals(retValue, term351950));
    }

};


