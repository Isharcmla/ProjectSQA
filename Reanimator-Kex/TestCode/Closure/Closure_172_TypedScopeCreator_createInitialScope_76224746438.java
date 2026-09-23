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

public class TypedScopeCreator_createInitialScope_76224746438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10988;
     Object term11058;

    public TypedScopeCreator_createInitialScope_76224746438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10988 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term10988, term10988.getClass(), "compiler", null);
        setField(term10988, term10988.getClass(), "typeRegistry", null);
        term11058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11058, term11058.getClass(), "type", -133);
        setField(term11058, term11058.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term11058;
        try {
            callMethod(klass, "createInitialScope", argTypes, term10988, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


