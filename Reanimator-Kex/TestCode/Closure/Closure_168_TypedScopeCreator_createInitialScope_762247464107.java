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

public class TypedScopeCreator_createInitialScope_762247464107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61810;
     Object term61984;

    public TypedScopeCreator_createInitialScope_762247464107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61810 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term61914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term61810, term61810.getClass(), "compiler", null);
        setField(term61810, term61810.getClass(), "typeRegistry", term61914);
        term61984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61984, term61984.getClass(), "type", 118);
        setField(term61984, term61984.getClass(), "parent", null);
        setField(term62124, term62124.getClass(), "next", null);
        setIntField(term62124, term62124.getClass(), "type", 33);
        setField(term62124, term62124.getClass(), "first", term62194);
        setField(term62124, term62124.getClass(), "propListHead", null);
        setField(term62124, term62124.getClass(), "parent", null);
        setField(term62054, term62054.getClass(), "next", term62124);
        setIntField(term62054, term62054.getClass(), "type", 0);
        setField(term62054, term62054.getClass(), "first", null);
        setField(term62054, term62054.getClass(), "propListHead", null);
        setField(term62054, term62054.getClass(), "parent", null);
        setField(term61984, term61984.getClass(), "first", term62054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term61984;
        try {
            callMethod(klass, "createInitialScope", argTypes, term61810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


