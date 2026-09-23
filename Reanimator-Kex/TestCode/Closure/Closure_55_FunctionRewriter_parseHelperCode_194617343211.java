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

public class FunctionRewriter_parseHelperCode_194617343211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6020;
     Object term6170;

    public FunctionRewriter_parseHelperCode_194617343211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6020 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionRewriter"));
        Object term6100 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term6020, term6020.getClass(), "compiler", term6100);
        term6170 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionRewriter$ReturnConstantReducer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Object[] args = new Object[1];
        args[0] = term6170;
        try {
            callMethod(klass, "parseHelperCode", argTypes, term6020, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


