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

public class TypedScopeCreator_createScope_26573221587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53921;
     Object term53991;
     Object term54205;

    public TypedScopeCreator_createScope_26573221587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53921 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term53921, term53921.getClass(), "compiler", null);
        term53991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term53991, term53991.getClass(), "jsType", null);
        setIntField(term53991, term53991.getClass(), "type", 0);
        setField(term53991, term53991.getClass(), "parent", null);
        setField(term54061, term54061.getClass(), "next", term54131);
        setIntField(term54061, term54061.getClass(), "type", 0);
        setField(term54061, term54061.getClass(), "first", null);
        setField(term53991, term53991.getClass(), "first", term54061);
        term54205 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term54275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54205, term54205.getClass(), "rootNode", term54275);
        setField(term54205, term54205.getClass(), "thisType", null);
        setIntField(term54205, term54205.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term53991;
        args[1] = term54205;
        try {
            callMethod(klass, "createScope", argTypes, term53921, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


