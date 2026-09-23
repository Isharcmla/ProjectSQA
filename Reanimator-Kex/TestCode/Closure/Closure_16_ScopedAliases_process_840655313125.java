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

public class ScopedAliases_process_840655313125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75024;
     Object term75094;
     Object term76397;
     Object term76398;

    public ScopedAliases_process_840655313125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75024 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term75024, term75024.getClass(), "compiler", null);
        term75094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75094, term75094.getClass(), "type", 0);
        setIntField(term75164, term75164.getClass(), "type", 0);
        setField(term75164, term75164.getClass(), "parent", null);
        setField(term75094, term75094.getClass(), "parent", term75164);
        setField(term75234, term75234.getClass(), "next", null);
        setIntField(term75234, term75234.getClass(), "type", 0);
        setField(term75234, term75234.getClass(), "first", null);
        setField(term75094, term75094.getClass(), "first", term75234);
        term76397 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term76397, term76397.getClass(), "compiler", null);
        setField(term76397, term76397.getClass(), "preprocessorSymbolTable", null);
        setField(term76397, term76397.getClass(), "transformationHandler", null);
        term76398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76398, term76398.getClass(), "type", 0);
        setField(term76398, term76398.getClass(), "next", null);
        setIntField(term76399, term76399.getClass(), "type", 0);
        setField(term76399, term76399.getClass(), "next", null);
        setField(term76399, term76399.getClass(), "first", null);
        setField(term76399, term76399.getClass(), "last", null);
        setField(term76399, term76399.getClass(), "propListHead", null);
        setIntField(term76399, term76399.getClass(), "sourcePosition", 0);
        setField(term76399, term76399.getClass(), "jsType", null);
        setField(term76399, term76399.getClass(), "parent", null);
        setField(term76398, term76398.getClass(), "first", term76399);
        setField(term76398, term76398.getClass(), "last", null);
        setField(term76398, term76398.getClass(), "propListHead", null);
        setIntField(term76398, term76398.getClass(), "sourcePosition", 0);
        setField(term76398, term76398.getClass(), "jsType", null);
        setIntField(term76400, term76400.getClass(), "type", 0);
        setField(term76400, term76400.getClass(), "next", null);
        setField(term76400, term76400.getClass(), "first", null);
        setField(term76400, term76400.getClass(), "last", null);
        setField(term76400, term76400.getClass(), "propListHead", null);
        setIntField(term76400, term76400.getClass(), "sourcePosition", 0);
        setField(term76400, term76400.getClass(), "jsType", null);
        setField(term76400, term76400.getClass(), "parent", null);
        setField(term76398, term76398.getClass(), "parent", term76400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term75094;
        callMethod(klass, "process", argTypes, term75024, args);
        assertTrue(recursiveEquals(term75024, term76397));
        assertTrue(recursiveEquals(term75094, null));
    }

};


