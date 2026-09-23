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

public class Normalize_process_1693239666186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2648590;
     Object term2648740;

    public Normalize_process_1693239666186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2648590 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2648670 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2648590, term2648590.getClass(), "compiler", term2648670);
        setBooleanField(term2648590, term2648590.getClass(), "assertOnChange", false);
        term2648740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2648740, term2648740.getClass(), "type", 126);
        setField(term2648740, term2648740.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2648740;
        try {
            callMethod(klass, "process", argTypes, term2648590, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


