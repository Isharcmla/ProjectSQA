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

public class JSType_getGreatestSubtype_1951394506553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152138;
     Object term152354;
     Object term152629;
     Object term152631;
     Object term152456;

    public JSType_getGreatestSubtype_1951394506553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term152256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term152256, term152256.getClass(), "unknown", false);
        setField(term152138, term152138.getClass(), "referencedType", term152256);
        term152354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term152454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term152354, term152354.getClass(), "referencedType", term152454);
        term152629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term152630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term152629, term152629.getClass(), "indexType", null);
        setField(term152630, term152630.getClass(), "leastSupertypeVisitor", null);
        setField(term152630, term152630.getClass(), "greatestSubtypeVisitor", null);
        setField(term152630, term152630.getClass(), "call", null);
        setField(term152630, term152630.getClass(), "prototype", null);
        setField(term152630, term152630.getClass(), "kind", null);
        setField(term152630, term152630.getClass(), "typeOfThis", null);
        setField(term152630, term152630.getClass(), "source", null);
        setField(term152630, term152630.getClass(), "implementedInterfaces", null);
        setField(term152630, term152630.getClass(), "subTypes", null);
        setField(term152630, term152630.getClass(), "templateTypeName", null);
        setField(term152630, term152630.getClass(), "className", null);
        setField(term152630, term152630.getClass(), "properties", null);
        setField(term152630, term152630.getClass(), "implicitPrototype", null);
        setBooleanField(term152630, term152630.getClass(), "nativeType", false);
        setBooleanField(term152630, term152630.getClass(), "prettyPrint", false);
        setBooleanField(term152630, term152630.getClass(), "visited", false);
        setField(term152630, term152630.getClass(), "docInfo", null);
        setBooleanField(term152630, term152630.getClass(), "unknown", false);
        setBooleanField(term152630, term152630.getClass(), "resolved", false);
        setField(term152630, term152630.getClass(), "resolveResult", null);
        setField(term152630, term152630.getClass(), "registry", null);
        setField(term152629, term152629.getClass(), "referencedType", term152630);
        setBooleanField(term152629, term152629.getClass(), "visited", false);
        setField(term152629, term152629.getClass(), "docInfo", null);
        setBooleanField(term152629, term152629.getClass(), "unknown", false);
        setBooleanField(term152629, term152629.getClass(), "resolved", false);
        setField(term152629, term152629.getClass(), "resolveResult", null);
        setField(term152629, term152629.getClass(), "registry", null);
        term152631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term152632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term152631, term152631.getClass(), "parameterType", null);
        setField(term152632, term152632.getClass(), "ownerFunction", null);
        setField(term152632, term152632.getClass(), "className", null);
        setField(term152632, term152632.getClass(), "properties", null);
        setField(term152632, term152632.getClass(), "implicitPrototype", null);
        setBooleanField(term152632, term152632.getClass(), "nativeType", false);
        setBooleanField(term152632, term152632.getClass(), "prettyPrint", false);
        setBooleanField(term152632, term152632.getClass(), "visited", false);
        setField(term152632, term152632.getClass(), "docInfo", null);
        setBooleanField(term152632, term152632.getClass(), "unknown", false);
        setBooleanField(term152632, term152632.getClass(), "resolved", false);
        setField(term152632, term152632.getClass(), "resolveResult", null);
        setField(term152632, term152632.getClass(), "registry", null);
        setField(term152631, term152631.getClass(), "referencedType", term152632);
        setBooleanField(term152631, term152631.getClass(), "visited", false);
        setField(term152631, term152631.getClass(), "docInfo", null);
        setBooleanField(term152631, term152631.getClass(), "unknown", false);
        setBooleanField(term152631, term152631.getClass(), "resolved", false);
        setField(term152631, term152631.getClass(), "resolveResult", null);
        setField(term152631, term152631.getClass(), "registry", null);
        term152456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term152457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term152456, term152456.getClass(), "indexType", null);
        setField(term152457, term152457.getClass(), "leastSupertypeVisitor", null);
        setField(term152457, term152457.getClass(), "greatestSubtypeVisitor", null);
        setField(term152457, term152457.getClass(), "call", null);
        setField(term152457, term152457.getClass(), "prototype", null);
        setField(term152457, term152457.getClass(), "kind", null);
        setField(term152457, term152457.getClass(), "typeOfThis", null);
        setField(term152457, term152457.getClass(), "source", null);
        setField(term152457, term152457.getClass(), "implementedInterfaces", null);
        setField(term152457, term152457.getClass(), "subTypes", null);
        setField(term152457, term152457.getClass(), "templateTypeName", null);
        setField(term152457, term152457.getClass(), "className", null);
        setField(term152457, term152457.getClass(), "properties", null);
        setField(term152457, term152457.getClass(), "implicitPrototype", null);
        setBooleanField(term152457, term152457.getClass(), "nativeType", false);
        setBooleanField(term152457, term152457.getClass(), "prettyPrint", false);
        setBooleanField(term152457, term152457.getClass(), "visited", false);
        setField(term152457, term152457.getClass(), "docInfo", null);
        setBooleanField(term152457, term152457.getClass(), "unknown", false);
        setBooleanField(term152457, term152457.getClass(), "resolved", false);
        setField(term152457, term152457.getClass(), "resolveResult", null);
        setField(term152457, term152457.getClass(), "registry", null);
        setField(term152456, term152456.getClass(), "referencedType", term152457);
        setBooleanField(term152456, term152456.getClass(), "visited", false);
        setField(term152456, term152456.getClass(), "docInfo", null);
        setBooleanField(term152456, term152456.getClass(), "unknown", false);
        setBooleanField(term152456, term152456.getClass(), "resolved", false);
        setField(term152456, term152456.getClass(), "resolveResult", null);
        setField(term152456, term152456.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term152138;
        args[1] = term152354;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term152138, term152629));
        assertTrue(recursiveEquals(term152354, term152631));
        assertTrue(recursiveEquals(retValue, term152456));
    }

};


