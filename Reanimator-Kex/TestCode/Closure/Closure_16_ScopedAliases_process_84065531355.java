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

public class ScopedAliases_process_84065531355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32501;
     Object term32571;
     Object term32936;
     Object term32937;

    public ScopedAliases_process_84065531355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32501 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term32501, term32501.getClass(), "compiler", null);
        term32571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32571, term32571.getClass(), "type", 105);
        setIntField(term32641, term32641.getClass(), "type", 0);
        setField(term32641, term32641.getClass(), "parent", null);
        setField(term32571, term32571.getClass(), "parent", term32641);
        term32936 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term32936, term32936.getClass(), "compiler", null);
        setField(term32936, term32936.getClass(), "preprocessorSymbolTable", null);
        setField(term32936, term32936.getClass(), "transformationHandler", null);
        term32937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32937, term32937.getClass(), "type", 105);
        setField(term32937, term32937.getClass(), "next", null);
        setField(term32937, term32937.getClass(), "first", null);
        setField(term32937, term32937.getClass(), "last", null);
        setField(term32937, term32937.getClass(), "propListHead", null);
        setIntField(term32937, term32937.getClass(), "sourcePosition", 0);
        setField(term32937, term32937.getClass(), "jsType", null);
        setIntField(term32938, term32938.getClass(), "type", 0);
        setField(term32938, term32938.getClass(), "next", null);
        setField(term32938, term32938.getClass(), "first", null);
        setField(term32938, term32938.getClass(), "last", null);
        setField(term32938, term32938.getClass(), "propListHead", null);
        setIntField(term32938, term32938.getClass(), "sourcePosition", 0);
        setField(term32938, term32938.getClass(), "jsType", null);
        setField(term32938, term32938.getClass(), "parent", null);
        setField(term32937, term32937.getClass(), "parent", term32938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term32571;
        callMethod(klass, "process", argTypes, term32501, args);
        assertTrue(recursiveEquals(term32501, term32936));
        assertTrue(recursiveEquals(term32571, null));
    }

};


