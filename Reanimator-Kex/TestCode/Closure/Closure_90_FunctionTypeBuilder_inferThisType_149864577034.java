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

public class FunctionTypeBuilder_inferThisType_149864577034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6860;
     Object term26149;

    public FunctionTypeBuilder_inferThisType_149864577034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6860 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term6860, term6860.getClass(), "fnName", null);
        setField(term6860, term6860.getClass(), "compiler", null);
        setField(term6860, term6860.getClass(), "codingConvention", null);
        setField(term6860, term6860.getClass(), "typeRegistry", null);
        setField(term6860, term6860.getClass(), "errorRoot", null);
        setField(term6860, term6860.getClass(), "sourceName", null);
        setField(term6860, term6860.getClass(), "scope", null);
        setField(term6860, term6860.getClass(), "returnType", null);
        setBooleanField(term6860, term6860.getClass(), "returnTypeInferred", false);
        setField(term6860, term6860.getClass(), "implementedInterfaces", null);
        setField(term6860, term6860.getClass(), "baseType", null);
        setField(term6860, term6860.getClass(), "thisType", null);
        setBooleanField(term6860, term6860.getClass(), "isConstructor", false);
        setBooleanField(term6860, term6860.getClass(), "isInterface", false);
        setField(term6860, term6860.getClass(), "parametersNode", null);
        setField(term6860, term6860.getClass(), "sourceNode", null);
        setField(term6860, term6860.getClass(), "templateTypeName", null);
        term26149 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term26149, term26149.getClass(), "fnName", null);
        setField(term26149, term26149.getClass(), "compiler", null);
        setField(term26149, term26149.getClass(), "codingConvention", null);
        setField(term26149, term26149.getClass(), "typeRegistry", null);
        setField(term26149, term26149.getClass(), "errorRoot", null);
        setField(term26149, term26149.getClass(), "sourceName", null);
        setField(term26149, term26149.getClass(), "scope", null);
        setField(term26149, term26149.getClass(), "returnType", null);
        setBooleanField(term26149, term26149.getClass(), "returnTypeInferred", false);
        setField(term26149, term26149.getClass(), "implementedInterfaces", null);
        setField(term26149, term26149.getClass(), "baseType", null);
        setField(term26149, term26149.getClass(), "thisType", null);
        setBooleanField(term26149, term26149.getClass(), "isConstructor", false);
        setBooleanField(term26149, term26149.getClass(), "isInterface", false);
        setField(term26149, term26149.getClass(), "parametersNode", null);
        setField(term26149, term26149.getClass(), "sourceNode", null);
        setField(term26149, term26149.getClass(), "templateTypeName", null);
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
        callMethod(klass, "inferThisType", argTypes, term6860, args);
        assertTrue(recursiveEquals(term6860, term26149));
    }

};


