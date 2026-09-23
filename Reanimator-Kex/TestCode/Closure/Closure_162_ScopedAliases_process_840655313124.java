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

public class ScopedAliases_process_840655313124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67725;
     Object term67795;
     Object term68182;
     Object term68183;

    public ScopedAliases_process_840655313124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67725 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term67725, term67725.getClass(), "compiler", null);
        term67795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67795, term67795.getClass(), "type", 37);
        setField(term67795, term67795.getClass(), "parent", null);
        setField(term67865, term67865.getClass(), "next", null);
        setIntField(term67865, term67865.getClass(), "type", 105);
        setField(term67795, term67795.getClass(), "first", term67865);
        term68182 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term68182, term68182.getClass(), "compiler", null);
        setField(term68182, term68182.getClass(), "preprocessorSymbolTable", null);
        setField(term68182, term68182.getClass(), "transformationHandler", null);
        term68183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68183, term68183.getClass(), "type", 37);
        setField(term68183, term68183.getClass(), "next", null);
        setIntField(term68184, term68184.getClass(), "type", 105);
        setField(term68184, term68184.getClass(), "next", null);
        setField(term68184, term68184.getClass(), "first", null);
        setField(term68184, term68184.getClass(), "last", null);
        setField(term68184, term68184.getClass(), "propListHead", null);
        setIntField(term68184, term68184.getClass(), "sourcePosition", 0);
        setField(term68184, term68184.getClass(), "jsType", null);
        setField(term68184, term68184.getClass(), "parent", null);
        setField(term68183, term68183.getClass(), "first", term68184);
        setField(term68183, term68183.getClass(), "last", null);
        setField(term68183, term68183.getClass(), "propListHead", null);
        setIntField(term68183, term68183.getClass(), "sourcePosition", 0);
        setField(term68183, term68183.getClass(), "jsType", null);
        setField(term68183, term68183.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term67795;
        callMethod(klass, "process", argTypes, term67725, args);
        assertTrue(recursiveEquals(term67725, term68182));
        assertTrue(recursiveEquals(term67795, null));
    }

};


