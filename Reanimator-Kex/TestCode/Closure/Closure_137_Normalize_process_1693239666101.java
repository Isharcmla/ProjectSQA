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

public class Normalize_process_1693239666101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2007296;
     Object term2007382;

    public Normalize_process_1693239666101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2007296 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2007296, term2007296.getClass(), "compiler", null);
        setBooleanField(term2007296, term2007296.getClass(), "assertOnChange", false);
        term2007382 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2007468 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2007382, term2007382.getClass(), "type", 126);
        setIntField(term2007468, term2007468.getClass(), "type", 119);
        setField(term2007382, term2007382.getClass(), "last", term2007468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2007382;
        try {
            callMethod(klass, "process", argTypes, term2007296, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


