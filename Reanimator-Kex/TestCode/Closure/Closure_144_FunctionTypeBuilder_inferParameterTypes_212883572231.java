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

public class FunctionTypeBuilder_inferParameterTypes_212883572231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105205;
     Object term105395;
     Object term105443;
     Object term105446;
     Object term105434;

    public FunctionTypeBuilder_inferParameterTypes_212883572231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105205 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term105309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term105205, term105205.getClass(), "typeRegistry", term105309);
        term105395 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term105443 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term105444 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term105445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term105443, term105443.getClass(), "fnName", null);
        setField(term105443, term105443.getClass(), "compiler", null);
        setField(term105443, term105443.getClass(), "codingConvention", null);
        setField(term105444, term105444.getClass(), "reporter", null);
        setField(term105444, term105444.getClass(), "nativeTypes", null);
        setField(term105444, term105444.getClass(), "namesToTypes", null);
        setField(term105444, term105444.getClass(), "namespaces", null);
        setField(term105444, term105444.getClass(), "enumTypeNames", null);
        setField(term105444, term105444.getClass(), "forwardDeclaredTypes", null);
        setField(term105444, term105444.getClass(), "typesIndexedByProperty", null);
        setField(term105444, term105444.getClass(), "greatestSubtypeByProperty", null);
        setField(term105444, term105444.getClass(), "interfaceToImplementors", null);
        setField(term105444, term105444.getClass(), "unresolvedNamedTypes", null);
        setField(term105444, term105444.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term105444, term105444.getClass(), "lastGeneration", false);
        setField(term105444, term105444.getClass(), "templateTypeName", null);
        setField(term105444, term105444.getClass(), "templateType", null);
        setBooleanField(term105444, term105444.getClass(), "tolerateUndefinedValues", false);
        setField(term105444, term105444.getClass(), "resolveMode", null);
        setField(term105443, term105443.getClass(), "typeRegistry", term105444);
        setField(term105443, term105443.getClass(), "errorRoot", null);
        setField(term105443, term105443.getClass(), "sourceName", null);
        setField(term105443, term105443.getClass(), "scope", null);
        setField(term105443, term105443.getClass(), "returnType", null);
        setField(term105443, term105443.getClass(), "implementedInterfaces", null);
        setField(term105443, term105443.getClass(), "baseType", null);
        setField(term105443, term105443.getClass(), "thisType", null);
        setBooleanField(term105443, term105443.getClass(), "isConstructor", false);
        setBooleanField(term105443, term105443.getClass(), "isInterface", false);
        setIntField(term105445, term105445.getClass(), "type", 83);
        setField(term105445, term105445.getClass(), "next", null);
        setField(term105445, term105445.getClass(), "first", null);
        setField(term105445, term105445.getClass(), "last", null);
        setField(term105445, term105445.getClass(), "propListHead", null);
        setIntField(term105445, term105445.getClass(), "sourcePosition", -1);
        setField(term105445, term105445.getClass(), "jsType", null);
        setField(term105445, term105445.getClass(), "parent", null);
        setField(term105443, term105443.getClass(), "parametersNode", term105445);
        setField(term105443, term105443.getClass(), "sourceNode", null);
        setField(term105443, term105443.getClass(), "templateTypeName", null);
        term105446 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term105446, term105446.getClass(), "functionName", null);
        setBooleanField(term105446, term105446.getClass(), "itsNeedsActivation", false);
        setIntField(term105446, term105446.getClass(), "itsFunctionType", 0);
        setBooleanField(term105446, term105446.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term105446, term105446.getClass(), "encodedSourceStart", 0);
        setIntField(term105446, term105446.getClass(), "encodedSourceEnd", 0);
        setField(term105446, term105446.getClass(), "sourceName", null);
        setIntField(term105446, term105446.getClass(), "baseLineno", 0);
        setIntField(term105446, term105446.getClass(), "endLineno", 0);
        setField(term105446, term105446.getClass(), "functions", null);
        setField(term105446, term105446.getClass(), "regexps", null);
        setField(term105446, term105446.getClass(), "itsVariables", null);
        setField(term105446, term105446.getClass(), "itsConst", null);
        setField(term105446, term105446.getClass(), "itsVariableNames", null);
        setIntField(term105446, term105446.getClass(), "varStart", 0);
        setField(term105446, term105446.getClass(), "compilerData", null);
        setIntField(term105446, term105446.getClass(), "type", 0);
        setField(term105446, term105446.getClass(), "next", null);
        setField(term105446, term105446.getClass(), "first", null);
        setField(term105446, term105446.getClass(), "last", null);
        setField(term105446, term105446.getClass(), "propListHead", null);
        setIntField(term105446, term105446.getClass(), "sourcePosition", 0);
        setField(term105446, term105446.getClass(), "jsType", null);
        setField(term105446, term105446.getClass(), "parent", null);
        term105434 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term105435 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term105440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term105434, term105434.getClass(), "fnName", null);
        setField(term105434, term105434.getClass(), "compiler", null);
        setField(term105434, term105434.getClass(), "codingConvention", null);
        setField(term105435, term105435.getClass(), "reporter", null);
        setField(term105435, term105435.getClass(), "nativeTypes", null);
        setField(term105435, term105435.getClass(), "namesToTypes", null);
        setField(term105435, term105435.getClass(), "namespaces", null);
        setField(term105435, term105435.getClass(), "enumTypeNames", null);
        setField(term105435, term105435.getClass(), "forwardDeclaredTypes", null);
        setField(term105435, term105435.getClass(), "typesIndexedByProperty", null);
        setField(term105435, term105435.getClass(), "greatestSubtypeByProperty", null);
        setField(term105435, term105435.getClass(), "interfaceToImplementors", null);
        setField(term105435, term105435.getClass(), "unresolvedNamedTypes", null);
        setField(term105435, term105435.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term105435, term105435.getClass(), "lastGeneration", false);
        setField(term105435, term105435.getClass(), "templateTypeName", null);
        setField(term105435, term105435.getClass(), "templateType", null);
        setBooleanField(term105435, term105435.getClass(), "tolerateUndefinedValues", false);
        setField(term105435, term105435.getClass(), "resolveMode", null);
        setField(term105434, term105434.getClass(), "typeRegistry", term105435);
        setField(term105434, term105434.getClass(), "errorRoot", null);
        setField(term105434, term105434.getClass(), "sourceName", null);
        setField(term105434, term105434.getClass(), "scope", null);
        setField(term105434, term105434.getClass(), "returnType", null);
        setField(term105434, term105434.getClass(), "implementedInterfaces", null);
        setField(term105434, term105434.getClass(), "baseType", null);
        setField(term105434, term105434.getClass(), "thisType", null);
        setBooleanField(term105434, term105434.getClass(), "isConstructor", false);
        setBooleanField(term105434, term105434.getClass(), "isInterface", false);
        setIntField(term105440, term105440.getClass(), "type", 83);
        setField(term105440, term105440.getClass(), "next", null);
        setField(term105440, term105440.getClass(), "first", null);
        setField(term105440, term105440.getClass(), "last", null);
        setField(term105440, term105440.getClass(), "propListHead", null);
        setIntField(term105440, term105440.getClass(), "sourcePosition", -1);
        setField(term105440, term105440.getClass(), "jsType", null);
        setField(term105440, term105440.getClass(), "parent", null);
        setField(term105434, term105434.getClass(), "parametersNode", term105440);
        setField(term105434, term105434.getClass(), "sourceNode", null);
        setField(term105434, term105434.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term105395;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term105205, args);
        assertTrue(recursiveEquals(term105205, term105443));
        assertTrue(recursiveEquals(term105395, term105446));
        assertTrue(recursiveEquals(retValue, term105434));
    }

};


