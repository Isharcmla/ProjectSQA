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

public class CheckSideEffects_process_152266774621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9092;
     Object term9162;

    public CheckSideEffects_process_152266774621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9092 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term9092, term9092.getClass(), "compiler", null);
        term9162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9162, term9162.getClass(), "type", 0);
        setField(term9162, term9162.getClass(), "parent", null);
        setField(term9232, term9232.getClass(), "next", term9302);
        setIntField(term9232, term9232.getClass(), "type", 85);
        setField(term9372, term9372.getClass(), "next", term9162);
        setIntField(term9372, term9372.getClass(), "type", 0);
        setField(term9372, term9372.getClass(), "first", null);
        setField(term9232, term9232.getClass(), "first", term9372);
        setField(term9232, term9232.getClass(), "parent", term9442);
        setField(term9162, term9162.getClass(), "first", term9232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9162;
        try {
            callMethod(klass, "process", argTypes, term9092, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


