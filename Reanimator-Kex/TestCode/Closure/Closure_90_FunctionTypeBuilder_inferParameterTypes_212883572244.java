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

public class FunctionTypeBuilder_inferParameterTypes_212883572244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92610;
     Object term92956;
     Object term93839;
     Object term93842;
     Object term93829;

    public FunctionTypeBuilder_inferParameterTypes_212883572244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92610 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term92696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term92766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term92696, term92696.getClass(), "first", term92766);
        setField(term92610, term92610.getClass(), "parametersNode", term92696);
        setField(term92610, term92610.getClass(), "typeRegistry", term92870);
        term92956 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term92956, term92956.getClass(), "first", null);
        term93839 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term93840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term93841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93839, term93839.getClass(), "fnName", null);
        setField(term93839, term93839.getClass(), "compiler", null);
        setField(term93839, term93839.getClass(), "codingConvention", null);
        setField(term93840, term93840.getClass(), "reporter", null);
        setField(term93840, term93840.getClass(), "nativeTypes", null);
        setField(term93840, term93840.getClass(), "namesToTypes", null);
        setField(term93840, term93840.getClass(), "namespaces", null);
        setField(term93840, term93840.getClass(), "nonNullableTypeNames", null);
        setField(term93840, term93840.getClass(), "forwardDeclaredTypes", null);
        setField(term93840, term93840.getClass(), "typesIndexedByProperty", null);
        setField(term93840, term93840.getClass(), "greatestSubtypeByProperty", null);
        setField(term93840, term93840.getClass(), "interfaceToImplementors", null);
        setField(term93840, term93840.getClass(), "unresolvedNamedTypes", null);
        setField(term93840, term93840.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term93840, term93840.getClass(), "lastGeneration", false);
        setField(term93840, term93840.getClass(), "templateTypeName", null);
        setField(term93840, term93840.getClass(), "templateType", null);
        setBooleanField(term93840, term93840.getClass(), "tolerateUndefinedValues", false);
        setField(term93840, term93840.getClass(), "resolveMode", null);
        setField(term93839, term93839.getClass(), "typeRegistry", term93840);
        setField(term93839, term93839.getClass(), "errorRoot", null);
        setField(term93839, term93839.getClass(), "sourceName", null);
        setField(term93839, term93839.getClass(), "scope", null);
        setField(term93839, term93839.getClass(), "returnType", null);
        setBooleanField(term93839, term93839.getClass(), "returnTypeInferred", false);
        setField(term93839, term93839.getClass(), "implementedInterfaces", null);
        setField(term93839, term93839.getClass(), "baseType", null);
        setField(term93839, term93839.getClass(), "thisType", null);
        setBooleanField(term93839, term93839.getClass(), "isConstructor", false);
        setBooleanField(term93839, term93839.getClass(), "isInterface", false);
        setIntField(term93841, term93841.getClass(), "type", 83);
        setField(term93841, term93841.getClass(), "next", null);
        setField(term93841, term93841.getClass(), "first", null);
        setField(term93841, term93841.getClass(), "last", null);
        setField(term93841, term93841.getClass(), "propListHead", null);
        setIntField(term93841, term93841.getClass(), "sourcePosition", -1);
        setField(term93841, term93841.getClass(), "jsType", null);
        setField(term93841, term93841.getClass(), "parent", null);
        setField(term93839, term93839.getClass(), "parametersNode", term93841);
        setField(term93839, term93839.getClass(), "sourceNode", null);
        setField(term93839, term93839.getClass(), "templateTypeName", null);
        term93842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term93842, term93842.getClass(), "functionName", null);
        setBooleanField(term93842, term93842.getClass(), "itsNeedsActivation", false);
        setIntField(term93842, term93842.getClass(), "itsFunctionType", 0);
        setBooleanField(term93842, term93842.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93842, term93842.getClass(), "encodedSourceStart", 0);
        setIntField(term93842, term93842.getClass(), "encodedSourceEnd", 0);
        setField(term93842, term93842.getClass(), "sourceName", null);
        setIntField(term93842, term93842.getClass(), "baseLineno", 0);
        setIntField(term93842, term93842.getClass(), "endLineno", 0);
        setField(term93842, term93842.getClass(), "functions", null);
        setField(term93842, term93842.getClass(), "regexps", null);
        setField(term93842, term93842.getClass(), "itsVariables", null);
        setField(term93842, term93842.getClass(), "itsConst", null);
        setField(term93842, term93842.getClass(), "itsVariableNames", null);
        setIntField(term93842, term93842.getClass(), "varStart", 0);
        setField(term93842, term93842.getClass(), "compilerData", null);
        setIntField(term93842, term93842.getClass(), "type", 0);
        setField(term93842, term93842.getClass(), "next", null);
        setField(term93842, term93842.getClass(), "first", null);
        setField(term93842, term93842.getClass(), "last", null);
        setField(term93842, term93842.getClass(), "propListHead", null);
        setIntField(term93842, term93842.getClass(), "sourcePosition", 0);
        setField(term93842, term93842.getClass(), "jsType", null);
        setField(term93842, term93842.getClass(), "parent", null);
        term93829 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term93830 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term93836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93829, term93829.getClass(), "fnName", null);
        setField(term93829, term93829.getClass(), "compiler", null);
        setField(term93829, term93829.getClass(), "codingConvention", null);
        setField(term93830, term93830.getClass(), "reporter", null);
        setField(term93830, term93830.getClass(), "nativeTypes", null);
        setField(term93830, term93830.getClass(), "namesToTypes", null);
        setField(term93830, term93830.getClass(), "namespaces", null);
        setField(term93830, term93830.getClass(), "nonNullableTypeNames", null);
        setField(term93830, term93830.getClass(), "forwardDeclaredTypes", null);
        setField(term93830, term93830.getClass(), "typesIndexedByProperty", null);
        setField(term93830, term93830.getClass(), "greatestSubtypeByProperty", null);
        setField(term93830, term93830.getClass(), "interfaceToImplementors", null);
        setField(term93830, term93830.getClass(), "unresolvedNamedTypes", null);
        setField(term93830, term93830.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term93830, term93830.getClass(), "lastGeneration", false);
        setField(term93830, term93830.getClass(), "templateTypeName", null);
        setField(term93830, term93830.getClass(), "templateType", null);
        setBooleanField(term93830, term93830.getClass(), "tolerateUndefinedValues", false);
        setField(term93830, term93830.getClass(), "resolveMode", null);
        setField(term93829, term93829.getClass(), "typeRegistry", term93830);
        setField(term93829, term93829.getClass(), "errorRoot", null);
        setField(term93829, term93829.getClass(), "sourceName", null);
        setField(term93829, term93829.getClass(), "scope", null);
        setField(term93829, term93829.getClass(), "returnType", null);
        setBooleanField(term93829, term93829.getClass(), "returnTypeInferred", false);
        setField(term93829, term93829.getClass(), "implementedInterfaces", null);
        setField(term93829, term93829.getClass(), "baseType", null);
        setField(term93829, term93829.getClass(), "thisType", null);
        setBooleanField(term93829, term93829.getClass(), "isConstructor", false);
        setBooleanField(term93829, term93829.getClass(), "isInterface", false);
        setIntField(term93836, term93836.getClass(), "type", 83);
        setField(term93836, term93836.getClass(), "next", null);
        setField(term93836, term93836.getClass(), "first", null);
        setField(term93836, term93836.getClass(), "last", null);
        setField(term93836, term93836.getClass(), "propListHead", null);
        setIntField(term93836, term93836.getClass(), "sourcePosition", -1);
        setField(term93836, term93836.getClass(), "jsType", null);
        setField(term93836, term93836.getClass(), "parent", null);
        setField(term93829, term93829.getClass(), "parametersNode", term93836);
        setField(term93829, term93829.getClass(), "sourceNode", null);
        setField(term93829, term93829.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term92956;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term92610, args);
        assertTrue(recursiveEquals(term92610, term93839));
        assertTrue(recursiveEquals(term92956, term93842));
        assertTrue(recursiveEquals(retValue, term93829));
    }

};


