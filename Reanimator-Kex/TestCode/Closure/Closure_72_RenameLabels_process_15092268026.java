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

public class RenameLabels_process_15092268026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9269;
     Object term9419;

    public RenameLabels_process_15092268026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9269 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        Object term9349 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term9269, term9269.getClass(), "compiler", term9349);
        term9419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9419, term9419.getClass(), "type", 0);
        setField(term9559, term9559.getClass(), "next", term9629);
        setIntField(term9559, term9559.getClass(), "type", 126);
        setField(term9489, term9489.getClass(), "next", term9559);
        setIntField(term9489, term9489.getClass(), "type", 117);
        setField(term9489, term9489.getClass(), "first", null);
        setField(term9419, term9419.getClass(), "first", term9489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9419;
        try {
            callMethod(klass, "process", argTypes, term9269, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


