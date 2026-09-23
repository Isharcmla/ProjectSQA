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

public class RuntimeTypeCheck_process_167558251329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12372;
     Object term12522;

    public RuntimeTypeCheck_process_167558251329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12372 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        Object term12452 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term12372, term12372.getClass(), "compiler", term12452);
        term12522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12522, term12522.getClass(), "type", 0);
        setField(term12592, term12592.getClass(), "next", term12662);
        setIntField(term12592, term12592.getClass(), "type", 120);
        setField(term12592, term12592.getClass(), "first", null);
        setField(term12522, term12522.getClass(), "first", term12592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12522;
        try {
            callMethod(klass, "process", argTypes, term12372, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


