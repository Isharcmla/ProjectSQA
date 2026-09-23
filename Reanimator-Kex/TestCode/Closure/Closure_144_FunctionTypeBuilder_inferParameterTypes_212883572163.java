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

public class FunctionTypeBuilder_inferParameterTypes_212883572163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77561;
     Object term77669;
     Object term77749;

    public FunctionTypeBuilder_inferParameterTypes_212883572163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77561 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term77561, term77561.getClass(), "typeRegistry", null);
        setField(term77561, term77561.getClass(), "templateTypeName", "");
        term77669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77669, term77669.getClass(), "first", null);
        term77749 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term77749, term77749.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term77669;
        args[1] = term77749;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term77561, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


