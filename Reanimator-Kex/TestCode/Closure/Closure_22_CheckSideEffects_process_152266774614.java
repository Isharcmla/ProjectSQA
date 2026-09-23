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

public class CheckSideEffects_process_152266774614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6850;
     Object term6920;

    public CheckSideEffects_process_152266774614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6850 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term6850, term6850.getClass(), "compiler", null);
        term6920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6920, term6920.getClass(), "type", 0);
        setField(term6920, term6920.getClass(), "parent", null);
        setField(term6990, term6990.getClass(), "next", null);
        setIntField(term6990, term6990.getClass(), "type", 85);
        setField(term7060, term7060.getClass(), "next", null);
        setIntField(term7060, term7060.getClass(), "type", 0);
        setField(term7060, term7060.getClass(), "first", null);
        setField(term6990, term6990.getClass(), "first", term7060);
        setField(term6920, term6920.getClass(), "first", term6990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6920;
        try {
            callMethod(klass, "process", argTypes, term6850, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


