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

public class FoldConstants_tryFoldBlock_1167048042297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79912;
     Object term79982;
     Object term80250;
     Object term80251;

    public FoldConstants_tryFoldBlock_1167048042297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79912 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term79982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term80052, term80052.getClass(), "next", term79982);
        setIntField(term80052, term80052.getClass(), "type", 31);
        setField(term79982, term79982.getClass(), "first", term80052);
        setField(term79982, term79982.getClass(), "next", term80122);
        setIntField(term79982, term79982.getClass(), "type", 95);
        term80250 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term80250, term80250.getClass(), "compiler", null);
        term80251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80251, term80251.getClass(), "type", 95);
        setIntField(term80252, term80252.getClass(), "type", 0);
        setField(term80252, term80252.getClass(), "next", null);
        setField(term80252, term80252.getClass(), "first", null);
        setField(term80252, term80252.getClass(), "last", null);
        setField(term80252, term80252.getClass(), "propListHead", null);
        setIntField(term80252, term80252.getClass(), "sourcePosition", 0);
        setField(term80252, term80252.getClass(), "jsType", null);
        setField(term80252, term80252.getClass(), "parent", null);
        setField(term80251, term80251.getClass(), "next", term80252);
        setIntField(term80253, term80253.getClass(), "type", 31);
        setField(term80253, term80253.getClass(), "next", term80251);
        setField(term80253, term80253.getClass(), "first", null);
        setField(term80253, term80253.getClass(), "last", null);
        setField(term80253, term80253.getClass(), "propListHead", null);
        setIntField(term80253, term80253.getClass(), "sourcePosition", 0);
        setField(term80253, term80253.getClass(), "jsType", null);
        setField(term80253, term80253.getClass(), "parent", null);
        setField(term80251, term80251.getClass(), "first", term80253);
        setField(term80251, term80251.getClass(), "last", null);
        setField(term80251, term80251.getClass(), "propListHead", null);
        setIntField(term80251, term80251.getClass(), "sourcePosition", 0);
        setField(term80251, term80251.getClass(), "jsType", null);
        setField(term80251, term80251.getClass(), "parent", null);
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
        args[1] = term79982;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term79912, args);
        assertTrue(recursiveEquals(term79912, term80250));
        assertTrue(recursiveEquals(term79982, null));
    }

};


