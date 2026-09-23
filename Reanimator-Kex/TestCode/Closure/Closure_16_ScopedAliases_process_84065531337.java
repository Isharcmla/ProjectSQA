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

public class ScopedAliases_process_84065531337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21918;
     Object term22010;
     Object term22309;
     Object term22310;

    public ScopedAliases_process_84065531337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21918 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term21918, term21918.getClass(), "compiler", null);
        term22010 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term22010, term22010.getClass(), "type", 0);
        setField(term22010, term22010.getClass(), "parent", null);
        setField(term22010, term22010.getClass(), "first", null);
        term22309 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term22309, term22309.getClass(), "compiler", null);
        setField(term22309, term22309.getClass(), "preprocessorSymbolTable", null);
        setField(term22309, term22309.getClass(), "transformationHandler", null);
        term22310 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term22310, term22310.getClass(), "number", 0.0);
        setIntField(term22310, term22310.getClass(), "type", 0);
        setField(term22310, term22310.getClass(), "next", null);
        setField(term22310, term22310.getClass(), "first", null);
        setField(term22310, term22310.getClass(), "last", null);
        setField(term22310, term22310.getClass(), "propListHead", null);
        setIntField(term22310, term22310.getClass(), "sourcePosition", 0);
        setField(term22310, term22310.getClass(), "jsType", null);
        setField(term22310, term22310.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22010;
        callMethod(klass, "process", argTypes, term21918, args);
        assertTrue(recursiveEquals(term21918, term22309));
        assertTrue(recursiveEquals(term22010, null));
    }

};


