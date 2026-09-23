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

public class TypeCheck_check_233062943269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118441;
     Object term118769;

    public TypeCheck_check_233062943269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118441 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term118521 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term118625 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term118699 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term118441, term118441.getClass(), "compiler", term118521);
        setField(term118441, term118441.getClass(), "scopeCreator", term118625);
        setBooleanField(term118441, term118441.getClass(), "inExterns", false);
        setField(term118699, term118699.getClass(), "parent", null);
        setField(term118441, term118441.getClass(), "topScope", term118699);
        term118769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term118769, term118769.getClass(), "type", 0);
        setField(term118909, term118909.getClass(), "next", term118979);
        setIntField(term118909, term118909.getClass(), "type", 14);
        setField(term118909, term118909.getClass(), "first", null);
        setField(term118839, term118839.getClass(), "next", term118909);
        setIntField(term118839, term118839.getClass(), "type", 130);
        setField(term118839, term118839.getClass(), "first", null);
        setField(term118769, term118769.getClass(), "first", term118839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term118769;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term118441, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


