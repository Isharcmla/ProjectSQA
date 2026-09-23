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

public class TypeCheck_process_10560252651318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394637;
     Object term394885;

    public TypeCheck_process_10560252651318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394637 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term394741 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term394815 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term394637, term394637.getClass(), "scopeCreator", term394741);
        setField(term394815, term394815.getClass(), "parent", null);
        setField(term394637, term394637.getClass(), "topScope", term394815);
        setField(term394637, term394637.getClass(), "compiler", null);
        setBooleanField(term394637, term394637.getClass(), "inExterns", false);
        term394885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term394955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term394885, term394885.getClass(), "parent", term394955);
        setIntField(term394885, term394885.getClass(), "type", 136);
        setField(term394885, term394885.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term394885;
        try {
            callMethod(klass, "process", argTypes, term394637, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


