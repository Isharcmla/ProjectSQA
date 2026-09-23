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

public class VarCheck_process_146632422048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13190;
     Object term13340;

    public VarCheck_process_146632422048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13190 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term13270 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term13190, term13190.getClass(), "sanityCheck", false);
        setField(term13190, term13190.getClass(), "compiler", term13270);
        term13340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13426 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term13512 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term13598 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term13340, term13340.getClass(), "type", 0);
        setField(term13426, term13426.getClass(), "next", term13512);
        setIntField(term13426, term13426.getClass(), "type", 0);
        setField(term13426, term13426.getClass(), "first", term13598);
        setField(term13340, term13340.getClass(), "first", term13426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term13340;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term13190, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


