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

public class FunctionTypeBuilder_inferThisType_107389744137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3442;
     Object term12211;

    public FunctionTypeBuilder_inferThisType_107389744137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3442 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term3442, term3442.getClass(), "fnName", null);
        setField(term3442, term3442.getClass(), "compiler", null);
        setField(term3442, term3442.getClass(), "codingConvention", null);
        setField(term3442, term3442.getClass(), "typeRegistry", null);
        setField(term3442, term3442.getClass(), "errorRoot", null);
        setField(term3442, term3442.getClass(), "sourceName", null);
        setField(term3442, term3442.getClass(), "scope", null);
        setField(term3442, term3442.getClass(), "contents", null);
        setField(term3442, term3442.getClass(), "returnType", null);
        setBooleanField(term3442, term3442.getClass(), "returnTypeInferred", false);
        setField(term3442, term3442.getClass(), "implementedInterfaces", null);
        setField(term3442, term3442.getClass(), "extendedInterfaces", null);
        setField(term3442, term3442.getClass(), "baseType", null);
        setField(term3442, term3442.getClass(), "thisType", null);
        setBooleanField(term3442, term3442.getClass(), "isConstructor", false);
        setBooleanField(term3442, term3442.getClass(), "isInterface", false);
        setField(term3442, term3442.getClass(), "parametersNode", null);
        setField(term3442, term3442.getClass(), "templateTypeName", null);
        term12211 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term12211, term12211.getClass(), "fnName", null);
        setField(term12211, term12211.getClass(), "compiler", null);
        setField(term12211, term12211.getClass(), "codingConvention", null);
        setField(term12211, term12211.getClass(), "typeRegistry", null);
        setField(term12211, term12211.getClass(), "errorRoot", null);
        setField(term12211, term12211.getClass(), "sourceName", null);
        setField(term12211, term12211.getClass(), "scope", null);
        setField(term12211, term12211.getClass(), "contents", null);
        setField(term12211, term12211.getClass(), "returnType", null);
        setBooleanField(term12211, term12211.getClass(), "returnTypeInferred", false);
        setField(term12211, term12211.getClass(), "implementedInterfaces", null);
        setField(term12211, term12211.getClass(), "extendedInterfaces", null);
        setField(term12211, term12211.getClass(), "baseType", null);
        setField(term12211, term12211.getClass(), "thisType", null);
        setBooleanField(term12211, term12211.getClass(), "isConstructor", false);
        setBooleanField(term12211, term12211.getClass(), "isInterface", false);
        setField(term12211, term12211.getClass(), "parametersNode", null);
        setField(term12211, term12211.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inferThisType", argTypes, term3442, args);
        assertTrue(recursiveEquals(term3442, term12211));
    }

};


