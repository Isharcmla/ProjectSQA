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

public class FunctionTypeBuilder_buildAndRegister_1388474616245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80815;

    public FunctionTypeBuilder_buildAndRegister_1388474616245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80815 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term80921 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term80991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term81245 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$UnknownFunctionContents"));
        setField(term80815, term80815.getClass(), "returnType", term80921);
        setField(term80815, term80815.getClass(), "parametersNode", term80991);
        setBooleanField(term80815, term80815.getClass(), "isConstructor", true);
        setField(term80815, term80815.getClass(), "typeRegistry", term81095);
        setField(term80815, term80815.getClass(), "fnName", null);
        setField(term80815, term80815.getClass(), "contents", term81245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildAndRegister", argTypes, term80815, args);
    }

};


