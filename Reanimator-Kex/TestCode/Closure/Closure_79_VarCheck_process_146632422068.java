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

public class VarCheck_process_146632422068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23494;
     Object term23644;

    public VarCheck_process_146632422068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23494 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term23574 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term23494, term23494.getClass(), "sanityCheck", false);
        setField(term23494, term23494.getClass(), "compiler", term23574);
        term23644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23730 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term23816 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term23644, term23644.getClass(), "type", 0);
        setField(term23730, term23730.getClass(), "next", null);
        setIntField(term23730, term23730.getClass(), "type", 0);
        setField(term23816, term23816.getClass(), "next", null);
        setIntField(term23816, term23816.getClass(), "type", 0);
        setField(term23816, term23816.getClass(), "first", null);
        setField(term23730, term23730.getClass(), "first", term23816);
        setField(term23644, term23644.getClass(), "first", term23730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term23644;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term23494, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


