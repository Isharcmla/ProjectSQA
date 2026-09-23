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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Scope_init_124665109727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;

    public Scope_init_124665109727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44, term44.getClass(), "type", -2068769794);
        setIntField(term46, term46.getClass(), "type", 590364439);
        setIntField(term48, term48.getClass(), "type", 0);
        setField(term48, term48.getClass(), "next", null);
        setField(term48, term48.getClass(), "first", null);
        setField(term48, term48.getClass(), "last", null);
        setField(term48, term48.getClass(), "propListHead", null);
        setIntField(term48, term48.getClass(), "sourcePosition", 0);
        setField(term48, term48.getClass(), "jsType", null);
        setField(term48, term48.getClass(), "parent", null);
        setField(term46, term46.getClass(), "next", term48);
        setIntField(term51, term51.getClass(), "type", 0);
        setField(term51, term51.getClass(), "next", null);
        setField(term51, term51.getClass(), "first", null);
        setField(term51, term51.getClass(), "last", null);
        setField(term51, term51.getClass(), "propListHead", null);
        setIntField(term51, term51.getClass(), "sourcePosition", 0);
        setField(term51, term51.getClass(), "jsType", null);
        setField(term51, term51.getClass(), "parent", null);
        setField(term46, term46.getClass(), "first", term51);
        setIntField(term54, term54.getClass(), "type", 0);
        setField(term54, term54.getClass(), "next", null);
        setField(term54, term54.getClass(), "first", null);
        setField(term54, term54.getClass(), "last", null);
        setField(term54, term54.getClass(), "propListHead", null);
        setIntField(term54, term54.getClass(), "sourcePosition", 0);
        setField(term54, term54.getClass(), "jsType", null);
        setField(term54, term54.getClass(), "parent", null);
        setField(term46, term46.getClass(), "last", term54);
        setField(term46, term46.getClass(), "propListHead", null);
        setIntField(term46, term46.getClass(), "sourcePosition", 0);
        setField(term46, term46.getClass(), "jsType", null);
        setField(term46, term46.getClass(), "parent", null);
        setField(term44, term44.getClass(), "next", term46);
        setIntField(term58, term58.getClass(), "type", 0);
        setField(term58, term58.getClass(), "next", null);
        setField(term58, term58.getClass(), "first", null);
        setField(term58, term58.getClass(), "last", null);
        setField(term58, term58.getClass(), "propListHead", null);
        setIntField(term58, term58.getClass(), "sourcePosition", 0);
        setField(term58, term58.getClass(), "jsType", null);
        setField(term58, term58.getClass(), "parent", null);
        setField(term44, term44.getClass(), "first", term58);
        setIntField(term61, term61.getClass(), "type", 0);
        setField(term61, term61.getClass(), "next", null);
        setField(term61, term61.getClass(), "first", null);
        setField(term61, term61.getClass(), "last", null);
        setField(term61, term61.getClass(), "propListHead", null);
        setIntField(term61, term61.getClass(), "sourcePosition", 0);
        setField(term61, term61.getClass(), "jsType", null);
        setField(term61, term61.getClass(), "parent", null);
        setField(term44, term44.getClass(), "last", term61);
        setField(term44, term44.getClass(), "propListHead", null);
        setIntField(term44, term44.getClass(), "sourcePosition", 0);
        setField(term44, term44.getClass(), "jsType", null);
        setField(term44, term44.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term44;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


