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

public class FunctionTypeBuilder_inferInheritance_96561335535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2128;
     Object term12194;

    public FunctionTypeBuilder_inferInheritance_96561335535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2128 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term2128, term2128.getClass(), "fnName", null);
        setField(term2128, term2128.getClass(), "compiler", null);
        setField(term2128, term2128.getClass(), "codingConvention", null);
        setField(term2128, term2128.getClass(), "typeRegistry", null);
        setField(term2128, term2128.getClass(), "errorRoot", null);
        setField(term2128, term2128.getClass(), "sourceName", null);
        setField(term2128, term2128.getClass(), "scope", null);
        setField(term2128, term2128.getClass(), "contents", null);
        setField(term2128, term2128.getClass(), "returnType", null);
        setBooleanField(term2128, term2128.getClass(), "returnTypeInferred", false);
        setField(term2128, term2128.getClass(), "implementedInterfaces", null);
        setField(term2128, term2128.getClass(), "extendedInterfaces", null);
        setField(term2128, term2128.getClass(), "baseType", null);
        setField(term2128, term2128.getClass(), "thisType", null);
        setBooleanField(term2128, term2128.getClass(), "isConstructor", false);
        setBooleanField(term2128, term2128.getClass(), "isInterface", false);
        setField(term2128, term2128.getClass(), "parametersNode", null);
        setField(term2128, term2128.getClass(), "templateTypeName", null);
        term12194 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term12194, term12194.getClass(), "fnName", null);
        setField(term12194, term12194.getClass(), "compiler", null);
        setField(term12194, term12194.getClass(), "codingConvention", null);
        setField(term12194, term12194.getClass(), "typeRegistry", null);
        setField(term12194, term12194.getClass(), "errorRoot", null);
        setField(term12194, term12194.getClass(), "sourceName", null);
        setField(term12194, term12194.getClass(), "scope", null);
        setField(term12194, term12194.getClass(), "contents", null);
        setField(term12194, term12194.getClass(), "returnType", null);
        setBooleanField(term12194, term12194.getClass(), "returnTypeInferred", false);
        setField(term12194, term12194.getClass(), "implementedInterfaces", null);
        setField(term12194, term12194.getClass(), "extendedInterfaces", null);
        setField(term12194, term12194.getClass(), "baseType", null);
        setField(term12194, term12194.getClass(), "thisType", null);
        setBooleanField(term12194, term12194.getClass(), "isConstructor", false);
        setBooleanField(term12194, term12194.getClass(), "isInterface", false);
        setField(term12194, term12194.getClass(), "parametersNode", null);
        setField(term12194, term12194.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inferInheritance", argTypes, term2128, args);
        assertTrue(recursiveEquals(term2128, term12194));
    }

};


