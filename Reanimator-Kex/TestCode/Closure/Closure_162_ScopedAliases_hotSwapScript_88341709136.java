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

public class ScopedAliases_hotSwapScript_88341709136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73635;
     Object term73727;
     Object term74882;
     Object term74883;

    public ScopedAliases_hotSwapScript_88341709136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73635 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term73635, term73635.getClass(), "compiler", null);
        term73727 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term73819 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term73911 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74003 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term73727, term73727.getClass(), "type", 0);
        setField(term73727, term73727.getClass(), "parent", null);
        setField(term73911, term73911.getClass(), "next", null);
        setIntField(term73911, term73911.getClass(), "type", 0);
        setField(term73911, term73911.getClass(), "first", null);
        setField(term73819, term73819.getClass(), "next", term73911);
        setIntField(term73819, term73819.getClass(), "type", 0);
        setField(term74003, term74003.getClass(), "next", null);
        setIntField(term74003, term74003.getClass(), "type", 0);
        setField(term74003, term74003.getClass(), "first", null);
        setField(term73819, term73819.getClass(), "first", term74003);
        setField(term73727, term73727.getClass(), "first", term73819);
        term74882 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term74882, term74882.getClass(), "compiler", null);
        setField(term74882, term74882.getClass(), "preprocessorSymbolTable", null);
        setField(term74882, term74882.getClass(), "transformationHandler", null);
        term74883 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74884 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74885 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74886 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term74883, term74883.getClass(), "number", 0.0);
        setIntField(term74883, term74883.getClass(), "type", 0);
        setField(term74883, term74883.getClass(), "next", null);
        setDoubleField(term74884, term74884.getClass(), "number", 0.0);
        setIntField(term74884, term74884.getClass(), "type", 0);
        setDoubleField(term74885, term74885.getClass(), "number", 0.0);
        setIntField(term74885, term74885.getClass(), "type", 0);
        setField(term74885, term74885.getClass(), "next", null);
        setField(term74885, term74885.getClass(), "first", null);
        setField(term74885, term74885.getClass(), "last", null);
        setField(term74885, term74885.getClass(), "propListHead", null);
        setIntField(term74885, term74885.getClass(), "sourcePosition", 0);
        setField(term74885, term74885.getClass(), "jsType", null);
        setField(term74885, term74885.getClass(), "parent", null);
        setField(term74884, term74884.getClass(), "next", term74885);
        setDoubleField(term74886, term74886.getClass(), "number", 0.0);
        setIntField(term74886, term74886.getClass(), "type", 0);
        setField(term74886, term74886.getClass(), "next", null);
        setField(term74886, term74886.getClass(), "first", null);
        setField(term74886, term74886.getClass(), "last", null);
        setField(term74886, term74886.getClass(), "propListHead", null);
        setIntField(term74886, term74886.getClass(), "sourcePosition", 0);
        setField(term74886, term74886.getClass(), "jsType", null);
        setField(term74886, term74886.getClass(), "parent", null);
        setField(term74884, term74884.getClass(), "first", term74886);
        setField(term74884, term74884.getClass(), "last", null);
        setField(term74884, term74884.getClass(), "propListHead", null);
        setIntField(term74884, term74884.getClass(), "sourcePosition", 0);
        setField(term74884, term74884.getClass(), "jsType", null);
        setField(term74884, term74884.getClass(), "parent", null);
        setField(term74883, term74883.getClass(), "first", term74884);
        setField(term74883, term74883.getClass(), "last", null);
        setField(term74883, term74883.getClass(), "propListHead", null);
        setIntField(term74883, term74883.getClass(), "sourcePosition", 0);
        setField(term74883, term74883.getClass(), "jsType", null);
        setField(term74883, term74883.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term73727;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term73635, args);
        assertTrue(recursiveEquals(term73635, term74882));
        assertTrue(recursiveEquals(term73727, term74883));
    }

};


