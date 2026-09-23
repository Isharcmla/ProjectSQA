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

public class ScopedAliases_process_840655313121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73226;
     Object term73318;
     Object term73586;
     Object term73587;

    public ScopedAliases_process_840655313121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73226 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term73226, term73226.getClass(), "compiler", null);
        term73318 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term73318, term73318.getClass(), "type", 105);
        setField(term73318, term73318.getClass(), "parent", null);
        term73586 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term73586, term73586.getClass(), "compiler", null);
        setField(term73586, term73586.getClass(), "preprocessorSymbolTable", null);
        setField(term73586, term73586.getClass(), "transformationHandler", null);
        term73587 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term73587, term73587.getClass(), "number", 0.0);
        setIntField(term73587, term73587.getClass(), "type", 105);
        setField(term73587, term73587.getClass(), "next", null);
        setField(term73587, term73587.getClass(), "first", null);
        setField(term73587, term73587.getClass(), "last", null);
        setField(term73587, term73587.getClass(), "propListHead", null);
        setIntField(term73587, term73587.getClass(), "sourcePosition", 0);
        setField(term73587, term73587.getClass(), "jsType", null);
        setField(term73587, term73587.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term73318;
        callMethod(klass, "process", argTypes, term73226, args);
        assertTrue(recursiveEquals(term73226, term73586));
        assertTrue(recursiveEquals(term73318, null));
    }

};


