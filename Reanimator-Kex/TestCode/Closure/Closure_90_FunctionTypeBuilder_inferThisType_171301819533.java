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

public class FunctionTypeBuilder_inferThisType_171301819533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5688;
     Object term26141;

    public FunctionTypeBuilder_inferThisType_171301819533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5688 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term5688, term5688.getClass(), "fnName", null);
        setField(term5688, term5688.getClass(), "compiler", null);
        setField(term5688, term5688.getClass(), "codingConvention", null);
        setField(term5688, term5688.getClass(), "typeRegistry", null);
        setField(term5688, term5688.getClass(), "errorRoot", null);
        setField(term5688, term5688.getClass(), "sourceName", null);
        setField(term5688, term5688.getClass(), "scope", null);
        setField(term5688, term5688.getClass(), "returnType", null);
        setBooleanField(term5688, term5688.getClass(), "returnTypeInferred", false);
        setField(term5688, term5688.getClass(), "implementedInterfaces", null);
        setField(term5688, term5688.getClass(), "baseType", null);
        setField(term5688, term5688.getClass(), "thisType", null);
        setBooleanField(term5688, term5688.getClass(), "isConstructor", false);
        setBooleanField(term5688, term5688.getClass(), "isInterface", false);
        setField(term5688, term5688.getClass(), "parametersNode", null);
        setField(term5688, term5688.getClass(), "sourceNode", null);
        setField(term5688, term5688.getClass(), "templateTypeName", null);
        term26141 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term26141, term26141.getClass(), "fnName", null);
        setField(term26141, term26141.getClass(), "compiler", null);
        setField(term26141, term26141.getClass(), "codingConvention", null);
        setField(term26141, term26141.getClass(), "typeRegistry", null);
        setField(term26141, term26141.getClass(), "errorRoot", null);
        setField(term26141, term26141.getClass(), "sourceName", null);
        setField(term26141, term26141.getClass(), "scope", null);
        setField(term26141, term26141.getClass(), "returnType", null);
        setBooleanField(term26141, term26141.getClass(), "returnTypeInferred", false);
        setField(term26141, term26141.getClass(), "implementedInterfaces", null);
        setField(term26141, term26141.getClass(), "baseType", null);
        setField(term26141, term26141.getClass(), "thisType", null);
        setBooleanField(term26141, term26141.getClass(), "isConstructor", false);
        setBooleanField(term26141, term26141.getClass(), "isInterface", false);
        setField(term26141, term26141.getClass(), "parametersNode", null);
        setField(term26141, term26141.getClass(), "sourceNode", null);
        setField(term26141, term26141.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "inferThisType", argTypes, term5688, args);
        assertTrue(recursiveEquals(term5688, term26141));
    }

};


