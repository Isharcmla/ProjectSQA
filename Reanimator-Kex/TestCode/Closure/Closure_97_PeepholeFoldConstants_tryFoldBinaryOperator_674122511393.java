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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91101;
     Object term91193;
     Object term91698;
     Object term91699;
     Object term91675;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91101 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term91193 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term91193, term91193.getClass(), "first", term91193);
        setField(term91193, term91193.getClass(), "next", term91263);
        setIntField(term91193, term91193.getClass(), "type", 23);
        term91698 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term91698, term91698.getClass(), "currentTraversal", null);
        term91699 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term91699, term91699.getClass(), "number", 0.0);
        setIntField(term91699, term91699.getClass(), "type", 23);
        setIntField(term91700, term91700.getClass(), "type", 0);
        setField(term91700, term91700.getClass(), "next", null);
        setField(term91700, term91700.getClass(), "first", null);
        setField(term91700, term91700.getClass(), "last", null);
        setField(term91700, term91700.getClass(), "propListHead", null);
        setIntField(term91700, term91700.getClass(), "sourcePosition", 0);
        setField(term91700, term91700.getClass(), "jsType", null);
        setField(term91700, term91700.getClass(), "parent", null);
        setField(term91699, term91699.getClass(), "next", term91700);
        setField(term91699, term91699.getClass(), "first", term91699);
        setField(term91699, term91699.getClass(), "last", null);
        setField(term91699, term91699.getClass(), "propListHead", null);
        setIntField(term91699, term91699.getClass(), "sourcePosition", 0);
        setField(term91699, term91699.getClass(), "jsType", null);
        setField(term91699, term91699.getClass(), "parent", null);
        term91675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term91675, term91675.getClass(), "number", 0.0);
        setIntField(term91675, term91675.getClass(), "type", 23);
        setIntField(term91678, term91678.getClass(), "type", 0);
        setField(term91678, term91678.getClass(), "next", null);
        setField(term91678, term91678.getClass(), "first", null);
        setField(term91678, term91678.getClass(), "last", null);
        setField(term91678, term91678.getClass(), "propListHead", null);
        setIntField(term91678, term91678.getClass(), "sourcePosition", 0);
        setField(term91678, term91678.getClass(), "jsType", null);
        setField(term91678, term91678.getClass(), "parent", null);
        setField(term91675, term91675.getClass(), "next", term91678);
        setField(term91675, term91675.getClass(), "first", term91675);
        setField(term91675, term91675.getClass(), "last", null);
        setField(term91675, term91675.getClass(), "propListHead", null);
        setIntField(term91675, term91675.getClass(), "sourcePosition", 0);
        setField(term91675, term91675.getClass(), "jsType", null);
        setField(term91675, term91675.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term91193;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term91101, args);
        assertTrue(recursiveEquals(term91101, term91698));
        assertTrue(recursiveEquals(term91193, term91699));
        assertTrue(recursiveEquals(retValue, term91675));
    }

};


