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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292554;
     Object term292646;
     Object term292870;
     Object term292871;
     Object term292837;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292554 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term292646 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term292738 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term292830 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term292738, term292738.getClass(), "next", term292830);
        setField(term292646, term292646.getClass(), "first", term292738);
        setIntField(term292646, term292646.getClass(), "type", 9);
        term292870 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term292870, term292870.getClass(), "currentTraversal", null);
        term292871 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term292872 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term292873 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term292871, term292871.getClass(), "str", null);
        setIntField(term292871, term292871.getClass(), "type", 9);
        setField(term292871, term292871.getClass(), "next", null);
        setField(term292872, term292872.getClass(), "str", null);
        setIntField(term292872, term292872.getClass(), "type", 0);
        setField(term292873, term292873.getClass(), "str", null);
        setIntField(term292873, term292873.getClass(), "type", 0);
        setField(term292873, term292873.getClass(), "next", null);
        setField(term292873, term292873.getClass(), "first", null);
        setField(term292873, term292873.getClass(), "last", null);
        setField(term292873, term292873.getClass(), "propListHead", null);
        setIntField(term292873, term292873.getClass(), "sourcePosition", 0);
        setField(term292873, term292873.getClass(), "jsType", null);
        setField(term292873, term292873.getClass(), "parent", null);
        setField(term292872, term292872.getClass(), "next", term292873);
        setField(term292872, term292872.getClass(), "first", null);
        setField(term292872, term292872.getClass(), "last", null);
        setField(term292872, term292872.getClass(), "propListHead", null);
        setIntField(term292872, term292872.getClass(), "sourcePosition", 0);
        setField(term292872, term292872.getClass(), "jsType", null);
        setField(term292872, term292872.getClass(), "parent", null);
        setField(term292871, term292871.getClass(), "first", term292872);
        setField(term292871, term292871.getClass(), "last", null);
        setField(term292871, term292871.getClass(), "propListHead", null);
        setIntField(term292871, term292871.getClass(), "sourcePosition", 0);
        setField(term292871, term292871.getClass(), "jsType", null);
        setField(term292871, term292871.getClass(), "parent", null);
        term292837 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term292839 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term292841 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term292837, term292837.getClass(), "str", null);
        setIntField(term292837, term292837.getClass(), "type", 9);
        setField(term292837, term292837.getClass(), "next", null);
        setField(term292839, term292839.getClass(), "str", null);
        setIntField(term292839, term292839.getClass(), "type", 0);
        setField(term292841, term292841.getClass(), "str", null);
        setIntField(term292841, term292841.getClass(), "type", 0);
        setField(term292841, term292841.getClass(), "next", null);
        setField(term292841, term292841.getClass(), "first", null);
        setField(term292841, term292841.getClass(), "last", null);
        setField(term292841, term292841.getClass(), "propListHead", null);
        setIntField(term292841, term292841.getClass(), "sourcePosition", 0);
        setField(term292841, term292841.getClass(), "jsType", null);
        setField(term292841, term292841.getClass(), "parent", null);
        setField(term292839, term292839.getClass(), "next", term292841);
        setField(term292839, term292839.getClass(), "first", null);
        setField(term292839, term292839.getClass(), "last", null);
        setField(term292839, term292839.getClass(), "propListHead", null);
        setIntField(term292839, term292839.getClass(), "sourcePosition", 0);
        setField(term292839, term292839.getClass(), "jsType", null);
        setField(term292839, term292839.getClass(), "parent", null);
        setField(term292837, term292837.getClass(), "first", term292839);
        setField(term292837, term292837.getClass(), "last", null);
        setField(term292837, term292837.getClass(), "propListHead", null);
        setIntField(term292837, term292837.getClass(), "sourcePosition", 0);
        setField(term292837, term292837.getClass(), "jsType", null);
        setField(term292837, term292837.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term292646;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term292554, args);
        assertTrue(recursiveEquals(term292554, term292870));
        assertTrue(recursiveEquals(term292646, term292871));
        assertTrue(recursiveEquals(retValue, term292837));
    }

};


