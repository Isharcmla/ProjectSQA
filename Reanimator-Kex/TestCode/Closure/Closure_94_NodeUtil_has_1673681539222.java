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

public class NodeUtil_has_1673681539222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3166;

    public NodeUtil_has_1673681539222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3179 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3189 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3166, term3166.getClass(), "type", 1174484848);
        setIntField(term3168, term3168.getClass(), "type", -2138801137);
        setIntField(term3170, term3170.getClass(), "type", 0);
        setField(term3170, term3170.getClass(), "next", null);
        setField(term3170, term3170.getClass(), "first", null);
        setField(term3170, term3170.getClass(), "last", null);
        setField(term3170, term3170.getClass(), "propListHead", null);
        setIntField(term3170, term3170.getClass(), "sourcePosition", 0);
        setField(term3170, term3170.getClass(), "jsType", null);
        setField(term3170, term3170.getClass(), "parent", null);
        setField(term3168, term3168.getClass(), "next", term3170);
        setIntField(term3173, term3173.getClass(), "type", 0);
        setField(term3173, term3173.getClass(), "next", null);
        setField(term3173, term3173.getClass(), "first", null);
        setField(term3173, term3173.getClass(), "last", null);
        setField(term3173, term3173.getClass(), "propListHead", null);
        setIntField(term3173, term3173.getClass(), "sourcePosition", 0);
        setField(term3173, term3173.getClass(), "jsType", null);
        setField(term3173, term3173.getClass(), "parent", null);
        setField(term3168, term3168.getClass(), "first", term3173);
        setIntField(term3176, term3176.getClass(), "type", 0);
        setField(term3176, term3176.getClass(), "next", null);
        setField(term3176, term3176.getClass(), "first", null);
        setField(term3176, term3176.getClass(), "last", null);
        setField(term3176, term3176.getClass(), "propListHead", null);
        setIntField(term3176, term3176.getClass(), "sourcePosition", 0);
        setField(term3176, term3176.getClass(), "jsType", null);
        setField(term3176, term3176.getClass(), "parent", null);
        setField(term3168, term3168.getClass(), "last", term3176);
        setField(term3179, term3179.getClass(), "next", null);
        setIntField(term3179, term3179.getClass(), "type", 0);
        setIntField(term3179, term3179.getClass(), "intValue", 0);
        setField(term3179, term3179.getClass(), "objectValue", null);
        setField(term3168, term3168.getClass(), "propListHead", term3179);
        setIntField(term3168, term3168.getClass(), "sourcePosition", -2024983877);
        setField(term3168, term3168.getClass(), "jsType", null);
        setField(term3168, term3168.getClass(), "parent", null);
        setField(term3166, term3166.getClass(), "next", term3168);
        setIntField(term3183, term3183.getClass(), "type", 0);
        setField(term3183, term3183.getClass(), "next", null);
        setField(term3183, term3183.getClass(), "first", null);
        setField(term3183, term3183.getClass(), "last", null);
        setField(term3183, term3183.getClass(), "propListHead", null);
        setIntField(term3183, term3183.getClass(), "sourcePosition", 0);
        setField(term3183, term3183.getClass(), "jsType", null);
        setField(term3183, term3183.getClass(), "parent", null);
        setField(term3166, term3166.getClass(), "first", term3183);
        setIntField(term3186, term3186.getClass(), "type", 0);
        setField(term3186, term3186.getClass(), "next", null);
        setField(term3186, term3186.getClass(), "first", null);
        setField(term3186, term3186.getClass(), "last", null);
        setField(term3186, term3186.getClass(), "propListHead", null);
        setIntField(term3186, term3186.getClass(), "sourcePosition", 0);
        setField(term3186, term3186.getClass(), "jsType", null);
        setField(term3186, term3186.getClass(), "parent", null);
        setField(term3166, term3166.getClass(), "last", term3186);
        setField(term3189, term3189.getClass(), "next", null);
        setIntField(term3189, term3189.getClass(), "type", 0);
        setIntField(term3189, term3189.getClass(), "intValue", 0);
        setField(term3189, term3189.getClass(), "objectValue", null);
        setField(term3166, term3166.getClass(), "propListHead", term3189);
        setIntField(term3166, term3166.getClass(), "sourcePosition", 1757149811);
        setField(term3166, term3166.getClass(), "jsType", null);
        setField(term3166, term3166.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3166;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "has", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


