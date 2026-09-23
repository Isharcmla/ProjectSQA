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

public class Normalize_process_1693239666214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2665315;
     Object term2665481;

    public Normalize_process_1693239666214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2665315 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2665395 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2665315, term2665315.getClass(), "compiler", term2665395);
        setBooleanField(term2665315, term2665315.getClass(), "assertOnChange", false);
        term2665481 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2665567 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2665481, term2665481.getClass(), "type", 0);
        setField(term2665567, term2665567.getClass(), "next", null);
        setIntField(term2665567, term2665567.getClass(), "type", 113);
        setField(term2665567, term2665567.getClass(), "first", null);
        setField(term2665481, term2665481.getClass(), "first", term2665567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2665481;
        try {
            callMethod(klass, "process", argTypes, term2665315, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


