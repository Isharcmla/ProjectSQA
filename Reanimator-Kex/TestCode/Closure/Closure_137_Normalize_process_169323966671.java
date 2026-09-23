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

public class Normalize_process_169323966671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1402736;
     Object term1402886;

    public Normalize_process_169323966671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1402736 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term1402816 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term1402736, term1402736.getClass(), "compiler", term1402816);
        setBooleanField(term1402736, term1402736.getClass(), "assertOnChange", false);
        term1402886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1402972 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term1402886, term1402886.getClass(), "type", 113);
        setField(term1402972, term1402972.getClass(), "next", null);
        setIntField(term1402972, term1402972.getClass(), "type", 0);
        setField(term1402972, term1402972.getClass(), "first", null);
        setField(term1402886, term1402886.getClass(), "first", term1402972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1402886;
        try {
            callMethod(klass, "process", argTypes, term1402736, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


