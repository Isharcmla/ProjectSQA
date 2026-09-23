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

public class TypeCheck_check_233062943288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126210;
     Object term126538;

    public TypeCheck_check_233062943288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126210 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term126290 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term126394 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term126468 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term126210, term126210.getClass(), "compiler", term126290);
        setField(term126210, term126210.getClass(), "scopeCreator", term126394);
        setBooleanField(term126210, term126210.getClass(), "inExterns", false);
        setField(term126468, term126468.getClass(), "parent", null);
        setField(term126210, term126210.getClass(), "topScope", term126468);
        term126538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term126538, term126538.getClass(), "type", 0);
        setField(term126678, term126678.getClass(), "next", term126748);
        setIntField(term126678, term126678.getClass(), "type", 72);
        setField(term126678, term126678.getClass(), "first", null);
        setField(term126608, term126608.getClass(), "next", term126678);
        setIntField(term126608, term126608.getClass(), "type", 77);
        setField(term126608, term126608.getClass(), "first", null);
        setField(term126538, term126538.getClass(), "first", term126608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term126538;
        args[1] = true;
        callMethod(klass, "check", argTypes, term126210, args);
    }

};


