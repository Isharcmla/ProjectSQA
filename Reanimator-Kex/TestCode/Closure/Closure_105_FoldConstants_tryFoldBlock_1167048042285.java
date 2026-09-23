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

public class FoldConstants_tryFoldBlock_1167048042285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76420;
     Object term76490;
     Object term76906;
     Object term76907;

    public FoldConstants_tryFoldBlock_1167048042285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76420 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term76490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76700, term76700.getClass(), "next", term76770);
        setIntField(term76700, term76700.getClass(), "type", 127);
        setField(term76630, term76630.getClass(), "next", term76700);
        setIntField(term76630, term76630.getClass(), "type", 69);
        setField(term76560, term76560.getClass(), "next", term76630);
        setIntField(term76560, term76560.getClass(), "type", 60);
        setField(term76490, term76490.getClass(), "first", term76560);
        term76906 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term76906, term76906.getClass(), "compiler", null);
        term76907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76907, term76907.getClass(), "type", 0);
        setField(term76907, term76907.getClass(), "next", null);
        setIntField(term76908, term76908.getClass(), "type", 60);
        setIntField(term76909, term76909.getClass(), "type", 69);
        setIntField(term76910, term76910.getClass(), "type", 127);
        setIntField(term76911, term76911.getClass(), "type", 0);
        setField(term76911, term76911.getClass(), "next", null);
        setField(term76911, term76911.getClass(), "first", null);
        setField(term76911, term76911.getClass(), "last", null);
        setField(term76911, term76911.getClass(), "propListHead", null);
        setIntField(term76911, term76911.getClass(), "sourcePosition", 0);
        setField(term76911, term76911.getClass(), "jsType", null);
        setField(term76911, term76911.getClass(), "parent", null);
        setField(term76910, term76910.getClass(), "next", term76911);
        setField(term76910, term76910.getClass(), "first", null);
        setField(term76910, term76910.getClass(), "last", null);
        setField(term76910, term76910.getClass(), "propListHead", null);
        setIntField(term76910, term76910.getClass(), "sourcePosition", 0);
        setField(term76910, term76910.getClass(), "jsType", null);
        setField(term76910, term76910.getClass(), "parent", null);
        setField(term76909, term76909.getClass(), "next", term76910);
        setField(term76909, term76909.getClass(), "first", null);
        setField(term76909, term76909.getClass(), "last", null);
        setField(term76909, term76909.getClass(), "propListHead", null);
        setIntField(term76909, term76909.getClass(), "sourcePosition", 0);
        setField(term76909, term76909.getClass(), "jsType", null);
        setField(term76909, term76909.getClass(), "parent", null);
        setField(term76908, term76908.getClass(), "next", term76909);
        setField(term76908, term76908.getClass(), "first", null);
        setField(term76908, term76908.getClass(), "last", null);
        setField(term76908, term76908.getClass(), "propListHead", null);
        setIntField(term76908, term76908.getClass(), "sourcePosition", 0);
        setField(term76908, term76908.getClass(), "jsType", null);
        setField(term76908, term76908.getClass(), "parent", null);
        setField(term76907, term76907.getClass(), "first", term76908);
        setField(term76907, term76907.getClass(), "last", null);
        setField(term76907, term76907.getClass(), "propListHead", null);
        setIntField(term76907, term76907.getClass(), "sourcePosition", 0);
        setField(term76907, term76907.getClass(), "jsType", null);
        setField(term76907, term76907.getClass(), "parent", null);
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
        args[1] = term76490;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term76420, args);
        assertTrue(recursiveEquals(term76420, term76906));
        assertTrue(recursiveEquals(term76490, null));
    }

};


