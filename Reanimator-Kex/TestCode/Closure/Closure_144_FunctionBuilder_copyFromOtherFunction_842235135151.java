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

public class FunctionBuilder_copyFromOtherFunction_842235135151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103641;
     Object term103749;
     Object term104020;
     Object term104024;
     Object term104014;

    public FunctionBuilder_copyFromOtherFunction_842235135151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term103641, term103641.getClass(), "name", null);
        setField(term103641, term103641.getClass(), "sourceNode", null);
        setField(term103641, term103641.getClass(), "parametersNode", null);
        setField(term103641, term103641.getClass(), "returnType", null);
        term103749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term103881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term103979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term103749, term103749.getClass(), "className", "");
        setField(term103749, term103749.getClass(), "source", null);
        setField(term103881, term103881.getClass(), "parameters", null);
        setField(term103881, term103881.getClass(), "returnType", null);
        setField(term103749, term103749.getClass(), "call", term103881);
        setField(term103749, term103749.getClass(), "typeOfThis", term103979);
        term104020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term104023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term104020, term104020.getClass(), "registry", null);
        setField(term104020, term104020.getClass(), "name", "");
        setField(term104020, term104020.getClass(), "sourceNode", null);
        setField(term104020, term104020.getClass(), "parametersNode", null);
        setField(term104020, term104020.getClass(), "returnType", null);
        setField(term104023, term104023.getClass(), "indexType", null);
        setField(term104023, term104023.getClass(), "referencedType", null);
        setBooleanField(term104023, term104023.getClass(), "visited", false);
        setField(term104023, term104023.getClass(), "docInfo", null);
        setBooleanField(term104023, term104023.getClass(), "unknown", false);
        setBooleanField(term104023, term104023.getClass(), "resolved", false);
        setField(term104023, term104023.getClass(), "resolveResult", null);
        setField(term104023, term104023.getClass(), "registry", null);
        setField(term104020, term104020.getClass(), "typeOfThis", term104023);
        setField(term104020, term104020.getClass(), "templateTypeName", null);
        setBooleanField(term104020, term104020.getClass(), "inferredReturnType", false);
        setBooleanField(term104020, term104020.getClass(), "isConstructor", false);
        setBooleanField(term104020, term104020.getClass(), "isNativeType", false);
        term104024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term104025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term104026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term104024, term104024.getClass(), "this$0", null);
        setField(term104025, term104025.getClass(), "parameters", null);
        setField(term104025, term104025.getClass(), "returnType", null);
        setBooleanField(term104025, term104025.getClass(), "returnTypeInferred", false);
        setBooleanField(term104025, term104025.getClass(), "resolved", false);
        setField(term104025, term104025.getClass(), "resolveResult", null);
        setField(term104025, term104025.getClass(), "registry", null);
        setField(term104024, term104024.getClass(), "call", term104025);
        setField(term104024, term104024.getClass(), "prototype", null);
        setField(term104024, term104024.getClass(), "kind", null);
        setField(term104026, term104026.getClass(), "indexType", null);
        setField(term104026, term104026.getClass(), "referencedType", null);
        setBooleanField(term104026, term104026.getClass(), "visited", false);
        setField(term104026, term104026.getClass(), "docInfo", null);
        setBooleanField(term104026, term104026.getClass(), "unknown", false);
        setBooleanField(term104026, term104026.getClass(), "resolved", false);
        setField(term104026, term104026.getClass(), "resolveResult", null);
        setField(term104026, term104026.getClass(), "registry", null);
        setField(term104024, term104024.getClass(), "typeOfThis", term104026);
        setField(term104024, term104024.getClass(), "source", null);
        setField(term104024, term104024.getClass(), "implementedInterfaces", null);
        setField(term104024, term104024.getClass(), "subTypes", null);
        setField(term104024, term104024.getClass(), "templateTypeName", null);
        setField(term104024, term104024.getClass(), "className", "");
        setField(term104024, term104024.getClass(), "properties", null);
        setField(term104024, term104024.getClass(), "implicitPrototype", null);
        setBooleanField(term104024, term104024.getClass(), "nativeType", false);
        setBooleanField(term104024, term104024.getClass(), "prettyPrint", false);
        setBooleanField(term104024, term104024.getClass(), "visited", false);
        setField(term104024, term104024.getClass(), "docInfo", null);
        setBooleanField(term104024, term104024.getClass(), "unknown", false);
        setBooleanField(term104024, term104024.getClass(), "resolved", false);
        setField(term104024, term104024.getClass(), "resolveResult", null);
        setField(term104024, term104024.getClass(), "registry", null);
        term104014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term103987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term104014, term104014.getClass(), "registry", null);
        setField(term104014, term104014.getClass(), "name", "");
        setField(term104014, term104014.getClass(), "sourceNode", null);
        setField(term104014, term104014.getClass(), "parametersNode", null);
        setField(term104014, term104014.getClass(), "returnType", null);
        setField(term103987, term103987.getClass(), "indexType", null);
        setField(term103987, term103987.getClass(), "referencedType", null);
        setBooleanField(term103987, term103987.getClass(), "visited", false);
        setField(term103987, term103987.getClass(), "docInfo", null);
        setBooleanField(term103987, term103987.getClass(), "unknown", false);
        setBooleanField(term103987, term103987.getClass(), "resolved", false);
        setField(term103987, term103987.getClass(), "resolveResult", null);
        setField(term103987, term103987.getClass(), "registry", null);
        setField(term104014, term104014.getClass(), "typeOfThis", term103987);
        setField(term104014, term104014.getClass(), "templateTypeName", null);
        setBooleanField(term104014, term104014.getClass(), "inferredReturnType", false);
        setBooleanField(term104014, term104014.getClass(), "isConstructor", false);
        setBooleanField(term104014, term104014.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term103749;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term103641, args);
        assertTrue(recursiveEquals(term103641, term104020));
        assertTrue(recursiveEquals(term103749, term104024));
        assertTrue(recursiveEquals(retValue, term104014));
    }

};


