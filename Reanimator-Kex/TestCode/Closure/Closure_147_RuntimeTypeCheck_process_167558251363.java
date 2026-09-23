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

public class RuntimeTypeCheck_process_167558251363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31197;
     Object term31347;

    public RuntimeTypeCheck_process_167558251363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31197 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        Object term31277 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31197, term31197.getClass(), "compiler", term31277);
        term31347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31347, term31347.getClass(), "type", 0);
        setField(term31417, term31417.getClass(), "next", term31487);
        setIntField(term31417, term31417.getClass(), "type", 105);
        setField(term31347, term31347.getClass(), "first", term31417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31347;
        try {
            callMethod(klass, "process", argTypes, term31197, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


