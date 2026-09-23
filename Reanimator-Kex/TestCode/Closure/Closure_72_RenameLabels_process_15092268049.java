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

public class RenameLabels_process_15092268049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23209;
     Object term23359;

    public RenameLabels_process_15092268049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23209 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        Object term23289 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term23209, term23209.getClass(), "compiler", term23289);
        term23359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23359, term23359.getClass(), "type", 0);
        setField(term23499, term23499.getClass(), "next", null);
        setIntField(term23499, term23499.getClass(), "type", 105);
        setField(term23499, term23499.getClass(), "first", null);
        setField(term23429, term23429.getClass(), "next", term23499);
        setIntField(term23429, term23429.getClass(), "type", 117);
        setField(term23429, term23429.getClass(), "first", null);
        setField(term23359, term23359.getClass(), "first", term23429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23359;
        try {
            callMethod(klass, "process", argTypes, term23209, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


