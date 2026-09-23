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

public class FunctionTypeBuilder_inferReturnType_2137249201206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81487;
     Object term81723;
     Object term82186;
     Object term82190;
     Object term82174;

    public FunctionTypeBuilder_inferReturnType_2137249201206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81487 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term81643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term81487, term81487.getClass(), "templateTypeName", "");
        setField(term81487, term81487.getClass(), "returnType", term81643);
        term81723 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term81723, term81723.getClass(), "bitset", -1610612736);
        term82186 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term82187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term82186, term82186.getClass(), "fnName", null);
        setField(term82186, term82186.getClass(), "compiler", null);
        setField(term82186, term82186.getClass(), "codingConvention", null);
        setField(term82186, term82186.getClass(), "typeRegistry", null);
        setField(term82186, term82186.getClass(), "errorRoot", null);
        setField(term82186, term82186.getClass(), "sourceName", null);
        setField(term82186, term82186.getClass(), "scope", null);
        setField(term82187, term82187.getClass(), "ownerFunction", null);
        setField(term82187, term82187.getClass(), "className", null);
        setField(term82187, term82187.getClass(), "properties", null);
        setBooleanField(term82187, term82187.getClass(), "nativeType", false);
        setField(term82187, term82187.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term82187, term82187.getClass(), "prettyPrint", false);
        setBooleanField(term82187, term82187.getClass(), "visited", false);
        setField(term82187, term82187.getClass(), "docInfo", null);
        setBooleanField(term82187, term82187.getClass(), "unknown", false);
        setBooleanField(term82187, term82187.getClass(), "resolved", false);
        setField(term82187, term82187.getClass(), "resolveResult", null);
        setField(term82187, term82187.getClass(), "registry", null);
        setField(term82186, term82186.getClass(), "returnType", term82187);
        setBooleanField(term82186, term82186.getClass(), "returnTypeInferred", false);
        setField(term82186, term82186.getClass(), "implementedInterfaces", null);
        setField(term82186, term82186.getClass(), "baseType", null);
        setField(term82186, term82186.getClass(), "thisType", null);
        setBooleanField(term82186, term82186.getClass(), "isConstructor", false);
        setBooleanField(term82186, term82186.getClass(), "isInterface", false);
        setField(term82186, term82186.getClass(), "parametersNode", null);
        setField(term82186, term82186.getClass(), "sourceNode", null);
        setField(term82186, term82186.getClass(), "templateTypeName", "");
        term82190 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term82190, term82190.getClass(), "info", null);
        setField(term82190, term82190.getClass(), "documentation", null);
        setField(term82190, term82190.getClass(), "sourceName", null);
        setField(term82190, term82190.getClass(), "visibility", null);
        setIntField(term82190, term82190.getClass(), "bitset", -1610612736);
        setField(term82190, term82190.getClass(), "type", null);
        setField(term82190, term82190.getClass(), "thisType", null);
        setBooleanField(term82190, term82190.getClass(), "includeDocumentation", false);
        term82174 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term82175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term82174, term82174.getClass(), "fnName", null);
        setField(term82174, term82174.getClass(), "compiler", null);
        setField(term82174, term82174.getClass(), "codingConvention", null);
        setField(term82174, term82174.getClass(), "typeRegistry", null);
        setField(term82174, term82174.getClass(), "errorRoot", null);
        setField(term82174, term82174.getClass(), "sourceName", null);
        setField(term82174, term82174.getClass(), "scope", null);
        setField(term82175, term82175.getClass(), "ownerFunction", null);
        setField(term82175, term82175.getClass(), "className", null);
        setField(term82175, term82175.getClass(), "properties", null);
        setBooleanField(term82175, term82175.getClass(), "nativeType", false);
        setField(term82175, term82175.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term82175, term82175.getClass(), "prettyPrint", false);
        setBooleanField(term82175, term82175.getClass(), "visited", false);
        setField(term82175, term82175.getClass(), "docInfo", null);
        setBooleanField(term82175, term82175.getClass(), "unknown", false);
        setBooleanField(term82175, term82175.getClass(), "resolved", false);
        setField(term82175, term82175.getClass(), "resolveResult", null);
        setField(term82175, term82175.getClass(), "registry", null);
        setField(term82174, term82174.getClass(), "returnType", term82175);
        setBooleanField(term82174, term82174.getClass(), "returnTypeInferred", false);
        setField(term82174, term82174.getClass(), "implementedInterfaces", null);
        setField(term82174, term82174.getClass(), "baseType", null);
        setField(term82174, term82174.getClass(), "thisType", null);
        setBooleanField(term82174, term82174.getClass(), "isConstructor", false);
        setBooleanField(term82174, term82174.getClass(), "isInterface", false);
        setField(term82174, term82174.getClass(), "parametersNode", null);
        setField(term82174, term82174.getClass(), "sourceNode", null);
        setField(term82174, term82174.getClass(), "templateTypeName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term81723;
        Object retValue = callMethod(klass, "inferReturnType", argTypes, term81487, args);
        assertTrue(recursiveEquals(term81487, term82186));
        assertTrue(recursiveEquals(term81723, term82190));
        assertTrue(recursiveEquals(retValue, term82174));
    }

};


