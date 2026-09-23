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

public class Normalize_process_169323966665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1202844;
     Object term1202994;

    public Normalize_process_169323966665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1202844 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term1202924 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term1202844, term1202844.getClass(), "compiler", term1202924);
        setBooleanField(term1202844, term1202844.getClass(), "assertOnChange", false);
        term1202994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1202994, term1202994.getClass(), "type", 0);
        setField(term1203064, term1203064.getClass(), "next", term1203134);
        setIntField(term1203064, term1203064.getClass(), "type", 126);
        setField(term1202994, term1202994.getClass(), "first", term1203064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1202994;
        try {
            callMethod(klass, "process", argTypes, term1202844, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


