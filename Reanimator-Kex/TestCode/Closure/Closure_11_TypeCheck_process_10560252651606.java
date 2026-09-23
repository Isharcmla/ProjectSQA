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

public class TypeCheck_process_10560252651606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509692;
     Object term509940;

    public TypeCheck_process_10560252651606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term509692 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term509796 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term509870 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term509692, term509692.getClass(), "scopeCreator", term509796);
        setField(term509870, term509870.getClass(), "parent", null);
        setField(term509692, term509692.getClass(), "topScope", term509870);
        setField(term509692, term509692.getClass(), "compiler", null);
        setBooleanField(term509692, term509692.getClass(), "inExterns", false);
        term509940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term510010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term509940, term509940.getClass(), "parent", term510010);
        setIntField(term509940, term509940.getClass(), "type", 10);
        setField(term509940, term509940.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term509940;
        try {
            callMethod(klass, "process", argTypes, term509692, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


