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

public class FoldConstants_tryFoldBlock_1167048042234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61322;
     Object term61392;
     Object term61993;
     Object term61994;

    public FoldConstants_tryFoldBlock_1167048042234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61322 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term61392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61462, term61462.getClass(), "next", term61392);
        setIntField(term61462, term61462.getClass(), "type", 107);
        setField(term61392, term61392.getClass(), "first", term61462);
        setField(term61392, term61392.getClass(), "next", term61532);
        setIntField(term61392, term61392.getClass(), "type", 95);
        term61993 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term61993, term61993.getClass(), "compiler", null);
        term61994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61994, term61994.getClass(), "type", 95);
        setIntField(term61995, term61995.getClass(), "type", 0);
        setField(term61995, term61995.getClass(), "next", null);
        setField(term61995, term61995.getClass(), "first", null);
        setField(term61995, term61995.getClass(), "last", null);
        setField(term61995, term61995.getClass(), "propListHead", null);
        setIntField(term61995, term61995.getClass(), "sourcePosition", 0);
        setField(term61995, term61995.getClass(), "jsType", null);
        setField(term61995, term61995.getClass(), "parent", null);
        setField(term61994, term61994.getClass(), "next", term61995);
        setIntField(term61996, term61996.getClass(), "type", 107);
        setField(term61996, term61996.getClass(), "next", term61994);
        setField(term61996, term61996.getClass(), "first", null);
        setField(term61996, term61996.getClass(), "last", null);
        setField(term61996, term61996.getClass(), "propListHead", null);
        setIntField(term61996, term61996.getClass(), "sourcePosition", 0);
        setField(term61996, term61996.getClass(), "jsType", null);
        setField(term61996, term61996.getClass(), "parent", null);
        setField(term61994, term61994.getClass(), "first", term61996);
        setField(term61994, term61994.getClass(), "last", null);
        setField(term61994, term61994.getClass(), "propListHead", null);
        setIntField(term61994, term61994.getClass(), "sourcePosition", 0);
        setField(term61994, term61994.getClass(), "jsType", null);
        setField(term61994, term61994.getClass(), "parent", null);
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
        args[1] = term61392;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term61322, args);
        assertTrue(recursiveEquals(term61322, term61993));
        assertTrue(recursiveEquals(term61392, null));
    }

};


