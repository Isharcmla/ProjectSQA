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

public class TypeCheck_check_233062943258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115007;
     Object term115255;

    public TypeCheck_check_233062943258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115007 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term115111 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term115185 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term115007, term115007.getClass(), "compiler", null);
        setField(term115007, term115007.getClass(), "scopeCreator", term115111);
        setBooleanField(term115007, term115007.getClass(), "inExterns", false);
        setField(term115185, term115185.getClass(), "parent", null);
        setField(term115007, term115007.getClass(), "topScope", term115185);
        term115255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term115255, term115255.getClass(), "type", 0);
        setField(term115325, term115325.getClass(), "next", term115395);
        setIntField(term115325, term115325.getClass(), "type", 20);
        setField(term115325, term115325.getClass(), "first", null);
        setField(term115255, term115255.getClass(), "first", term115325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term115255;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term115007, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


