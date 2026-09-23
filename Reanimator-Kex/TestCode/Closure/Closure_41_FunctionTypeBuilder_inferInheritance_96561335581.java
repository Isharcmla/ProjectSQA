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

public class FunctionTypeBuilder_inferInheritance_96561335581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26035;
     Object term26115;
     Object term26340;
     Object term26341;
     Object term26336;

    public FunctionTypeBuilder_inferInheritance_96561335581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26035 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term26115 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term26340 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term26340, term26340.getClass(), "fnName", null);
        setField(term26340, term26340.getClass(), "compiler", null);
        setField(term26340, term26340.getClass(), "codingConvention", null);
        setField(term26340, term26340.getClass(), "typeRegistry", null);
        setField(term26340, term26340.getClass(), "errorRoot", null);
        setField(term26340, term26340.getClass(), "sourceName", null);
        setField(term26340, term26340.getClass(), "scope", null);
        setField(term26340, term26340.getClass(), "contents", null);
        setField(term26340, term26340.getClass(), "returnType", null);
        setBooleanField(term26340, term26340.getClass(), "returnTypeInferred", false);
        setField(term26340, term26340.getClass(), "implementedInterfaces", null);
        setField(term26340, term26340.getClass(), "extendedInterfaces", null);
        setField(term26340, term26340.getClass(), "baseType", null);
        setField(term26340, term26340.getClass(), "thisType", null);
        setBooleanField(term26340, term26340.getClass(), "isConstructor", false);
        setBooleanField(term26340, term26340.getClass(), "isInterface", false);
        setField(term26340, term26340.getClass(), "parametersNode", null);
        setField(term26340, term26340.getClass(), "templateTypeName", null);
        term26341 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term26341, term26341.getClass(), "info", null);
        setField(term26341, term26341.getClass(), "documentation", null);
        setField(term26341, term26341.getClass(), "associatedNode", null);
        setField(term26341, term26341.getClass(), "visibility", null);
        setIntField(term26341, term26341.getClass(), "bitset", 0);
        setField(term26341, term26341.getClass(), "type", null);
        setField(term26341, term26341.getClass(), "thisType", null);
        setBooleanField(term26341, term26341.getClass(), "includeDocumentation", false);
        term26336 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term26336, term26336.getClass(), "fnName", null);
        setField(term26336, term26336.getClass(), "compiler", null);
        setField(term26336, term26336.getClass(), "codingConvention", null);
        setField(term26336, term26336.getClass(), "typeRegistry", null);
        setField(term26336, term26336.getClass(), "errorRoot", null);
        setField(term26336, term26336.getClass(), "sourceName", null);
        setField(term26336, term26336.getClass(), "scope", null);
        setField(term26336, term26336.getClass(), "contents", null);
        setField(term26336, term26336.getClass(), "returnType", null);
        setBooleanField(term26336, term26336.getClass(), "returnTypeInferred", false);
        setField(term26336, term26336.getClass(), "implementedInterfaces", null);
        setField(term26336, term26336.getClass(), "extendedInterfaces", null);
        setField(term26336, term26336.getClass(), "baseType", null);
        setField(term26336, term26336.getClass(), "thisType", null);
        setBooleanField(term26336, term26336.getClass(), "isConstructor", false);
        setBooleanField(term26336, term26336.getClass(), "isInterface", false);
        setField(term26336, term26336.getClass(), "parametersNode", null);
        setField(term26336, term26336.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term26115;
        Object retValue = callMethod(klass, "inferInheritance", argTypes, term26035, args);
        assertTrue(recursiveEquals(term26035, term26340));
        assertTrue(recursiveEquals(term26115, term26341));
        assertTrue(recursiveEquals(retValue, term26336));
    }

};


