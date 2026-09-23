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

public class TypedScopeCreator_createScope_26573221542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19588;
     Object term19738;
     Object term19882;

    public TypedScopeCreator_createScope_26573221542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19588 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term19668 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term19588, term19588.getClass(), "compiler", term19668);
        term19738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19738, term19738.getClass(), "jsType", null);
        setIntField(term19738, term19738.getClass(), "type", 0);
        setField(term19808, term19808.getClass(), "next", null);
        setIntField(term19808, term19808.getClass(), "type", 120);
        setField(term19808, term19808.getClass(), "first", null);
        setField(term19738, term19738.getClass(), "first", term19808);
        term19882 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term19952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19882, term19882.getClass(), "rootNode", term19952);
        setField(term19882, term19882.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term19738;
        args[1] = term19882;
        try {
            callMethod(klass, "createScope", argTypes, term19588, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


