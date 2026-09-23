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

public class FunctionTypeBuilder_inferParameterTypes_1660322551300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115016;
     Object term115324;

    public FunctionTypeBuilder_inferParameterTypes_1660322551300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115016 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term115102 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term115206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term115102, term115102.getClass(), "first", null);
        setField(term115016, term115016.getClass(), "parametersNode", term115102);
        setField(term115016, term115016.getClass(), "typeRegistry", term115206);
        setField(term115016, term115016.getClass(), "templateTypeName", "");
        term115324 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term115324, term115324.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term115324;
        callMethod(klass, "inferParameterTypes", argTypes, term115016, args);
    }

};


