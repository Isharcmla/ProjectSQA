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

public class FunctionTypeBuilder_inferParameterTypes_212883572194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77076;
     Object term77324;

    public FunctionTypeBuilder_inferParameterTypes_212883572194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77076 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term77146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77146, term77146.getClass(), "first", term77216);
        setField(term77076, term77076.getClass(), "parametersNode", term77146);
        setField(term77076, term77076.getClass(), "typeRegistry", null);
        setField(term77076, term77076.getClass(), "templateTypeName", "");
        term77324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77324, term77324.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term77324;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term77076, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


