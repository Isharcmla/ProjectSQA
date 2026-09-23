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

public class ScopedAliases_process_84065531318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9140;
     Object term9210;
     Object term10297;
     Object term10298;

    public ScopedAliases_process_84065531318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9140 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term9140, term9140.getClass(), "compiler", null);
        term9210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9210, term9210.getClass(), "type", -133);
        setField(term9210, term9210.getClass(), "parent", term9280);
        term10297 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term10297, term10297.getClass(), "compiler", null);
        setField(term10297, term10297.getClass(), "preprocessorSymbolTable", null);
        setField(term10297, term10297.getClass(), "transformationHandler", null);
        term10298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10298, term10298.getClass(), "type", -133);
        setField(term10298, term10298.getClass(), "next", null);
        setField(term10298, term10298.getClass(), "first", null);
        setField(term10298, term10298.getClass(), "last", null);
        setField(term10298, term10298.getClass(), "propListHead", null);
        setIntField(term10298, term10298.getClass(), "sourcePosition", 0);
        setField(term10298, term10298.getClass(), "jsType", null);
        setIntField(term10299, term10299.getClass(), "type", 0);
        setField(term10299, term10299.getClass(), "next", null);
        setField(term10299, term10299.getClass(), "first", null);
        setField(term10299, term10299.getClass(), "last", null);
        setField(term10299, term10299.getClass(), "propListHead", null);
        setIntField(term10299, term10299.getClass(), "sourcePosition", 0);
        setField(term10299, term10299.getClass(), "jsType", null);
        setField(term10299, term10299.getClass(), "parent", null);
        setField(term10298, term10298.getClass(), "parent", term10299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9210;
        callMethod(klass, "process", argTypes, term9140, args);
        assertTrue(recursiveEquals(term9140, term10297));
        assertTrue(recursiveEquals(term9210, null));
    }

};


