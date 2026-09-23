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

public class TypedScopeCreator_createScope_265732215144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92130;
     Object term92200;
     Object term92502;

    public TypedScopeCreator_createScope_265732215144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92130 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term92130, term92130.getClass(), "compiler", null);
        term92200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term92200, term92200.getClass(), "jsType", null);
        setIntField(term92200, term92200.getClass(), "type", 0);
        setField(term92340, term92340.getClass(), "next", null);
        setIntField(term92340, term92340.getClass(), "type", 43);
        setField(term92340, term92340.getClass(), "first", null);
        setField(term92270, term92270.getClass(), "next", term92340);
        setIntField(term92270, term92270.getClass(), "type", 64);
        setField(term92270, term92270.getClass(), "first", null);
        setField(term92270, term92270.getClass(), "jsType", term92428);
        setField(term92200, term92200.getClass(), "first", term92270);
        term92502 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term92572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term92502, term92502.getClass(), "rootNode", term92572);
        setField(term92502, term92502.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term92200;
        args[1] = term92502;
        try {
            callMethod(klass, "createScope", argTypes, term92130, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


