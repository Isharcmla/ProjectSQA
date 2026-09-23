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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CheckSideEffects_process_152266774652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23628;
     Object term23778;

    public CheckSideEffects_process_152266774652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23628 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term23708 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term23628, term23628.getClass(), "compiler", term23708);
        term23778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23778, term23778.getClass(), "type", 85);
        setField(term23778, term23778.getClass(), "parent", null);
        setField(term23848, term23848.getClass(), "next", term23918);
        setIntField(term23848, term23848.getClass(), "type", 115);
        setField(term23988, term23988.getClass(), "next", null);
        setIntField(term23988, term23988.getClass(), "type", 0);
        setField(term23988, term23988.getClass(), "first", null);
        setField(term23848, term23848.getClass(), "first", term23988);
        setField(term23778, term23778.getClass(), "first", term23848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23778;
        try {
            callMethod(klass, "process", argTypes, term23628, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


