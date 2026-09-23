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

public class FunctionTypeBuilder_buildAndRegister_1388474616246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81374;

    public FunctionTypeBuilder_buildAndRegister_1388474616246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81374 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term81486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term81556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term81802 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        setField(term81374, term81374.getClass(), "returnType", term81486);
        setField(term81374, term81374.getClass(), "parametersNode", term81556);
        setBooleanField(term81374, term81374.getClass(), "isConstructor", true);
        setField(term81374, term81374.getClass(), "typeRegistry", term81660);
        setField(term81374, term81374.getClass(), "fnName", null);
        setField(term81802, term81802.getClass(), "n", null);
        setField(term81374, term81374.getClass(), "contents", term81802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildAndRegister", argTypes, term81374, args);
    }

};


