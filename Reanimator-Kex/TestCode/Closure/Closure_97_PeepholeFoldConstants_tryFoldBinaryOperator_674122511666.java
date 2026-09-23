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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172564;
     Object term172656;
     Object term172885;
     Object term172886;
     Object term172849;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172564 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term172656 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172748 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term172748, term172748.getClass(), "next", term172840);
        setIntField(term172748, term172748.getClass(), "type", 39);
        setField(term172656, term172656.getClass(), "first", term172748);
        setIntField(term172656, term172656.getClass(), "type", 20);
        term172885 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term172885, term172885.getClass(), "currentTraversal", null);
        term172886 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172888 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term172886, term172886.getClass(), "number", 0.0);
        setIntField(term172886, term172886.getClass(), "type", 20);
        setField(term172886, term172886.getClass(), "next", null);
        setDoubleField(term172887, term172887.getClass(), "number", 0.0);
        setIntField(term172887, term172887.getClass(), "type", 39);
        setDoubleField(term172888, term172888.getClass(), "number", 0.0);
        setIntField(term172888, term172888.getClass(), "type", 0);
        setField(term172888, term172888.getClass(), "next", null);
        setField(term172888, term172888.getClass(), "first", null);
        setField(term172888, term172888.getClass(), "last", null);
        setField(term172888, term172888.getClass(), "propListHead", null);
        setIntField(term172888, term172888.getClass(), "sourcePosition", 0);
        setField(term172888, term172888.getClass(), "jsType", null);
        setField(term172888, term172888.getClass(), "parent", null);
        setField(term172887, term172887.getClass(), "next", term172888);
        setField(term172887, term172887.getClass(), "first", null);
        setField(term172887, term172887.getClass(), "last", null);
        setField(term172887, term172887.getClass(), "propListHead", null);
        setIntField(term172887, term172887.getClass(), "sourcePosition", 0);
        setField(term172887, term172887.getClass(), "jsType", null);
        setField(term172887, term172887.getClass(), "parent", null);
        setField(term172886, term172886.getClass(), "first", term172887);
        setField(term172886, term172886.getClass(), "last", null);
        setField(term172886, term172886.getClass(), "propListHead", null);
        setIntField(term172886, term172886.getClass(), "sourcePosition", 0);
        setField(term172886, term172886.getClass(), "jsType", null);
        setField(term172886, term172886.getClass(), "parent", null);
        term172849 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172852 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172855 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term172849, term172849.getClass(), "number", 0.0);
        setIntField(term172849, term172849.getClass(), "type", 20);
        setField(term172849, term172849.getClass(), "next", null);
        setDoubleField(term172852, term172852.getClass(), "number", 0.0);
        setIntField(term172852, term172852.getClass(), "type", 39);
        setDoubleField(term172855, term172855.getClass(), "number", 0.0);
        setIntField(term172855, term172855.getClass(), "type", 0);
        setField(term172855, term172855.getClass(), "next", null);
        setField(term172855, term172855.getClass(), "first", null);
        setField(term172855, term172855.getClass(), "last", null);
        setField(term172855, term172855.getClass(), "propListHead", null);
        setIntField(term172855, term172855.getClass(), "sourcePosition", 0);
        setField(term172855, term172855.getClass(), "jsType", null);
        setField(term172855, term172855.getClass(), "parent", null);
        setField(term172852, term172852.getClass(), "next", term172855);
        setField(term172852, term172852.getClass(), "first", null);
        setField(term172852, term172852.getClass(), "last", null);
        setField(term172852, term172852.getClass(), "propListHead", null);
        setIntField(term172852, term172852.getClass(), "sourcePosition", 0);
        setField(term172852, term172852.getClass(), "jsType", null);
        setField(term172852, term172852.getClass(), "parent", null);
        setField(term172849, term172849.getClass(), "first", term172852);
        setField(term172849, term172849.getClass(), "last", null);
        setField(term172849, term172849.getClass(), "propListHead", null);
        setIntField(term172849, term172849.getClass(), "sourcePosition", 0);
        setField(term172849, term172849.getClass(), "jsType", null);
        setField(term172849, term172849.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term172656;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term172564, args);
        assertTrue(recursiveEquals(term172564, term172885));
        assertTrue(recursiveEquals(term172656, term172886));
        assertTrue(recursiveEquals(retValue, term172849));
    }

};


