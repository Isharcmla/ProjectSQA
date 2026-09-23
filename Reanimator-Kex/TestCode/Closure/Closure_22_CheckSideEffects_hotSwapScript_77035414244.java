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

public class CheckSideEffects_hotSwapScript_77035414244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18889;
     Object term18959;
     Object term20179;
     Object term20180;

    public CheckSideEffects_hotSwapScript_77035414244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18889 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term18889, term18889.getClass(), "compiler", null);
        term18959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18959, term18959.getClass(), "type", 115);
        setField(term18959, term18959.getClass(), "parent", null);
        setField(term19099, term19099.getClass(), "next", null);
        setIntField(term19099, term19099.getClass(), "type", 0);
        setField(term19099, term19099.getClass(), "first", null);
        setField(term19029, term19029.getClass(), "next", term19099);
        setIntField(term19029, term19029.getClass(), "type", 0);
        setField(term19029, term19029.getClass(), "first", term19099);
        setField(term18959, term18959.getClass(), "first", term19029);
        term20179 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term20179, term20179.getClass(), "level", null);
        setField(term20179, term20179.getClass(), "problemNodes", null);
        setField(term20179, term20179.getClass(), "compiler", null);
        setBooleanField(term20179, term20179.getClass(), "protectSideEffectFreeCode", false);
        term20180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20180, term20180.getClass(), "type", 115);
        setField(term20180, term20180.getClass(), "next", null);
        setIntField(term20181, term20181.getClass(), "type", 0);
        setIntField(term20182, term20182.getClass(), "type", 0);
        setField(term20182, term20182.getClass(), "next", null);
        setField(term20182, term20182.getClass(), "first", null);
        setField(term20182, term20182.getClass(), "last", null);
        setField(term20182, term20182.getClass(), "propListHead", null);
        setIntField(term20182, term20182.getClass(), "sourcePosition", 0);
        setField(term20182, term20182.getClass(), "jsType", null);
        setField(term20182, term20182.getClass(), "parent", null);
        setField(term20181, term20181.getClass(), "next", term20182);
        setField(term20181, term20181.getClass(), "first", term20182);
        setField(term20181, term20181.getClass(), "last", null);
        setField(term20181, term20181.getClass(), "propListHead", null);
        setIntField(term20181, term20181.getClass(), "sourcePosition", 0);
        setField(term20181, term20181.getClass(), "jsType", null);
        setField(term20181, term20181.getClass(), "parent", null);
        setField(term20180, term20180.getClass(), "first", term20181);
        setField(term20180, term20180.getClass(), "last", null);
        setField(term20180, term20180.getClass(), "propListHead", null);
        setIntField(term20180, term20180.getClass(), "sourcePosition", 0);
        setField(term20180, term20180.getClass(), "jsType", null);
        setField(term20180, term20180.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term18959;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term18889, args);
        assertTrue(recursiveEquals(term18889, term20179));
        assertTrue(recursiveEquals(term18959, term20180));
    }

};


