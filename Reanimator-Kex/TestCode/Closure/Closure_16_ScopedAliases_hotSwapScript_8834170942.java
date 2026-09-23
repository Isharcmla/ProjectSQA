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

public class ScopedAliases_hotSwapScript_8834170942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23848;
     Object term23918;
     Object term25432;
     Object term25433;

    public ScopedAliases_hotSwapScript_8834170942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23848 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term23848, term23848.getClass(), "compiler", null);
        term23918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23918, term23918.getClass(), "type", 0);
        setField(term23918, term23918.getClass(), "parent", null);
        setField(term24058, term24058.getClass(), "next", null);
        setIntField(term24058, term24058.getClass(), "type", 0);
        setField(term24128, term24128.getClass(), "next", null);
        setIntField(term24128, term24128.getClass(), "type", 0);
        setField(term24128, term24128.getClass(), "first", null);
        setField(term24058, term24058.getClass(), "first", term24128);
        setField(term23988, term23988.getClass(), "next", term24058);
        setIntField(term23988, term23988.getClass(), "type", 0);
        setField(term24198, term24198.getClass(), "next", null);
        setIntField(term24198, term24198.getClass(), "type", 0);
        setField(term24198, term24198.getClass(), "first", null);
        setField(term23988, term23988.getClass(), "first", term24198);
        setField(term23918, term23918.getClass(), "first", term23988);
        term25432 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term25432, term25432.getClass(), "compiler", null);
        setField(term25432, term25432.getClass(), "preprocessorSymbolTable", null);
        setField(term25432, term25432.getClass(), "transformationHandler", null);
        term25433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25433, term25433.getClass(), "type", 0);
        setField(term25433, term25433.getClass(), "next", null);
        setIntField(term25434, term25434.getClass(), "type", 0);
        setIntField(term25435, term25435.getClass(), "type", 0);
        setField(term25435, term25435.getClass(), "next", null);
        setIntField(term25436, term25436.getClass(), "type", 0);
        setField(term25436, term25436.getClass(), "next", null);
        setField(term25436, term25436.getClass(), "first", null);
        setField(term25436, term25436.getClass(), "last", null);
        setField(term25436, term25436.getClass(), "propListHead", null);
        setIntField(term25436, term25436.getClass(), "sourcePosition", 0);
        setField(term25436, term25436.getClass(), "jsType", null);
        setField(term25436, term25436.getClass(), "parent", null);
        setField(term25435, term25435.getClass(), "first", term25436);
        setField(term25435, term25435.getClass(), "last", null);
        setField(term25435, term25435.getClass(), "propListHead", null);
        setIntField(term25435, term25435.getClass(), "sourcePosition", 0);
        setField(term25435, term25435.getClass(), "jsType", null);
        setField(term25435, term25435.getClass(), "parent", null);
        setField(term25434, term25434.getClass(), "next", term25435);
        setIntField(term25437, term25437.getClass(), "type", 0);
        setField(term25437, term25437.getClass(), "next", null);
        setField(term25437, term25437.getClass(), "first", null);
        setField(term25437, term25437.getClass(), "last", null);
        setField(term25437, term25437.getClass(), "propListHead", null);
        setIntField(term25437, term25437.getClass(), "sourcePosition", 0);
        setField(term25437, term25437.getClass(), "jsType", null);
        setField(term25437, term25437.getClass(), "parent", null);
        setField(term25434, term25434.getClass(), "first", term25437);
        setField(term25434, term25434.getClass(), "last", null);
        setField(term25434, term25434.getClass(), "propListHead", null);
        setIntField(term25434, term25434.getClass(), "sourcePosition", 0);
        setField(term25434, term25434.getClass(), "jsType", null);
        setField(term25434, term25434.getClass(), "parent", null);
        setField(term25433, term25433.getClass(), "first", term25434);
        setField(term25433, term25433.getClass(), "last", null);
        setField(term25433, term25433.getClass(), "propListHead", null);
        setIntField(term25433, term25433.getClass(), "sourcePosition", 0);
        setField(term25433, term25433.getClass(), "jsType", null);
        setField(term25433, term25433.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term23918;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term23848, args);
        assertTrue(recursiveEquals(term23848, term25432));
        assertTrue(recursiveEquals(term23918, term25433));
    }

};


