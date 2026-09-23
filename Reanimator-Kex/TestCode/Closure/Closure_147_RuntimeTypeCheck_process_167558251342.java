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

public class RuntimeTypeCheck_process_167558251342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19637;
     Object term19723;

    public RuntimeTypeCheck_process_167558251342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19637 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        setField(term19637, term19637.getClass(), "compiler", null);
        term19723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term19793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19879 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term19723, term19723.getClass(), "type", 0);
        setField(term19879, term19879.getClass(), "next", null);
        setIntField(term19879, term19879.getClass(), "type", 0);
        setField(term19879, term19879.getClass(), "first", null);
        setField(term19793, term19793.getClass(), "next", term19879);
        setIntField(term19793, term19793.getClass(), "type", 0);
        setField(term19793, term19793.getClass(), "first", null);
        setField(term19723, term19723.getClass(), "first", term19793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term19723;
        try {
            callMethod(klass, "process", argTypes, term19637, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


