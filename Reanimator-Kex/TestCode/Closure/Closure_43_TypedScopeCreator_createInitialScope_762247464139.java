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

public class TypedScopeCreator_createInitialScope_762247464139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102811;
     Object term103065;

    public TypedScopeCreator_createInitialScope_762247464139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102811 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term102891 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term102995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term102811, term102811.getClass(), "compiler", term102891);
        setField(term102811, term102811.getClass(), "typeRegistry", term102995);
        term103065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term103065, term103065.getClass(), "type", 114);
        setField(term103065, term103065.getClass(), "parent", null);
        setField(term103205, term103205.getClass(), "next", term103275);
        setIntField(term103205, term103205.getClass(), "type", 0);
        setField(term103205, term103205.getClass(), "first", null);
        setField(term103135, term103135.getClass(), "next", term103205);
        setIntField(term103135, term103135.getClass(), "type", 0);
        setField(term103135, term103135.getClass(), "first", null);
        setField(term103065, term103065.getClass(), "first", term103135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term103065;
        try {
            callMethod(klass, "createInitialScope", argTypes, term102811, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


