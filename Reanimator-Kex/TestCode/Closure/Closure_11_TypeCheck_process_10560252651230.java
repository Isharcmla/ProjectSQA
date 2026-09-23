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

public class TypeCheck_process_10560252651230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358176;
     Object term358424;

    public TypeCheck_process_10560252651230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358176 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term358280 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term358354 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term358176, term358176.getClass(), "scopeCreator", term358280);
        setField(term358354, term358354.getClass(), "parent", null);
        setField(term358176, term358176.getClass(), "topScope", term358354);
        setField(term358176, term358176.getClass(), "compiler", null);
        setBooleanField(term358176, term358176.getClass(), "inExterns", false);
        term358424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term358494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term358424, term358424.getClass(), "parent", term358494);
        setIntField(term358424, term358424.getClass(), "type", 48);
        setField(term358424, term358424.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term358424;
        try {
            callMethod(klass, "process", argTypes, term358176, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


