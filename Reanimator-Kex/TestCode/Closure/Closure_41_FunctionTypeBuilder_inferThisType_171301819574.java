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

public class FunctionTypeBuilder_inferThisType_171301819574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23186;
     Object term23266;
     Object term24362;
     Object term24363;
     Object term24355;

    public FunctionTypeBuilder_inferThisType_171301819574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23186 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term23266 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term24362 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term24362, term24362.getClass(), "fnName", null);
        setField(term24362, term24362.getClass(), "compiler", null);
        setField(term24362, term24362.getClass(), "codingConvention", null);
        setField(term24362, term24362.getClass(), "typeRegistry", null);
        setField(term24362, term24362.getClass(), "errorRoot", null);
        setField(term24362, term24362.getClass(), "sourceName", null);
        setField(term24362, term24362.getClass(), "scope", null);
        setField(term24362, term24362.getClass(), "contents", null);
        setField(term24362, term24362.getClass(), "returnType", null);
        setBooleanField(term24362, term24362.getClass(), "returnTypeInferred", false);
        setField(term24362, term24362.getClass(), "implementedInterfaces", null);
        setField(term24362, term24362.getClass(), "extendedInterfaces", null);
        setField(term24362, term24362.getClass(), "baseType", null);
        setField(term24362, term24362.getClass(), "thisType", null);
        setBooleanField(term24362, term24362.getClass(), "isConstructor", false);
        setBooleanField(term24362, term24362.getClass(), "isInterface", false);
        setField(term24362, term24362.getClass(), "parametersNode", null);
        setField(term24362, term24362.getClass(), "templateTypeName", null);
        term24363 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term24363, term24363.getClass(), "info", null);
        setField(term24363, term24363.getClass(), "documentation", null);
        setField(term24363, term24363.getClass(), "associatedNode", null);
        setField(term24363, term24363.getClass(), "visibility", null);
        setIntField(term24363, term24363.getClass(), "bitset", 0);
        setField(term24363, term24363.getClass(), "type", null);
        setField(term24363, term24363.getClass(), "thisType", null);
        setBooleanField(term24363, term24363.getClass(), "includeDocumentation", false);
        term24355 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term24355, term24355.getClass(), "fnName", null);
        setField(term24355, term24355.getClass(), "compiler", null);
        setField(term24355, term24355.getClass(), "codingConvention", null);
        setField(term24355, term24355.getClass(), "typeRegistry", null);
        setField(term24355, term24355.getClass(), "errorRoot", null);
        setField(term24355, term24355.getClass(), "sourceName", null);
        setField(term24355, term24355.getClass(), "scope", null);
        setField(term24355, term24355.getClass(), "contents", null);
        setField(term24355, term24355.getClass(), "returnType", null);
        setBooleanField(term24355, term24355.getClass(), "returnTypeInferred", false);
        setField(term24355, term24355.getClass(), "implementedInterfaces", null);
        setField(term24355, term24355.getClass(), "extendedInterfaces", null);
        setField(term24355, term24355.getClass(), "baseType", null);
        setField(term24355, term24355.getClass(), "thisType", null);
        setBooleanField(term24355, term24355.getClass(), "isConstructor", false);
        setBooleanField(term24355, term24355.getClass(), "isInterface", false);
        setField(term24355, term24355.getClass(), "parametersNode", null);
        setField(term24355, term24355.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term23266;
        args[1] = null;
        Object retValue = callMethod(klass, "inferThisType", argTypes, term23186, args);
        assertTrue(recursiveEquals(term23186, term24362));
        assertTrue(recursiveEquals(term23266, term24363));
        assertTrue(recursiveEquals(retValue, term24355));
    }

};


