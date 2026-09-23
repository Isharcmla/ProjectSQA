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

public class Normalize_process_169323966641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1188726;
     Object term1188876;

    public Normalize_process_169323966641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1188726 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term1188806 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term1188726, term1188726.getClass(), "compiler", term1188806);
        setBooleanField(term1188726, term1188726.getClass(), "assertOnChange", false);
        term1188876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1188946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1188876, term1188876.getClass(), "type", 0);
        setField(term1188946, term1188946.getClass(), "next", null);
        setIntField(term1188946, term1188946.getClass(), "type", 105);
        setField(term1188876, term1188876.getClass(), "first", term1188946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1188876;
        try {
            callMethod(klass, "process", argTypes, term1188726, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


