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

public class FunctionTypeBuilder_inferThisType_149864577029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6103;
     Object term25546;

    public FunctionTypeBuilder_inferThisType_149864577029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6103 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term6103, term6103.getClass(), "fnName", null);
        setField(term6103, term6103.getClass(), "compiler", null);
        setField(term6103, term6103.getClass(), "codingConvention", null);
        setField(term6103, term6103.getClass(), "typeRegistry", null);
        setField(term6103, term6103.getClass(), "errorRoot", null);
        setField(term6103, term6103.getClass(), "sourceName", null);
        setField(term6103, term6103.getClass(), "scope", null);
        setField(term6103, term6103.getClass(), "returnType", null);
        setField(term6103, term6103.getClass(), "implementedInterfaces", null);
        setField(term6103, term6103.getClass(), "baseType", null);
        setField(term6103, term6103.getClass(), "thisType", null);
        setBooleanField(term6103, term6103.getClass(), "isConstructor", false);
        setBooleanField(term6103, term6103.getClass(), "isInterface", false);
        setField(term6103, term6103.getClass(), "parametersNode", null);
        setField(term6103, term6103.getClass(), "sourceNode", null);
        setField(term6103, term6103.getClass(), "templateTypeName", null);
        term25546 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term25546, term25546.getClass(), "fnName", null);
        setField(term25546, term25546.getClass(), "compiler", null);
        setField(term25546, term25546.getClass(), "codingConvention", null);
        setField(term25546, term25546.getClass(), "typeRegistry", null);
        setField(term25546, term25546.getClass(), "errorRoot", null);
        setField(term25546, term25546.getClass(), "sourceName", null);
        setField(term25546, term25546.getClass(), "scope", null);
        setField(term25546, term25546.getClass(), "returnType", null);
        setField(term25546, term25546.getClass(), "implementedInterfaces", null);
        setField(term25546, term25546.getClass(), "baseType", null);
        setField(term25546, term25546.getClass(), "thisType", null);
        setBooleanField(term25546, term25546.getClass(), "isConstructor", false);
        setBooleanField(term25546, term25546.getClass(), "isInterface", false);
        setField(term25546, term25546.getClass(), "parametersNode", null);
        setField(term25546, term25546.getClass(), "sourceNode", null);
        setField(term25546, term25546.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "inferThisType", argTypes, term6103, args);
        assertTrue(recursiveEquals(term6103, term25546));
    }

};


