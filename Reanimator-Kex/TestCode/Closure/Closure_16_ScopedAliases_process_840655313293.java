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

public class ScopedAliases_process_840655313293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190283;
     Object term190353;
     Object term191170;
     Object term191171;

    public ScopedAliases_process_840655313293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190283 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term190283, term190283.getClass(), "compiler", null);
        term190353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term190353, term190353.getClass(), "type", 37);
        setField(term190353, term190353.getClass(), "parent", null);
        setField(term190493, term190493.getClass(), "next", null);
        setIntField(term190493, term190493.getClass(), "type", 0);
        setField(term190493, term190493.getClass(), "first", null);
        setField(term190423, term190423.getClass(), "next", term190493);
        setIntField(term190423, term190423.getClass(), "type", 0);
        setField(term190563, term190563.getClass(), "next", null);
        setIntField(term190563, term190563.getClass(), "type", 0);
        setField(term190563, term190563.getClass(), "first", null);
        setField(term190423, term190423.getClass(), "first", term190563);
        setField(term190353, term190353.getClass(), "first", term190423);
        term191170 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term191170, term191170.getClass(), "compiler", null);
        setField(term191170, term191170.getClass(), "preprocessorSymbolTable", null);
        setField(term191170, term191170.getClass(), "transformationHandler", null);
        term191171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term191171, term191171.getClass(), "type", 37);
        setField(term191171, term191171.getClass(), "next", null);
        setIntField(term191172, term191172.getClass(), "type", 0);
        setIntField(term191173, term191173.getClass(), "type", 0);
        setField(term191173, term191173.getClass(), "next", null);
        setField(term191173, term191173.getClass(), "first", null);
        setField(term191173, term191173.getClass(), "last", null);
        setField(term191173, term191173.getClass(), "propListHead", null);
        setIntField(term191173, term191173.getClass(), "sourcePosition", 0);
        setField(term191173, term191173.getClass(), "jsType", null);
        setField(term191173, term191173.getClass(), "parent", null);
        setField(term191172, term191172.getClass(), "next", term191173);
        setIntField(term191174, term191174.getClass(), "type", 0);
        setField(term191174, term191174.getClass(), "next", null);
        setField(term191174, term191174.getClass(), "first", null);
        setField(term191174, term191174.getClass(), "last", null);
        setField(term191174, term191174.getClass(), "propListHead", null);
        setIntField(term191174, term191174.getClass(), "sourcePosition", 0);
        setField(term191174, term191174.getClass(), "jsType", null);
        setField(term191174, term191174.getClass(), "parent", null);
        setField(term191172, term191172.getClass(), "first", term191174);
        setField(term191172, term191172.getClass(), "last", null);
        setField(term191172, term191172.getClass(), "propListHead", null);
        setIntField(term191172, term191172.getClass(), "sourcePosition", 0);
        setField(term191172, term191172.getClass(), "jsType", null);
        setField(term191172, term191172.getClass(), "parent", null);
        setField(term191171, term191171.getClass(), "first", term191172);
        setField(term191171, term191171.getClass(), "last", null);
        setField(term191171, term191171.getClass(), "propListHead", null);
        setIntField(term191171, term191171.getClass(), "sourcePosition", 0);
        setField(term191171, term191171.getClass(), "jsType", null);
        setField(term191171, term191171.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term190353;
        callMethod(klass, "process", argTypes, term190283, args);
        assertTrue(recursiveEquals(term190283, term191170));
        assertTrue(recursiveEquals(term190353, null));
    }

};


