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

public class TypedScopeCreator_createScope_26573221527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12961;
     Object term13111;
     Object term13255;

    public TypedScopeCreator_createScope_26573221527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12961 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term13041 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term12961, term12961.getClass(), "compiler", term13041);
        term13111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13111, term13111.getClass(), "jsType", null);
        setIntField(term13111, term13111.getClass(), "type", 0);
        setField(term13181, term13181.getClass(), "next", null);
        setIntField(term13181, term13181.getClass(), "type", 120);
        setField(term13111, term13111.getClass(), "first", term13181);
        term13255 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term13255, term13255.getClass(), "rootNode", null);
        setField(term13255, term13255.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term13111;
        args[1] = term13255;
        try {
            callMethod(klass, "createScope", argTypes, term12961, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


