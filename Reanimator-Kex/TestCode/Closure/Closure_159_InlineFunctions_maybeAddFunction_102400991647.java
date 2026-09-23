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

public class InlineFunctions_maybeAddFunction_102400991647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6353;
     Object term6471;

    public InlineFunctions_maybeAddFunction_102400991647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6353 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term6471 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionVar"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[2];
        args[0] = term6471;
        args[1] = null;
        try {
            callMethod(klass, "maybeAddFunction", argTypes, term6353, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


