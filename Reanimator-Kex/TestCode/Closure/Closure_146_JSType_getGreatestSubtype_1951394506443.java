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

public class JSType_getGreatestSubtype_1951394506443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112931;
     Object term113147;
     Object term113389;
     Object term113391;
     Object term113237;

    public JSType_getGreatestSubtype_1951394506443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term113049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term113049, term113049.getClass(), "unknown", false);
        setField(term112931, term112931.getClass(), "referencedType", term113049);
        term113147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term113235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term113235, term113235.getClass(), "unknown", false);
        setField(term113147, term113147.getClass(), "referencedType", term113235);
        term113389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term113390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term113389, term113389.getClass(), "indexType", null);
        setField(term113390, term113390.getClass(), "leastSupertypeVisitor", null);
        setField(term113390, term113390.getClass(), "greatestSubtypeVisitor", null);
        setField(term113390, term113390.getClass(), "call", null);
        setField(term113390, term113390.getClass(), "prototype", null);
        setField(term113390, term113390.getClass(), "kind", null);
        setField(term113390, term113390.getClass(), "typeOfThis", null);
        setField(term113390, term113390.getClass(), "source", null);
        setField(term113390, term113390.getClass(), "implementedInterfaces", null);
        setField(term113390, term113390.getClass(), "subTypes", null);
        setField(term113390, term113390.getClass(), "templateTypeName", null);
        setField(term113390, term113390.getClass(), "className", null);
        setField(term113390, term113390.getClass(), "properties", null);
        setField(term113390, term113390.getClass(), "implicitPrototype", null);
        setBooleanField(term113390, term113390.getClass(), "nativeType", false);
        setBooleanField(term113390, term113390.getClass(), "prettyPrint", false);
        setBooleanField(term113390, term113390.getClass(), "visited", false);
        setField(term113390, term113390.getClass(), "docInfo", null);
        setBooleanField(term113390, term113390.getClass(), "unknown", false);
        setBooleanField(term113390, term113390.getClass(), "resolved", false);
        setField(term113390, term113390.getClass(), "resolveResult", null);
        setField(term113390, term113390.getClass(), "registry", null);
        setField(term113389, term113389.getClass(), "referencedType", term113390);
        setBooleanField(term113389, term113389.getClass(), "visited", false);
        setField(term113389, term113389.getClass(), "docInfo", null);
        setBooleanField(term113389, term113389.getClass(), "unknown", false);
        setBooleanField(term113389, term113389.getClass(), "resolved", false);
        setField(term113389, term113389.getClass(), "resolveResult", null);
        setField(term113389, term113389.getClass(), "registry", null);
        term113391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term113392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term113391, term113391.getClass(), "indexType", null);
        setField(term113392, term113392.getClass(), "ownerFunction", null);
        setField(term113392, term113392.getClass(), "className", null);
        setField(term113392, term113392.getClass(), "properties", null);
        setField(term113392, term113392.getClass(), "implicitPrototype", null);
        setBooleanField(term113392, term113392.getClass(), "nativeType", false);
        setBooleanField(term113392, term113392.getClass(), "prettyPrint", false);
        setBooleanField(term113392, term113392.getClass(), "visited", false);
        setField(term113392, term113392.getClass(), "docInfo", null);
        setBooleanField(term113392, term113392.getClass(), "unknown", false);
        setBooleanField(term113392, term113392.getClass(), "resolved", false);
        setField(term113392, term113392.getClass(), "resolveResult", null);
        setField(term113392, term113392.getClass(), "registry", null);
        setField(term113391, term113391.getClass(), "referencedType", term113392);
        setBooleanField(term113391, term113391.getClass(), "visited", false);
        setField(term113391, term113391.getClass(), "docInfo", null);
        setBooleanField(term113391, term113391.getClass(), "unknown", false);
        setBooleanField(term113391, term113391.getClass(), "resolved", false);
        setField(term113391, term113391.getClass(), "resolveResult", null);
        setField(term113391, term113391.getClass(), "registry", null);
        term113237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term113238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term113237, term113237.getClass(), "indexType", null);
        setField(term113238, term113238.getClass(), "leastSupertypeVisitor", null);
        setField(term113238, term113238.getClass(), "greatestSubtypeVisitor", null);
        setField(term113238, term113238.getClass(), "call", null);
        setField(term113238, term113238.getClass(), "prototype", null);
        setField(term113238, term113238.getClass(), "kind", null);
        setField(term113238, term113238.getClass(), "typeOfThis", null);
        setField(term113238, term113238.getClass(), "source", null);
        setField(term113238, term113238.getClass(), "implementedInterfaces", null);
        setField(term113238, term113238.getClass(), "subTypes", null);
        setField(term113238, term113238.getClass(), "templateTypeName", null);
        setField(term113238, term113238.getClass(), "className", null);
        setField(term113238, term113238.getClass(), "properties", null);
        setField(term113238, term113238.getClass(), "implicitPrototype", null);
        setBooleanField(term113238, term113238.getClass(), "nativeType", false);
        setBooleanField(term113238, term113238.getClass(), "prettyPrint", false);
        setBooleanField(term113238, term113238.getClass(), "visited", false);
        setField(term113238, term113238.getClass(), "docInfo", null);
        setBooleanField(term113238, term113238.getClass(), "unknown", false);
        setBooleanField(term113238, term113238.getClass(), "resolved", false);
        setField(term113238, term113238.getClass(), "resolveResult", null);
        setField(term113238, term113238.getClass(), "registry", null);
        setField(term113237, term113237.getClass(), "referencedType", term113238);
        setBooleanField(term113237, term113237.getClass(), "visited", false);
        setField(term113237, term113237.getClass(), "docInfo", null);
        setBooleanField(term113237, term113237.getClass(), "unknown", false);
        setBooleanField(term113237, term113237.getClass(), "resolved", false);
        setField(term113237, term113237.getClass(), "resolveResult", null);
        setField(term113237, term113237.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term112931;
        args[1] = term113147;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term112931, term113389));
        assertTrue(recursiveEquals(term113147, term113391));
        assertTrue(recursiveEquals(retValue, term113237));
    }

};


