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

public class TypeCheck_process_10560252651387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422183;
     Object term422431;

    public TypeCheck_process_10560252651387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422183 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term422287 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term422361 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term422183, term422183.getClass(), "scopeCreator", term422287);
        setField(term422361, term422361.getClass(), "parent", null);
        setField(term422183, term422183.getClass(), "topScope", term422361);
        setField(term422183, term422183.getClass(), "compiler", null);
        setBooleanField(term422183, term422183.getClass(), "inExterns", false);
        term422431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term422431, term422431.getClass(), "parent", term422501);
        setIntField(term422431, term422431.getClass(), "type", 65);
        setField(term422431, term422431.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term422431;
        try {
            callMethod(klass, "process", argTypes, term422183, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


