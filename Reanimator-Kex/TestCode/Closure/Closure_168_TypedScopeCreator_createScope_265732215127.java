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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76961;
     Object term77111;
     Object term77465;

    public TypedScopeCreator_createScope_265732215127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76961 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term77041 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term76961, term76961.getClass(), "compiler", term77041);
        term77111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77111, term77111.getClass(), "jsType", null);
        setIntField(term77111, term77111.getClass(), "type", 0);
        setField(term77111, term77111.getClass(), "parent", null);
        setField(term77321, term77321.getClass(), "next", null);
        setIntField(term77321, term77321.getClass(), "type", 0);
        setField(term77321, term77321.getClass(), "first", null);
        setField(term77321, term77321.getClass(), "parent", null);
        setField(term77251, term77251.getClass(), "next", term77321);
        setIntField(term77251, term77251.getClass(), "type", 33);
        setField(term77251, term77251.getClass(), "first", null);
        setField(term77251, term77251.getClass(), "parent", null);
        setField(term77181, term77181.getClass(), "next", term77251);
        setIntField(term77181, term77181.getClass(), "type", 0);
        setField(term77391, term77391.getClass(), "next", null);
        setIntField(term77391, term77391.getClass(), "type", 0);
        setField(term77391, term77391.getClass(), "first", null);
        setField(term77391, term77391.getClass(), "parent", null);
        setField(term77181, term77181.getClass(), "first", term77391);
        setField(term77181, term77181.getClass(), "parent", null);
        setField(term77111, term77111.getClass(), "first", term77181);
        term77465 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term77535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77465, term77465.getClass(), "rootNode", term77535);
        setField(term77465, term77465.getClass(), "thisType", null);
        setIntField(term77465, term77465.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term77111;
        args[1] = term77465;
        try {
            callMethod(klass, "createScope", argTypes, term76961, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


