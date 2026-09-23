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

public class TypedScopeCreator_createScope_26573221570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33254;
     Object term33324;
     Object term33468;

    public TypedScopeCreator_createScope_26573221570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33254 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term33254, term33254.getClass(), "compiler", null);
        term33324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33324, term33324.getClass(), "jsType", null);
        setIntField(term33324, term33324.getClass(), "type", 0);
        setField(term33394, term33394.getClass(), "next", null);
        setIntField(term33394, term33394.getClass(), "type", 83);
        setField(term33394, term33394.getClass(), "first", null);
        setField(term33324, term33324.getClass(), "first", term33394);
        term33468 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term33538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33468, term33468.getClass(), "rootNode", term33538);
        setField(term33468, term33468.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term33324;
        args[1] = term33468;
        try {
            callMethod(klass, "createScope", argTypes, term33254, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


