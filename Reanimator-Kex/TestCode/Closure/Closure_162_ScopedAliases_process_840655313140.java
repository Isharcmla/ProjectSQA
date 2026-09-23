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

public class ScopedAliases_process_840655313140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76908;
     Object term76978;
     Object term77321;
     Object term77322;

    public ScopedAliases_process_840655313140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76908 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term76908, term76908.getClass(), "compiler", null);
        term76978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76978, term76978.getClass(), "type", 0);
        setIntField(term77048, term77048.getClass(), "type", 132);
        setField(term77048, term77048.getClass(), "propListHead", null);
        setField(term76978, term76978.getClass(), "parent", term77048);
        setField(term76978, term76978.getClass(), "first", null);
        term77321 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term77321, term77321.getClass(), "compiler", null);
        setField(term77321, term77321.getClass(), "preprocessorSymbolTable", null);
        setField(term77321, term77321.getClass(), "transformationHandler", null);
        term77322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77322, term77322.getClass(), "type", 0);
        setField(term77322, term77322.getClass(), "next", null);
        setField(term77322, term77322.getClass(), "first", null);
        setField(term77322, term77322.getClass(), "last", null);
        setField(term77322, term77322.getClass(), "propListHead", null);
        setIntField(term77322, term77322.getClass(), "sourcePosition", 0);
        setField(term77322, term77322.getClass(), "jsType", null);
        setIntField(term77323, term77323.getClass(), "type", 132);
        setField(term77323, term77323.getClass(), "next", null);
        setField(term77323, term77323.getClass(), "first", null);
        setField(term77323, term77323.getClass(), "last", null);
        setField(term77323, term77323.getClass(), "propListHead", null);
        setIntField(term77323, term77323.getClass(), "sourcePosition", 0);
        setField(term77323, term77323.getClass(), "jsType", null);
        setField(term77323, term77323.getClass(), "parent", null);
        setField(term77322, term77322.getClass(), "parent", term77323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term76978;
        callMethod(klass, "process", argTypes, term76908, args);
        assertTrue(recursiveEquals(term76908, term77321));
        assertTrue(recursiveEquals(term76978, null));
    }

};


