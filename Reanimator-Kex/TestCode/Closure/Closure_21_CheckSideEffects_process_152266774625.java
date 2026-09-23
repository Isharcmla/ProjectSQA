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

public class CheckSideEffects_process_152266774625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10263;
     Object term10333;

    public CheckSideEffects_process_152266774625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10263 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term10263, term10263.getClass(), "compiler", null);
        term10333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10333, term10333.getClass(), "type", 0);
        setField(term10333, term10333.getClass(), "parent", null);
        setField(term10403, term10403.getClass(), "next", null);
        setIntField(term10403, term10403.getClass(), "type", 0);
        setField(term10403, term10403.getClass(), "first", null);
        setField(term10333, term10333.getClass(), "first", term10403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10333;
        try {
            callMethod(klass, "process", argTypes, term10263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


