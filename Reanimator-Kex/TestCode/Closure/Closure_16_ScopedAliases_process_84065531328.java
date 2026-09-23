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

public class ScopedAliases_process_84065531328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16021;
     Object term16113;
     Object term16965;
     Object term16966;

    public ScopedAliases_process_84065531328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16021 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term16021, term16021.getClass(), "compiler", null);
        term16113 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term16113, term16113.getClass(), "type", -133);
        setField(term16113, term16113.getClass(), "parent", null);
        term16965 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term16965, term16965.getClass(), "compiler", null);
        setField(term16965, term16965.getClass(), "preprocessorSymbolTable", null);
        setField(term16965, term16965.getClass(), "transformationHandler", null);
        term16966 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term16966, term16966.getClass(), "number", 0.0);
        setIntField(term16966, term16966.getClass(), "type", -133);
        setField(term16966, term16966.getClass(), "next", null);
        setField(term16966, term16966.getClass(), "first", null);
        setField(term16966, term16966.getClass(), "last", null);
        setField(term16966, term16966.getClass(), "propListHead", null);
        setIntField(term16966, term16966.getClass(), "sourcePosition", 0);
        setField(term16966, term16966.getClass(), "jsType", null);
        setField(term16966, term16966.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term16113;
        callMethod(klass, "process", argTypes, term16021, args);
        assertTrue(recursiveEquals(term16021, term16965));
        assertTrue(recursiveEquals(term16113, null));
    }

};


