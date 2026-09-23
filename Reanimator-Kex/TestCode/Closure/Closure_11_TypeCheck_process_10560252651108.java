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

public class TypeCheck_process_10560252651108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319877;
     Object term320125;

    public TypeCheck_process_10560252651108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319877 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term319981 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term320055 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term319877, term319877.getClass(), "scopeCreator", term319981);
        setField(term320055, term320055.getClass(), "parent", null);
        setField(term319877, term319877.getClass(), "topScope", term320055);
        setField(term319877, term319877.getClass(), "compiler", null);
        setBooleanField(term319877, term319877.getClass(), "inExterns", false);
        term320125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term320195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term320125, term320125.getClass(), "parent", term320195);
        setIntField(term320125, term320125.getClass(), "type", 54);
        setField(term320125, term320125.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term320125;
        try {
            callMethod(klass, "process", argTypes, term319877, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


