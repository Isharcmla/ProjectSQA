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

public class JSType_getGreatestSubtype_1951394506297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55545;
     Object term55737;
     Object term55807;
     Object term55808;
     Object term55754;

    public JSType_getGreatestSubtype_1951394506297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term55633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term55545, term55545.getClass(), "referencedType", term55633);
        term55737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term55807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term55807, term55807.getClass(), "call", null);
        setField(term55807, term55807.getClass(), "prototype", null);
        setField(term55807, term55807.getClass(), "kind", null);
        setField(term55807, term55807.getClass(), "typeOfThis", null);
        setField(term55807, term55807.getClass(), "source", null);
        setField(term55807, term55807.getClass(), "implementedInterfaces", null);
        setField(term55807, term55807.getClass(), "subTypes", null);
        setField(term55807, term55807.getClass(), "templateTypeName", null);
        setField(term55807, term55807.getClass(), "className", null);
        setField(term55807, term55807.getClass(), "properties", null);
        setBooleanField(term55807, term55807.getClass(), "nativeType", false);
        setField(term55807, term55807.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term55807, term55807.getClass(), "prettyPrint", false);
        setBooleanField(term55807, term55807.getClass(), "visited", false);
        setField(term55807, term55807.getClass(), "docInfo", null);
        setBooleanField(term55807, term55807.getClass(), "unknown", false);
        setBooleanField(term55807, term55807.getClass(), "resolved", false);
        setField(term55807, term55807.getClass(), "resolveResult", null);
        setField(term55807, term55807.getClass(), "registry", null);
        term55808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term55809 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term55808, term55808.getClass(), "indexType", null);
        setField(term55809, term55809.getClass(), "call", null);
        setField(term55809, term55809.getClass(), "prototype", null);
        setField(term55809, term55809.getClass(), "kind", null);
        setField(term55809, term55809.getClass(), "typeOfThis", null);
        setField(term55809, term55809.getClass(), "source", null);
        setField(term55809, term55809.getClass(), "implementedInterfaces", null);
        setField(term55809, term55809.getClass(), "subTypes", null);
        setField(term55809, term55809.getClass(), "templateTypeName", null);
        setField(term55809, term55809.getClass(), "className", null);
        setField(term55809, term55809.getClass(), "properties", null);
        setBooleanField(term55809, term55809.getClass(), "nativeType", false);
        setField(term55809, term55809.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term55809, term55809.getClass(), "prettyPrint", false);
        setBooleanField(term55809, term55809.getClass(), "visited", false);
        setField(term55809, term55809.getClass(), "docInfo", null);
        setBooleanField(term55809, term55809.getClass(), "unknown", false);
        setBooleanField(term55809, term55809.getClass(), "resolved", false);
        setField(term55809, term55809.getClass(), "resolveResult", null);
        setField(term55809, term55809.getClass(), "registry", null);
        setField(term55808, term55808.getClass(), "referencedType", term55809);
        setField(term55808, term55808.getClass(), "referencedObjType", null);
        setBooleanField(term55808, term55808.getClass(), "visited", false);
        setField(term55808, term55808.getClass(), "docInfo", null);
        setBooleanField(term55808, term55808.getClass(), "unknown", false);
        setBooleanField(term55808, term55808.getClass(), "resolved", false);
        setField(term55808, term55808.getClass(), "resolveResult", null);
        setField(term55808, term55808.getClass(), "registry", null);
        term55754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term55755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term55754, term55754.getClass(), "indexType", null);
        setField(term55755, term55755.getClass(), "call", null);
        setField(term55755, term55755.getClass(), "prototype", null);
        setField(term55755, term55755.getClass(), "kind", null);
        setField(term55755, term55755.getClass(), "typeOfThis", null);
        setField(term55755, term55755.getClass(), "source", null);
        setField(term55755, term55755.getClass(), "implementedInterfaces", null);
        setField(term55755, term55755.getClass(), "subTypes", null);
        setField(term55755, term55755.getClass(), "templateTypeName", null);
        setField(term55755, term55755.getClass(), "className", null);
        setField(term55755, term55755.getClass(), "properties", null);
        setBooleanField(term55755, term55755.getClass(), "nativeType", false);
        setField(term55755, term55755.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term55755, term55755.getClass(), "prettyPrint", false);
        setBooleanField(term55755, term55755.getClass(), "visited", false);
        setField(term55755, term55755.getClass(), "docInfo", null);
        setBooleanField(term55755, term55755.getClass(), "unknown", false);
        setBooleanField(term55755, term55755.getClass(), "resolved", false);
        setField(term55755, term55755.getClass(), "resolveResult", null);
        setField(term55755, term55755.getClass(), "registry", null);
        setField(term55754, term55754.getClass(), "referencedType", term55755);
        setField(term55754, term55754.getClass(), "referencedObjType", null);
        setBooleanField(term55754, term55754.getClass(), "visited", false);
        setField(term55754, term55754.getClass(), "docInfo", null);
        setBooleanField(term55754, term55754.getClass(), "unknown", false);
        setBooleanField(term55754, term55754.getClass(), "resolved", false);
        setField(term55754, term55754.getClass(), "resolveResult", null);
        setField(term55754, term55754.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term55545;
        args[1] = term55737;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term55545, term55807));
        assertTrue(recursiveEquals(term55737, term55808));
        assertTrue(recursiveEquals(retValue, term55754));
    }

};


