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

public class ScopedAliases_process_84065531327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11910;
     Object term11980;
     Object term12377;
     Object term12378;

    public ScopedAliases_process_84065531327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11910 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term11910, term11910.getClass(), "compiler", null);
        term11980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11980, term11980.getClass(), "type", 37);
        setField(term11980, term11980.getClass(), "parent", null);
        setField(term12050, term12050.getClass(), "next", null);
        setIntField(term12050, term12050.getClass(), "type", 0);
        setField(term12050, term12050.getClass(), "first", null);
        setField(term11980, term11980.getClass(), "first", term12050);
        term12377 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term12377, term12377.getClass(), "compiler", null);
        setField(term12377, term12377.getClass(), "preprocessorSymbolTable", null);
        setField(term12377, term12377.getClass(), "transformationHandler", null);
        term12378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12378, term12378.getClass(), "type", 37);
        setField(term12378, term12378.getClass(), "next", null);
        setIntField(term12379, term12379.getClass(), "type", 0);
        setField(term12379, term12379.getClass(), "next", null);
        setField(term12379, term12379.getClass(), "first", null);
        setField(term12379, term12379.getClass(), "last", null);
        setField(term12379, term12379.getClass(), "propListHead", null);
        setIntField(term12379, term12379.getClass(), "sourcePosition", 0);
        setField(term12379, term12379.getClass(), "jsType", null);
        setField(term12379, term12379.getClass(), "parent", null);
        setField(term12378, term12378.getClass(), "first", term12379);
        setField(term12378, term12378.getClass(), "last", null);
        setField(term12378, term12378.getClass(), "propListHead", null);
        setIntField(term12378, term12378.getClass(), "sourcePosition", 0);
        setField(term12378, term12378.getClass(), "jsType", null);
        setField(term12378, term12378.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11980;
        callMethod(klass, "process", argTypes, term11910, args);
        assertTrue(recursiveEquals(term11910, term12377));
        assertTrue(recursiveEquals(term11980, null));
    }

};


