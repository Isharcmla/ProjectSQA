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

public class TypeCheck_check_233062943308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135333;
     Object term135661;

    public TypeCheck_check_233062943308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135333 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term135413 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term135517 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term135591 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term135333, term135333.getClass(), "compiler", term135413);
        setField(term135333, term135333.getClass(), "scopeCreator", term135517);
        setBooleanField(term135333, term135333.getClass(), "inExterns", false);
        setField(term135591, term135591.getClass(), "parent", null);
        setField(term135333, term135333.getClass(), "topScope", term135591);
        term135661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term135661, term135661.getClass(), "type", 0);
        setField(term135801, term135801.getClass(), "next", term135871);
        setIntField(term135801, term135801.getClass(), "type", 20);
        setField(term135801, term135801.getClass(), "first", null);
        setField(term135731, term135731.getClass(), "next", term135801);
        setIntField(term135731, term135731.getClass(), "type", 130);
        setField(term135731, term135731.getClass(), "first", null);
        setField(term135661, term135661.getClass(), "first", term135731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term135661;
        args[1] = true;
        callMethod(klass, "check", argTypes, term135333, args);
    }

};


