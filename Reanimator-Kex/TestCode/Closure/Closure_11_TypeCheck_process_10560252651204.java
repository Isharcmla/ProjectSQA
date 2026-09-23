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

public class TypeCheck_process_10560252651204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348481;
     Object term348723;

    public TypeCheck_process_10560252651204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348481 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term348579 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term348653 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term348481, term348481.getClass(), "scopeCreator", term348579);
        setField(term348653, term348653.getClass(), "parent", null);
        setField(term348481, term348481.getClass(), "topScope", term348653);
        setField(term348481, term348481.getClass(), "compiler", null);
        setBooleanField(term348481, term348481.getClass(), "inExterns", false);
        term348723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term348793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term348723, term348723.getClass(), "parent", term348793);
        setIntField(term348723, term348723.getClass(), "type", 38);
        setField(term348723, term348723.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term348723;
        try {
            callMethod(klass, "process", argTypes, term348481, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


