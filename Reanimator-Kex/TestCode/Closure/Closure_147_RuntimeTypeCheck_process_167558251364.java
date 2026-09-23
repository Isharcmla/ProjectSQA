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

public class RuntimeTypeCheck_process_167558251364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31922;
     Object term32072;

    public RuntimeTypeCheck_process_167558251364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31922 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        Object term32002 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31922, term31922.getClass(), "compiler", term32002);
        term32072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32298 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term32072, term32072.getClass(), "type", 0);
        setField(term32298, term32298.getClass(), "next", null);
        setIntField(term32298, term32298.getClass(), "type", 0);
        setField(term32298, term32298.getClass(), "first", null);
        setField(term32212, term32212.getClass(), "next", term32298);
        setIntField(term32212, term32212.getClass(), "type", 0);
        setField(term32212, term32212.getClass(), "first", null);
        setField(term32142, term32142.getClass(), "next", term32212);
        setIntField(term32142, term32142.getClass(), "type", 0);
        setField(term32142, term32142.getClass(), "first", null);
        setField(term32072, term32072.getClass(), "first", term32142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term32072;
        try {
            callMethod(klass, "process", argTypes, term31922, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


