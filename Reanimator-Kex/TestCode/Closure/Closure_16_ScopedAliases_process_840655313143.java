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

public class ScopedAliases_process_840655313143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87469;
     Object term87539;
     Object term87957;
     Object term87958;

    public ScopedAliases_process_840655313143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87469 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term87469, term87469.getClass(), "compiler", null);
        term87539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87631 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term87539, term87539.getClass(), "type", -133);
        setField(term87539, term87539.getClass(), "parent", term87631);
        term87957 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term87957, term87957.getClass(), "compiler", null);
        setField(term87957, term87957.getClass(), "preprocessorSymbolTable", null);
        setField(term87957, term87957.getClass(), "transformationHandler", null);
        term87958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87959 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term87958, term87958.getClass(), "type", -133);
        setField(term87958, term87958.getClass(), "next", null);
        setField(term87958, term87958.getClass(), "first", null);
        setField(term87958, term87958.getClass(), "last", null);
        setField(term87958, term87958.getClass(), "propListHead", null);
        setIntField(term87958, term87958.getClass(), "sourcePosition", 0);
        setField(term87958, term87958.getClass(), "jsType", null);
        setField(term87959, term87959.getClass(), "str", null);
        setIntField(term87959, term87959.getClass(), "type", 0);
        setField(term87959, term87959.getClass(), "next", null);
        setField(term87959, term87959.getClass(), "first", null);
        setField(term87959, term87959.getClass(), "last", null);
        setField(term87959, term87959.getClass(), "propListHead", null);
        setIntField(term87959, term87959.getClass(), "sourcePosition", 0);
        setField(term87959, term87959.getClass(), "jsType", null);
        setField(term87959, term87959.getClass(), "parent", null);
        setField(term87958, term87958.getClass(), "parent", term87959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term87539;
        callMethod(klass, "process", argTypes, term87469, args);
        assertTrue(recursiveEquals(term87469, term87957));
        assertTrue(recursiveEquals(term87539, null));
    }

};


