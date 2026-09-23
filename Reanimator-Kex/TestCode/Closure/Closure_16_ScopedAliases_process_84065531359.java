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

public class ScopedAliases_process_84065531359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34199;
     Object term34269;
     Object term34687;
     Object term34688;

    public ScopedAliases_process_84065531359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34199 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term34199, term34199.getClass(), "compiler", null);
        term34269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term34269, term34269.getClass(), "type", 0);
        setIntField(term34361, term34361.getClass(), "type", 0);
        setField(term34361, term34361.getClass(), "parent", null);
        setField(term34269, term34269.getClass(), "parent", term34361);
        term34687 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term34687, term34687.getClass(), "compiler", null);
        setField(term34687, term34687.getClass(), "preprocessorSymbolTable", null);
        setField(term34687, term34687.getClass(), "transformationHandler", null);
        term34688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34689 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term34688, term34688.getClass(), "type", 0);
        setField(term34688, term34688.getClass(), "next", null);
        setField(term34688, term34688.getClass(), "first", null);
        setField(term34688, term34688.getClass(), "last", null);
        setField(term34688, term34688.getClass(), "propListHead", null);
        setIntField(term34688, term34688.getClass(), "sourcePosition", 0);
        setField(term34688, term34688.getClass(), "jsType", null);
        setField(term34689, term34689.getClass(), "str", null);
        setIntField(term34689, term34689.getClass(), "type", 0);
        setField(term34689, term34689.getClass(), "next", null);
        setField(term34689, term34689.getClass(), "first", null);
        setField(term34689, term34689.getClass(), "last", null);
        setField(term34689, term34689.getClass(), "propListHead", null);
        setIntField(term34689, term34689.getClass(), "sourcePosition", 0);
        setField(term34689, term34689.getClass(), "jsType", null);
        setField(term34689, term34689.getClass(), "parent", null);
        setField(term34688, term34688.getClass(), "parent", term34689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34269;
        callMethod(klass, "process", argTypes, term34199, args);
        assertTrue(recursiveEquals(term34199, term34687));
        assertTrue(recursiveEquals(term34269, null));
    }

};


