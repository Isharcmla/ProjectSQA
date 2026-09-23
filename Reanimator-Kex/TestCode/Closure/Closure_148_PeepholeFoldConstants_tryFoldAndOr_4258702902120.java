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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576295;
     Object term576387;
     Object term576549;
     Object term576641;
     Object term577110;
     Object term577111;
     Object term577113;
     Object term577114;
     Object term577063;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term576295 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term576387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term576457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term576387, term576387.getClass(), "parent", term576457);
        setIntField(term576387, term576387.getClass(), "type", 0);
        term576549 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term576549, term576549.getClass(), "type", 0);
        term576641 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term576641, term576641.getClass(), "type", 47);
        term577110 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term577110, term577110.getClass(), "currentTraversal", null);
        term577111 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term577112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term577111, term577111.getClass(), "str", null);
        setIntField(term577111, term577111.getClass(), "type", 0);
        setField(term577111, term577111.getClass(), "next", null);
        setField(term577111, term577111.getClass(), "first", null);
        setField(term577111, term577111.getClass(), "last", null);
        setField(term577111, term577111.getClass(), "propListHead", null);
        setIntField(term577111, term577111.getClass(), "sourcePosition", 0);
        setField(term577111, term577111.getClass(), "jsType", null);
        setIntField(term577112, term577112.getClass(), "type", 0);
        setField(term577112, term577112.getClass(), "next", null);
        setField(term577112, term577112.getClass(), "first", null);
        setField(term577112, term577112.getClass(), "last", null);
        setField(term577112, term577112.getClass(), "propListHead", null);
        setIntField(term577112, term577112.getClass(), "sourcePosition", 0);
        setField(term577112, term577112.getClass(), "jsType", null);
        setField(term577112, term577112.getClass(), "parent", null);
        setField(term577111, term577111.getClass(), "parent", term577112);
        term577113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term577113, term577113.getClass(), "str", null);
        setIntField(term577113, term577113.getClass(), "type", 0);
        setField(term577113, term577113.getClass(), "next", null);
        setField(term577113, term577113.getClass(), "first", null);
        setField(term577113, term577113.getClass(), "last", null);
        setField(term577113, term577113.getClass(), "propListHead", null);
        setIntField(term577113, term577113.getClass(), "sourcePosition", 0);
        setField(term577113, term577113.getClass(), "jsType", null);
        setField(term577113, term577113.getClass(), "parent", null);
        term577114 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term577114, term577114.getClass(), "str", null);
        setIntField(term577114, term577114.getClass(), "type", 47);
        setField(term577114, term577114.getClass(), "next", null);
        setField(term577114, term577114.getClass(), "first", null);
        setField(term577114, term577114.getClass(), "last", null);
        setField(term577114, term577114.getClass(), "propListHead", null);
        setIntField(term577114, term577114.getClass(), "sourcePosition", 0);
        setField(term577114, term577114.getClass(), "jsType", null);
        setField(term577114, term577114.getClass(), "parent", null);
        term577063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term577066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term577063, term577063.getClass(), "str", null);
        setIntField(term577063, term577063.getClass(), "type", 0);
        setField(term577063, term577063.getClass(), "next", null);
        setField(term577063, term577063.getClass(), "first", null);
        setField(term577063, term577063.getClass(), "last", null);
        setField(term577063, term577063.getClass(), "propListHead", null);
        setIntField(term577063, term577063.getClass(), "sourcePosition", 0);
        setField(term577063, term577063.getClass(), "jsType", null);
        setIntField(term577066, term577066.getClass(), "type", 0);
        setField(term577066, term577066.getClass(), "next", null);
        setField(term577066, term577066.getClass(), "first", null);
        setField(term577066, term577066.getClass(), "last", null);
        setField(term577066, term577066.getClass(), "propListHead", null);
        setIntField(term577066, term577066.getClass(), "sourcePosition", 0);
        setField(term577066, term577066.getClass(), "jsType", null);
        setField(term577066, term577066.getClass(), "parent", null);
        setField(term577063, term577063.getClass(), "parent", term577066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term576387;
        args[1] = term576549;
        args[2] = term576641;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term576295, args);
        assertTrue(recursiveEquals(term576295, term577110));
        assertTrue(recursiveEquals(term576387, term577111));
        assertTrue(recursiveEquals(term576549, term577113));
        assertTrue(recursiveEquals(term576641, term577114));
        assertTrue(recursiveEquals(retValue, term577063));
    }

};


