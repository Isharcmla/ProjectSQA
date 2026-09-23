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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108009;
     Object term108109;
     Object term108359;
     Object term108409;
     Object term108411;
     Object term108414;
     Object term108403;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108009 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term108009, term108009.getClass(), "returnType", null);
        setField(term108009, term108009.getClass(), "typeRegistry", null);
        term108109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term108203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term108273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term108203, term108203.getClass(), "returnType", null);
        setField(term108273, term108273.getClass(), "first", null);
        setField(term108203, term108203.getClass(), "parameters", term108273);
        setField(term108109, term108109.getClass(), "call", term108203);
        term108359 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term108409 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term108410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term108409, term108409.getClass(), "fnName", null);
        setField(term108409, term108409.getClass(), "compiler", null);
        setField(term108409, term108409.getClass(), "codingConvention", null);
        setField(term108409, term108409.getClass(), "typeRegistry", null);
        setField(term108409, term108409.getClass(), "errorRoot", null);
        setField(term108409, term108409.getClass(), "sourceName", null);
        setField(term108409, term108409.getClass(), "scope", null);
        setField(term108409, term108409.getClass(), "returnType", null);
        setField(term108409, term108409.getClass(), "implementedInterfaces", null);
        setField(term108409, term108409.getClass(), "baseType", null);
        setField(term108409, term108409.getClass(), "thisType", null);
        setBooleanField(term108409, term108409.getClass(), "isConstructor", false);
        setBooleanField(term108409, term108409.getClass(), "isInterface", false);
        setIntField(term108410, term108410.getClass(), "type", 83);
        setField(term108410, term108410.getClass(), "next", null);
        setField(term108410, term108410.getClass(), "first", null);
        setField(term108410, term108410.getClass(), "last", null);
        setField(term108410, term108410.getClass(), "propListHead", null);
        setIntField(term108410, term108410.getClass(), "sourcePosition", -1);
        setField(term108410, term108410.getClass(), "jsType", null);
        setField(term108410, term108410.getClass(), "parent", null);
        setField(term108409, term108409.getClass(), "parametersNode", term108410);
        setField(term108409, term108409.getClass(), "sourceNode", null);
        setField(term108409, term108409.getClass(), "templateTypeName", null);
        term108411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term108412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term108413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108413, term108413.getClass(), "type", 0);
        setField(term108413, term108413.getClass(), "next", null);
        setField(term108413, term108413.getClass(), "first", null);
        setField(term108413, term108413.getClass(), "last", null);
        setField(term108413, term108413.getClass(), "propListHead", null);
        setIntField(term108413, term108413.getClass(), "sourcePosition", 0);
        setField(term108413, term108413.getClass(), "jsType", null);
        setField(term108413, term108413.getClass(), "parent", null);
        setField(term108412, term108412.getClass(), "parameters", term108413);
        setField(term108412, term108412.getClass(), "returnType", null);
        setBooleanField(term108412, term108412.getClass(), "returnTypeInferred", false);
        setBooleanField(term108412, term108412.getClass(), "resolved", false);
        setField(term108412, term108412.getClass(), "resolveResult", null);
        setField(term108412, term108412.getClass(), "registry", null);
        setField(term108411, term108411.getClass(), "call", term108412);
        setField(term108411, term108411.getClass(), "prototype", null);
        setField(term108411, term108411.getClass(), "kind", null);
        setField(term108411, term108411.getClass(), "typeOfThis", null);
        setField(term108411, term108411.getClass(), "source", null);
        setField(term108411, term108411.getClass(), "implementedInterfaces", null);
        setField(term108411, term108411.getClass(), "subTypes", null);
        setField(term108411, term108411.getClass(), "templateTypeName", null);
        setField(term108411, term108411.getClass(), "className", null);
        setField(term108411, term108411.getClass(), "properties", null);
        setField(term108411, term108411.getClass(), "implicitPrototype", null);
        setBooleanField(term108411, term108411.getClass(), "nativeType", false);
        setBooleanField(term108411, term108411.getClass(), "prettyPrint", false);
        setBooleanField(term108411, term108411.getClass(), "visited", false);
        setField(term108411, term108411.getClass(), "docInfo", null);
        setBooleanField(term108411, term108411.getClass(), "unknown", false);
        setBooleanField(term108411, term108411.getClass(), "resolved", false);
        setField(term108411, term108411.getClass(), "resolveResult", null);
        setField(term108411, term108411.getClass(), "registry", null);
        term108414 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term108414, term108414.getClass(), "functionName", null);
        setBooleanField(term108414, term108414.getClass(), "itsNeedsActivation", false);
        setIntField(term108414, term108414.getClass(), "itsFunctionType", 0);
        setBooleanField(term108414, term108414.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108414, term108414.getClass(), "encodedSourceStart", 0);
        setIntField(term108414, term108414.getClass(), "encodedSourceEnd", 0);
        setField(term108414, term108414.getClass(), "sourceName", null);
        setIntField(term108414, term108414.getClass(), "baseLineno", 0);
        setIntField(term108414, term108414.getClass(), "endLineno", 0);
        setField(term108414, term108414.getClass(), "functions", null);
        setField(term108414, term108414.getClass(), "regexps", null);
        setField(term108414, term108414.getClass(), "itsVariables", null);
        setField(term108414, term108414.getClass(), "itsConst", null);
        setField(term108414, term108414.getClass(), "itsVariableNames", null);
        setIntField(term108414, term108414.getClass(), "varStart", 0);
        setField(term108414, term108414.getClass(), "compilerData", null);
        setIntField(term108414, term108414.getClass(), "type", 0);
        setField(term108414, term108414.getClass(), "next", null);
        setField(term108414, term108414.getClass(), "first", null);
        setField(term108414, term108414.getClass(), "last", null);
        setField(term108414, term108414.getClass(), "propListHead", null);
        setIntField(term108414, term108414.getClass(), "sourcePosition", 0);
        setField(term108414, term108414.getClass(), "jsType", null);
        setField(term108414, term108414.getClass(), "parent", null);
        term108403 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term108406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term108403, term108403.getClass(), "fnName", null);
        setField(term108403, term108403.getClass(), "compiler", null);
        setField(term108403, term108403.getClass(), "codingConvention", null);
        setField(term108403, term108403.getClass(), "typeRegistry", null);
        setField(term108403, term108403.getClass(), "errorRoot", null);
        setField(term108403, term108403.getClass(), "sourceName", null);
        setField(term108403, term108403.getClass(), "scope", null);
        setField(term108403, term108403.getClass(), "returnType", null);
        setField(term108403, term108403.getClass(), "implementedInterfaces", null);
        setField(term108403, term108403.getClass(), "baseType", null);
        setField(term108403, term108403.getClass(), "thisType", null);
        setBooleanField(term108403, term108403.getClass(), "isConstructor", false);
        setBooleanField(term108403, term108403.getClass(), "isInterface", false);
        setIntField(term108406, term108406.getClass(), "type", 83);
        setField(term108406, term108406.getClass(), "next", null);
        setField(term108406, term108406.getClass(), "first", null);
        setField(term108406, term108406.getClass(), "last", null);
        setField(term108406, term108406.getClass(), "propListHead", null);
        setIntField(term108406, term108406.getClass(), "sourcePosition", -1);
        setField(term108406, term108406.getClass(), "jsType", null);
        setField(term108406, term108406.getClass(), "parent", null);
        setField(term108403, term108403.getClass(), "parametersNode", term108406);
        setField(term108403, term108403.getClass(), "sourceNode", null);
        setField(term108403, term108403.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term108109;
        args[1] = term108359;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term108009, args);
        assertTrue(recursiveEquals(term108009, term108409));
        assertTrue(recursiveEquals(term108109, term108411));
        assertTrue(recursiveEquals(term108359, term108414));
        assertTrue(recursiveEquals(retValue, term108403));
    }

};


