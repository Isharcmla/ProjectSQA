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

public class TypedScopeCreator_createInitialScope_762247464109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44046;
     Object term44300;

    public TypedScopeCreator_createInitialScope_762247464109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44046 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term44126 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term44230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term44126, term44126.getClass(), "phaseOptimizer", null);
        setField(term44046, term44046.getClass(), "compiler", term44126);
        setField(term44046, term44046.getClass(), "typeRegistry", term44230);
        term44300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44300, term44300.getClass(), "type", 130);
        setField(term44300, term44300.getClass(), "parent", null);
        setField(term44300, term44300.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44300;
        try {
            callMethod(klass, "createInitialScope", argTypes, term44046, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


