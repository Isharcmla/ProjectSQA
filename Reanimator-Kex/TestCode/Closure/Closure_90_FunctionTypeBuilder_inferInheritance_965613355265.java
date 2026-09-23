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

public class FunctionTypeBuilder_inferInheritance_965613355265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101047;
     Object term101127;
     Object term101169;
     Object term101172;
     Object term101161;

    public FunctionTypeBuilder_inferInheritance_965613355265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101047 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setBooleanField(term101047, term101047.getClass(), "isConstructor", false);
        term101127 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term101127, term101127.getClass(), "bitset", 512);
        ArrayList term101170 = new ArrayList();
        term101169 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term101169, term101169.getClass(), "fnName", null);
        setField(term101169, term101169.getClass(), "compiler", null);
        setField(term101169, term101169.getClass(), "codingConvention", null);
        setField(term101169, term101169.getClass(), "typeRegistry", null);
        setField(term101169, term101169.getClass(), "errorRoot", null);
        setField(term101169, term101169.getClass(), "sourceName", null);
        setField(term101169, term101169.getClass(), "scope", null);
        setField(term101169, term101169.getClass(), "returnType", null);
        setBooleanField(term101169, term101169.getClass(), "returnTypeInferred", false);
        setField(term101169, term101169.getClass(), "implementedInterfaces", term101170);
        setField(term101169, term101169.getClass(), "baseType", null);
        setField(term101169, term101169.getClass(), "thisType", null);
        setBooleanField(term101169, term101169.getClass(), "isConstructor", false);
        setBooleanField(term101169, term101169.getClass(), "isInterface", true);
        setField(term101169, term101169.getClass(), "parametersNode", null);
        setField(term101169, term101169.getClass(), "sourceNode", null);
        setField(term101169, term101169.getClass(), "templateTypeName", null);
        term101172 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term101172, term101172.getClass(), "info", null);
        setField(term101172, term101172.getClass(), "documentation", null);
        setField(term101172, term101172.getClass(), "sourceName", null);
        setField(term101172, term101172.getClass(), "visibility", null);
        setIntField(term101172, term101172.getClass(), "bitset", 512);
        setField(term101172, term101172.getClass(), "type", null);
        setField(term101172, term101172.getClass(), "thisType", null);
        setBooleanField(term101172, term101172.getClass(), "includeDocumentation", false);
        ArrayList term101163 = new ArrayList();
        term101161 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term101161, term101161.getClass(), "fnName", null);
        setField(term101161, term101161.getClass(), "compiler", null);
        setField(term101161, term101161.getClass(), "codingConvention", null);
        setField(term101161, term101161.getClass(), "typeRegistry", null);
        setField(term101161, term101161.getClass(), "errorRoot", null);
        setField(term101161, term101161.getClass(), "sourceName", null);
        setField(term101161, term101161.getClass(), "scope", null);
        setField(term101161, term101161.getClass(), "returnType", null);
        setBooleanField(term101161, term101161.getClass(), "returnTypeInferred", false);
        setField(term101161, term101161.getClass(), "implementedInterfaces", term101163);
        setField(term101161, term101161.getClass(), "baseType", null);
        setField(term101161, term101161.getClass(), "thisType", null);
        setBooleanField(term101161, term101161.getClass(), "isConstructor", false);
        setBooleanField(term101161, term101161.getClass(), "isInterface", true);
        setField(term101161, term101161.getClass(), "parametersNode", null);
        setField(term101161, term101161.getClass(), "sourceNode", null);
        setField(term101161, term101161.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term101127;
        Object retValue = callMethod(klass, "inferInheritance", argTypes, term101047, args);
        assertTrue(recursiveEquals(term101047, term101169));
        assertTrue(recursiveEquals(term101127, term101172));
        assertTrue(recursiveEquals(retValue, term101161));
    }

};


