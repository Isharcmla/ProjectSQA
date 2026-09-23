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

public class FunctionTypeBuilder_inferInheritance_96561335532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4522;
     Object term26134;

    public FunctionTypeBuilder_inferInheritance_96561335532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4522 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term4522, term4522.getClass(), "fnName", null);
        setField(term4522, term4522.getClass(), "compiler", null);
        setField(term4522, term4522.getClass(), "codingConvention", null);
        setField(term4522, term4522.getClass(), "typeRegistry", null);
        setField(term4522, term4522.getClass(), "errorRoot", null);
        setField(term4522, term4522.getClass(), "sourceName", null);
        setField(term4522, term4522.getClass(), "scope", null);
        setField(term4522, term4522.getClass(), "returnType", null);
        setBooleanField(term4522, term4522.getClass(), "returnTypeInferred", false);
        setField(term4522, term4522.getClass(), "implementedInterfaces", null);
        setField(term4522, term4522.getClass(), "baseType", null);
        setField(term4522, term4522.getClass(), "thisType", null);
        setBooleanField(term4522, term4522.getClass(), "isConstructor", false);
        setBooleanField(term4522, term4522.getClass(), "isInterface", false);
        setField(term4522, term4522.getClass(), "parametersNode", null);
        setField(term4522, term4522.getClass(), "sourceNode", null);
        setField(term4522, term4522.getClass(), "templateTypeName", null);
        term26134 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term26134, term26134.getClass(), "fnName", null);
        setField(term26134, term26134.getClass(), "compiler", null);
        setField(term26134, term26134.getClass(), "codingConvention", null);
        setField(term26134, term26134.getClass(), "typeRegistry", null);
        setField(term26134, term26134.getClass(), "errorRoot", null);
        setField(term26134, term26134.getClass(), "sourceName", null);
        setField(term26134, term26134.getClass(), "scope", null);
        setField(term26134, term26134.getClass(), "returnType", null);
        setBooleanField(term26134, term26134.getClass(), "returnTypeInferred", false);
        setField(term26134, term26134.getClass(), "implementedInterfaces", null);
        setField(term26134, term26134.getClass(), "baseType", null);
        setField(term26134, term26134.getClass(), "thisType", null);
        setBooleanField(term26134, term26134.getClass(), "isConstructor", false);
        setBooleanField(term26134, term26134.getClass(), "isInterface", false);
        setField(term26134, term26134.getClass(), "parametersNode", null);
        setField(term26134, term26134.getClass(), "sourceNode", null);
        setField(term26134, term26134.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inferInheritance", argTypes, term4522, args);
        assertTrue(recursiveEquals(term4522, term26134));
    }

};


