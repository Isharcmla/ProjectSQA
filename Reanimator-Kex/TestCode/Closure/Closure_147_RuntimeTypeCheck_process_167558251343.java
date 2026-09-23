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

public class RuntimeTypeCheck_process_167558251343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20117;
     Object term20187;

    public RuntimeTypeCheck_process_167558251343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20117 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        setField(term20117, term20117.getClass(), "compiler", null);
        term20187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20187, term20187.getClass(), "type", 120);
        setField(term20187, term20187.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20187;
        try {
            callMethod(klass, "process", argTypes, term20117, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


