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

public class TypeCheck_process_1056025265336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81496;
     Object term81744;

    public TypeCheck_process_1056025265336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81496 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term81600 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term81674 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term81496, term81496.getClass(), "scopeCreator", term81600);
        setField(term81496, term81496.getClass(), "topScope", term81674);
        term81744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term81744;
        try {
            callMethod(klass, "process", argTypes, term81496, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


