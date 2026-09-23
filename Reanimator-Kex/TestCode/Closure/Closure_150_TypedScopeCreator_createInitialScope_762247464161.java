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

public class TypedScopeCreator_createInitialScope_762247464161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106741;
     Object term106995;

    public TypedScopeCreator_createInitialScope_762247464161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106741 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term106821 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term106925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term106741, term106741.getClass(), "compiler", term106821);
        setField(term106741, term106741.getClass(), "typeRegistry", term106925);
        term106995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106995, term106995.getClass(), "type", 0);
        setField(term107065, term107065.getClass(), "next", null);
        setIntField(term107065, term107065.getClass(), "type", 86);
        setField(term107065, term107065.getClass(), "first", null);
        setField(term106995, term106995.getClass(), "first", term107065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term106995;
        try {
            callMethod(klass, "createInitialScope", argTypes, term106741, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


