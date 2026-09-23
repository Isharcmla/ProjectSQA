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

public class RuntimeTypeCheck_process_167558251357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28447;
     Object term28597;

    public RuntimeTypeCheck_process_167558251357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28447 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        Object term28527 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term28447, term28447.getClass(), "compiler", term28527);
        term28597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28689 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28781 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term28597, term28597.getClass(), "type", 0);
        setField(term28781, term28781.getClass(), "next", null);
        setIntField(term28781, term28781.getClass(), "type", 0);
        setField(term28781, term28781.getClass(), "first", null);
        setField(term28689, term28689.getClass(), "next", term28781);
        setIntField(term28689, term28689.getClass(), "type", 0);
        setField(term28689, term28689.getClass(), "first", null);
        setField(term28597, term28597.getClass(), "first", term28689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28597;
        try {
            callMethod(klass, "process", argTypes, term28447, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


