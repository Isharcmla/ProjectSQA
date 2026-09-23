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

public class FunctionTypeBuilder_inferParameterTypes_212883572258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99052;
     Object term99332;

    public FunctionTypeBuilder_inferParameterTypes_212883572258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99052 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term99138 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term99208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term99138, term99138.getClass(), "first", term99208);
        setField(term99052, term99052.getClass(), "parametersNode", term99138);
        setField(term99052, term99052.getClass(), "typeRegistry", null);
        setField(term99052, term99052.getClass(), "templateTypeName", "");
        term99332 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term99332, term99332.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term99332;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term99052, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


