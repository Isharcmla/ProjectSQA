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

public class FoldConstants_tryFoldBlock_1167048042158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34538;
     Object term34608;
     Object term34986;
     Object term34987;

    public FoldConstants_tryFoldBlock_1167048042158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34538 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term34608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term34608, term34608.getClass(), "first", term34608);
        setField(term34608, term34608.getClass(), "next", term34678);
        setIntField(term34608, term34608.getClass(), "type", 36);
        term34986 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term34986, term34986.getClass(), "compiler", null);
        term34987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34987, term34987.getClass(), "type", 36);
        setIntField(term34988, term34988.getClass(), "type", 0);
        setField(term34988, term34988.getClass(), "next", null);
        setField(term34988, term34988.getClass(), "first", null);
        setField(term34988, term34988.getClass(), "last", null);
        setField(term34988, term34988.getClass(), "propListHead", null);
        setIntField(term34988, term34988.getClass(), "sourcePosition", 0);
        setField(term34988, term34988.getClass(), "jsType", null);
        setField(term34988, term34988.getClass(), "parent", null);
        setField(term34987, term34987.getClass(), "next", term34988);
        setField(term34987, term34987.getClass(), "first", term34987);
        setField(term34987, term34987.getClass(), "last", null);
        setField(term34987, term34987.getClass(), "propListHead", null);
        setIntField(term34987, term34987.getClass(), "sourcePosition", 0);
        setField(term34987, term34987.getClass(), "jsType", null);
        setField(term34987, term34987.getClass(), "parent", null);
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
        args[1] = term34608;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term34538, args);
        assertTrue(recursiveEquals(term34538, term34986));
        assertTrue(recursiveEquals(term34608, null));
    }

};


