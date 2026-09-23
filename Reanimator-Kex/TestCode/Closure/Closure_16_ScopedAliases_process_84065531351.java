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

public class ScopedAliases_process_84065531351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30397;
     Object term30467;
     Object term31237;
     Object term31238;

    public ScopedAliases_process_84065531351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30397 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term30397, term30397.getClass(), "compiler", null);
        term30467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30467, term30467.getClass(), "type", 0);
        setField(term30467, term30467.getClass(), "parent", null);
        setField(term30607, term30607.getClass(), "next", null);
        setIntField(term30607, term30607.getClass(), "type", 105);
        setField(term30537, term30537.getClass(), "next", term30607);
        setIntField(term30537, term30537.getClass(), "type", 0);
        setField(term30677, term30677.getClass(), "next", null);
        setIntField(term30677, term30677.getClass(), "type", 0);
        setField(term30677, term30677.getClass(), "first", null);
        setField(term30537, term30537.getClass(), "first", term30677);
        setField(term30467, term30467.getClass(), "first", term30537);
        term31237 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term31237, term31237.getClass(), "compiler", null);
        setField(term31237, term31237.getClass(), "preprocessorSymbolTable", null);
        setField(term31237, term31237.getClass(), "transformationHandler", null);
        term31238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31238, term31238.getClass(), "type", 0);
        setField(term31238, term31238.getClass(), "next", null);
        setIntField(term31239, term31239.getClass(), "type", 0);
        setIntField(term31240, term31240.getClass(), "type", 105);
        setField(term31240, term31240.getClass(), "next", null);
        setField(term31240, term31240.getClass(), "first", null);
        setField(term31240, term31240.getClass(), "last", null);
        setField(term31240, term31240.getClass(), "propListHead", null);
        setIntField(term31240, term31240.getClass(), "sourcePosition", 0);
        setField(term31240, term31240.getClass(), "jsType", null);
        setField(term31240, term31240.getClass(), "parent", null);
        setField(term31239, term31239.getClass(), "next", term31240);
        setIntField(term31241, term31241.getClass(), "type", 0);
        setField(term31241, term31241.getClass(), "next", null);
        setField(term31241, term31241.getClass(), "first", null);
        setField(term31241, term31241.getClass(), "last", null);
        setField(term31241, term31241.getClass(), "propListHead", null);
        setIntField(term31241, term31241.getClass(), "sourcePosition", 0);
        setField(term31241, term31241.getClass(), "jsType", null);
        setField(term31241, term31241.getClass(), "parent", null);
        setField(term31239, term31239.getClass(), "first", term31241);
        setField(term31239, term31239.getClass(), "last", null);
        setField(term31239, term31239.getClass(), "propListHead", null);
        setIntField(term31239, term31239.getClass(), "sourcePosition", 0);
        setField(term31239, term31239.getClass(), "jsType", null);
        setField(term31239, term31239.getClass(), "parent", null);
        setField(term31238, term31238.getClass(), "first", term31239);
        setField(term31238, term31238.getClass(), "last", null);
        setField(term31238, term31238.getClass(), "propListHead", null);
        setIntField(term31238, term31238.getClass(), "sourcePosition", 0);
        setField(term31238, term31238.getClass(), "jsType", null);
        setField(term31238, term31238.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term30467;
        callMethod(klass, "process", argTypes, term30397, args);
        assertTrue(recursiveEquals(term30397, term31237));
        assertTrue(recursiveEquals(term30467, null));
    }

};


