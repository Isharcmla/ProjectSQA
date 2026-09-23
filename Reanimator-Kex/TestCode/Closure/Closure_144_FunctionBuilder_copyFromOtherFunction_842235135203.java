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

public class FunctionBuilder_copyFromOtherFunction_842235135203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138116;
     Object term138226;
     Object term138505;
     Object term138509;
     Object term138499;

    public FunctionBuilder_copyFromOtherFunction_842235135203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term138116, term138116.getClass(), "name", null);
        setField(term138116, term138116.getClass(), "sourceNode", null);
        setField(term138116, term138116.getClass(), "parametersNode", null);
        setField(term138116, term138116.getClass(), "returnType", null);
        term138226 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term138358 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term138464 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term138226, term138226.getClass(), "className", "");
        setField(term138226, term138226.getClass(), "source", null);
        setField(term138358, term138358.getClass(), "parameters", null);
        setField(term138358, term138358.getClass(), "returnType", null);
        setField(term138226, term138226.getClass(), "call", term138358);
        setField(term138226, term138226.getClass(), "typeOfThis", term138464);
        term138505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term138508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term138505, term138505.getClass(), "registry", null);
        setField(term138505, term138505.getClass(), "name", "");
        setField(term138505, term138505.getClass(), "sourceNode", null);
        setField(term138505, term138505.getClass(), "parametersNode", null);
        setField(term138505, term138505.getClass(), "returnType", null);
        setField(term138508, term138508.getClass(), "referencedType", null);
        setBooleanField(term138508, term138508.getClass(), "visited", false);
        setField(term138508, term138508.getClass(), "docInfo", null);
        setBooleanField(term138508, term138508.getClass(), "unknown", false);
        setBooleanField(term138508, term138508.getClass(), "resolved", false);
        setField(term138508, term138508.getClass(), "resolveResult", null);
        setField(term138508, term138508.getClass(), "registry", null);
        setField(term138505, term138505.getClass(), "typeOfThis", term138508);
        setField(term138505, term138505.getClass(), "templateTypeName", null);
        setBooleanField(term138505, term138505.getClass(), "inferredReturnType", false);
        setBooleanField(term138505, term138505.getClass(), "isConstructor", false);
        setBooleanField(term138505, term138505.getClass(), "isNativeType", false);
        term138509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term138510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term138511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term138510, term138510.getClass(), "parameters", null);
        setField(term138510, term138510.getClass(), "returnType", null);
        setBooleanField(term138510, term138510.getClass(), "returnTypeInferred", false);
        setBooleanField(term138510, term138510.getClass(), "resolved", false);
        setField(term138510, term138510.getClass(), "resolveResult", null);
        setField(term138510, term138510.getClass(), "registry", null);
        setField(term138509, term138509.getClass(), "call", term138510);
        setField(term138509, term138509.getClass(), "prototype", null);
        setField(term138509, term138509.getClass(), "kind", null);
        setField(term138511, term138511.getClass(), "referencedType", null);
        setBooleanField(term138511, term138511.getClass(), "visited", false);
        setField(term138511, term138511.getClass(), "docInfo", null);
        setBooleanField(term138511, term138511.getClass(), "unknown", false);
        setBooleanField(term138511, term138511.getClass(), "resolved", false);
        setField(term138511, term138511.getClass(), "resolveResult", null);
        setField(term138511, term138511.getClass(), "registry", null);
        setField(term138509, term138509.getClass(), "typeOfThis", term138511);
        setField(term138509, term138509.getClass(), "source", null);
        setField(term138509, term138509.getClass(), "implementedInterfaces", null);
        setField(term138509, term138509.getClass(), "subTypes", null);
        setField(term138509, term138509.getClass(), "templateTypeName", null);
        setField(term138509, term138509.getClass(), "className", "");
        setField(term138509, term138509.getClass(), "properties", null);
        setField(term138509, term138509.getClass(), "implicitPrototype", null);
        setBooleanField(term138509, term138509.getClass(), "nativeType", false);
        setBooleanField(term138509, term138509.getClass(), "prettyPrint", false);
        setBooleanField(term138509, term138509.getClass(), "visited", false);
        setField(term138509, term138509.getClass(), "docInfo", null);
        setBooleanField(term138509, term138509.getClass(), "unknown", false);
        setBooleanField(term138509, term138509.getClass(), "resolved", false);
        setField(term138509, term138509.getClass(), "resolveResult", null);
        setField(term138509, term138509.getClass(), "registry", null);
        term138499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term138472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term138499, term138499.getClass(), "registry", null);
        setField(term138499, term138499.getClass(), "name", "");
        setField(term138499, term138499.getClass(), "sourceNode", null);
        setField(term138499, term138499.getClass(), "parametersNode", null);
        setField(term138499, term138499.getClass(), "returnType", null);
        setField(term138472, term138472.getClass(), "referencedType", null);
        setBooleanField(term138472, term138472.getClass(), "visited", false);
        setField(term138472, term138472.getClass(), "docInfo", null);
        setBooleanField(term138472, term138472.getClass(), "unknown", false);
        setBooleanField(term138472, term138472.getClass(), "resolved", false);
        setField(term138472, term138472.getClass(), "resolveResult", null);
        setField(term138472, term138472.getClass(), "registry", null);
        setField(term138499, term138499.getClass(), "typeOfThis", term138472);
        setField(term138499, term138499.getClass(), "templateTypeName", null);
        setBooleanField(term138499, term138499.getClass(), "inferredReturnType", false);
        setBooleanField(term138499, term138499.getClass(), "isConstructor", false);
        setBooleanField(term138499, term138499.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term138226;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term138116, args);
        assertTrue(recursiveEquals(term138116, term138505));
        assertTrue(recursiveEquals(term138226, term138509));
        assertTrue(recursiveEquals(retValue, term138499));
    }

};


