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

public class TypedScopeCreator_createScope_265732215175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130472;
     Object term130622;
     Object term130836;

    public TypedScopeCreator_createScope_265732215175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130472 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term130552 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term130472, term130472.getClass(), "compiler", term130552);
        term130622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term130622, term130622.getClass(), "jsType", null);
        setIntField(term130622, term130622.getClass(), "type", 0);
        setField(term130692, term130692.getClass(), "next", null);
        setIntField(term130692, term130692.getClass(), "type", 69);
        setField(term130762, term130762.getClass(), "next", null);
        setIntField(term130762, term130762.getClass(), "type", 0);
        setField(term130762, term130762.getClass(), "first", null);
        setField(term130692, term130692.getClass(), "first", term130762);
        setField(term130622, term130622.getClass(), "first", term130692);
        term130836 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term130906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term130836, term130836.getClass(), "rootNode", term130906);
        setField(term130836, term130836.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term130622;
        args[1] = term130836;
        try {
            callMethod(klass, "createScope", argTypes, term130472, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


