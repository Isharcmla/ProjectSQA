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

public class TypedScopeCreator_createScope_26573221555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26362;
     Object term26512;
     Object term26586;

    public TypedScopeCreator_createScope_26573221555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26362 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term26442 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26362, term26362.getClass(), "compiler", term26442);
        term26512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26512, term26512.getClass(), "jsType", null);
        setIntField(term26512, term26512.getClass(), "type", 0);
        setField(term26512, term26512.getClass(), "parent", null);
        setField(term26512, term26512.getClass(), "first", null);
        term26586 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term26656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26586, term26586.getClass(), "rootNode", term26656);
        setField(term26586, term26586.getClass(), "thisType", null);
        setIntField(term26586, term26586.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term26512;
        args[1] = term26586;
        try {
            callMethod(klass, "createScope", argTypes, term26362, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


