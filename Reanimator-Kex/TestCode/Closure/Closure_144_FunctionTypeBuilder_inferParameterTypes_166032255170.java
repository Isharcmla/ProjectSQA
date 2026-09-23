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

public class FunctionTypeBuilder_inferParameterTypes_166032255170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47291;
     Object term47371;
     Object term47958;
     Object term47959;
     Object term47952;

    public FunctionTypeBuilder_inferParameterTypes_166032255170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47291 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term47291, term47291.getClass(), "typeRegistry", null);
        setField(term47291, term47291.getClass(), "templateTypeName", null);
        HashMap term47543 = new HashMap();
        term47371 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term47495 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term47495, term47495.getClass(), "parameters", term47543);
        setField(term47371, term47371.getClass(), "info", term47495);
        term47958 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term47958, term47958.getClass(), "asList", null);
        HashMap term47961 = new HashMap();
        term47959 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term47960 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term47960, term47960.getClass(), "baseType", null);
        setField(term47960, term47960.getClass(), "implementedInterfaces", null);
        setField(term47960, term47960.getClass(), "parameters", term47961);
        setField(term47960, term47960.getClass(), "thrownTypes", null);
        setField(term47960, term47960.getClass(), "templateTypeName", null);
        setField(term47960, term47960.getClass(), "description", null);
        setField(term47960, term47960.getClass(), "deprecated", null);
        setField(term47960, term47960.getClass(), "license", null);
        setField(term47960, term47960.getClass(), "suppressions", null);
        setField(term47959, term47959.getClass(), "info", term47960);
        setField(term47959, term47959.getClass(), "documentation", null);
        setField(term47959, term47959.getClass(), "sourceName", null);
        setField(term47959, term47959.getClass(), "visibility", null);
        setIntField(term47959, term47959.getClass(), "bitset", 0);
        setField(term47959, term47959.getClass(), "type", null);
        setField(term47959, term47959.getClass(), "thisType", null);
        setBooleanField(term47959, term47959.getClass(), "includeDocumentation", false);
        term47952 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term47955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47952, term47952.getClass(), "fnName", null);
        setField(term47952, term47952.getClass(), "compiler", null);
        setField(term47952, term47952.getClass(), "codingConvention", null);
        setField(term47952, term47952.getClass(), "typeRegistry", null);
        setField(term47952, term47952.getClass(), "errorRoot", null);
        setField(term47952, term47952.getClass(), "sourceName", null);
        setField(term47952, term47952.getClass(), "scope", null);
        setField(term47952, term47952.getClass(), "returnType", null);
        setField(term47952, term47952.getClass(), "implementedInterfaces", null);
        setField(term47952, term47952.getClass(), "baseType", null);
        setField(term47952, term47952.getClass(), "thisType", null);
        setBooleanField(term47952, term47952.getClass(), "isConstructor", false);
        setBooleanField(term47952, term47952.getClass(), "isInterface", false);
        setIntField(term47955, term47955.getClass(), "type", 83);
        setField(term47955, term47955.getClass(), "next", null);
        setField(term47955, term47955.getClass(), "first", null);
        setField(term47955, term47955.getClass(), "last", null);
        setField(term47955, term47955.getClass(), "propListHead", null);
        setIntField(term47955, term47955.getClass(), "sourcePosition", -1);
        setField(term47955, term47955.getClass(), "jsType", null);
        setField(term47955, term47955.getClass(), "parent", null);
        setField(term47952, term47952.getClass(), "parametersNode", term47955);
        setField(term47952, term47952.getClass(), "sourceNode", null);
        setField(term47952, term47952.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term47371;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term47291, args);
        assertTrue(recursiveEquals(term47291, term47958));
        assertTrue(recursiveEquals(term47371, term47959));
        assertTrue(recursiveEquals(retValue, term47952));
    }

};


