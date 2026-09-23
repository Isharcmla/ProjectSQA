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

public class InlineFunctions_isCandidateFunction_112806305043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5064;
     Object term5182;

    public InlineFunctions_isCandidateFunction_112806305043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5064 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term5182 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionVar"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Object[] args = new Object[1];
        args[0] = term5182;
        try {
            callMethod(klass, "isCandidateFunction", argTypes, term5064, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


