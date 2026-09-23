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

public class FunctionTypeBuilder_inferInheritance_96561335568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41593;
     Object term41673;
     Object term41739;
     Object term41740;
     Object term41735;

    public FunctionTypeBuilder_inferInheritance_96561335568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41593 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term41673 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term41739 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term41739, term41739.getClass(), "fnName", null);
        setField(term41739, term41739.getClass(), "compiler", null);
        setField(term41739, term41739.getClass(), "codingConvention", null);
        setField(term41739, term41739.getClass(), "typeRegistry", null);
        setField(term41739, term41739.getClass(), "errorRoot", null);
        setField(term41739, term41739.getClass(), "sourceName", null);
        setField(term41739, term41739.getClass(), "scope", null);
        setField(term41739, term41739.getClass(), "returnType", null);
        setBooleanField(term41739, term41739.getClass(), "returnTypeInferred", false);
        setField(term41739, term41739.getClass(), "implementedInterfaces", null);
        setField(term41739, term41739.getClass(), "baseType", null);
        setField(term41739, term41739.getClass(), "thisType", null);
        setBooleanField(term41739, term41739.getClass(), "isConstructor", false);
        setBooleanField(term41739, term41739.getClass(), "isInterface", false);
        setField(term41739, term41739.getClass(), "parametersNode", null);
        setField(term41739, term41739.getClass(), "sourceNode", null);
        setField(term41739, term41739.getClass(), "templateTypeName", null);
        term41740 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term41740, term41740.getClass(), "info", null);
        setField(term41740, term41740.getClass(), "documentation", null);
        setField(term41740, term41740.getClass(), "sourceName", null);
        setField(term41740, term41740.getClass(), "visibility", null);
        setIntField(term41740, term41740.getClass(), "bitset", 0);
        setField(term41740, term41740.getClass(), "type", null);
        setField(term41740, term41740.getClass(), "thisType", null);
        setBooleanField(term41740, term41740.getClass(), "includeDocumentation", false);
        term41735 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term41735, term41735.getClass(), "fnName", null);
        setField(term41735, term41735.getClass(), "compiler", null);
        setField(term41735, term41735.getClass(), "codingConvention", null);
        setField(term41735, term41735.getClass(), "typeRegistry", null);
        setField(term41735, term41735.getClass(), "errorRoot", null);
        setField(term41735, term41735.getClass(), "sourceName", null);
        setField(term41735, term41735.getClass(), "scope", null);
        setField(term41735, term41735.getClass(), "returnType", null);
        setBooleanField(term41735, term41735.getClass(), "returnTypeInferred", false);
        setField(term41735, term41735.getClass(), "implementedInterfaces", null);
        setField(term41735, term41735.getClass(), "baseType", null);
        setField(term41735, term41735.getClass(), "thisType", null);
        setBooleanField(term41735, term41735.getClass(), "isConstructor", false);
        setBooleanField(term41735, term41735.getClass(), "isInterface", false);
        setField(term41735, term41735.getClass(), "parametersNode", null);
        setField(term41735, term41735.getClass(), "sourceNode", null);
        setField(term41735, term41735.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term41673;
        Object retValue = callMethod(klass, "inferInheritance", argTypes, term41593, args);
        assertTrue(recursiveEquals(term41593, term41739));
        assertTrue(recursiveEquals(term41673, term41740));
        assertTrue(recursiveEquals(retValue, term41735));
    }

};


