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
import java.util.HashMap;

public class FunctionTypeBuilder_inferParameterTypes_166032255163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45731;
     Object term45811;
     Object term46632;
     Object term46633;
     Object term46626;

    public FunctionTypeBuilder_inferParameterTypes_166032255163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45731 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term45731, term45731.getClass(), "typeRegistry", null);
        HashMap term45983 = new HashMap();
        term45811 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term45935 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term45935, term45935.getClass(), "parameters", term45983);
        setField(term45811, term45811.getClass(), "info", term45935);
        term46632 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term46632, term46632.getClass(), "asList", null);
        HashMap term46635 = new HashMap();
        term46633 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term46634 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term46634, term46634.getClass(), "baseType", null);
        setField(term46634, term46634.getClass(), "implementedInterfaces", null);
        setField(term46634, term46634.getClass(), "parameters", term46635);
        setField(term46634, term46634.getClass(), "thrownTypes", null);
        setField(term46634, term46634.getClass(), "templateTypeName", null);
        setField(term46634, term46634.getClass(), "description", null);
        setField(term46634, term46634.getClass(), "deprecated", null);
        setField(term46634, term46634.getClass(), "license", null);
        setField(term46634, term46634.getClass(), "suppressions", null);
        setField(term46633, term46633.getClass(), "info", term46634);
        setField(term46633, term46633.getClass(), "documentation", null);
        setField(term46633, term46633.getClass(), "sourceName", null);
        setField(term46633, term46633.getClass(), "visibility", null);
        setIntField(term46633, term46633.getClass(), "bitset", 0);
        setField(term46633, term46633.getClass(), "type", null);
        setField(term46633, term46633.getClass(), "thisType", null);
        setBooleanField(term46633, term46633.getClass(), "includeDocumentation", false);
        term46626 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term46629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46626, term46626.getClass(), "fnName", null);
        setField(term46626, term46626.getClass(), "compiler", null);
        setField(term46626, term46626.getClass(), "codingConvention", null);
        setField(term46626, term46626.getClass(), "typeRegistry", null);
        setField(term46626, term46626.getClass(), "errorRoot", null);
        setField(term46626, term46626.getClass(), "sourceName", null);
        setField(term46626, term46626.getClass(), "scope", null);
        setField(term46626, term46626.getClass(), "returnType", null);
        setField(term46626, term46626.getClass(), "implementedInterfaces", null);
        setField(term46626, term46626.getClass(), "baseType", null);
        setField(term46626, term46626.getClass(), "thisType", null);
        setBooleanField(term46626, term46626.getClass(), "isConstructor", false);
        setBooleanField(term46626, term46626.getClass(), "isInterface", false);
        setIntField(term46629, term46629.getClass(), "type", 83);
        setField(term46629, term46629.getClass(), "next", null);
        setField(term46629, term46629.getClass(), "first", null);
        setField(term46629, term46629.getClass(), "last", null);
        setField(term46629, term46629.getClass(), "propListHead", null);
        setIntField(term46629, term46629.getClass(), "sourcePosition", -1);
        setField(term46629, term46629.getClass(), "jsType", null);
        setField(term46629, term46629.getClass(), "parent", null);
        setField(term46626, term46626.getClass(), "parametersNode", term46629);
        setField(term46626, term46626.getClass(), "sourceNode", null);
        setField(term46626, term46626.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term45811;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term45731, args);
        assertTrue(recursiveEquals(term45731, term46632));
        assertTrue(recursiveEquals(term45811, term46633));
        assertTrue(recursiveEquals(retValue, term46626));
    }

};


