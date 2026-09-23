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
     Object term27341;
     Object term27513;
     Object term27679;

    public TypedScopeCreator_createScope_26573221555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27341 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term27421 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27341, term27341.getClass(), "compiler", term27421);
        term27513 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term27605 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term27513, term27513.getClass(), "jsType", null);
        setIntField(term27513, term27513.getClass(), "type", 0);
        setField(term27513, term27513.getClass(), "parent", null);
        setField(term27513, term27513.getClass(), "first", term27605);
        term27679 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term27749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27679, term27679.getClass(), "rootNode", term27749);
        setField(term27679, term27679.getClass(), "thisType", null);
        setIntField(term27679, term27679.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term27513;
        args[1] = term27679;
        try {
            callMethod(klass, "createScope", argTypes, term27341, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


