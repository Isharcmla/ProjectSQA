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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FunctionTypeBuilder_inferThisType_1498645770243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109299;
     Object term109379;
     Object term109449;

    public FunctionTypeBuilder_inferThisType_1498645770243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109299 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term109379 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term109379, term109379.getClass(), "thisType", null);
        setIntField(term109379, term109379.getClass(), "bitset", -1073741824);
        term109449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term109449, term109449.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term109379;
        args[1] = term109449;
        try {
            callMethod(klass, "inferThisType", argTypes, term109299, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


