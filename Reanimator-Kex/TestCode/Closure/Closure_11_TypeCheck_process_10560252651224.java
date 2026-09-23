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

public class TypeCheck_process_10560252651224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355801;
     Object term356043;

    public TypeCheck_process_10560252651224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355801 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term355899 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term355973 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term355801, term355801.getClass(), "scopeCreator", term355899);
        setField(term355973, term355973.getClass(), "parent", null);
        setField(term355801, term355801.getClass(), "topScope", term355973);
        setField(term355801, term355801.getClass(), "compiler", null);
        setBooleanField(term355801, term355801.getClass(), "inExterns", false);
        term356043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term356113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term356043, term356043.getClass(), "parent", term356113);
        setIntField(term356043, term356043.getClass(), "type", 70);
        setField(term356043, term356043.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term356043;
        try {
            callMethod(klass, "process", argTypes, term355801, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


