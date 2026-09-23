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

public class TypedScopeCreator_createScope_265732215141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97923;
     Object term97993;
     Object term98137;

    public TypedScopeCreator_createScope_265732215141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97923 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term97923, term97923.getClass(), "compiler", null);
        term97993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term97993, term97993.getClass(), "jsType", null);
        setIntField(term97993, term97993.getClass(), "type", 0);
        setField(term98063, term98063.getClass(), "next", null);
        setIntField(term98063, term98063.getClass(), "type", 64);
        setField(term98063, term98063.getClass(), "first", null);
        setField(term98063, term98063.getClass(), "jsType", null);
        setField(term97993, term97993.getClass(), "first", term98063);
        term98137 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term98137, term98137.getClass(), "rootNode", null);
        setField(term98137, term98137.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term97993;
        args[1] = term98137;
        try {
            callMethod(klass, "createScope", argTypes, term97923, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


