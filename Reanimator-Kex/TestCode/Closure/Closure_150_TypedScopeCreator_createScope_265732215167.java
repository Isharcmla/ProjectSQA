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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111420;
     Object term111570;
     Object term111950;

    public TypedScopeCreator_createScope_265732215167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111420 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term111500 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term111420, term111420.getClass(), "compiler", term111500);
        term111570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111876 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term111570, term111570.getClass(), "jsType", null);
        setIntField(term111570, term111570.getClass(), "type", 0);
        setField(term111710, term111710.getClass(), "next", term111780);
        setIntField(term111710, term111710.getClass(), "type", 64);
        setField(term111710, term111710.getClass(), "first", null);
        setField(term111710, term111710.getClass(), "jsType", null);
        setField(term111640, term111640.getClass(), "next", term111710);
        setIntField(term111640, term111640.getClass(), "type", 64);
        setField(term111640, term111640.getClass(), "first", null);
        setField(term111640, term111640.getClass(), "jsType", term111876);
        setField(term111570, term111570.getClass(), "first", term111640);
        term111950 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term112020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term111950, term111950.getClass(), "rootNode", term112020);
        setField(term111950, term111950.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term111570;
        args[1] = term111950;
        try {
            callMethod(klass, "createScope", argTypes, term111420, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


