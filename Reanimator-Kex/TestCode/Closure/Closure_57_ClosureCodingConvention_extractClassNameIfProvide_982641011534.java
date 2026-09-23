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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168542;
     Object term168634;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168542 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term168634 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term168720 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term168634, term168634.getClass(), "type", 130);
        setIntField(term168720, term168720.getClass(), "type", 37);
        setField(term168634, term168634.getClass(), "first", term168720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term168634;
        try {
            callMethod(klass, "extractClassNameIfProvide", argTypes, term168542, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


