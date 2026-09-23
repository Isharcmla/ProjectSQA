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

public class FunctionTypeBuilder_inferParameterTypes_1660322551301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115560;
     Object term115900;

    public FunctionTypeBuilder_inferParameterTypes_1660322551301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115560 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term115646 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term115716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term115646, term115646.getClass(), "first", term115716);
        setField(term115560, term115560.getClass(), "parametersNode", term115646);
        setField(term115560, term115560.getClass(), "typeRegistry", term115820);
        setField(term115560, term115560.getClass(), "templateTypeName", null);
        term115900 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term115900, term115900.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term115900;
        callMethod(klass, "inferParameterTypes", argTypes, term115560, args);
    }

};


