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

public class ProcessClosurePrimitives_process_177909034960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27928;
     Object term28078;

    public ProcessClosurePrimitives_process_177909034960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27928 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term28008 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27928, term27928.getClass(), "compiler", term28008);
        term28078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28078, term28078.getClass(), "type", 0);
        setField(term28148, term28148.getClass(), "next", term28218);
        setIntField(term28148, term28148.getClass(), "type", 37);
        setField(term28148, term28148.getClass(), "first", null);
        setField(term28078, term28078.getClass(), "first", term28148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28078;
        try {
            callMethod(klass, "process", argTypes, term27928, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


