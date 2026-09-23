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

public class ProcessClosurePrimitives_process_177909034983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36437;
     Object term36587;

    public ProcessClosurePrimitives_process_177909034983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36437 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term36517 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term36437, term36437.getClass(), "compiler", term36517);
        term36587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36587, term36587.getClass(), "type", 37);
        setField(term36657, term36657.getClass(), "next", null);
        setIntField(term36657, term36657.getClass(), "type", 0);
        setField(term36657, term36657.getClass(), "first", null);
        setField(term36587, term36587.getClass(), "first", term36657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term36587;
        try {
            callMethod(klass, "process", argTypes, term36437, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


