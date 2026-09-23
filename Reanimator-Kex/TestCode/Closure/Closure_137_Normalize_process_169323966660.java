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

public class Normalize_process_169323966660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1199051;
     Object term1199201;

    public Normalize_process_169323966660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1199051 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term1199131 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term1199051, term1199051.getClass(), "compiler", term1199131);
        setBooleanField(term1199051, term1199051.getClass(), "assertOnChange", false);
        term1199201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1199271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1199341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1199201, term1199201.getClass(), "type", 126);
        setIntField(term1199271, term1199271.getClass(), "type", 0);
        setField(term1199271, term1199271.getClass(), "propListHead", null);
        setIntField(term1199271, term1199271.getClass(), "sourcePosition", 0);
        setField(term1199271, term1199271.getClass(), "next", term1199341);
        setField(term1199201, term1199201.getClass(), "last", term1199271);
        setField(term1199201, term1199201.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1199201;
        try {
            callMethod(klass, "process", argTypes, term1199051, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


