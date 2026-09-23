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

public class JSType_isSubtype_437021077382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91125;
     Object term91423;
     Object term91804;
     Object term91805;

    public JSType_isSubtype_437021077382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term91235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term91323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term91235, term91235.getClass(), "referencedType", term91323);
        setField(term91125, term91125.getClass(), "referencedType", term91235);
        term91423 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term91423, term91423.getClass(), "unknown", false);
        term91804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term91804, term91804.getClass(), "call", null);
        setField(term91804, term91804.getClass(), "prototype", null);
        setField(term91804, term91804.getClass(), "kind", null);
        setField(term91804, term91804.getClass(), "typeOfThis", null);
        setField(term91804, term91804.getClass(), "source", null);
        setField(term91804, term91804.getClass(), "implementedInterfaces", null);
        setField(term91804, term91804.getClass(), "subTypes", null);
        setField(term91804, term91804.getClass(), "templateTypeName", null);
        setField(term91804, term91804.getClass(), "className", null);
        setField(term91804, term91804.getClass(), "properties", null);
        setField(term91804, term91804.getClass(), "implicitPrototype", null);
        setBooleanField(term91804, term91804.getClass(), "nativeType", false);
        setBooleanField(term91804, term91804.getClass(), "prettyPrint", false);
        setBooleanField(term91804, term91804.getClass(), "visited", false);
        setField(term91804, term91804.getClass(), "docInfo", null);
        setBooleanField(term91804, term91804.getClass(), "unknown", false);
        setBooleanField(term91804, term91804.getClass(), "resolved", false);
        setField(term91804, term91804.getClass(), "resolveResult", null);
        setField(term91804, term91804.getClass(), "registry", null);
        term91805 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term91806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term91807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term91805, term91805.getClass(), "parameterType", null);
        setField(term91806, term91806.getClass(), "parameterType", null);
        setField(term91807, term91807.getClass(), "leastSupertypeVisitor", null);
        setField(term91807, term91807.getClass(), "greatestSubtypeVisitor", null);
        setField(term91807, term91807.getClass(), "call", null);
        setField(term91807, term91807.getClass(), "prototype", null);
        setField(term91807, term91807.getClass(), "kind", null);
        setField(term91807, term91807.getClass(), "typeOfThis", null);
        setField(term91807, term91807.getClass(), "source", null);
        setField(term91807, term91807.getClass(), "implementedInterfaces", null);
        setField(term91807, term91807.getClass(), "subTypes", null);
        setField(term91807, term91807.getClass(), "templateTypeName", null);
        setField(term91807, term91807.getClass(), "className", null);
        setField(term91807, term91807.getClass(), "properties", null);
        setField(term91807, term91807.getClass(), "implicitPrototype", null);
        setBooleanField(term91807, term91807.getClass(), "nativeType", false);
        setBooleanField(term91807, term91807.getClass(), "prettyPrint", false);
        setBooleanField(term91807, term91807.getClass(), "visited", false);
        setField(term91807, term91807.getClass(), "docInfo", null);
        setBooleanField(term91807, term91807.getClass(), "unknown", false);
        setBooleanField(term91807, term91807.getClass(), "resolved", false);
        setField(term91807, term91807.getClass(), "resolveResult", null);
        setField(term91807, term91807.getClass(), "registry", null);
        setField(term91806, term91806.getClass(), "referencedType", term91807);
        setBooleanField(term91806, term91806.getClass(), "visited", false);
        setField(term91806, term91806.getClass(), "docInfo", null);
        setBooleanField(term91806, term91806.getClass(), "unknown", false);
        setBooleanField(term91806, term91806.getClass(), "resolved", false);
        setField(term91806, term91806.getClass(), "resolveResult", null);
        setField(term91806, term91806.getClass(), "registry", null);
        setField(term91805, term91805.getClass(), "referencedType", term91806);
        setBooleanField(term91805, term91805.getClass(), "visited", false);
        setField(term91805, term91805.getClass(), "docInfo", null);
        setBooleanField(term91805, term91805.getClass(), "unknown", false);
        setBooleanField(term91805, term91805.getClass(), "resolved", false);
        setField(term91805, term91805.getClass(), "resolveResult", null);
        setField(term91805, term91805.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term91125;
        args[1] = term91423;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term91125, term91804));
        assertTrue(recursiveEquals(term91423, term91805));
        assertTrue(recursiveEquals(retValue, false));
    }

};


