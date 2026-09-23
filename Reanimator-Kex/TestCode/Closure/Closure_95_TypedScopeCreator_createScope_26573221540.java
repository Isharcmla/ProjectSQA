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

public class TypedScopeCreator_createScope_26573221540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22510;
     Object term22580;
     Object term22724;

    public TypedScopeCreator_createScope_26573221540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22510 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term22510, term22510.getClass(), "compiler", null);
        term22580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22580, term22580.getClass(), "jsType", null);
        setIntField(term22580, term22580.getClass(), "type", 0);
        setField(term22650, term22650.getClass(), "next", null);
        setIntField(term22650, term22650.getClass(), "type", 122);
        setField(term22650, term22650.getClass(), "first", null);
        setField(term22580, term22580.getClass(), "first", term22650);
        term22724 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term22794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22724, term22724.getClass(), "rootNode", term22794);
        setField(term22724, term22724.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term22580;
        args[1] = term22724;
        try {
            callMethod(klass, "createScope", argTypes, term22510, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


