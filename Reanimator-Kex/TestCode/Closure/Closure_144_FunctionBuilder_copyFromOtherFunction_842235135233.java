package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class FunctionBuilder_copyFromOtherFunction_842235135233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166613;
     Object term166923;
     Object term167623;
     Object term167625;
     Object term167619;

    public FunctionBuilder_copyFromOtherFunction_842235135233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term166721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166813 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term166613, term166613.getClass(), "name", "");
        setField(term166613, term166613.getClass(), "sourceNode", null);
        setField(term166613, term166613.getClass(), "parametersNode", term166721);
        setField(term166613, term166613.getClass(), "returnType", term166813);
        setField(term166613, term166613.getClass(), "typeOfThis", null);
        setField(term166613, term166613.getClass(), "templateTypeName", null);
        Class<? extends Object> term167632 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term167631 = ((Class) term167632).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term167631).setAccessible(true);
        Object enum221 = ((Field) term167631).get((Object) null);
        term166923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term167017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term167111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term166923, term166923.getClass(), "className", null);
        setField(term166923, term166923.getClass(), "source", null);
        setField(term167017, term167017.getClass(), "parameters", null);
        setField(term167017, term167017.getClass(), "returnType", term167111);
        setField(term166923, term166923.getClass(), "call", term167017);
        setField(term166923, term166923.getClass(), "typeOfThis", term167111);
        setField(term166923, term166923.getClass(), "templateTypeName", null);
        setField(term166923, term166923.getClass(), "kind", enum221);
        term167623 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term167624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term167623, term167623.getClass(), "registry", null);
        setField(term167623, term167623.getClass(), "name", null);
        setField(term167623, term167623.getClass(), "sourceNode", null);
        setField(term167623, term167623.getClass(), "parametersNode", null);
        setField(term167624, term167624.getClass(), "reference", null);
        setField(term167624, term167624.getClass(), "sourceName", null);
        setIntField(term167624, term167624.getClass(), "lineno", 0);
        setIntField(term167624, term167624.getClass(), "charno", 0);
        setBooleanField(term167624, term167624.getClass(), "forgiving", false);
        setField(term167624, term167624.getClass(), "referencedType", null);
        setBooleanField(term167624, term167624.getClass(), "visited", false);
        setField(term167624, term167624.getClass(), "docInfo", null);
        setBooleanField(term167624, term167624.getClass(), "unknown", false);
        setBooleanField(term167624, term167624.getClass(), "resolved", false);
        setField(term167624, term167624.getClass(), "resolveResult", null);
        setField(term167624, term167624.getClass(), "registry", null);
        setField(term167623, term167623.getClass(), "returnType", term167624);
        setField(term167623, term167623.getClass(), "typeOfThis", term167624);
        setField(term167623, term167623.getClass(), "templateTypeName", null);
        setBooleanField(term167623, term167623.getClass(), "inferredReturnType", false);
        setBooleanField(term167623, term167623.getClass(), "isConstructor", true);
        setBooleanField(term167623, term167623.getClass(), "isNativeType", false);
        Class<? extends Object> term167932 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term167931 = ((Class) term167932).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term167931).setAccessible(true);
        Object enum222 = ((Field) term167931).get((Object) null);
        term167625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term167626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term167627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term167626, term167626.getClass(), "parameters", null);
        setField(term167627, term167627.getClass(), "reference", null);
        setField(term167627, term167627.getClass(), "sourceName", null);
        setIntField(term167627, term167627.getClass(), "lineno", 0);
        setIntField(term167627, term167627.getClass(), "charno", 0);
        setBooleanField(term167627, term167627.getClass(), "forgiving", false);
        setField(term167627, term167627.getClass(), "referencedType", null);
        setBooleanField(term167627, term167627.getClass(), "visited", false);
        setField(term167627, term167627.getClass(), "docInfo", null);
        setBooleanField(term167627, term167627.getClass(), "unknown", false);
        setBooleanField(term167627, term167627.getClass(), "resolved", false);
        setField(term167627, term167627.getClass(), "resolveResult", null);
        setField(term167627, term167627.getClass(), "registry", null);
        setField(term167626, term167626.getClass(), "returnType", term167627);
        setBooleanField(term167626, term167626.getClass(), "returnTypeInferred", false);
        setBooleanField(term167626, term167626.getClass(), "resolved", false);
        setField(term167626, term167626.getClass(), "resolveResult", null);
        setField(term167626, term167626.getClass(), "registry", null);
        setField(term167625, term167625.getClass(), "call", term167626);
        setField(term167625, term167625.getClass(), "prototype", null);
        setField(term167625, term167625.getClass(), "kind", enum222);
        setField(term167625, term167625.getClass(), "typeOfThis", term167627);
        setField(term167625, term167625.getClass(), "source", null);
        setField(term167625, term167625.getClass(), "implementedInterfaces", null);
        setField(term167625, term167625.getClass(), "subTypes", null);
        setField(term167625, term167625.getClass(), "templateTypeName", null);
        setField(term167625, term167625.getClass(), "className", null);
        setField(term167625, term167625.getClass(), "properties", null);
        setField(term167625, term167625.getClass(), "implicitPrototype", null);
        setBooleanField(term167625, term167625.getClass(), "nativeType", false);
        setBooleanField(term167625, term167625.getClass(), "prettyPrint", false);
        setBooleanField(term167625, term167625.getClass(), "visited", false);
        setField(term167625, term167625.getClass(), "docInfo", null);
        setBooleanField(term167625, term167625.getClass(), "unknown", false);
        setBooleanField(term167625, term167625.getClass(), "resolved", false);
        setField(term167625, term167625.getClass(), "resolveResult", null);
        setField(term167625, term167625.getClass(), "registry", null);
        term167619 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term167563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term167619, term167619.getClass(), "registry", null);
        setField(term167619, term167619.getClass(), "name", null);
        setField(term167619, term167619.getClass(), "sourceNode", null);
        setField(term167619, term167619.getClass(), "parametersNode", null);
        setField(term167563, term167563.getClass(), "reference", null);
        setField(term167563, term167563.getClass(), "sourceName", null);
        setIntField(term167563, term167563.getClass(), "lineno", 0);
        setIntField(term167563, term167563.getClass(), "charno", 0);
        setBooleanField(term167563, term167563.getClass(), "forgiving", false);
        setField(term167563, term167563.getClass(), "referencedType", null);
        setBooleanField(term167563, term167563.getClass(), "visited", false);
        setField(term167563, term167563.getClass(), "docInfo", null);
        setBooleanField(term167563, term167563.getClass(), "unknown", false);
        setBooleanField(term167563, term167563.getClass(), "resolved", false);
        setField(term167563, term167563.getClass(), "resolveResult", null);
        setField(term167563, term167563.getClass(), "registry", null);
        setField(term167619, term167619.getClass(), "returnType", term167563);
        setField(term167619, term167619.getClass(), "typeOfThis", term167563);
        setField(term167619, term167619.getClass(), "templateTypeName", null);
        setBooleanField(term167619, term167619.getClass(), "inferredReturnType", false);
        setBooleanField(term167619, term167619.getClass(), "isConstructor", true);
        setBooleanField(term167619, term167619.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term166923;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term166613, args);
        assertTrue(recursiveEquals(term166613, term167623));
        assertTrue(recursiveEquals(term166923, term167625));
        assertTrue(recursiveEquals(retValue, term167619));
    }

};


