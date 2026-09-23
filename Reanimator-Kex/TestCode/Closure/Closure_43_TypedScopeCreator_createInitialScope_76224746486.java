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

public class TypedScopeCreator_createInitialScope_76224746486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53449;
     Object term53519;

    public TypedScopeCreator_createInitialScope_76224746486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53449 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term53449, term53449.getClass(), "compiler", null);
        setField(term53449, term53449.getClass(), "typeRegistry", null);
        term53519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53519, term53519.getClass(), "type", 114);
        setField(term53519, term53519.getClass(), "parent", null);
        setField(term53589, term53589.getClass(), "next", null);
        setIntField(term53589, term53589.getClass(), "type", 0);
        setField(term53589, term53589.getClass(), "first", null);
        setField(term53519, term53519.getClass(), "first", term53589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53519;
        try {
            callMethod(klass, "createInitialScope", argTypes, term53449, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


