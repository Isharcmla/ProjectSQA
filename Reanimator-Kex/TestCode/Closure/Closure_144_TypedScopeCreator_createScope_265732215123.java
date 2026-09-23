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

public class TypedScopeCreator_createScope_265732215123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58769;
     Object term58943;
     Object term59157;

    public TypedScopeCreator_createScope_265732215123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58769 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term58873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term58769, term58769.getClass(), "compiler", null);
        setField(term58769, term58769.getClass(), "typeRegistry", term58873);
        term58943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58943, term58943.getClass(), "jsType", null);
        setIntField(term58943, term58943.getClass(), "type", 0);
        setField(term59083, term59083.getClass(), "next", null);
        setIntField(term59083, term59083.getClass(), "type", 0);
        setField(term59083, term59083.getClass(), "first", null);
        setField(term59013, term59013.getClass(), "next", term59083);
        setIntField(term59013, term59013.getClass(), "type", 132);
        setField(term59013, term59013.getClass(), "propListHead", null);
        setField(term59013, term59013.getClass(), "first", null);
        setField(term58943, term58943.getClass(), "first", term59013);
        term59157 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term59157, term59157.getClass(), "rootNode", null);
        setField(term59157, term59157.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term58943;
        args[1] = term59157;
        try {
            callMethod(klass, "createScope", argTypes, term58769, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


