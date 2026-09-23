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

public class TypedScopeCreator_createScope_26573221559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31974;
     Object term32124;
     Object term32198;

    public TypedScopeCreator_createScope_26573221559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31974 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term32054 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31974, term31974.getClass(), "compiler", term32054);
        term32124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32124, term32124.getClass(), "jsType", null);
        setIntField(term32124, term32124.getClass(), "type", 126);
        setField(term32124, term32124.getClass(), "parent", null);
        setField(term32124, term32124.getClass(), "first", null);
        term32198 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term32198, term32198.getClass(), "rootNode", null);
        setField(term32198, term32198.getClass(), "thisType", null);
        setIntField(term32198, term32198.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term32124;
        args[1] = term32198;
        try {
            callMethod(klass, "createScope", argTypes, term31974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


