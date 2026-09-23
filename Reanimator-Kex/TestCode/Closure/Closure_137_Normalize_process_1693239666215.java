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

public class Normalize_process_1693239666215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2667509;
     Object term2667579;

    public Normalize_process_1693239666215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2667509 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2667509, term2667509.getClass(), "compiler", null);
        setBooleanField(term2667509, term2667509.getClass(), "assertOnChange", false);
        term2667579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2667665 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2667735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2667579, term2667579.getClass(), "type", 0);
        setField(term2667665, term2667665.getClass(), "next", term2667735);
        setIntField(term2667665, term2667665.getClass(), "type", 113);
        setField(term2667665, term2667665.getClass(), "first", null);
        setField(term2667579, term2667579.getClass(), "first", term2667665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2667579;
        callMethod(klass, "process", argTypes, term2667509, args);
    }

};


