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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25083;
     Object term25153;
     Object term25415;
     Object term25416;
     Object term25401;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25083 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term25153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term25153, term25153.getClass(), "first", null);
        setIntField(term25153, term25153.getClass(), "type", 37);
        term25415 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term25415, term25415.getClass(), "currentTraversal", null);
        term25416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25416, term25416.getClass(), "type", 37);
        setField(term25416, term25416.getClass(), "next", null);
        setField(term25416, term25416.getClass(), "first", null);
        setField(term25416, term25416.getClass(), "last", null);
        setField(term25416, term25416.getClass(), "propListHead", null);
        setIntField(term25416, term25416.getClass(), "sourcePosition", 0);
        setField(term25416, term25416.getClass(), "jsType", null);
        setField(term25416, term25416.getClass(), "parent", null);
        term25401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25401, term25401.getClass(), "type", 37);
        setField(term25401, term25401.getClass(), "next", null);
        setField(term25401, term25401.getClass(), "first", null);
        setField(term25401, term25401.getClass(), "last", null);
        setField(term25401, term25401.getClass(), "propListHead", null);
        setIntField(term25401, term25401.getClass(), "sourcePosition", 0);
        setField(term25401, term25401.getClass(), "jsType", null);
        setField(term25401, term25401.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25153;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term25083, args);
        assertTrue(recursiveEquals(term25083, term25415));
        assertTrue(recursiveEquals(term25153, term25416));
        assertTrue(recursiveEquals(retValue, term25401));
    }

};


