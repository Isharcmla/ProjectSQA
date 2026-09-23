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

public class RuntimeTypeCheck_process_167558251351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24922;
     Object term24992;

    public RuntimeTypeCheck_process_167558251351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24922 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        setField(term24922, term24922.getClass(), "compiler", null);
        term24992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25154 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term24992, term24992.getClass(), "type", 0);
        setField(term25154, term25154.getClass(), "next", term25246);
        setIntField(term25154, term25154.getClass(), "type", 0);
        setField(term25154, term25154.getClass(), "first", null);
        setField(term25062, term25062.getClass(), "next", term25154);
        setIntField(term25062, term25062.getClass(), "type", 0);
        setField(term25062, term25062.getClass(), "first", null);
        setField(term24992, term24992.getClass(), "first", term25062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term24992;
        try {
            callMethod(klass, "process", argTypes, term24922, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


