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

public class ScopedAliases_hotSwapScript_88341709106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54991;
     Object term55083;
     Object term56031;
     Object term56032;

    public ScopedAliases_hotSwapScript_88341709106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54991 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term54991, term54991.getClass(), "compiler", null);
        term55083 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55175 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55267 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55429 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term55083, term55083.getClass(), "type", 0);
        setField(term55083, term55083.getClass(), "parent", null);
        setField(term55337, term55337.getClass(), "next", null);
        setIntField(term55337, term55337.getClass(), "type", 0);
        setField(term55337, term55337.getClass(), "first", null);
        setField(term55267, term55267.getClass(), "next", term55337);
        setIntField(term55267, term55267.getClass(), "type", 0);
        setField(term55267, term55267.getClass(), "first", null);
        setField(term55175, term55175.getClass(), "next", term55267);
        setIntField(term55175, term55175.getClass(), "type", 0);
        setField(term55429, term55429.getClass(), "next", null);
        setIntField(term55429, term55429.getClass(), "type", 0);
        setField(term55429, term55429.getClass(), "first", null);
        setField(term55175, term55175.getClass(), "first", term55429);
        setField(term55083, term55083.getClass(), "first", term55175);
        term56031 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term56031, term56031.getClass(), "compiler", null);
        setField(term56031, term56031.getClass(), "preprocessorSymbolTable", null);
        setField(term56031, term56031.getClass(), "transformationHandler", null);
        term56032 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56033 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56034 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56036 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term56032, term56032.getClass(), "number", 0.0);
        setIntField(term56032, term56032.getClass(), "type", 0);
        setField(term56032, term56032.getClass(), "next", null);
        setDoubleField(term56033, term56033.getClass(), "number", 0.0);
        setIntField(term56033, term56033.getClass(), "type", 0);
        setDoubleField(term56034, term56034.getClass(), "number", 0.0);
        setIntField(term56034, term56034.getClass(), "type", 0);
        setIntField(term56035, term56035.getClass(), "type", 0);
        setField(term56035, term56035.getClass(), "next", null);
        setField(term56035, term56035.getClass(), "first", null);
        setField(term56035, term56035.getClass(), "last", null);
        setField(term56035, term56035.getClass(), "propListHead", null);
        setIntField(term56035, term56035.getClass(), "sourcePosition", 0);
        setField(term56035, term56035.getClass(), "jsType", null);
        setField(term56035, term56035.getClass(), "parent", null);
        setField(term56034, term56034.getClass(), "next", term56035);
        setField(term56034, term56034.getClass(), "first", null);
        setField(term56034, term56034.getClass(), "last", null);
        setField(term56034, term56034.getClass(), "propListHead", null);
        setIntField(term56034, term56034.getClass(), "sourcePosition", 0);
        setField(term56034, term56034.getClass(), "jsType", null);
        setField(term56034, term56034.getClass(), "parent", null);
        setField(term56033, term56033.getClass(), "next", term56034);
        setDoubleField(term56036, term56036.getClass(), "number", 0.0);
        setIntField(term56036, term56036.getClass(), "type", 0);
        setField(term56036, term56036.getClass(), "next", null);
        setField(term56036, term56036.getClass(), "first", null);
        setField(term56036, term56036.getClass(), "last", null);
        setField(term56036, term56036.getClass(), "propListHead", null);
        setIntField(term56036, term56036.getClass(), "sourcePosition", 0);
        setField(term56036, term56036.getClass(), "jsType", null);
        setField(term56036, term56036.getClass(), "parent", null);
        setField(term56033, term56033.getClass(), "first", term56036);
        setField(term56033, term56033.getClass(), "last", null);
        setField(term56033, term56033.getClass(), "propListHead", null);
        setIntField(term56033, term56033.getClass(), "sourcePosition", 0);
        setField(term56033, term56033.getClass(), "jsType", null);
        setField(term56033, term56033.getClass(), "parent", null);
        setField(term56032, term56032.getClass(), "first", term56033);
        setField(term56032, term56032.getClass(), "last", null);
        setField(term56032, term56032.getClass(), "propListHead", null);
        setIntField(term56032, term56032.getClass(), "sourcePosition", 0);
        setField(term56032, term56032.getClass(), "jsType", null);
        setField(term56032, term56032.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term55083;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term54991, args);
        assertTrue(recursiveEquals(term54991, term56031));
        assertTrue(recursiveEquals(term55083, term56032));
    }

};


