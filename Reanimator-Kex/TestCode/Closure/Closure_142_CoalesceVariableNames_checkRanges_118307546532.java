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

public class CoalesceVariableNames_checkRanges_118307546532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8415;
     Object term8501;

    public CoalesceVariableNames_checkRanges_118307546532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8415 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term8415, term8415.getClass(), "compiler", null);
        term8501 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term8587 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term8501, term8501.getClass(), "type", 0);
        setField(term8587, term8587.getClass(), "next", null);
        setIntField(term8587, term8587.getClass(), "type", 132);
        setField(term8501, term8501.getClass(), "first", term8587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8501;
        try {
            callMethod(klass, "checkRanges", argTypes, term8415, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


