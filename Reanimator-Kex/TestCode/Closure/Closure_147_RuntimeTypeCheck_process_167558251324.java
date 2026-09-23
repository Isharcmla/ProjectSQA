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

public class RuntimeTypeCheck_process_167558251324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10615;
     Object term10685;

    public RuntimeTypeCheck_process_167558251324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10615 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        setField(term10615, term10615.getClass(), "compiler", null);
        term10685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10685, term10685.getClass(), "type", 0);
        setField(term10685, term10685.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10685;
        try {
            callMethod(klass, "process", argTypes, term10615, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


