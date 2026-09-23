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

public class TypedScopeCreator_createScope_265732215173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128152;
     Object term128302;
     Object term128516;

    public TypedScopeCreator_createScope_265732215173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128152 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term128232 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term128152, term128152.getClass(), "compiler", term128232);
        term128302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128302, term128302.getClass(), "jsType", null);
        setIntField(term128302, term128302.getClass(), "type", 0);
        setField(term128372, term128372.getClass(), "next", null);
        setIntField(term128372, term128372.getClass(), "type", 40);
        setField(term128442, term128442.getClass(), "next", null);
        setIntField(term128442, term128442.getClass(), "type", 0);
        setField(term128442, term128442.getClass(), "first", null);
        setField(term128372, term128372.getClass(), "first", term128442);
        setField(term128302, term128302.getClass(), "first", term128372);
        term128516 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term128586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128516, term128516.getClass(), "rootNode", term128586);
        setField(term128516, term128516.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term128302;
        args[1] = term128516;
        try {
            callMethod(klass, "createScope", argTypes, term128152, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


