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

public class Normalize_process_169323966645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1191145;
     Object term1191295;

    public Normalize_process_169323966645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1191145 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term1191225 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term1191145, term1191145.getClass(), "compiler", term1191225);
        setBooleanField(term1191145, term1191145.getClass(), "assertOnChange", false);
        term1191295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1191295, term1191295.getClass(), "type", 126);
        setField(term1191295, term1191295.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1191295;
        try {
            callMethod(klass, "process", argTypes, term1191145, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


