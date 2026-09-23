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

public class VarCheck_process_146632422081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56853;
     Object term57019;

    public VarCheck_process_146632422081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56853 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term56933 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term56853, term56853.getClass(), "sanityCheck", false);
        setField(term56853, term56853.getClass(), "compiler", term56933);
        term57019 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term57105 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term57191 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term57277 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term57363 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term57019, term57019.getClass(), "type", 0);
        setField(term57191, term57191.getClass(), "next", null);
        setIntField(term57191, term57191.getClass(), "type", 0);
        setField(term57191, term57191.getClass(), "first", term57277);
        setField(term57105, term57105.getClass(), "next", term57191);
        setIntField(term57105, term57105.getClass(), "type", 0);
        setField(term57363, term57363.getClass(), "next", null);
        setIntField(term57363, term57363.getClass(), "type", 0);
        setField(term57363, term57363.getClass(), "first", null);
        setField(term57105, term57105.getClass(), "first", term57363);
        setField(term57019, term57019.getClass(), "first", term57105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term57019;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term56853, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


