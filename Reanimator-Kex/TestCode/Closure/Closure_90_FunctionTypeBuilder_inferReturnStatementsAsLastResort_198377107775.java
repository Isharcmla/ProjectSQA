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

public class FunctionTypeBuilder_inferReturnStatementsAsLastResort_198377107775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43276;
     Object term43473;
     Object term43469;

    public FunctionTypeBuilder_inferReturnStatementsAsLastResort_198377107775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43276 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term43473 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term43473, term43473.getClass(), "fnName", null);
        setField(term43473, term43473.getClass(), "compiler", null);
        setField(term43473, term43473.getClass(), "codingConvention", null);
        setField(term43473, term43473.getClass(), "typeRegistry", null);
        setField(term43473, term43473.getClass(), "errorRoot", null);
        setField(term43473, term43473.getClass(), "sourceName", null);
        setField(term43473, term43473.getClass(), "scope", null);
        setField(term43473, term43473.getClass(), "returnType", null);
        setBooleanField(term43473, term43473.getClass(), "returnTypeInferred", false);
        setField(term43473, term43473.getClass(), "implementedInterfaces", null);
        setField(term43473, term43473.getClass(), "baseType", null);
        setField(term43473, term43473.getClass(), "thisType", null);
        setBooleanField(term43473, term43473.getClass(), "isConstructor", false);
        setBooleanField(term43473, term43473.getClass(), "isInterface", false);
        setField(term43473, term43473.getClass(), "parametersNode", null);
        setField(term43473, term43473.getClass(), "sourceNode", null);
        setField(term43473, term43473.getClass(), "templateTypeName", null);
        term43469 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term43469, term43469.getClass(), "fnName", null);
        setField(term43469, term43469.getClass(), "compiler", null);
        setField(term43469, term43469.getClass(), "codingConvention", null);
        setField(term43469, term43469.getClass(), "typeRegistry", null);
        setField(term43469, term43469.getClass(), "errorRoot", null);
        setField(term43469, term43469.getClass(), "sourceName", null);
        setField(term43469, term43469.getClass(), "scope", null);
        setField(term43469, term43469.getClass(), "returnType", null);
        setBooleanField(term43469, term43469.getClass(), "returnTypeInferred", false);
        setField(term43469, term43469.getClass(), "implementedInterfaces", null);
        setField(term43469, term43469.getClass(), "baseType", null);
        setField(term43469, term43469.getClass(), "thisType", null);
        setBooleanField(term43469, term43469.getClass(), "isConstructor", false);
        setBooleanField(term43469, term43469.getClass(), "isInterface", false);
        setField(term43469, term43469.getClass(), "parametersNode", null);
        setField(term43469, term43469.getClass(), "sourceNode", null);
        setField(term43469, term43469.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "inferReturnStatementsAsLastResort", argTypes, term43276, args);
        assertTrue(recursiveEquals(term43276, term43473));
        assertTrue(recursiveEquals(retValue, term43469));
    }

};


