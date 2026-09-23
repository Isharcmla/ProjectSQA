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

public class CoalesceVariableNames_checkRanges_118307546557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20490;
     Object term20576;

    public CoalesceVariableNames_checkRanges_118307546557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20490 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term20490, term20490.getClass(), "compiler", null);
        term20576 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term20662 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term20576, term20576.getClass(), "type", 0);
        setField(term20576, term20576.getClass(), "first", term20662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20576;
        try {
            callMethod(klass, "checkRanges", argTypes, term20490, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


