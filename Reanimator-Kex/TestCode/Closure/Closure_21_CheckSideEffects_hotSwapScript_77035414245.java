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

public class CheckSideEffects_hotSwapScript_77035414245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17289;
     Object term17439;

    public CheckSideEffects_hotSwapScript_77035414245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17289 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term17369 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17289, term17289.getClass(), "compiler", term17369);
        term17439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17439, term17439.getClass(), "type", 0);
        setField(term17439, term17439.getClass(), "parent", null);
        setField(term17509, term17509.getClass(), "next", term17579);
        setIntField(term17509, term17509.getClass(), "type", 124);
        setField(term17509, term17509.getClass(), "first", null);
        setField(term17439, term17439.getClass(), "first", term17509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term17439;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term17289, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


