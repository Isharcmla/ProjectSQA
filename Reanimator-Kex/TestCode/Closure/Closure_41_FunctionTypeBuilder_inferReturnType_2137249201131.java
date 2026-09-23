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

public class FunctionTypeBuilder_inferReturnType_2137249201131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39587;
     Object term39667;
     Object term39682;
     Object term39683;
     Object term39678;

    public FunctionTypeBuilder_inferReturnType_2137249201131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39587 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term39667 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term39682 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term39682, term39682.getClass(), "fnName", null);
        setField(term39682, term39682.getClass(), "compiler", null);
        setField(term39682, term39682.getClass(), "codingConvention", null);
        setField(term39682, term39682.getClass(), "typeRegistry", null);
        setField(term39682, term39682.getClass(), "errorRoot", null);
        setField(term39682, term39682.getClass(), "sourceName", null);
        setField(term39682, term39682.getClass(), "scope", null);
        setField(term39682, term39682.getClass(), "contents", null);
        setField(term39682, term39682.getClass(), "returnType", null);
        setBooleanField(term39682, term39682.getClass(), "returnTypeInferred", false);
        setField(term39682, term39682.getClass(), "implementedInterfaces", null);
        setField(term39682, term39682.getClass(), "extendedInterfaces", null);
        setField(term39682, term39682.getClass(), "baseType", null);
        setField(term39682, term39682.getClass(), "thisType", null);
        setBooleanField(term39682, term39682.getClass(), "isConstructor", false);
        setBooleanField(term39682, term39682.getClass(), "isInterface", false);
        setField(term39682, term39682.getClass(), "parametersNode", null);
        setField(term39682, term39682.getClass(), "templateTypeName", null);
        term39683 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term39683, term39683.getClass(), "info", null);
        setField(term39683, term39683.getClass(), "documentation", null);
        setField(term39683, term39683.getClass(), "associatedNode", null);
        setField(term39683, term39683.getClass(), "visibility", null);
        setIntField(term39683, term39683.getClass(), "bitset", 0);
        setField(term39683, term39683.getClass(), "type", null);
        setField(term39683, term39683.getClass(), "thisType", null);
        setBooleanField(term39683, term39683.getClass(), "includeDocumentation", false);
        term39678 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term39678, term39678.getClass(), "fnName", null);
        setField(term39678, term39678.getClass(), "compiler", null);
        setField(term39678, term39678.getClass(), "codingConvention", null);
        setField(term39678, term39678.getClass(), "typeRegistry", null);
        setField(term39678, term39678.getClass(), "errorRoot", null);
        setField(term39678, term39678.getClass(), "sourceName", null);
        setField(term39678, term39678.getClass(), "scope", null);
        setField(term39678, term39678.getClass(), "contents", null);
        setField(term39678, term39678.getClass(), "returnType", null);
        setBooleanField(term39678, term39678.getClass(), "returnTypeInferred", false);
        setField(term39678, term39678.getClass(), "implementedInterfaces", null);
        setField(term39678, term39678.getClass(), "extendedInterfaces", null);
        setField(term39678, term39678.getClass(), "baseType", null);
        setField(term39678, term39678.getClass(), "thisType", null);
        setBooleanField(term39678, term39678.getClass(), "isConstructor", false);
        setBooleanField(term39678, term39678.getClass(), "isInterface", false);
        setField(term39678, term39678.getClass(), "parametersNode", null);
        setField(term39678, term39678.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term39667;
        Object retValue = callMethod(klass, "inferReturnType", argTypes, term39587, args);
        assertTrue(recursiveEquals(term39587, term39682));
        assertTrue(recursiveEquals(term39667, term39683));
        assertTrue(recursiveEquals(retValue, term39678));
    }

};


