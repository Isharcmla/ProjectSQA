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

public class TypedScopeCreator_createInitialScope_76224746494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36503;
     Object term36675;

    public TypedScopeCreator_createInitialScope_76224746494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36503 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term36583 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term36583, term36583.getClass(), "phaseOptimizer", null);
        setField(term36503, term36503.getClass(), "compiler", term36583);
        setField(term36503, term36503.getClass(), "typeRegistry", null);
        term36675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term36675, term36675.getClass(), "type", -133);
        setField(term36675, term36675.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36675;
        try {
            callMethod(klass, "createInitialScope", argTypes, term36503, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


