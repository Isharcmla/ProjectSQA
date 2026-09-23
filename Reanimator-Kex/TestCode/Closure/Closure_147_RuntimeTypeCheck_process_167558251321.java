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

public class RuntimeTypeCheck_process_167558251321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9289;
     Object term9439;

    public RuntimeTypeCheck_process_167558251321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9289 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        Object term9369 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term9289, term9289.getClass(), "compiler", term9369);
        term9439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9439, term9439.getClass(), "type", 0);
        setField(term9509, term9509.getClass(), "next", term9579);
        setIntField(term9509, term9509.getClass(), "type", 120);
        setField(term9509, term9509.getClass(), "first", null);
        setField(term9439, term9439.getClass(), "first", term9509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9439;
        try {
            callMethod(klass, "process", argTypes, term9289, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


