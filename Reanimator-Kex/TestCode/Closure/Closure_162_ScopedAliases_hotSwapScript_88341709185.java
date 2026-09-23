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

public class ScopedAliases_hotSwapScript_88341709185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104241;
     Object term104311;
     Object term105265;
     Object term105266;

    public ScopedAliases_hotSwapScript_88341709185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104241 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term104241, term104241.getClass(), "compiler", null);
        term104311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term104311, term104311.getClass(), "type", 105);
        setField(term104311, term104311.getClass(), "parent", null);
        term105265 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term105265, term105265.getClass(), "compiler", null);
        setField(term105265, term105265.getClass(), "preprocessorSymbolTable", null);
        setField(term105265, term105265.getClass(), "transformationHandler", null);
        term105266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term105266, term105266.getClass(), "type", 105);
        setField(term105266, term105266.getClass(), "next", null);
        setField(term105266, term105266.getClass(), "first", null);
        setField(term105266, term105266.getClass(), "last", null);
        setField(term105266, term105266.getClass(), "propListHead", null);
        setIntField(term105266, term105266.getClass(), "sourcePosition", 0);
        setField(term105266, term105266.getClass(), "jsType", null);
        setField(term105266, term105266.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term104311;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term104241, args);
        assertTrue(recursiveEquals(term104241, term105265));
        assertTrue(recursiveEquals(term104311, term105266));
    }

};


