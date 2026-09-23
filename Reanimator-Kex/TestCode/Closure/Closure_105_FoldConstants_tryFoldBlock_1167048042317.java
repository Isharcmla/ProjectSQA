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

public class FoldConstants_tryFoldBlock_1167048042317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86377;
     Object term86447;
     Object term86975;
     Object term86976;

    public FoldConstants_tryFoldBlock_1167048042317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86377 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term86447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86727, term86727.getClass(), "next", term86797);
        setIntField(term86727, term86727.getClass(), "type", 53);
        setField(term86657, term86657.getClass(), "next", term86727);
        setIntField(term86657, term86657.getClass(), "type", 56);
        setField(term86587, term86587.getClass(), "next", term86657);
        setIntField(term86587, term86587.getClass(), "type", 99);
        setField(term86517, term86517.getClass(), "next", term86587);
        setIntField(term86517, term86517.getClass(), "type", 107);
        setField(term86447, term86447.getClass(), "first", term86517);
        term86975 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term86975, term86975.getClass(), "compiler", null);
        term86976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86976, term86976.getClass(), "type", 0);
        setField(term86976, term86976.getClass(), "next", null);
        setIntField(term86977, term86977.getClass(), "type", 107);
        setIntField(term86978, term86978.getClass(), "type", 99);
        setIntField(term86979, term86979.getClass(), "type", 56);
        setIntField(term86980, term86980.getClass(), "type", 53);
        setField(term86980, term86980.getClass(), "next", null);
        setField(term86980, term86980.getClass(), "first", null);
        setField(term86980, term86980.getClass(), "last", null);
        setField(term86980, term86980.getClass(), "propListHead", null);
        setIntField(term86980, term86980.getClass(), "sourcePosition", 0);
        setField(term86980, term86980.getClass(), "jsType", null);
        setField(term86980, term86980.getClass(), "parent", null);
        setField(term86979, term86979.getClass(), "next", term86980);
        setField(term86979, term86979.getClass(), "first", null);
        setField(term86979, term86979.getClass(), "last", null);
        setField(term86979, term86979.getClass(), "propListHead", null);
        setIntField(term86979, term86979.getClass(), "sourcePosition", 0);
        setField(term86979, term86979.getClass(), "jsType", null);
        setField(term86979, term86979.getClass(), "parent", null);
        setField(term86978, term86978.getClass(), "next", term86979);
        setField(term86978, term86978.getClass(), "first", null);
        setField(term86978, term86978.getClass(), "last", null);
        setField(term86978, term86978.getClass(), "propListHead", null);
        setIntField(term86978, term86978.getClass(), "sourcePosition", 0);
        setField(term86978, term86978.getClass(), "jsType", null);
        setField(term86978, term86978.getClass(), "parent", null);
        setField(term86977, term86977.getClass(), "next", term86978);
        setField(term86977, term86977.getClass(), "first", null);
        setField(term86977, term86977.getClass(), "last", null);
        setField(term86977, term86977.getClass(), "propListHead", null);
        setIntField(term86977, term86977.getClass(), "sourcePosition", 0);
        setField(term86977, term86977.getClass(), "jsType", null);
        setField(term86977, term86977.getClass(), "parent", null);
        setField(term86976, term86976.getClass(), "first", term86977);
        setField(term86976, term86976.getClass(), "last", null);
        setField(term86976, term86976.getClass(), "propListHead", null);
        setIntField(term86976, term86976.getClass(), "sourcePosition", 0);
        setField(term86976, term86976.getClass(), "jsType", null);
        setField(term86976, term86976.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term86447;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term86377, args);
        assertTrue(recursiveEquals(term86377, term86975));
        assertTrue(recursiveEquals(term86447, null));
    }

};


