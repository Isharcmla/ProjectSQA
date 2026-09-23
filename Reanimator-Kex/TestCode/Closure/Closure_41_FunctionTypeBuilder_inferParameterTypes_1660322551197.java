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

public class FunctionTypeBuilder_inferParameterTypes_1660322551197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61700;
     Object term61968;

    public FunctionTypeBuilder_inferParameterTypes_1660322551197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61700 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term61770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61888 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term61770, term61770.getClass(), "first", null);
        setField(term61700, term61700.getClass(), "parametersNode", term61770);
        setField(term61700, term61700.getClass(), "typeRegistry", null);
        setField(term61700, term61700.getClass(), "templateTypeName", "");
        setField(term61700, term61700.getClass(), "fnName", null);
        setField(term61700, term61700.getClass(), "compiler", term61888);
        setField(term61700, term61700.getClass(), "sourceName", "");
        setField(term61700, term61700.getClass(), "errorRoot", null);
        term61968 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term61968, term61968.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term61968;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term61700, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


