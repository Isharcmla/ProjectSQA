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

public class ScopedAliases_hotSwapScript_8834170975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44486;
     Object term44578;
     Object term44877;
     Object term44878;

    public ScopedAliases_hotSwapScript_8834170975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44486 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term44486, term44486.getClass(), "compiler", null);
        term44578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term44877 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term44877, term44877.getClass(), "compiler", null);
        setField(term44877, term44877.getClass(), "preprocessorSymbolTable", null);
        setField(term44877, term44877.getClass(), "transformationHandler", null);
        term44878 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term44878, term44878.getClass(), "number", 0.0);
        setIntField(term44878, term44878.getClass(), "type", 0);
        setField(term44878, term44878.getClass(), "next", null);
        setField(term44878, term44878.getClass(), "first", null);
        setField(term44878, term44878.getClass(), "last", null);
        setField(term44878, term44878.getClass(), "propListHead", null);
        setIntField(term44878, term44878.getClass(), "sourcePosition", 0);
        setField(term44878, term44878.getClass(), "jsType", null);
        setField(term44878, term44878.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term44578;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term44486, args);
        assertTrue(recursiveEquals(term44486, term44877));
        assertTrue(recursiveEquals(term44578, term44878));
    }

};


