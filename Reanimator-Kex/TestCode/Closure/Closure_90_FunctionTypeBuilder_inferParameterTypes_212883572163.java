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

public class FunctionTypeBuilder_inferParameterTypes_212883572163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66894;
     Object term67208;
     Object term67887;
     Object term67890;
     Object term67877;

    public FunctionTypeBuilder_inferParameterTypes_212883572163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66894 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term66964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term66964, term66964.getClass(), "first", term67034);
        setField(term66894, term66894.getClass(), "parametersNode", term66964);
        setField(term66894, term66894.getClass(), "typeRegistry", term67138);
        setField(term66894, term66894.getClass(), "templateTypeName", null);
        term67208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67208, term67208.getClass(), "first", null);
        term67887 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term67888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term67889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67887, term67887.getClass(), "fnName", null);
        setField(term67887, term67887.getClass(), "compiler", null);
        setField(term67887, term67887.getClass(), "codingConvention", null);
        setField(term67888, term67888.getClass(), "reporter", null);
        setField(term67888, term67888.getClass(), "nativeTypes", null);
        setField(term67888, term67888.getClass(), "namesToTypes", null);
        setField(term67888, term67888.getClass(), "namespaces", null);
        setField(term67888, term67888.getClass(), "nonNullableTypeNames", null);
        setField(term67888, term67888.getClass(), "forwardDeclaredTypes", null);
        setField(term67888, term67888.getClass(), "typesIndexedByProperty", null);
        setField(term67888, term67888.getClass(), "greatestSubtypeByProperty", null);
        setField(term67888, term67888.getClass(), "interfaceToImplementors", null);
        setField(term67888, term67888.getClass(), "unresolvedNamedTypes", null);
        setField(term67888, term67888.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term67888, term67888.getClass(), "lastGeneration", false);
        setField(term67888, term67888.getClass(), "templateTypeName", null);
        setField(term67888, term67888.getClass(), "templateType", null);
        setBooleanField(term67888, term67888.getClass(), "tolerateUndefinedValues", false);
        setField(term67888, term67888.getClass(), "resolveMode", null);
        setField(term67887, term67887.getClass(), "typeRegistry", term67888);
        setField(term67887, term67887.getClass(), "errorRoot", null);
        setField(term67887, term67887.getClass(), "sourceName", null);
        setField(term67887, term67887.getClass(), "scope", null);
        setField(term67887, term67887.getClass(), "returnType", null);
        setBooleanField(term67887, term67887.getClass(), "returnTypeInferred", false);
        setField(term67887, term67887.getClass(), "implementedInterfaces", null);
        setField(term67887, term67887.getClass(), "baseType", null);
        setField(term67887, term67887.getClass(), "thisType", null);
        setBooleanField(term67887, term67887.getClass(), "isConstructor", false);
        setBooleanField(term67887, term67887.getClass(), "isInterface", false);
        setIntField(term67889, term67889.getClass(), "type", 83);
        setField(term67889, term67889.getClass(), "next", null);
        setField(term67889, term67889.getClass(), "first", null);
        setField(term67889, term67889.getClass(), "last", null);
        setField(term67889, term67889.getClass(), "propListHead", null);
        setIntField(term67889, term67889.getClass(), "sourcePosition", -1);
        setField(term67889, term67889.getClass(), "jsType", null);
        setField(term67889, term67889.getClass(), "parent", null);
        setField(term67887, term67887.getClass(), "parametersNode", term67889);
        setField(term67887, term67887.getClass(), "sourceNode", null);
        setField(term67887, term67887.getClass(), "templateTypeName", null);
        term67890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67890, term67890.getClass(), "type", 0);
        setField(term67890, term67890.getClass(), "next", null);
        setField(term67890, term67890.getClass(), "first", null);
        setField(term67890, term67890.getClass(), "last", null);
        setField(term67890, term67890.getClass(), "propListHead", null);
        setIntField(term67890, term67890.getClass(), "sourcePosition", 0);
        setField(term67890, term67890.getClass(), "jsType", null);
        setField(term67890, term67890.getClass(), "parent", null);
        term67877 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term67878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term67884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67877, term67877.getClass(), "fnName", null);
        setField(term67877, term67877.getClass(), "compiler", null);
        setField(term67877, term67877.getClass(), "codingConvention", null);
        setField(term67878, term67878.getClass(), "reporter", null);
        setField(term67878, term67878.getClass(), "nativeTypes", null);
        setField(term67878, term67878.getClass(), "namesToTypes", null);
        setField(term67878, term67878.getClass(), "namespaces", null);
        setField(term67878, term67878.getClass(), "nonNullableTypeNames", null);
        setField(term67878, term67878.getClass(), "forwardDeclaredTypes", null);
        setField(term67878, term67878.getClass(), "typesIndexedByProperty", null);
        setField(term67878, term67878.getClass(), "greatestSubtypeByProperty", null);
        setField(term67878, term67878.getClass(), "interfaceToImplementors", null);
        setField(term67878, term67878.getClass(), "unresolvedNamedTypes", null);
        setField(term67878, term67878.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term67878, term67878.getClass(), "lastGeneration", false);
        setField(term67878, term67878.getClass(), "templateTypeName", null);
        setField(term67878, term67878.getClass(), "templateType", null);
        setBooleanField(term67878, term67878.getClass(), "tolerateUndefinedValues", false);
        setField(term67878, term67878.getClass(), "resolveMode", null);
        setField(term67877, term67877.getClass(), "typeRegistry", term67878);
        setField(term67877, term67877.getClass(), "errorRoot", null);
        setField(term67877, term67877.getClass(), "sourceName", null);
        setField(term67877, term67877.getClass(), "scope", null);
        setField(term67877, term67877.getClass(), "returnType", null);
        setBooleanField(term67877, term67877.getClass(), "returnTypeInferred", false);
        setField(term67877, term67877.getClass(), "implementedInterfaces", null);
        setField(term67877, term67877.getClass(), "baseType", null);
        setField(term67877, term67877.getClass(), "thisType", null);
        setBooleanField(term67877, term67877.getClass(), "isConstructor", false);
        setBooleanField(term67877, term67877.getClass(), "isInterface", false);
        setIntField(term67884, term67884.getClass(), "type", 83);
        setField(term67884, term67884.getClass(), "next", null);
        setField(term67884, term67884.getClass(), "first", null);
        setField(term67884, term67884.getClass(), "last", null);
        setField(term67884, term67884.getClass(), "propListHead", null);
        setIntField(term67884, term67884.getClass(), "sourcePosition", -1);
        setField(term67884, term67884.getClass(), "jsType", null);
        setField(term67884, term67884.getClass(), "parent", null);
        setField(term67877, term67877.getClass(), "parametersNode", term67884);
        setField(term67877, term67877.getClass(), "sourceNode", null);
        setField(term67877, term67877.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term67208;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term66894, args);
        assertTrue(recursiveEquals(term66894, term67887));
        assertTrue(recursiveEquals(term67208, term67890));
        assertTrue(recursiveEquals(retValue, term67877));
    }

};


