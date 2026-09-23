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

public class TypedScopeCreator_createScope_265732215182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135974;
     Object term136044;
     Object term136258;

    public TypedScopeCreator_createScope_265732215182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135974 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term135974, term135974.getClass(), "compiler", null);
        term136044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term136044, term136044.getClass(), "jsType", null);
        setIntField(term136044, term136044.getClass(), "type", 0);
        setField(term136114, term136114.getClass(), "next", null);
        setIntField(term136114, term136114.getClass(), "type", 0);
        setField(term136184, term136184.getClass(), "next", null);
        setIntField(term136184, term136184.getClass(), "type", 40);
        setField(term136184, term136184.getClass(), "first", null);
        setField(term136114, term136114.getClass(), "first", term136184);
        setField(term136044, term136044.getClass(), "first", term136114);
        term136258 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term136350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term136258, term136258.getClass(), "rootNode", null);
        setField(term136258, term136258.getClass(), "thisType", term136350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term136044;
        args[1] = term136258;
        try {
            callMethod(klass, "createScope", argTypes, term135974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


