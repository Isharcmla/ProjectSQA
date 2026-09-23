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
import java.util.ArrayList;

public class FunctionTypeBuilder_inferInheritance_965613355290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109383;
     Object term109573;
     Object term110210;
     Object term110214;
     Object term110196;

    public FunctionTypeBuilder_inferInheritance_965613355290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109383 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term109493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term109383, term109383.getClass(), "isConstructor", false);
        setBooleanField(term109383, term109383.getClass(), "isInterface", false);
        setField(term109383, term109383.getClass(), "implementedInterfaces", null);
        setField(term109383, term109383.getClass(), "baseType", term109493);
        term109573 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term109573, term109573.getClass(), "bitset", 514);
        setField(term109573, term109573.getClass(), "info", null);
        ArrayList term110211 = new ArrayList();
        term110210 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term110213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term110210, term110210.getClass(), "fnName", null);
        setField(term110210, term110210.getClass(), "compiler", null);
        setField(term110210, term110210.getClass(), "codingConvention", null);
        setField(term110210, term110210.getClass(), "typeRegistry", null);
        setField(term110210, term110210.getClass(), "errorRoot", null);
        setField(term110210, term110210.getClass(), "sourceName", null);
        setField(term110210, term110210.getClass(), "scope", null);
        setField(term110210, term110210.getClass(), "returnType", null);
        setBooleanField(term110210, term110210.getClass(), "returnTypeInferred", false);
        setField(term110210, term110210.getClass(), "implementedInterfaces", term110211);
        setField(term110213, term110213.getClass(), "call", null);
        setField(term110213, term110213.getClass(), "prototype", null);
        setField(term110213, term110213.getClass(), "kind", null);
        setField(term110213, term110213.getClass(), "typeOfThis", null);
        setField(term110213, term110213.getClass(), "source", null);
        setField(term110213, term110213.getClass(), "implementedInterfaces", null);
        setField(term110213, term110213.getClass(), "subTypes", null);
        setField(term110213, term110213.getClass(), "templateTypeName", null);
        setField(term110213, term110213.getClass(), "className", null);
        setField(term110213, term110213.getClass(), "properties", null);
        setBooleanField(term110213, term110213.getClass(), "nativeType", false);
        setField(term110213, term110213.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term110213, term110213.getClass(), "prettyPrint", false);
        setBooleanField(term110213, term110213.getClass(), "visited", false);
        setField(term110213, term110213.getClass(), "docInfo", null);
        setBooleanField(term110213, term110213.getClass(), "unknown", false);
        setBooleanField(term110213, term110213.getClass(), "resolved", false);
        setField(term110213, term110213.getClass(), "resolveResult", null);
        setField(term110213, term110213.getClass(), "registry", null);
        setField(term110210, term110210.getClass(), "baseType", term110213);
        setField(term110210, term110210.getClass(), "thisType", null);
        setBooleanField(term110210, term110210.getClass(), "isConstructor", true);
        setBooleanField(term110210, term110210.getClass(), "isInterface", true);
        setField(term110210, term110210.getClass(), "parametersNode", null);
        setField(term110210, term110210.getClass(), "sourceNode", null);
        setField(term110210, term110210.getClass(), "templateTypeName", null);
        term110214 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term110214, term110214.getClass(), "info", null);
        setField(term110214, term110214.getClass(), "documentation", null);
        setField(term110214, term110214.getClass(), "sourceName", null);
        setField(term110214, term110214.getClass(), "visibility", null);
        setIntField(term110214, term110214.getClass(), "bitset", 514);
        setField(term110214, term110214.getClass(), "type", null);
        setField(term110214, term110214.getClass(), "thisType", null);
        setBooleanField(term110214, term110214.getClass(), "includeDocumentation", false);
        ArrayList term110198 = new ArrayList();
        term110196 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term110202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term110196, term110196.getClass(), "fnName", null);
        setField(term110196, term110196.getClass(), "compiler", null);
        setField(term110196, term110196.getClass(), "codingConvention", null);
        setField(term110196, term110196.getClass(), "typeRegistry", null);
        setField(term110196, term110196.getClass(), "errorRoot", null);
        setField(term110196, term110196.getClass(), "sourceName", null);
        setField(term110196, term110196.getClass(), "scope", null);
        setField(term110196, term110196.getClass(), "returnType", null);
        setBooleanField(term110196, term110196.getClass(), "returnTypeInferred", false);
        setField(term110196, term110196.getClass(), "implementedInterfaces", term110198);
        setField(term110202, term110202.getClass(), "call", null);
        setField(term110202, term110202.getClass(), "prototype", null);
        setField(term110202, term110202.getClass(), "kind", null);
        setField(term110202, term110202.getClass(), "typeOfThis", null);
        setField(term110202, term110202.getClass(), "source", null);
        setField(term110202, term110202.getClass(), "implementedInterfaces", null);
        setField(term110202, term110202.getClass(), "subTypes", null);
        setField(term110202, term110202.getClass(), "templateTypeName", null);
        setField(term110202, term110202.getClass(), "className", null);
        setField(term110202, term110202.getClass(), "properties", null);
        setBooleanField(term110202, term110202.getClass(), "nativeType", false);
        setField(term110202, term110202.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term110202, term110202.getClass(), "prettyPrint", false);
        setBooleanField(term110202, term110202.getClass(), "visited", false);
        setField(term110202, term110202.getClass(), "docInfo", null);
        setBooleanField(term110202, term110202.getClass(), "unknown", false);
        setBooleanField(term110202, term110202.getClass(), "resolved", false);
        setField(term110202, term110202.getClass(), "resolveResult", null);
        setField(term110202, term110202.getClass(), "registry", null);
        setField(term110196, term110196.getClass(), "baseType", term110202);
        setField(term110196, term110196.getClass(), "thisType", null);
        setBooleanField(term110196, term110196.getClass(), "isConstructor", true);
        setBooleanField(term110196, term110196.getClass(), "isInterface", true);
        setField(term110196, term110196.getClass(), "parametersNode", null);
        setField(term110196, term110196.getClass(), "sourceNode", null);
        setField(term110196, term110196.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term109573;
        Object retValue = callMethod(klass, "inferInheritance", argTypes, term109383, args);
        assertTrue(recursiveEquals(term109383, term110210));
        assertTrue(recursiveEquals(term109573, term110214));
        assertTrue(recursiveEquals(retValue, term110196));
    }

};


