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

public class ScopedAliases_hotSwapScript_88341709104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54017;
     Object term54109;
     Object term54349;
     Object term54350;

    public ScopedAliases_hotSwapScript_88341709104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54017 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term54017, term54017.getClass(), "compiler", null);
        term54109 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term54109, term54109.getClass(), "type", -133);
        setField(term54109, term54109.getClass(), "parent", null);
        term54349 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term54349, term54349.getClass(), "compiler", null);
        setField(term54349, term54349.getClass(), "preprocessorSymbolTable", null);
        setField(term54349, term54349.getClass(), "transformationHandler", null);
        term54350 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term54350, term54350.getClass(), "str", null);
        setIntField(term54350, term54350.getClass(), "type", -133);
        setField(term54350, term54350.getClass(), "next", null);
        setField(term54350, term54350.getClass(), "first", null);
        setField(term54350, term54350.getClass(), "last", null);
        setField(term54350, term54350.getClass(), "propListHead", null);
        setIntField(term54350, term54350.getClass(), "sourcePosition", 0);
        setField(term54350, term54350.getClass(), "jsType", null);
        setField(term54350, term54350.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term54109;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term54017, args);
        assertTrue(recursiveEquals(term54017, term54349));
        assertTrue(recursiveEquals(term54109, term54350));
    }

};


