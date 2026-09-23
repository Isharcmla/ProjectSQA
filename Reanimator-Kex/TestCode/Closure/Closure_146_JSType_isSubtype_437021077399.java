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

public class JSType_isSubtype_437021077399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96028;
     Object term96134;
     Object term96263;
     Object term96265;

    public JSType_isSubtype_437021077399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term96134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term96222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term96222, term96222.getClass(), "unknown", false);
        setField(term96134, term96134.getClass(), "referencedType", term96222);
        term96263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term96264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term96264, term96264.getClass(), "leastSupertypeVisitor", null);
        setField(term96264, term96264.getClass(), "greatestSubtypeVisitor", null);
        setField(term96264, term96264.getClass(), "call", null);
        setField(term96264, term96264.getClass(), "prototype", null);
        setField(term96264, term96264.getClass(), "kind", null);
        setField(term96264, term96264.getClass(), "typeOfThis", null);
        setField(term96264, term96264.getClass(), "source", null);
        setField(term96264, term96264.getClass(), "implementedInterfaces", null);
        setField(term96264, term96264.getClass(), "subTypes", null);
        setField(term96264, term96264.getClass(), "templateTypeName", null);
        setField(term96264, term96264.getClass(), "className", null);
        setField(term96264, term96264.getClass(), "properties", null);
        setField(term96264, term96264.getClass(), "implicitPrototype", null);
        setBooleanField(term96264, term96264.getClass(), "nativeType", false);
        setBooleanField(term96264, term96264.getClass(), "prettyPrint", false);
        setBooleanField(term96264, term96264.getClass(), "visited", false);
        setField(term96264, term96264.getClass(), "docInfo", null);
        setBooleanField(term96264, term96264.getClass(), "unknown", false);
        setBooleanField(term96264, term96264.getClass(), "resolved", false);
        setField(term96264, term96264.getClass(), "resolveResult", null);
        setField(term96264, term96264.getClass(), "registry", null);
        setField(term96263, term96263.getClass(), "referencedType", term96264);
        setBooleanField(term96263, term96263.getClass(), "visited", false);
        setField(term96263, term96263.getClass(), "docInfo", null);
        setBooleanField(term96263, term96263.getClass(), "unknown", false);
        setBooleanField(term96263, term96263.getClass(), "resolved", false);
        setField(term96263, term96263.getClass(), "resolveResult", null);
        setField(term96263, term96263.getClass(), "registry", null);
        term96265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term96265, term96265.getClass(), "resolved", false);
        setField(term96265, term96265.getClass(), "resolveResult", null);
        setField(term96265, term96265.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term96028;
        args[1] = term96134;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term96028, term96263));
        assertTrue(recursiveEquals(term96134, term96265));
        assertTrue(recursiveEquals(retValue, false));
    }

};


