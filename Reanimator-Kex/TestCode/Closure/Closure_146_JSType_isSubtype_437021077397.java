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

public class JSType_isSubtype_437021077397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95685;
     Object term95873;
     Object term95909;
     Object term95910;

    public JSType_isSubtype_437021077397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term95773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term95685, term95685.getClass(), "referencedType", term95773);
        term95873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term95873, term95873.getClass(), "unknown", false);
        term95909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term95909, term95909.getClass(), "call", null);
        setField(term95909, term95909.getClass(), "prototype", null);
        setField(term95909, term95909.getClass(), "kind", null);
        setField(term95909, term95909.getClass(), "typeOfThis", null);
        setField(term95909, term95909.getClass(), "source", null);
        setField(term95909, term95909.getClass(), "implementedInterfaces", null);
        setField(term95909, term95909.getClass(), "subTypes", null);
        setField(term95909, term95909.getClass(), "templateTypeName", null);
        setField(term95909, term95909.getClass(), "className", null);
        setField(term95909, term95909.getClass(), "properties", null);
        setField(term95909, term95909.getClass(), "implicitPrototype", null);
        setBooleanField(term95909, term95909.getClass(), "nativeType", false);
        setBooleanField(term95909, term95909.getClass(), "prettyPrint", false);
        setBooleanField(term95909, term95909.getClass(), "visited", false);
        setField(term95909, term95909.getClass(), "docInfo", null);
        setBooleanField(term95909, term95909.getClass(), "unknown", false);
        setBooleanField(term95909, term95909.getClass(), "resolved", false);
        setField(term95909, term95909.getClass(), "resolveResult", null);
        setField(term95909, term95909.getClass(), "registry", null);
        term95910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term95911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term95910, term95910.getClass(), "parameterType", null);
        setField(term95911, term95911.getClass(), "leastSupertypeVisitor", null);
        setField(term95911, term95911.getClass(), "greatestSubtypeVisitor", null);
        setField(term95911, term95911.getClass(), "call", null);
        setField(term95911, term95911.getClass(), "prototype", null);
        setField(term95911, term95911.getClass(), "kind", null);
        setField(term95911, term95911.getClass(), "typeOfThis", null);
        setField(term95911, term95911.getClass(), "source", null);
        setField(term95911, term95911.getClass(), "implementedInterfaces", null);
        setField(term95911, term95911.getClass(), "subTypes", null);
        setField(term95911, term95911.getClass(), "templateTypeName", null);
        setField(term95911, term95911.getClass(), "className", null);
        setField(term95911, term95911.getClass(), "properties", null);
        setField(term95911, term95911.getClass(), "implicitPrototype", null);
        setBooleanField(term95911, term95911.getClass(), "nativeType", false);
        setBooleanField(term95911, term95911.getClass(), "prettyPrint", false);
        setBooleanField(term95911, term95911.getClass(), "visited", false);
        setField(term95911, term95911.getClass(), "docInfo", null);
        setBooleanField(term95911, term95911.getClass(), "unknown", false);
        setBooleanField(term95911, term95911.getClass(), "resolved", false);
        setField(term95911, term95911.getClass(), "resolveResult", null);
        setField(term95911, term95911.getClass(), "registry", null);
        setField(term95910, term95910.getClass(), "referencedType", term95911);
        setBooleanField(term95910, term95910.getClass(), "visited", false);
        setField(term95910, term95910.getClass(), "docInfo", null);
        setBooleanField(term95910, term95910.getClass(), "unknown", false);
        setBooleanField(term95910, term95910.getClass(), "resolved", false);
        setField(term95910, term95910.getClass(), "resolveResult", null);
        setField(term95910, term95910.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term95685;
        args[1] = term95873;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term95685, term95909));
        assertTrue(recursiveEquals(term95873, term95910));
        assertTrue(recursiveEquals(retValue, false));
    }

};


