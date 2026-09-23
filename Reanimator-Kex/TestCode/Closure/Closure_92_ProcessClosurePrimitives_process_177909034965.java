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

public class ProcessClosurePrimitives_process_177909034965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29759;
     Object term29909;

    public ProcessClosurePrimitives_process_177909034965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29759 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term29839 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term29759, term29759.getClass(), "compiler", term29839);
        term29909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29909, term29909.getClass(), "type", 33);
        setField(term29979, term29979.getClass(), "next", null);
        setIntField(term29979, term29979.getClass(), "type", 0);
        setField(term29979, term29979.getClass(), "first", null);
        setField(term29909, term29909.getClass(), "first", term29979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29909;
        try {
            callMethod(klass, "process", argTypes, term29759, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


