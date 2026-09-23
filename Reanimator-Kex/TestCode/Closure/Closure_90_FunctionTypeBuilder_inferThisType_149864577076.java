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

public class FunctionTypeBuilder_inferThisType_149864577076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43387;
     Object term43467;
     Object term43487;
     Object term43488;

    public FunctionTypeBuilder_inferThisType_149864577076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43387 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term43467 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term43487 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term43487, term43487.getClass(), "fnName", null);
        setField(term43487, term43487.getClass(), "compiler", null);
        setField(term43487, term43487.getClass(), "codingConvention", null);
        setField(term43487, term43487.getClass(), "typeRegistry", null);
        setField(term43487, term43487.getClass(), "errorRoot", null);
        setField(term43487, term43487.getClass(), "sourceName", null);
        setField(term43487, term43487.getClass(), "scope", null);
        setField(term43487, term43487.getClass(), "returnType", null);
        setBooleanField(term43487, term43487.getClass(), "returnTypeInferred", false);
        setField(term43487, term43487.getClass(), "implementedInterfaces", null);
        setField(term43487, term43487.getClass(), "baseType", null);
        setField(term43487, term43487.getClass(), "thisType", null);
        setBooleanField(term43487, term43487.getClass(), "isConstructor", false);
        setBooleanField(term43487, term43487.getClass(), "isInterface", false);
        setField(term43487, term43487.getClass(), "parametersNode", null);
        setField(term43487, term43487.getClass(), "sourceNode", null);
        setField(term43487, term43487.getClass(), "templateTypeName", null);
        term43488 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term43488, term43488.getClass(), "info", null);
        setField(term43488, term43488.getClass(), "documentation", null);
        setField(term43488, term43488.getClass(), "sourceName", null);
        setField(term43488, term43488.getClass(), "visibility", null);
        setIntField(term43488, term43488.getClass(), "bitset", 0);
        setField(term43488, term43488.getClass(), "type", null);
        setField(term43488, term43488.getClass(), "thisType", null);
        setBooleanField(term43488, term43488.getClass(), "includeDocumentation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term43467;
        args[1] = null;
        callMethod(klass, "inferThisType", argTypes, term43387, args);
        assertTrue(recursiveEquals(term43387, term43487));
        assertTrue(recursiveEquals(term43467, term43488));
    }

};


