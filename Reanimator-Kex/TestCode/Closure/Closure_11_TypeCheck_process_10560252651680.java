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

public class TypeCheck_process_10560252651680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544402;
     Object term544730;

    public TypeCheck_process_10560252651680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544402 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term544506 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term544580 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term544660 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term544402, term544402.getClass(), "scopeCreator", term544506);
        setField(term544580, term544580.getClass(), "parent", null);
        setField(term544402, term544402.getClass(), "topScope", term544580);
        setField(term544402, term544402.getClass(), "compiler", term544660);
        setBooleanField(term544402, term544402.getClass(), "inExterns", false);
        term544730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term544800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term544730, term544730.getClass(), "parent", term544800);
        setIntField(term544730, term544730.getClass(), "type", 101);
        setField(term544730, term544730.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term544730;
        try {
            callMethod(klass, "process", argTypes, term544402, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


