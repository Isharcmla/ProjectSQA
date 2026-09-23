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

public class FunctionTypeBuilder_inferReturnType_2137249201162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47931;
     Object term48049;
     Object term48628;
     Object term48631;
     Object term48622;

    public FunctionTypeBuilder_inferReturnType_2137249201162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47931 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term47931, term47931.getClass(), "templateTypeName", "");
        term48049 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term48049, term48049.getClass(), "bitset", -1610612736);
        term48628 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term48628, term48628.getClass(), "fnName", null);
        setField(term48628, term48628.getClass(), "compiler", null);
        setField(term48628, term48628.getClass(), "codingConvention", null);
        setField(term48628, term48628.getClass(), "typeRegistry", null);
        setField(term48628, term48628.getClass(), "errorRoot", null);
        setField(term48628, term48628.getClass(), "sourceName", null);
        setField(term48628, term48628.getClass(), "scope", null);
        setField(term48628, term48628.getClass(), "contents", null);
        setField(term48628, term48628.getClass(), "returnType", null);
        setBooleanField(term48628, term48628.getClass(), "returnTypeInferred", false);
        setField(term48628, term48628.getClass(), "implementedInterfaces", null);
        setField(term48628, term48628.getClass(), "extendedInterfaces", null);
        setField(term48628, term48628.getClass(), "baseType", null);
        setField(term48628, term48628.getClass(), "thisType", null);
        setBooleanField(term48628, term48628.getClass(), "isConstructor", false);
        setBooleanField(term48628, term48628.getClass(), "isInterface", false);
        setField(term48628, term48628.getClass(), "parametersNode", null);
        setField(term48628, term48628.getClass(), "templateTypeName", "");
        term48631 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term48631, term48631.getClass(), "info", null);
        setField(term48631, term48631.getClass(), "documentation", null);
        setField(term48631, term48631.getClass(), "associatedNode", null);
        setField(term48631, term48631.getClass(), "visibility", null);
        setIntField(term48631, term48631.getClass(), "bitset", -1610612736);
        setField(term48631, term48631.getClass(), "type", null);
        setField(term48631, term48631.getClass(), "thisType", null);
        setBooleanField(term48631, term48631.getClass(), "includeDocumentation", false);
        term48622 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term48622, term48622.getClass(), "fnName", null);
        setField(term48622, term48622.getClass(), "compiler", null);
        setField(term48622, term48622.getClass(), "codingConvention", null);
        setField(term48622, term48622.getClass(), "typeRegistry", null);
        setField(term48622, term48622.getClass(), "errorRoot", null);
        setField(term48622, term48622.getClass(), "sourceName", null);
        setField(term48622, term48622.getClass(), "scope", null);
        setField(term48622, term48622.getClass(), "contents", null);
        setField(term48622, term48622.getClass(), "returnType", null);
        setBooleanField(term48622, term48622.getClass(), "returnTypeInferred", false);
        setField(term48622, term48622.getClass(), "implementedInterfaces", null);
        setField(term48622, term48622.getClass(), "extendedInterfaces", null);
        setField(term48622, term48622.getClass(), "baseType", null);
        setField(term48622, term48622.getClass(), "thisType", null);
        setBooleanField(term48622, term48622.getClass(), "isConstructor", false);
        setBooleanField(term48622, term48622.getClass(), "isInterface", false);
        setField(term48622, term48622.getClass(), "parametersNode", null);
        setField(term48622, term48622.getClass(), "templateTypeName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term48049;
        Object retValue = callMethod(klass, "inferReturnType", argTypes, term47931, args);
        assertTrue(recursiveEquals(term47931, term48628));
        assertTrue(recursiveEquals(term48049, term48631));
        assertTrue(recursiveEquals(retValue, term48622));
    }

};


