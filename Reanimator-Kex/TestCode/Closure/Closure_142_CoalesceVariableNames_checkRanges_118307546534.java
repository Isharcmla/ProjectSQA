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

public class CoalesceVariableNames_checkRanges_118307546534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9385;
     Object term9455;

    public CoalesceVariableNames_checkRanges_118307546534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9385 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term9385, term9385.getClass(), "compiler", null);
        term9455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9455, term9455.getClass(), "type", 0);
        setField(term9525, term9525.getClass(), "next", term9595);
        setIntField(term9525, term9525.getClass(), "type", 132);
        setField(term9455, term9455.getClass(), "first", term9525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9455;
        try {
            callMethod(klass, "checkRanges", argTypes, term9385, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


