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

public class TypedScopeCreator_createScope_265732215183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125407;
     Object term125557;
     Object term125933;

    public TypedScopeCreator_createScope_265732215183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125407 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term125487 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term125407, term125407.getClass(), "compiler", term125487);
        term125557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term125557, term125557.getClass(), "jsType", null);
        setIntField(term125557, term125557.getClass(), "type", 0);
        setField(term125767, term125767.getClass(), "next", null);
        setIntField(term125767, term125767.getClass(), "type", 0);
        setField(term125767, term125767.getClass(), "first", null);
        setField(term125697, term125697.getClass(), "next", term125767);
        setIntField(term125697, term125697.getClass(), "type", 0);
        setField(term125697, term125697.getClass(), "first", null);
        setField(term125627, term125627.getClass(), "next", term125697);
        setIntField(term125627, term125627.getClass(), "type", 64);
        setField(term125627, term125627.getClass(), "first", null);
        setField(term125627, term125627.getClass(), "jsType", term126049);
        setField(term125557, term125557.getClass(), "first", term125627);
        term125933 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term126003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term125933, term125933.getClass(), "rootNode", term126003);
        setField(term125933, term125933.getClass(), "thisType", term126049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term125557;
        args[1] = term125933;
        try {
            callMethod(klass, "createScope", argTypes, term125407, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


