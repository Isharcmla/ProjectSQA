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

public class VarCheck_process_146632422077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53696;
     Object term53862;

    public VarCheck_process_146632422077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53696 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term53776 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term53696, term53696.getClass(), "sanityCheck", false);
        setField(term53696, term53696.getClass(), "compiler", term53776);
        term53862 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term53948 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54034 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53862, term53862.getClass(), "type", 0);
        setField(term53948, term53948.getClass(), "next", term54034);
        setIntField(term53948, term53948.getClass(), "type", 0);
        setField(term53948, term53948.getClass(), "first", term54104);
        setField(term53862, term53862.getClass(), "first", term53948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term53862;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term53696, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


