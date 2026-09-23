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

public class ScopedAliases_hotSwapScript_8834170954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25565;
     Object term25657;
     Object term26424;
     Object term26425;

    public ScopedAliases_hotSwapScript_8834170954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25565 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term25565, term25565.getClass(), "compiler", null);
        term25657 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term25657, term25657.getClass(), "type", 0);
        setField(term25657, term25657.getClass(), "parent", null);
        setField(term25657, term25657.getClass(), "first", null);
        term26424 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term26424, term26424.getClass(), "compiler", null);
        setField(term26424, term26424.getClass(), "preprocessorSymbolTable", null);
        setField(term26424, term26424.getClass(), "transformationHandler", null);
        term26425 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term26425, term26425.getClass(), "number", 0.0);
        setIntField(term26425, term26425.getClass(), "type", 0);
        setField(term26425, term26425.getClass(), "next", null);
        setField(term26425, term26425.getClass(), "first", null);
        setField(term26425, term26425.getClass(), "last", null);
        setField(term26425, term26425.getClass(), "propListHead", null);
        setIntField(term26425, term26425.getClass(), "sourcePosition", 0);
        setField(term26425, term26425.getClass(), "jsType", null);
        setField(term26425, term26425.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term25657;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term25565, args);
        assertTrue(recursiveEquals(term25565, term26424));
        assertTrue(recursiveEquals(term25657, term26425));
    }

};


