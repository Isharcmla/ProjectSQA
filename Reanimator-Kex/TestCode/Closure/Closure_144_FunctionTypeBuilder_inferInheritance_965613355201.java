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
import java.lang.Object;

public class FunctionTypeBuilder_inferInheritance_965613355201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91949;
     Object term92029;
     Object term92180;
     Object term92181;
     Object term92177;

    public FunctionTypeBuilder_inferInheritance_965613355201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91949 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setBooleanField(term91949, term91949.getClass(), "isConstructor", false);
        setBooleanField(term91949, term91949.getClass(), "isInterface", false);
        term92029 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term92153 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term92029, term92029.getClass(), "bitset", 0);
        setField(term92029, term92029.getClass(), "info", term92153);
        term92180 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term92180, term92180.getClass(), "fnName", null);
        setField(term92180, term92180.getClass(), "compiler", null);
        setField(term92180, term92180.getClass(), "codingConvention", null);
        setField(term92180, term92180.getClass(), "typeRegistry", null);
        setField(term92180, term92180.getClass(), "errorRoot", null);
        setField(term92180, term92180.getClass(), "sourceName", null);
        setField(term92180, term92180.getClass(), "scope", null);
        setField(term92180, term92180.getClass(), "returnType", null);
        setField(term92180, term92180.getClass(), "implementedInterfaces", null);
        setField(term92180, term92180.getClass(), "baseType", null);
        setField(term92180, term92180.getClass(), "thisType", null);
        setBooleanField(term92180, term92180.getClass(), "isConstructor", false);
        setBooleanField(term92180, term92180.getClass(), "isInterface", false);
        setField(term92180, term92180.getClass(), "parametersNode", null);
        setField(term92180, term92180.getClass(), "sourceNode", null);
        setField(term92180, term92180.getClass(), "templateTypeName", null);
        term92181 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term92182 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term92182, term92182.getClass(), "baseType", null);
        setField(term92182, term92182.getClass(), "implementedInterfaces", null);
        setField(term92182, term92182.getClass(), "parameters", null);
        setField(term92182, term92182.getClass(), "thrownTypes", null);
        setField(term92182, term92182.getClass(), "templateTypeName", null);
        setField(term92182, term92182.getClass(), "description", null);
        setField(term92182, term92182.getClass(), "deprecated", null);
        setField(term92182, term92182.getClass(), "license", null);
        setField(term92182, term92182.getClass(), "suppressions", null);
        setField(term92181, term92181.getClass(), "info", term92182);
        setField(term92181, term92181.getClass(), "documentation", null);
        setField(term92181, term92181.getClass(), "sourceName", null);
        setField(term92181, term92181.getClass(), "visibility", null);
        setIntField(term92181, term92181.getClass(), "bitset", 0);
        setField(term92181, term92181.getClass(), "type", null);
        setField(term92181, term92181.getClass(), "thisType", null);
        setBooleanField(term92181, term92181.getClass(), "includeDocumentation", false);
        term92177 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term92177, term92177.getClass(), "fnName", null);
        setField(term92177, term92177.getClass(), "compiler", null);
        setField(term92177, term92177.getClass(), "codingConvention", null);
        setField(term92177, term92177.getClass(), "typeRegistry", null);
        setField(term92177, term92177.getClass(), "errorRoot", null);
        setField(term92177, term92177.getClass(), "sourceName", null);
        setField(term92177, term92177.getClass(), "scope", null);
        setField(term92177, term92177.getClass(), "returnType", null);
        setField(term92177, term92177.getClass(), "implementedInterfaces", null);
        setField(term92177, term92177.getClass(), "baseType", null);
        setField(term92177, term92177.getClass(), "thisType", null);
        setBooleanField(term92177, term92177.getClass(), "isConstructor", false);
        setBooleanField(term92177, term92177.getClass(), "isInterface", false);
        setField(term92177, term92177.getClass(), "parametersNode", null);
        setField(term92177, term92177.getClass(), "sourceNode", null);
        setField(term92177, term92177.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term92029;
        Object retValue = callMethod(klass, "inferInheritance", argTypes, term91949, args);
        assertTrue(recursiveEquals(term91949, term92180));
        assertTrue(recursiveEquals(term92029, term92181));
        assertTrue(recursiveEquals(retValue, term92177));
    }

};


