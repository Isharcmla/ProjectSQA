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

public class FunctionTypeBuilder_inferReturnType_213724920153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38608;
     Object term38813;
     Object term38809;

    public FunctionTypeBuilder_inferReturnType_213724920153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38608 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term38813 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term38813, term38813.getClass(), "fnName", null);
        setField(term38813, term38813.getClass(), "compiler", null);
        setField(term38813, term38813.getClass(), "codingConvention", null);
        setField(term38813, term38813.getClass(), "typeRegistry", null);
        setField(term38813, term38813.getClass(), "errorRoot", null);
        setField(term38813, term38813.getClass(), "sourceName", null);
        setField(term38813, term38813.getClass(), "scope", null);
        setField(term38813, term38813.getClass(), "returnType", null);
        setBooleanField(term38813, term38813.getClass(), "returnTypeInferred", false);
        setField(term38813, term38813.getClass(), "implementedInterfaces", null);
        setField(term38813, term38813.getClass(), "baseType", null);
        setField(term38813, term38813.getClass(), "thisType", null);
        setBooleanField(term38813, term38813.getClass(), "isConstructor", false);
        setBooleanField(term38813, term38813.getClass(), "isInterface", false);
        setField(term38813, term38813.getClass(), "parametersNode", null);
        setField(term38813, term38813.getClass(), "sourceNode", null);
        setField(term38813, term38813.getClass(), "templateTypeName", null);
        term38809 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term38809, term38809.getClass(), "fnName", null);
        setField(term38809, term38809.getClass(), "compiler", null);
        setField(term38809, term38809.getClass(), "codingConvention", null);
        setField(term38809, term38809.getClass(), "typeRegistry", null);
        setField(term38809, term38809.getClass(), "errorRoot", null);
        setField(term38809, term38809.getClass(), "sourceName", null);
        setField(term38809, term38809.getClass(), "scope", null);
        setField(term38809, term38809.getClass(), "returnType", null);
        setBooleanField(term38809, term38809.getClass(), "returnTypeInferred", false);
        setField(term38809, term38809.getClass(), "implementedInterfaces", null);
        setField(term38809, term38809.getClass(), "baseType", null);
        setField(term38809, term38809.getClass(), "thisType", null);
        setBooleanField(term38809, term38809.getClass(), "isConstructor", false);
        setBooleanField(term38809, term38809.getClass(), "isInterface", false);
        setField(term38809, term38809.getClass(), "parametersNode", null);
        setField(term38809, term38809.getClass(), "sourceNode", null);
        setField(term38809, term38809.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "inferReturnType", argTypes, term38608, args);
        assertTrue(recursiveEquals(term38608, term38813));
        assertTrue(recursiveEquals(retValue, term38809));
    }

};


