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

public class InlineFunctions_inliningLowersCost_163611531980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14840;
     Object term14962;

    public InlineFunctions_inliningLowersCost_163611531980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14840 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term14840, term14840.getClass(), "injector", null);
        term14962 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState"));
        Object term15094 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionExpression"));
        setField(term14962, term14962.getClass(), "module", null);
        setField(term14962, term14962.getClass(), "fn", term15094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Object[] args = new Object[1];
        args[0] = term14962;
        try {
            callMethod(klass, "inliningLowersCost", argTypes, term14840, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


