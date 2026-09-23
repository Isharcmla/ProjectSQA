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

public class Normalize_process_1693239666150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2232976;
     Object term2233142;

    public Normalize_process_1693239666150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2232976 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2233056 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2232976, term2232976.getClass(), "compiler", term2233056);
        setBooleanField(term2232976, term2232976.getClass(), "assertOnChange", false);
        term2233142 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2233234 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2233142, term2233142.getClass(), "type", 126);
        setIntField(term2233234, term2233234.getClass(), "type", 119);
        setField(term2233142, term2233142.getClass(), "last", term2233234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2233142;
        try {
            callMethod(klass, "process", argTypes, term2232976, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


