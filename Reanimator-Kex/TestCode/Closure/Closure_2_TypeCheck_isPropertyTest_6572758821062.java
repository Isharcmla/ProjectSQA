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

public class TypeCheck_isPropertyTest_6572758821062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303346;
     Object term303496;

    public TypeCheck_isPropertyTest_6572758821062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303346 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term303426 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term303346, term303346.getClass(), "compiler", term303426);
        term303496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term303496, term303496.getClass(), "parent", term303496);
        setIntField(term303496, term303496.getClass(), "type", 37);
        setField(term303496, term303496.getClass(), "first", term303566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term303496;
        try {
            callMethod(klass, "isPropertyTest", argTypes, term303346, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


