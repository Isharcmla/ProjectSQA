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

public class FunctionTypeBuilder_inferParameterTypes_212883572113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34302;
     Object term34410;
     Object term34490;

    public FunctionTypeBuilder_inferParameterTypes_212883572113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34302 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term34302, term34302.getClass(), "parametersNode", null);
        setField(term34302, term34302.getClass(), "typeRegistry", null);
        setField(term34302, term34302.getClass(), "templateTypeName", "");
        term34410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term34410, term34410.getClass(), "first", null);
        term34490 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term34490, term34490.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term34410;
        args[1] = term34490;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term34302, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


