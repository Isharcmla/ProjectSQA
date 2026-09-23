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

public class JSType_isSubtype_437021077523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144242;
     Object term144336;
     Object term144496;
     Object term144498;

    public JSType_isSubtype_437021077523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term144336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term144446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term144336, term144336.getClass(), "referencedType", term144446);
        term144496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term144497 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term144496, term144496.getClass(), "reference", null);
        setField(term144496, term144496.getClass(), "sourceName", null);
        setIntField(term144496, term144496.getClass(), "lineno", 0);
        setIntField(term144496, term144496.getClass(), "charno", 0);
        setBooleanField(term144496, term144496.getClass(), "forgiving", false);
        setField(term144497, term144497.getClass(), "call", null);
        setField(term144497, term144497.getClass(), "prototype", null);
        setField(term144497, term144497.getClass(), "kind", null);
        setField(term144497, term144497.getClass(), "typeOfThis", null);
        setField(term144497, term144497.getClass(), "source", null);
        setField(term144497, term144497.getClass(), "implementedInterfaces", null);
        setField(term144497, term144497.getClass(), "subTypes", null);
        setField(term144497, term144497.getClass(), "templateTypeName", null);
        setField(term144497, term144497.getClass(), "className", null);
        setField(term144497, term144497.getClass(), "properties", null);
        setField(term144497, term144497.getClass(), "implicitPrototype", null);
        setBooleanField(term144497, term144497.getClass(), "nativeType", false);
        setBooleanField(term144497, term144497.getClass(), "prettyPrint", false);
        setBooleanField(term144497, term144497.getClass(), "visited", false);
        setField(term144497, term144497.getClass(), "docInfo", null);
        setBooleanField(term144497, term144497.getClass(), "unknown", false);
        setBooleanField(term144497, term144497.getClass(), "resolved", false);
        setField(term144497, term144497.getClass(), "resolveResult", null);
        setField(term144497, term144497.getClass(), "registry", null);
        setField(term144496, term144496.getClass(), "referencedType", term144497);
        setBooleanField(term144496, term144496.getClass(), "visited", false);
        setField(term144496, term144496.getClass(), "docInfo", null);
        setBooleanField(term144496, term144496.getClass(), "unknown", false);
        setBooleanField(term144496, term144496.getClass(), "resolved", false);
        setField(term144496, term144496.getClass(), "resolveResult", null);
        setField(term144496, term144496.getClass(), "registry", null);
        term144498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term144498, term144498.getClass(), "resolved", false);
        setField(term144498, term144498.getClass(), "resolveResult", null);
        setField(term144498, term144498.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term144242;
        args[1] = term144336;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term144242, term144496));
        assertTrue(recursiveEquals(term144336, term144498));
        assertTrue(recursiveEquals(retValue, false));
    }

};


