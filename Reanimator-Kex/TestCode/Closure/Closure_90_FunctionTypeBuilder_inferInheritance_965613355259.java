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
import java.util.ArrayList;

public class FunctionTypeBuilder_inferInheritance_965613355259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99456;
     Object term99536;
     Object term100040;
     Object term100043;
     Object term100032;

    public FunctionTypeBuilder_inferInheritance_965613355259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99456 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setBooleanField(term99456, term99456.getClass(), "isConstructor", false);
        term99536 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term99536, term99536.getClass(), "bitset", 514);
        ArrayList term100041 = new ArrayList();
        term100040 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term100040, term100040.getClass(), "fnName", null);
        setField(term100040, term100040.getClass(), "compiler", null);
        setField(term100040, term100040.getClass(), "codingConvention", null);
        setField(term100040, term100040.getClass(), "typeRegistry", null);
        setField(term100040, term100040.getClass(), "errorRoot", null);
        setField(term100040, term100040.getClass(), "sourceName", null);
        setField(term100040, term100040.getClass(), "scope", null);
        setField(term100040, term100040.getClass(), "returnType", null);
        setBooleanField(term100040, term100040.getClass(), "returnTypeInferred", false);
        setField(term100040, term100040.getClass(), "implementedInterfaces", term100041);
        setField(term100040, term100040.getClass(), "baseType", null);
        setField(term100040, term100040.getClass(), "thisType", null);
        setBooleanField(term100040, term100040.getClass(), "isConstructor", true);
        setBooleanField(term100040, term100040.getClass(), "isInterface", true);
        setField(term100040, term100040.getClass(), "parametersNode", null);
        setField(term100040, term100040.getClass(), "sourceNode", null);
        setField(term100040, term100040.getClass(), "templateTypeName", null);
        term100043 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term100043, term100043.getClass(), "info", null);
        setField(term100043, term100043.getClass(), "documentation", null);
        setField(term100043, term100043.getClass(), "sourceName", null);
        setField(term100043, term100043.getClass(), "visibility", null);
        setIntField(term100043, term100043.getClass(), "bitset", 514);
        setField(term100043, term100043.getClass(), "type", null);
        setField(term100043, term100043.getClass(), "thisType", null);
        setBooleanField(term100043, term100043.getClass(), "includeDocumentation", false);
        ArrayList term100034 = new ArrayList();
        term100032 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term100032, term100032.getClass(), "fnName", null);
        setField(term100032, term100032.getClass(), "compiler", null);
        setField(term100032, term100032.getClass(), "codingConvention", null);
        setField(term100032, term100032.getClass(), "typeRegistry", null);
        setField(term100032, term100032.getClass(), "errorRoot", null);
        setField(term100032, term100032.getClass(), "sourceName", null);
        setField(term100032, term100032.getClass(), "scope", null);
        setField(term100032, term100032.getClass(), "returnType", null);
        setBooleanField(term100032, term100032.getClass(), "returnTypeInferred", false);
        setField(term100032, term100032.getClass(), "implementedInterfaces", term100034);
        setField(term100032, term100032.getClass(), "baseType", null);
        setField(term100032, term100032.getClass(), "thisType", null);
        setBooleanField(term100032, term100032.getClass(), "isConstructor", true);
        setBooleanField(term100032, term100032.getClass(), "isInterface", true);
        setField(term100032, term100032.getClass(), "parametersNode", null);
        setField(term100032, term100032.getClass(), "sourceNode", null);
        setField(term100032, term100032.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term99536;
        Object retValue = callMethod(klass, "inferInheritance", argTypes, term99456, args);
        assertTrue(recursiveEquals(term99456, term100040));
        assertTrue(recursiveEquals(term99536, term100043));
        assertTrue(recursiveEquals(retValue, term100032));
    }

};


