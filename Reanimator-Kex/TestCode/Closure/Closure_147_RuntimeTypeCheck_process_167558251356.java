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

public class RuntimeTypeCheck_process_167558251356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27165;
     Object term27235;

    public RuntimeTypeCheck_process_167558251356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27165 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        setField(term27165, term27165.getClass(), "compiler", null);
        term27235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27235, term27235.getClass(), "type", 0);
        setField(term27445, term27445.getClass(), "next", null);
        setIntField(term27445, term27445.getClass(), "type", 0);
        setField(term27445, term27445.getClass(), "first", null);
        setField(term27375, term27375.getClass(), "next", term27445);
        setIntField(term27375, term27375.getClass(), "type", 4);
        setField(term27375, term27375.getClass(), "first", null);
        setField(term27305, term27305.getClass(), "next", term27375);
        setIntField(term27305, term27305.getClass(), "type", 0);
        setField(term27305, term27305.getClass(), "first", null);
        setField(term27235, term27235.getClass(), "first", term27305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term27235;
        try {
            callMethod(klass, "process", argTypes, term27165, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


