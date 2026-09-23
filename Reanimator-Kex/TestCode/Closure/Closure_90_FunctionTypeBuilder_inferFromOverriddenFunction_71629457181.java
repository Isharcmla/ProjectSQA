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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class FunctionTypeBuilder_inferFromOverriddenFunction_71629457181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43804;
     Object term44502;
     Object term44498;

    public FunctionTypeBuilder_inferFromOverriddenFunction_71629457181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43804 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term44502 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term44502, term44502.getClass(), "fnName", null);
        setField(term44502, term44502.getClass(), "compiler", null);
        setField(term44502, term44502.getClass(), "codingConvention", null);
        setField(term44502, term44502.getClass(), "typeRegistry", null);
        setField(term44502, term44502.getClass(), "errorRoot", null);
        setField(term44502, term44502.getClass(), "sourceName", null);
        setField(term44502, term44502.getClass(), "scope", null);
        setField(term44502, term44502.getClass(), "returnType", null);
        setBooleanField(term44502, term44502.getClass(), "returnTypeInferred", false);
        setField(term44502, term44502.getClass(), "implementedInterfaces", null);
        setField(term44502, term44502.getClass(), "baseType", null);
        setField(term44502, term44502.getClass(), "thisType", null);
        setBooleanField(term44502, term44502.getClass(), "isConstructor", false);
        setBooleanField(term44502, term44502.getClass(), "isInterface", false);
        setField(term44502, term44502.getClass(), "parametersNode", null);
        setField(term44502, term44502.getClass(), "sourceNode", null);
        setField(term44502, term44502.getClass(), "templateTypeName", null);
        term44498 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term44498, term44498.getClass(), "fnName", null);
        setField(term44498, term44498.getClass(), "compiler", null);
        setField(term44498, term44498.getClass(), "codingConvention", null);
        setField(term44498, term44498.getClass(), "typeRegistry", null);
        setField(term44498, term44498.getClass(), "errorRoot", null);
        setField(term44498, term44498.getClass(), "sourceName", null);
        setField(term44498, term44498.getClass(), "scope", null);
        setField(term44498, term44498.getClass(), "returnType", null);
        setBooleanField(term44498, term44498.getClass(), "returnTypeInferred", false);
        setField(term44498, term44498.getClass(), "implementedInterfaces", null);
        setField(term44498, term44498.getClass(), "baseType", null);
        setField(term44498, term44498.getClass(), "thisType", null);
        setBooleanField(term44498, term44498.getClass(), "isConstructor", false);
        setBooleanField(term44498, term44498.getClass(), "isInterface", false);
        setField(term44498, term44498.getClass(), "parametersNode", null);
        setField(term44498, term44498.getClass(), "sourceNode", null);
        setField(term44498, term44498.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term43804, args);
        assertTrue(recursiveEquals(term43804, term44502));
        assertTrue(recursiveEquals(retValue, term44498));
    }

};


