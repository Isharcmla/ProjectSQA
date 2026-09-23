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

public class TypeCheck_check_233062943113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64733;
     Object term64975;

    public TypeCheck_check_233062943113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64733 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term64831 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term64905 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term64733, term64733.getClass(), "compiler", null);
        setField(term64733, term64733.getClass(), "scopeCreator", term64831);
        setBooleanField(term64733, term64733.getClass(), "inExterns", false);
        setField(term64905, term64905.getClass(), "parent", null);
        setField(term64733, term64733.getClass(), "topScope", term64905);
        term64975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64975, term64975.getClass(), "type", 0);
        setField(term65045, term65045.getClass(), "next", term65115);
        setIntField(term65045, term65045.getClass(), "type", 63);
        setField(term65045, term65045.getClass(), "first", null);
        setField(term64975, term64975.getClass(), "first", term65045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term64975;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term64733, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


