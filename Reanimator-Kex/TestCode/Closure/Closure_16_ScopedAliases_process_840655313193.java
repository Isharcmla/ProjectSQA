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

public class ScopedAliases_process_840655313193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118068;
     Object term118160;
     Object term119020;
     Object term119021;

    public ScopedAliases_process_840655313193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118068 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term118068, term118068.getClass(), "compiler", null);
        term118160 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term118252 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term118344 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term118414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term118160, term118160.getClass(), "type", 0);
        setField(term118160, term118160.getClass(), "parent", null);
        setField(term118252, term118252.getClass(), "next", term118344);
        setIntField(term118252, term118252.getClass(), "type", 0);
        setField(term118252, term118252.getClass(), "first", term118414);
        setField(term118160, term118160.getClass(), "first", term118252);
        term119020 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term119020, term119020.getClass(), "compiler", null);
        setField(term119020, term119020.getClass(), "preprocessorSymbolTable", null);
        setField(term119020, term119020.getClass(), "transformationHandler", null);
        term119021 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119022 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119023 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term119021, term119021.getClass(), "number", 0.0);
        setIntField(term119021, term119021.getClass(), "type", 0);
        setField(term119021, term119021.getClass(), "next", null);
        setDoubleField(term119022, term119022.getClass(), "number", 0.0);
        setIntField(term119022, term119022.getClass(), "type", 0);
        setDoubleField(term119023, term119023.getClass(), "number", 0.0);
        setIntField(term119023, term119023.getClass(), "type", 0);
        setField(term119023, term119023.getClass(), "next", null);
        setField(term119023, term119023.getClass(), "first", null);
        setField(term119023, term119023.getClass(), "last", null);
        setField(term119023, term119023.getClass(), "propListHead", null);
        setIntField(term119023, term119023.getClass(), "sourcePosition", 0);
        setField(term119023, term119023.getClass(), "jsType", null);
        setField(term119023, term119023.getClass(), "parent", null);
        setField(term119022, term119022.getClass(), "next", term119023);
        setIntField(term119024, term119024.getClass(), "type", 0);
        setField(term119024, term119024.getClass(), "next", null);
        setField(term119024, term119024.getClass(), "first", null);
        setField(term119024, term119024.getClass(), "last", null);
        setField(term119024, term119024.getClass(), "propListHead", null);
        setIntField(term119024, term119024.getClass(), "sourcePosition", 0);
        setField(term119024, term119024.getClass(), "jsType", null);
        setField(term119024, term119024.getClass(), "parent", null);
        setField(term119022, term119022.getClass(), "first", term119024);
        setField(term119022, term119022.getClass(), "last", null);
        setField(term119022, term119022.getClass(), "propListHead", null);
        setIntField(term119022, term119022.getClass(), "sourcePosition", 0);
        setField(term119022, term119022.getClass(), "jsType", null);
        setField(term119022, term119022.getClass(), "parent", null);
        setField(term119021, term119021.getClass(), "first", term119022);
        setField(term119021, term119021.getClass(), "last", null);
        setField(term119021, term119021.getClass(), "propListHead", null);
        setIntField(term119021, term119021.getClass(), "sourcePosition", 0);
        setField(term119021, term119021.getClass(), "jsType", null);
        setField(term119021, term119021.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term118160;
        callMethod(klass, "process", argTypes, term118068, args);
        assertTrue(recursiveEquals(term118068, term119020));
        assertTrue(recursiveEquals(term118160, null));
    }

};


