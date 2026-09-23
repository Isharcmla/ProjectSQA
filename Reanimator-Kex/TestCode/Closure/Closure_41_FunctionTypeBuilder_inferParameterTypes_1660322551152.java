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

public class FunctionTypeBuilder_inferParameterTypes_1660322551152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44674;
     Object term45036;

    public FunctionTypeBuilder_inferParameterTypes_1660322551152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44674 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term44744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term44744, term44744.getClass(), "first", term44814);
        setField(term44674, term44674.getClass(), "parametersNode", term44744);
        setField(term44674, term44674.getClass(), "typeRegistry", term44918);
        setField(term44674, term44674.getClass(), "templateTypeName", "");
        term45036 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term45036, term45036.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term45036;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term44674, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


