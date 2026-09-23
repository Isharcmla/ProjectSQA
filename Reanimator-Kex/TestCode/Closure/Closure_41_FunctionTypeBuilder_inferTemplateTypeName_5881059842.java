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

public class FunctionTypeBuilder_inferTemplateTypeName_5881059842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6903;
     Object term12972;

    public FunctionTypeBuilder_inferTemplateTypeName_5881059842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6903 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term6903, term6903.getClass(), "fnName", null);
        setField(term6903, term6903.getClass(), "compiler", null);
        setField(term6903, term6903.getClass(), "codingConvention", null);
        setField(term6903, term6903.getClass(), "typeRegistry", null);
        setField(term6903, term6903.getClass(), "errorRoot", null);
        setField(term6903, term6903.getClass(), "sourceName", null);
        setField(term6903, term6903.getClass(), "scope", null);
        setField(term6903, term6903.getClass(), "contents", null);
        setField(term6903, term6903.getClass(), "returnType", null);
        setBooleanField(term6903, term6903.getClass(), "returnTypeInferred", false);
        setField(term6903, term6903.getClass(), "implementedInterfaces", null);
        setField(term6903, term6903.getClass(), "extendedInterfaces", null);
        setField(term6903, term6903.getClass(), "baseType", null);
        setField(term6903, term6903.getClass(), "thisType", null);
        setBooleanField(term6903, term6903.getClass(), "isConstructor", false);
        setBooleanField(term6903, term6903.getClass(), "isInterface", false);
        setField(term6903, term6903.getClass(), "parametersNode", null);
        setField(term6903, term6903.getClass(), "templateTypeName", null);
        term12972 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term12972, term12972.getClass(), "fnName", null);
        setField(term12972, term12972.getClass(), "compiler", null);
        setField(term12972, term12972.getClass(), "codingConvention", null);
        setField(term12972, term12972.getClass(), "typeRegistry", null);
        setField(term12972, term12972.getClass(), "errorRoot", null);
        setField(term12972, term12972.getClass(), "sourceName", null);
        setField(term12972, term12972.getClass(), "scope", null);
        setField(term12972, term12972.getClass(), "contents", null);
        setField(term12972, term12972.getClass(), "returnType", null);
        setBooleanField(term12972, term12972.getClass(), "returnTypeInferred", false);
        setField(term12972, term12972.getClass(), "implementedInterfaces", null);
        setField(term12972, term12972.getClass(), "extendedInterfaces", null);
        setField(term12972, term12972.getClass(), "baseType", null);
        setField(term12972, term12972.getClass(), "thisType", null);
        setBooleanField(term12972, term12972.getClass(), "isConstructor", false);
        setBooleanField(term12972, term12972.getClass(), "isInterface", false);
        setField(term12972, term12972.getClass(), "parametersNode", null);
        setField(term12972, term12972.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inferTemplateTypeName", argTypes, term6903, args);
        assertTrue(recursiveEquals(term6903, term12972));
    }

};


