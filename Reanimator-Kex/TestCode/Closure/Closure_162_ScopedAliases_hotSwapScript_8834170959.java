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

public class ScopedAliases_hotSwapScript_8834170959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28241;
     Object term28333;
     Object term28625;
     Object term28626;

    public ScopedAliases_hotSwapScript_8834170959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28241 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term28241, term28241.getClass(), "compiler", null);
        term28333 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term28333, term28333.getClass(), "type", 0);
        setField(term28333, term28333.getClass(), "parent", null);
        setField(term28333, term28333.getClass(), "first", null);
        term28625 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term28625, term28625.getClass(), "compiler", null);
        setField(term28625, term28625.getClass(), "preprocessorSymbolTable", null);
        setField(term28625, term28625.getClass(), "transformationHandler", null);
        term28626 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term28626, term28626.getClass(), "number", 0.0);
        setIntField(term28626, term28626.getClass(), "type", 0);
        setField(term28626, term28626.getClass(), "next", null);
        setField(term28626, term28626.getClass(), "first", null);
        setField(term28626, term28626.getClass(), "last", null);
        setField(term28626, term28626.getClass(), "propListHead", null);
        setIntField(term28626, term28626.getClass(), "sourcePosition", 0);
        setField(term28626, term28626.getClass(), "jsType", null);
        setField(term28626, term28626.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term28333;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term28241, args);
        assertTrue(recursiveEquals(term28241, term28625));
        assertTrue(recursiveEquals(term28333, term28626));
    }

};


