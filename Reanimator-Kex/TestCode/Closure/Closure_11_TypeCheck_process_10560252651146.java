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
import java.lang.Object;

public class TypeCheck_process_10560252651146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332357;
     Object term332599;

    public TypeCheck_process_10560252651146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332357 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term332455 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term332529 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term332357, term332357.getClass(), "scopeCreator", term332455);
        setField(term332529, term332529.getClass(), "parent", null);
        setField(term332357, term332357.getClass(), "topScope", term332529);
        setField(term332357, term332357.getClass(), "compiler", null);
        setBooleanField(term332357, term332357.getClass(), "inExterns", false);
        term332599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term332669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term332599, term332599.getClass(), "parent", term332669);
        setIntField(term332599, term332599.getClass(), "type", 8);
        setField(term332599, term332599.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term332599;
        try {
            callMethod(klass, "process", argTypes, term332357, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


