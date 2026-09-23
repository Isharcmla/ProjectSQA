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

public class FunctionTypeBuilder_inferInheritance_96561335548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41610;
     Object term41690;
     Object term42669;
     Object term42670;
     Object term42666;

    public FunctionTypeBuilder_inferInheritance_96561335548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41610 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term41690 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term42669 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term42669, term42669.getClass(), "fnName", null);
        setField(term42669, term42669.getClass(), "compiler", null);
        setField(term42669, term42669.getClass(), "codingConvention", null);
        setField(term42669, term42669.getClass(), "typeRegistry", null);
        setField(term42669, term42669.getClass(), "errorRoot", null);
        setField(term42669, term42669.getClass(), "sourceName", null);
        setField(term42669, term42669.getClass(), "scope", null);
        setField(term42669, term42669.getClass(), "returnType", null);
        setField(term42669, term42669.getClass(), "implementedInterfaces", null);
        setField(term42669, term42669.getClass(), "baseType", null);
        setField(term42669, term42669.getClass(), "thisType", null);
        setBooleanField(term42669, term42669.getClass(), "isConstructor", false);
        setBooleanField(term42669, term42669.getClass(), "isInterface", false);
        setField(term42669, term42669.getClass(), "parametersNode", null);
        setField(term42669, term42669.getClass(), "sourceNode", null);
        setField(term42669, term42669.getClass(), "templateTypeName", null);
        term42670 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term42670, term42670.getClass(), "info", null);
        setField(term42670, term42670.getClass(), "documentation", null);
        setField(term42670, term42670.getClass(), "sourceName", null);
        setField(term42670, term42670.getClass(), "visibility", null);
        setIntField(term42670, term42670.getClass(), "bitset", 0);
        setField(term42670, term42670.getClass(), "type", null);
        setField(term42670, term42670.getClass(), "thisType", null);
        setBooleanField(term42670, term42670.getClass(), "includeDocumentation", false);
        term42666 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term42666, term42666.getClass(), "fnName", null);
        setField(term42666, term42666.getClass(), "compiler", null);
        setField(term42666, term42666.getClass(), "codingConvention", null);
        setField(term42666, term42666.getClass(), "typeRegistry", null);
        setField(term42666, term42666.getClass(), "errorRoot", null);
        setField(term42666, term42666.getClass(), "sourceName", null);
        setField(term42666, term42666.getClass(), "scope", null);
        setField(term42666, term42666.getClass(), "returnType", null);
        setField(term42666, term42666.getClass(), "implementedInterfaces", null);
        setField(term42666, term42666.getClass(), "baseType", null);
        setField(term42666, term42666.getClass(), "thisType", null);
        setBooleanField(term42666, term42666.getClass(), "isConstructor", false);
        setBooleanField(term42666, term42666.getClass(), "isInterface", false);
        setField(term42666, term42666.getClass(), "parametersNode", null);
        setField(term42666, term42666.getClass(), "sourceNode", null);
        setField(term42666, term42666.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term41690;
        Object retValue = callMethod(klass, "inferInheritance", argTypes, term41610, args);
        assertTrue(recursiveEquals(term41610, term42669));
        assertTrue(recursiveEquals(term41690, term42670));
        assertTrue(recursiveEquals(retValue, term42666));
    }

};


