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

public class ScopedAliases_hotSwapScript_8834170978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39268;
     Object term39360;
     Object term40118;
     Object term40119;

    public ScopedAliases_hotSwapScript_8834170978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39268 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term39268, term39268.getClass(), "compiler", null);
        term39360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39614 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term39360, term39360.getClass(), "type", 0);
        setField(term39360, term39360.getClass(), "parent", null);
        setField(term39522, term39522.getClass(), "next", null);
        setIntField(term39522, term39522.getClass(), "type", 0);
        setField(term39522, term39522.getClass(), "first", null);
        setField(term39452, term39452.getClass(), "next", term39522);
        setIntField(term39452, term39452.getClass(), "type", 0);
        setField(term39614, term39614.getClass(), "next", null);
        setIntField(term39614, term39614.getClass(), "type", 0);
        setField(term39614, term39614.getClass(), "first", null);
        setField(term39452, term39452.getClass(), "first", term39614);
        setField(term39360, term39360.getClass(), "first", term39452);
        term40118 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term40118, term40118.getClass(), "compiler", null);
        setField(term40118, term40118.getClass(), "preprocessorSymbolTable", null);
        setField(term40118, term40118.getClass(), "transformationHandler", null);
        term40119 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40120 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40122 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term40119, term40119.getClass(), "number", 0.0);
        setIntField(term40119, term40119.getClass(), "type", 0);
        setField(term40119, term40119.getClass(), "next", null);
        setDoubleField(term40120, term40120.getClass(), "number", 0.0);
        setIntField(term40120, term40120.getClass(), "type", 0);
        setIntField(term40121, term40121.getClass(), "type", 0);
        setField(term40121, term40121.getClass(), "next", null);
        setField(term40121, term40121.getClass(), "first", null);
        setField(term40121, term40121.getClass(), "last", null);
        setField(term40121, term40121.getClass(), "propListHead", null);
        setIntField(term40121, term40121.getClass(), "sourcePosition", 0);
        setField(term40121, term40121.getClass(), "jsType", null);
        setField(term40121, term40121.getClass(), "parent", null);
        setField(term40120, term40120.getClass(), "next", term40121);
        setDoubleField(term40122, term40122.getClass(), "number", 0.0);
        setIntField(term40122, term40122.getClass(), "type", 0);
        setField(term40122, term40122.getClass(), "next", null);
        setField(term40122, term40122.getClass(), "first", null);
        setField(term40122, term40122.getClass(), "last", null);
        setField(term40122, term40122.getClass(), "propListHead", null);
        setIntField(term40122, term40122.getClass(), "sourcePosition", 0);
        setField(term40122, term40122.getClass(), "jsType", null);
        setField(term40122, term40122.getClass(), "parent", null);
        setField(term40120, term40120.getClass(), "first", term40122);
        setField(term40120, term40120.getClass(), "last", null);
        setField(term40120, term40120.getClass(), "propListHead", null);
        setIntField(term40120, term40120.getClass(), "sourcePosition", 0);
        setField(term40120, term40120.getClass(), "jsType", null);
        setField(term40120, term40120.getClass(), "parent", null);
        setField(term40119, term40119.getClass(), "first", term40120);
        setField(term40119, term40119.getClass(), "last", null);
        setField(term40119, term40119.getClass(), "propListHead", null);
        setIntField(term40119, term40119.getClass(), "sourcePosition", 0);
        setField(term40119, term40119.getClass(), "jsType", null);
        setField(term40119, term40119.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term39360;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term39268, args);
        assertTrue(recursiveEquals(term39268, term40118));
        assertTrue(recursiveEquals(term39360, term40119));
    }

};


