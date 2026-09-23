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
import java.util.ArrayList;

public class FunctionTypeBuilder_inferInheritance_965613355228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88058;
     Object term88138;
     Object term88985;
     Object term88988;
     Object term88977;

    public FunctionTypeBuilder_inferInheritance_965613355228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88058 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term88138 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term88138, term88138.getClass(), "bitset", 2);
        ArrayList term88986 = new ArrayList();
        term88985 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term88985, term88985.getClass(), "fnName", null);
        setField(term88985, term88985.getClass(), "compiler", null);
        setField(term88985, term88985.getClass(), "codingConvention", null);
        setField(term88985, term88985.getClass(), "typeRegistry", null);
        setField(term88985, term88985.getClass(), "errorRoot", null);
        setField(term88985, term88985.getClass(), "sourceName", null);
        setField(term88985, term88985.getClass(), "scope", null);
        setField(term88985, term88985.getClass(), "returnType", null);
        setBooleanField(term88985, term88985.getClass(), "returnTypeInferred", false);
        setField(term88985, term88985.getClass(), "implementedInterfaces", term88986);
        setField(term88985, term88985.getClass(), "baseType", null);
        setField(term88985, term88985.getClass(), "thisType", null);
        setBooleanField(term88985, term88985.getClass(), "isConstructor", true);
        setBooleanField(term88985, term88985.getClass(), "isInterface", false);
        setField(term88985, term88985.getClass(), "parametersNode", null);
        setField(term88985, term88985.getClass(), "sourceNode", null);
        setField(term88985, term88985.getClass(), "templateTypeName", null);
        term88988 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term88988, term88988.getClass(), "info", null);
        setField(term88988, term88988.getClass(), "documentation", null);
        setField(term88988, term88988.getClass(), "sourceName", null);
        setField(term88988, term88988.getClass(), "visibility", null);
        setIntField(term88988, term88988.getClass(), "bitset", 2);
        setField(term88988, term88988.getClass(), "type", null);
        setField(term88988, term88988.getClass(), "thisType", null);
        setBooleanField(term88988, term88988.getClass(), "includeDocumentation", false);
        ArrayList term88979 = new ArrayList();
        term88977 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term88977, term88977.getClass(), "fnName", null);
        setField(term88977, term88977.getClass(), "compiler", null);
        setField(term88977, term88977.getClass(), "codingConvention", null);
        setField(term88977, term88977.getClass(), "typeRegistry", null);
        setField(term88977, term88977.getClass(), "errorRoot", null);
        setField(term88977, term88977.getClass(), "sourceName", null);
        setField(term88977, term88977.getClass(), "scope", null);
        setField(term88977, term88977.getClass(), "returnType", null);
        setBooleanField(term88977, term88977.getClass(), "returnTypeInferred", false);
        setField(term88977, term88977.getClass(), "implementedInterfaces", term88979);
        setField(term88977, term88977.getClass(), "baseType", null);
        setField(term88977, term88977.getClass(), "thisType", null);
        setBooleanField(term88977, term88977.getClass(), "isConstructor", true);
        setBooleanField(term88977, term88977.getClass(), "isInterface", false);
        setField(term88977, term88977.getClass(), "parametersNode", null);
        setField(term88977, term88977.getClass(), "sourceNode", null);
        setField(term88977, term88977.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term88138;
        Object retValue = callMethod(klass, "inferInheritance", argTypes, term88058, args);
        assertTrue(recursiveEquals(term88058, term88985));
        assertTrue(recursiveEquals(term88138, term88988));
        assertTrue(recursiveEquals(retValue, term88977));
    }

};


