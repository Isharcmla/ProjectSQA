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

public class ScopedAliases_process_840655313158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88327;
     Object term88397;
     Object term88937;
     Object term88938;

    public ScopedAliases_process_840655313158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88327 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term88327, term88327.getClass(), "compiler", null);
        term88397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88397, term88397.getClass(), "type", 0);
        setField(term88397, term88397.getClass(), "parent", null);
        setField(term88537, term88537.getClass(), "next", null);
        setIntField(term88537, term88537.getClass(), "type", 0);
        setField(term88537, term88537.getClass(), "first", null);
        setField(term88467, term88467.getClass(), "next", term88537);
        setIntField(term88467, term88467.getClass(), "type", 0);
        setField(term88467, term88467.getClass(), "first", null);
        setField(term88397, term88397.getClass(), "first", term88467);
        term88937 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term88937, term88937.getClass(), "compiler", null);
        setField(term88937, term88937.getClass(), "preprocessorSymbolTable", null);
        setField(term88937, term88937.getClass(), "transformationHandler", null);
        term88938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88938, term88938.getClass(), "type", 0);
        setField(term88938, term88938.getClass(), "next", null);
        setIntField(term88939, term88939.getClass(), "type", 0);
        setIntField(term88940, term88940.getClass(), "type", 0);
        setField(term88940, term88940.getClass(), "next", null);
        setField(term88940, term88940.getClass(), "first", null);
        setField(term88940, term88940.getClass(), "last", null);
        setField(term88940, term88940.getClass(), "propListHead", null);
        setIntField(term88940, term88940.getClass(), "sourcePosition", 0);
        setField(term88940, term88940.getClass(), "jsType", null);
        setField(term88940, term88940.getClass(), "parent", null);
        setField(term88939, term88939.getClass(), "next", term88940);
        setField(term88939, term88939.getClass(), "first", null);
        setField(term88939, term88939.getClass(), "last", null);
        setField(term88939, term88939.getClass(), "propListHead", null);
        setIntField(term88939, term88939.getClass(), "sourcePosition", 0);
        setField(term88939, term88939.getClass(), "jsType", null);
        setField(term88939, term88939.getClass(), "parent", null);
        setField(term88938, term88938.getClass(), "first", term88939);
        setField(term88938, term88938.getClass(), "last", null);
        setField(term88938, term88938.getClass(), "propListHead", null);
        setIntField(term88938, term88938.getClass(), "sourcePosition", 0);
        setField(term88938, term88938.getClass(), "jsType", null);
        setField(term88938, term88938.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term88397;
        callMethod(klass, "process", argTypes, term88327, args);
        assertTrue(recursiveEquals(term88327, term88937));
        assertTrue(recursiveEquals(term88397, null));
    }

};


