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
import java.lang.Object;

public class FunctionTypeBuilder_inferParameterTypes_212883572267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101358;
     Object term101532;
     Object term101682;

    public FunctionTypeBuilder_inferParameterTypes_212883572267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101358 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term101462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term101358, term101358.getClass(), "parametersNode", null);
        setField(term101358, term101358.getClass(), "typeRegistry", term101462);
        term101532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term101532, term101532.getClass(), "first", term101602);
        term101682 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term101682, term101682.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term101532;
        args[1] = term101682;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term101358, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


