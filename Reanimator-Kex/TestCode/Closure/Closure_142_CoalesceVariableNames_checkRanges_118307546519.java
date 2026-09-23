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
import java.util.ArrayList;

public class CoalesceVariableNames_checkRanges_118307546519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3227;
     Object term3359;
     Object term3429;

    public CoalesceVariableNames_checkRanges_118307546519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3227 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term3307 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term3227, term3227.getClass(), "compiler", term3307);
        term3359 = new ArrayList();
        term3429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3515 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3429, term3429.getClass(), "type", 0);
        setField(term3429, term3429.getClass(), "first", term3515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term3359;
        args[1] = term3429;
        try {
            callMethod(klass, "checkRanges", argTypes, term3227, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


