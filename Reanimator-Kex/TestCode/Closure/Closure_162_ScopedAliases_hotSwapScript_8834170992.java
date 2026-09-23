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

public class ScopedAliases_hotSwapScript_8834170992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48397;
     Object term48467;
     Object term49038;
     Object term49039;

    public ScopedAliases_hotSwapScript_8834170992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48397 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term48397, term48397.getClass(), "compiler", null);
        term48467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48467, term48467.getClass(), "type", 0);
        setField(term48467, term48467.getClass(), "parent", null);
        setField(term48537, term48537.getClass(), "next", term48607);
        setIntField(term48537, term48537.getClass(), "type", 0);
        setField(term48537, term48537.getClass(), "first", null);
        setField(term48467, term48467.getClass(), "first", term48537);
        term49038 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term49038, term49038.getClass(), "compiler", null);
        setField(term49038, term49038.getClass(), "preprocessorSymbolTable", null);
        setField(term49038, term49038.getClass(), "transformationHandler", null);
        term49039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49039, term49039.getClass(), "type", 0);
        setField(term49039, term49039.getClass(), "next", null);
        setIntField(term49040, term49040.getClass(), "type", 0);
        setIntField(term49041, term49041.getClass(), "type", 0);
        setField(term49041, term49041.getClass(), "next", null);
        setField(term49041, term49041.getClass(), "first", null);
        setField(term49041, term49041.getClass(), "last", null);
        setField(term49041, term49041.getClass(), "propListHead", null);
        setIntField(term49041, term49041.getClass(), "sourcePosition", 0);
        setField(term49041, term49041.getClass(), "jsType", null);
        setField(term49041, term49041.getClass(), "parent", null);
        setField(term49040, term49040.getClass(), "next", term49041);
        setField(term49040, term49040.getClass(), "first", null);
        setField(term49040, term49040.getClass(), "last", null);
        setField(term49040, term49040.getClass(), "propListHead", null);
        setIntField(term49040, term49040.getClass(), "sourcePosition", 0);
        setField(term49040, term49040.getClass(), "jsType", null);
        setField(term49040, term49040.getClass(), "parent", null);
        setField(term49039, term49039.getClass(), "first", term49040);
        setField(term49039, term49039.getClass(), "last", null);
        setField(term49039, term49039.getClass(), "propListHead", null);
        setIntField(term49039, term49039.getClass(), "sourcePosition", 0);
        setField(term49039, term49039.getClass(), "jsType", null);
        setField(term49039, term49039.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term48467;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term48397, args);
        assertTrue(recursiveEquals(term48397, term49038));
        assertTrue(recursiveEquals(term48467, term49039));
    }

};


