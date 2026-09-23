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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315514;
     Object term315606;
     Object term316284;
     Object term316285;
     Object term316248;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315514 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term315606 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term315698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term315790 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term315698, term315698.getClass(), "next", term315790);
        setIntField(term315698, term315698.getClass(), "type", 39);
        setField(term315606, term315606.getClass(), "first", term315698);
        setIntField(term315606, term315606.getClass(), "type", 22);
        term316284 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term316284, term316284.getClass(), "currentTraversal", null);
        term316285 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term316286 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term316287 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term316285, term316285.getClass(), "number", 0.0);
        setIntField(term316285, term316285.getClass(), "type", 22);
        setField(term316285, term316285.getClass(), "next", null);
        setDoubleField(term316286, term316286.getClass(), "number", 0.0);
        setIntField(term316286, term316286.getClass(), "type", 39);
        setDoubleField(term316287, term316287.getClass(), "number", 0.0);
        setIntField(term316287, term316287.getClass(), "type", 0);
        setField(term316287, term316287.getClass(), "next", null);
        setField(term316287, term316287.getClass(), "first", null);
        setField(term316287, term316287.getClass(), "last", null);
        setField(term316287, term316287.getClass(), "propListHead", null);
        setIntField(term316287, term316287.getClass(), "sourcePosition", 0);
        setField(term316287, term316287.getClass(), "jsType", null);
        setField(term316287, term316287.getClass(), "parent", null);
        setField(term316286, term316286.getClass(), "next", term316287);
        setField(term316286, term316286.getClass(), "first", null);
        setField(term316286, term316286.getClass(), "last", null);
        setField(term316286, term316286.getClass(), "propListHead", null);
        setIntField(term316286, term316286.getClass(), "sourcePosition", 0);
        setField(term316286, term316286.getClass(), "jsType", null);
        setField(term316286, term316286.getClass(), "parent", null);
        setField(term316285, term316285.getClass(), "first", term316286);
        setField(term316285, term316285.getClass(), "last", null);
        setField(term316285, term316285.getClass(), "propListHead", null);
        setIntField(term316285, term316285.getClass(), "sourcePosition", 0);
        setField(term316285, term316285.getClass(), "jsType", null);
        setField(term316285, term316285.getClass(), "parent", null);
        term316248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term316251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term316254 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term316248, term316248.getClass(), "number", 0.0);
        setIntField(term316248, term316248.getClass(), "type", 22);
        setField(term316248, term316248.getClass(), "next", null);
        setDoubleField(term316251, term316251.getClass(), "number", 0.0);
        setIntField(term316251, term316251.getClass(), "type", 39);
        setDoubleField(term316254, term316254.getClass(), "number", 0.0);
        setIntField(term316254, term316254.getClass(), "type", 0);
        setField(term316254, term316254.getClass(), "next", null);
        setField(term316254, term316254.getClass(), "first", null);
        setField(term316254, term316254.getClass(), "last", null);
        setField(term316254, term316254.getClass(), "propListHead", null);
        setIntField(term316254, term316254.getClass(), "sourcePosition", 0);
        setField(term316254, term316254.getClass(), "jsType", null);
        setField(term316254, term316254.getClass(), "parent", null);
        setField(term316251, term316251.getClass(), "next", term316254);
        setField(term316251, term316251.getClass(), "first", null);
        setField(term316251, term316251.getClass(), "last", null);
        setField(term316251, term316251.getClass(), "propListHead", null);
        setIntField(term316251, term316251.getClass(), "sourcePosition", 0);
        setField(term316251, term316251.getClass(), "jsType", null);
        setField(term316251, term316251.getClass(), "parent", null);
        setField(term316248, term316248.getClass(), "first", term316251);
        setField(term316248, term316248.getClass(), "last", null);
        setField(term316248, term316248.getClass(), "propListHead", null);
        setIntField(term316248, term316248.getClass(), "sourcePosition", 0);
        setField(term316248, term316248.getClass(), "jsType", null);
        setField(term316248, term316248.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term315606;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term315514, args);
        assertTrue(recursiveEquals(term315514, term316284));
        assertTrue(recursiveEquals(term315606, term316285));
        assertTrue(recursiveEquals(retValue, term316248));
    }

};


