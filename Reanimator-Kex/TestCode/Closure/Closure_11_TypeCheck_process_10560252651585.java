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

public class TypeCheck_process_10560252651585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501075;
     Object term501323;

    public TypeCheck_process_10560252651585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501075 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term501179 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term501253 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term501075, term501075.getClass(), "scopeCreator", term501179);
        setField(term501253, term501253.getClass(), "parent", null);
        setField(term501075, term501075.getClass(), "topScope", term501253);
        setField(term501075, term501075.getClass(), "compiler", null);
        setBooleanField(term501075, term501075.getClass(), "inExterns", false);
        term501323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term501323, term501323.getClass(), "parent", term501393);
        setIntField(term501323, term501323.getClass(), "type", 122);
        setField(term501323, term501323.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term501323;
        try {
            callMethod(klass, "process", argTypes, term501075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


