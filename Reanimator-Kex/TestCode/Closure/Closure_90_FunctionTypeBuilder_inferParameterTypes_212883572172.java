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

public class FunctionTypeBuilder_inferParameterTypes_212883572172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69390;
     Object term69704;
     Object term69788;
     Object term69791;
     Object term69778;

    public FunctionTypeBuilder_inferParameterTypes_212883572172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69390 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term69460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term69460, term69460.getClass(), "first", term69530);
        setField(term69390, term69390.getClass(), "parametersNode", term69460);
        setField(term69390, term69390.getClass(), "typeRegistry", term69634);
        term69704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69704, term69704.getClass(), "first", null);
        term69788 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term69789 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term69790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69788, term69788.getClass(), "fnName", null);
        setField(term69788, term69788.getClass(), "compiler", null);
        setField(term69788, term69788.getClass(), "codingConvention", null);
        setField(term69789, term69789.getClass(), "reporter", null);
        setField(term69789, term69789.getClass(), "nativeTypes", null);
        setField(term69789, term69789.getClass(), "namesToTypes", null);
        setField(term69789, term69789.getClass(), "namespaces", null);
        setField(term69789, term69789.getClass(), "nonNullableTypeNames", null);
        setField(term69789, term69789.getClass(), "forwardDeclaredTypes", null);
        setField(term69789, term69789.getClass(), "typesIndexedByProperty", null);
        setField(term69789, term69789.getClass(), "greatestSubtypeByProperty", null);
        setField(term69789, term69789.getClass(), "interfaceToImplementors", null);
        setField(term69789, term69789.getClass(), "unresolvedNamedTypes", null);
        setField(term69789, term69789.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term69789, term69789.getClass(), "lastGeneration", false);
        setField(term69789, term69789.getClass(), "templateTypeName", null);
        setField(term69789, term69789.getClass(), "templateType", null);
        setBooleanField(term69789, term69789.getClass(), "tolerateUndefinedValues", false);
        setField(term69789, term69789.getClass(), "resolveMode", null);
        setField(term69788, term69788.getClass(), "typeRegistry", term69789);
        setField(term69788, term69788.getClass(), "errorRoot", null);
        setField(term69788, term69788.getClass(), "sourceName", null);
        setField(term69788, term69788.getClass(), "scope", null);
        setField(term69788, term69788.getClass(), "returnType", null);
        setBooleanField(term69788, term69788.getClass(), "returnTypeInferred", false);
        setField(term69788, term69788.getClass(), "implementedInterfaces", null);
        setField(term69788, term69788.getClass(), "baseType", null);
        setField(term69788, term69788.getClass(), "thisType", null);
        setBooleanField(term69788, term69788.getClass(), "isConstructor", false);
        setBooleanField(term69788, term69788.getClass(), "isInterface", false);
        setIntField(term69790, term69790.getClass(), "type", 83);
        setField(term69790, term69790.getClass(), "next", null);
        setField(term69790, term69790.getClass(), "first", null);
        setField(term69790, term69790.getClass(), "last", null);
        setField(term69790, term69790.getClass(), "propListHead", null);
        setIntField(term69790, term69790.getClass(), "sourcePosition", -1);
        setField(term69790, term69790.getClass(), "jsType", null);
        setField(term69790, term69790.getClass(), "parent", null);
        setField(term69788, term69788.getClass(), "parametersNode", term69790);
        setField(term69788, term69788.getClass(), "sourceNode", null);
        setField(term69788, term69788.getClass(), "templateTypeName", null);
        term69791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69791, term69791.getClass(), "type", 0);
        setField(term69791, term69791.getClass(), "next", null);
        setField(term69791, term69791.getClass(), "first", null);
        setField(term69791, term69791.getClass(), "last", null);
        setField(term69791, term69791.getClass(), "propListHead", null);
        setIntField(term69791, term69791.getClass(), "sourcePosition", 0);
        setField(term69791, term69791.getClass(), "jsType", null);
        setField(term69791, term69791.getClass(), "parent", null);
        term69778 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term69779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term69785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69778, term69778.getClass(), "fnName", null);
        setField(term69778, term69778.getClass(), "compiler", null);
        setField(term69778, term69778.getClass(), "codingConvention", null);
        setField(term69779, term69779.getClass(), "reporter", null);
        setField(term69779, term69779.getClass(), "nativeTypes", null);
        setField(term69779, term69779.getClass(), "namesToTypes", null);
        setField(term69779, term69779.getClass(), "namespaces", null);
        setField(term69779, term69779.getClass(), "nonNullableTypeNames", null);
        setField(term69779, term69779.getClass(), "forwardDeclaredTypes", null);
        setField(term69779, term69779.getClass(), "typesIndexedByProperty", null);
        setField(term69779, term69779.getClass(), "greatestSubtypeByProperty", null);
        setField(term69779, term69779.getClass(), "interfaceToImplementors", null);
        setField(term69779, term69779.getClass(), "unresolvedNamedTypes", null);
        setField(term69779, term69779.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term69779, term69779.getClass(), "lastGeneration", false);
        setField(term69779, term69779.getClass(), "templateTypeName", null);
        setField(term69779, term69779.getClass(), "templateType", null);
        setBooleanField(term69779, term69779.getClass(), "tolerateUndefinedValues", false);
        setField(term69779, term69779.getClass(), "resolveMode", null);
        setField(term69778, term69778.getClass(), "typeRegistry", term69779);
        setField(term69778, term69778.getClass(), "errorRoot", null);
        setField(term69778, term69778.getClass(), "sourceName", null);
        setField(term69778, term69778.getClass(), "scope", null);
        setField(term69778, term69778.getClass(), "returnType", null);
        setBooleanField(term69778, term69778.getClass(), "returnTypeInferred", false);
        setField(term69778, term69778.getClass(), "implementedInterfaces", null);
        setField(term69778, term69778.getClass(), "baseType", null);
        setField(term69778, term69778.getClass(), "thisType", null);
        setBooleanField(term69778, term69778.getClass(), "isConstructor", false);
        setBooleanField(term69778, term69778.getClass(), "isInterface", false);
        setIntField(term69785, term69785.getClass(), "type", 83);
        setField(term69785, term69785.getClass(), "next", null);
        setField(term69785, term69785.getClass(), "first", null);
        setField(term69785, term69785.getClass(), "last", null);
        setField(term69785, term69785.getClass(), "propListHead", null);
        setIntField(term69785, term69785.getClass(), "sourcePosition", -1);
        setField(term69785, term69785.getClass(), "jsType", null);
        setField(term69785, term69785.getClass(), "parent", null);
        setField(term69778, term69778.getClass(), "parametersNode", term69785);
        setField(term69778, term69778.getClass(), "sourceNode", null);
        setField(term69778, term69778.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term69704;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term69390, args);
        assertTrue(recursiveEquals(term69390, term69788));
        assertTrue(recursiveEquals(term69704, term69791));
        assertTrue(recursiveEquals(retValue, term69778));
    }

};


