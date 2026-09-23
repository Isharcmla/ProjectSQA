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

public class ScopedAliases_hotSwapScript_8834170933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15028;
     Object term15098;
     Object term16406;
     Object term16407;

    public ScopedAliases_hotSwapScript_8834170933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15028 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term15028, term15028.getClass(), "compiler", null);
        term15098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15098, term15098.getClass(), "type", 0);
        setField(term15098, term15098.getClass(), "parent", null);
        setField(term15238, term15238.getClass(), "next", null);
        setIntField(term15238, term15238.getClass(), "type", 0);
        setField(term15238, term15238.getClass(), "first", null);
        setField(term15168, term15168.getClass(), "next", term15238);
        setIntField(term15168, term15168.getClass(), "type", 0);
        setField(term15308, term15308.getClass(), "next", null);
        setIntField(term15308, term15308.getClass(), "type", 0);
        setField(term15308, term15308.getClass(), "first", null);
        setField(term15168, term15168.getClass(), "first", term15308);
        setField(term15098, term15098.getClass(), "first", term15168);
        term16406 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term16406, term16406.getClass(), "compiler", null);
        setField(term16406, term16406.getClass(), "preprocessorSymbolTable", null);
        setField(term16406, term16406.getClass(), "transformationHandler", null);
        term16407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16407, term16407.getClass(), "type", 0);
        setField(term16407, term16407.getClass(), "next", null);
        setIntField(term16408, term16408.getClass(), "type", 0);
        setIntField(term16409, term16409.getClass(), "type", 0);
        setField(term16409, term16409.getClass(), "next", null);
        setField(term16409, term16409.getClass(), "first", null);
        setField(term16409, term16409.getClass(), "last", null);
        setField(term16409, term16409.getClass(), "propListHead", null);
        setIntField(term16409, term16409.getClass(), "sourcePosition", 0);
        setField(term16409, term16409.getClass(), "jsType", null);
        setField(term16409, term16409.getClass(), "parent", null);
        setField(term16408, term16408.getClass(), "next", term16409);
        setIntField(term16410, term16410.getClass(), "type", 0);
        setField(term16410, term16410.getClass(), "next", null);
        setField(term16410, term16410.getClass(), "first", null);
        setField(term16410, term16410.getClass(), "last", null);
        setField(term16410, term16410.getClass(), "propListHead", null);
        setIntField(term16410, term16410.getClass(), "sourcePosition", 0);
        setField(term16410, term16410.getClass(), "jsType", null);
        setField(term16410, term16410.getClass(), "parent", null);
        setField(term16408, term16408.getClass(), "first", term16410);
        setField(term16408, term16408.getClass(), "last", null);
        setField(term16408, term16408.getClass(), "propListHead", null);
        setIntField(term16408, term16408.getClass(), "sourcePosition", 0);
        setField(term16408, term16408.getClass(), "jsType", null);
        setField(term16408, term16408.getClass(), "parent", null);
        setField(term16407, term16407.getClass(), "first", term16408);
        setField(term16407, term16407.getClass(), "last", null);
        setField(term16407, term16407.getClass(), "propListHead", null);
        setIntField(term16407, term16407.getClass(), "sourcePosition", 0);
        setField(term16407, term16407.getClass(), "jsType", null);
        setField(term16407, term16407.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term15098;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term15028, args);
        assertTrue(recursiveEquals(term15028, term16406));
        assertTrue(recursiveEquals(term15098, term16407));
    }

};


