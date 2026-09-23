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

public class JSType_getGreatestSubtype_1951394506317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62903;
     Object term63059;
     Object term63081;
     Object term63082;
     Object term63076;

    public JSType_getGreatestSubtype_1951394506317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62903 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        term63059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term62903, term62903.getClass(), "referencedType", term63059);
        term63081 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term63081, term63081.getClass(), "call", null);
        setField(term63081, term63081.getClass(), "prototype", null);
        setField(term63081, term63081.getClass(), "kind", null);
        setField(term63081, term63081.getClass(), "typeOfThis", null);
        setField(term63081, term63081.getClass(), "source", null);
        setField(term63081, term63081.getClass(), "implementedInterfaces", null);
        setField(term63081, term63081.getClass(), "subTypes", null);
        setField(term63081, term63081.getClass(), "templateTypeName", null);
        setField(term63081, term63081.getClass(), "className", null);
        setField(term63081, term63081.getClass(), "properties", null);
        setBooleanField(term63081, term63081.getClass(), "nativeType", false);
        setField(term63081, term63081.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term63081, term63081.getClass(), "prettyPrint", false);
        setBooleanField(term63081, term63081.getClass(), "visited", false);
        setField(term63081, term63081.getClass(), "docInfo", null);
        setBooleanField(term63081, term63081.getClass(), "unknown", false);
        setBooleanField(term63081, term63081.getClass(), "resolved", false);
        setField(term63081, term63081.getClass(), "resolveResult", null);
        setField(term63081, term63081.getClass(), "registry", null);
        term63082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term63083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term63082, term63082.getClass(), "indexType", null);
        setField(term63083, term63083.getClass(), "call", null);
        setField(term63083, term63083.getClass(), "prototype", null);
        setField(term63083, term63083.getClass(), "kind", null);
        setField(term63083, term63083.getClass(), "typeOfThis", null);
        setField(term63083, term63083.getClass(), "source", null);
        setField(term63083, term63083.getClass(), "implementedInterfaces", null);
        setField(term63083, term63083.getClass(), "subTypes", null);
        setField(term63083, term63083.getClass(), "templateTypeName", null);
        setField(term63083, term63083.getClass(), "className", null);
        setField(term63083, term63083.getClass(), "properties", null);
        setBooleanField(term63083, term63083.getClass(), "nativeType", false);
        setField(term63083, term63083.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term63083, term63083.getClass(), "prettyPrint", false);
        setBooleanField(term63083, term63083.getClass(), "visited", false);
        setField(term63083, term63083.getClass(), "docInfo", null);
        setBooleanField(term63083, term63083.getClass(), "unknown", false);
        setBooleanField(term63083, term63083.getClass(), "resolved", false);
        setField(term63083, term63083.getClass(), "resolveResult", null);
        setField(term63083, term63083.getClass(), "registry", null);
        setField(term63082, term63082.getClass(), "referencedType", term63083);
        setField(term63082, term63082.getClass(), "referencedObjType", null);
        setBooleanField(term63082, term63082.getClass(), "visited", false);
        setField(term63082, term63082.getClass(), "docInfo", null);
        setBooleanField(term63082, term63082.getClass(), "unknown", false);
        setBooleanField(term63082, term63082.getClass(), "resolved", false);
        setField(term63082, term63082.getClass(), "resolveResult", null);
        setField(term63082, term63082.getClass(), "registry", null);
        term63076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term63069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term63076, term63076.getClass(), "indexType", null);
        setField(term63069, term63069.getClass(), "call", null);
        setField(term63069, term63069.getClass(), "prototype", null);
        setField(term63069, term63069.getClass(), "kind", null);
        setField(term63069, term63069.getClass(), "typeOfThis", null);
        setField(term63069, term63069.getClass(), "source", null);
        setField(term63069, term63069.getClass(), "implementedInterfaces", null);
        setField(term63069, term63069.getClass(), "subTypes", null);
        setField(term63069, term63069.getClass(), "templateTypeName", null);
        setField(term63069, term63069.getClass(), "className", null);
        setField(term63069, term63069.getClass(), "properties", null);
        setBooleanField(term63069, term63069.getClass(), "nativeType", false);
        setField(term63069, term63069.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term63069, term63069.getClass(), "prettyPrint", false);
        setBooleanField(term63069, term63069.getClass(), "visited", false);
        setField(term63069, term63069.getClass(), "docInfo", null);
        setBooleanField(term63069, term63069.getClass(), "unknown", false);
        setBooleanField(term63069, term63069.getClass(), "resolved", false);
        setField(term63069, term63069.getClass(), "resolveResult", null);
        setField(term63069, term63069.getClass(), "registry", null);
        setField(term63076, term63076.getClass(), "referencedType", term63069);
        setField(term63076, term63076.getClass(), "referencedObjType", null);
        setBooleanField(term63076, term63076.getClass(), "visited", false);
        setField(term63076, term63076.getClass(), "docInfo", null);
        setBooleanField(term63076, term63076.getClass(), "unknown", false);
        setBooleanField(term63076, term63076.getClass(), "resolved", false);
        setField(term63076, term63076.getClass(), "resolveResult", null);
        setField(term63076, term63076.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term62903;
        args[1] = term63059;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term62903, term63081));
        assertTrue(recursiveEquals(term63059, term63082));
        assertTrue(recursiveEquals(retValue, term63076));
    }

};


