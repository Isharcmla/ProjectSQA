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

public class RuntimeTypeCheck_process_167558251347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21910;
     Object term22060;

    public RuntimeTypeCheck_process_167558251347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21910 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        Object term21990 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term21910, term21910.getClass(), "compiler", term21990);
        term22060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22060, term22060.getClass(), "type", 0);
        setField(term22130, term22130.getClass(), "next", null);
        setIntField(term22130, term22130.getClass(), "type", 120);
        setField(term22200, term22200.getClass(), "next", null);
        setField(term22130, term22130.getClass(), "first", term22200);
        setField(term22060, term22060.getClass(), "first", term22130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22060;
        try {
            callMethod(klass, "process", argTypes, term21910, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


