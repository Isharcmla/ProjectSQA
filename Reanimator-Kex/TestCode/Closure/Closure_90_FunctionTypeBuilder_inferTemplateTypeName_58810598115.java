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

public class FunctionTypeBuilder_inferTemplateTypeName_58810598115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52706;
     Object term52825;

    public FunctionTypeBuilder_inferTemplateTypeName_58810598115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52706 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term52825 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term52825, term52825.getClass(), "fnName", null);
        setField(term52825, term52825.getClass(), "compiler", null);
        setField(term52825, term52825.getClass(), "codingConvention", null);
        setField(term52825, term52825.getClass(), "typeRegistry", null);
        setField(term52825, term52825.getClass(), "errorRoot", null);
        setField(term52825, term52825.getClass(), "sourceName", null);
        setField(term52825, term52825.getClass(), "scope", null);
        setField(term52825, term52825.getClass(), "returnType", null);
        setBooleanField(term52825, term52825.getClass(), "returnTypeInferred", false);
        setField(term52825, term52825.getClass(), "implementedInterfaces", null);
        setField(term52825, term52825.getClass(), "baseType", null);
        setField(term52825, term52825.getClass(), "thisType", null);
        setBooleanField(term52825, term52825.getClass(), "isConstructor", false);
        setBooleanField(term52825, term52825.getClass(), "isInterface", false);
        setField(term52825, term52825.getClass(), "parametersNode", null);
        setField(term52825, term52825.getClass(), "sourceNode", null);
        setField(term52825, term52825.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inferTemplateTypeName", argTypes, term52706, args);
        assertTrue(recursiveEquals(term52706, term52825));
    }

};


