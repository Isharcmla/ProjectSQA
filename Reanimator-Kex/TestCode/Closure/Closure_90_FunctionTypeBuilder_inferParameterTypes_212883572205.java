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

public class FunctionTypeBuilder_inferParameterTypes_212883572205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81032;
     Object term81276;
     Object term81356;

    public FunctionTypeBuilder_inferParameterTypes_212883572205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81032 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term81102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term81102, term81102.getClass(), "first", null);
        setField(term81032, term81032.getClass(), "parametersNode", term81102);
        setField(term81032, term81032.getClass(), "typeRegistry", term81206);
        term81276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81276, term81276.getClass(), "first", term81276);
        term81356 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term81356, term81356.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term81276;
        args[1] = term81356;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term81032, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


