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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Normalize_process_169323966673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1600945;
     Object term1601117;

    public Normalize_process_169323966673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1600945 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term1601025 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term1600945, term1600945.getClass(), "compiler", term1601025);
        setBooleanField(term1600945, term1600945.getClass(), "assertOnChange", false);
        term1601117 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1601203 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term1601117, term1601117.getClass(), "type", 0);
        setField(term1601117, term1601117.getClass(), "first", term1601203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1601117;
        callMethod(klass, "process", argTypes, term1600945, args);
    }

};


