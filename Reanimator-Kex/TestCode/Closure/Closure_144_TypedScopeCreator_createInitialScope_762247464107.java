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

public class TypedScopeCreator_createInitialScope_762247464107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52465;
     Object term52661;

    public TypedScopeCreator_createInitialScope_762247464107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52465 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term52569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term52465, term52465.getClass(), "compiler", null);
        setField(term52465, term52465.getClass(), "typeRegistry", term52569);
        term52661 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52753 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term52661, term52661.getClass(), "type", 0);
        setField(term52753, term52753.getClass(), "next", null);
        setIntField(term52753, term52753.getClass(), "type", 38);
        setField(term52753, term52753.getClass(), "first", null);
        setField(term52661, term52661.getClass(), "first", term52753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term52661;
        try {
            callMethod(klass, "createInitialScope", argTypes, term52465, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


