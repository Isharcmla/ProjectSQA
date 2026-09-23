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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionTypeBuilder_inferParameterTypes_212883572153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45207;
     Object term45381;

    public FunctionTypeBuilder_inferParameterTypes_212883572153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45207 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term45311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term45207, term45207.getClass(), "parametersNode", null);
        setField(term45207, term45207.getClass(), "typeRegistry", term45311);
        term45381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term45381, term45381.getClass(), "first", term45451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term45381;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term45207, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


