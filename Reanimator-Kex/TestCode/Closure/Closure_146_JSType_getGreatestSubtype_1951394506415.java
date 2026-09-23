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

public class JSType_getGreatestSubtype_1951394506415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102723;
     Object term102939;
     Object term103181;
     Object term103183;
     Object term103029;

    public JSType_getGreatestSubtype_1951394506415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term102841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term102841, term102841.getClass(), "unknown", false);
        setField(term102723, term102723.getClass(), "referencedType", term102841);
        term102939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term103027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term103027, term103027.getClass(), "unknown", false);
        setField(term102939, term102939.getClass(), "referencedType", term103027);
        term103181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term103182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term103181, term103181.getClass(), "indexType", null);
        setField(term103182, term103182.getClass(), "leastSupertypeVisitor", null);
        setField(term103182, term103182.getClass(), "greatestSubtypeVisitor", null);
        setField(term103182, term103182.getClass(), "call", null);
        setField(term103182, term103182.getClass(), "prototype", null);
        setField(term103182, term103182.getClass(), "kind", null);
        setField(term103182, term103182.getClass(), "typeOfThis", null);
        setField(term103182, term103182.getClass(), "source", null);
        setField(term103182, term103182.getClass(), "implementedInterfaces", null);
        setField(term103182, term103182.getClass(), "subTypes", null);
        setField(term103182, term103182.getClass(), "templateTypeName", null);
        setField(term103182, term103182.getClass(), "className", null);
        setField(term103182, term103182.getClass(), "properties", null);
        setField(term103182, term103182.getClass(), "implicitPrototype", null);
        setBooleanField(term103182, term103182.getClass(), "nativeType", false);
        setBooleanField(term103182, term103182.getClass(), "prettyPrint", false);
        setBooleanField(term103182, term103182.getClass(), "visited", false);
        setField(term103182, term103182.getClass(), "docInfo", null);
        setBooleanField(term103182, term103182.getClass(), "unknown", false);
        setBooleanField(term103182, term103182.getClass(), "resolved", false);
        setField(term103182, term103182.getClass(), "resolveResult", null);
        setField(term103182, term103182.getClass(), "registry", null);
        setField(term103181, term103181.getClass(), "referencedType", term103182);
        setBooleanField(term103181, term103181.getClass(), "visited", false);
        setField(term103181, term103181.getClass(), "docInfo", null);
        setBooleanField(term103181, term103181.getClass(), "unknown", false);
        setBooleanField(term103181, term103181.getClass(), "resolved", false);
        setField(term103181, term103181.getClass(), "resolveResult", null);
        setField(term103181, term103181.getClass(), "registry", null);
        term103183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term103184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term103183, term103183.getClass(), "indexType", null);
        setField(term103184, term103184.getClass(), "ownerFunction", null);
        setField(term103184, term103184.getClass(), "className", null);
        setField(term103184, term103184.getClass(), "properties", null);
        setField(term103184, term103184.getClass(), "implicitPrototype", null);
        setBooleanField(term103184, term103184.getClass(), "nativeType", false);
        setBooleanField(term103184, term103184.getClass(), "prettyPrint", false);
        setBooleanField(term103184, term103184.getClass(), "visited", false);
        setField(term103184, term103184.getClass(), "docInfo", null);
        setBooleanField(term103184, term103184.getClass(), "unknown", false);
        setBooleanField(term103184, term103184.getClass(), "resolved", false);
        setField(term103184, term103184.getClass(), "resolveResult", null);
        setField(term103184, term103184.getClass(), "registry", null);
        setField(term103183, term103183.getClass(), "referencedType", term103184);
        setBooleanField(term103183, term103183.getClass(), "visited", false);
        setField(term103183, term103183.getClass(), "docInfo", null);
        setBooleanField(term103183, term103183.getClass(), "unknown", false);
        setBooleanField(term103183, term103183.getClass(), "resolved", false);
        setField(term103183, term103183.getClass(), "resolveResult", null);
        setField(term103183, term103183.getClass(), "registry", null);
        term103029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term103030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term103029, term103029.getClass(), "indexType", null);
        setField(term103030, term103030.getClass(), "leastSupertypeVisitor", null);
        setField(term103030, term103030.getClass(), "greatestSubtypeVisitor", null);
        setField(term103030, term103030.getClass(), "call", null);
        setField(term103030, term103030.getClass(), "prototype", null);
        setField(term103030, term103030.getClass(), "kind", null);
        setField(term103030, term103030.getClass(), "typeOfThis", null);
        setField(term103030, term103030.getClass(), "source", null);
        setField(term103030, term103030.getClass(), "implementedInterfaces", null);
        setField(term103030, term103030.getClass(), "subTypes", null);
        setField(term103030, term103030.getClass(), "templateTypeName", null);
        setField(term103030, term103030.getClass(), "className", null);
        setField(term103030, term103030.getClass(), "properties", null);
        setField(term103030, term103030.getClass(), "implicitPrototype", null);
        setBooleanField(term103030, term103030.getClass(), "nativeType", false);
        setBooleanField(term103030, term103030.getClass(), "prettyPrint", false);
        setBooleanField(term103030, term103030.getClass(), "visited", false);
        setField(term103030, term103030.getClass(), "docInfo", null);
        setBooleanField(term103030, term103030.getClass(), "unknown", false);
        setBooleanField(term103030, term103030.getClass(), "resolved", false);
        setField(term103030, term103030.getClass(), "resolveResult", null);
        setField(term103030, term103030.getClass(), "registry", null);
        setField(term103029, term103029.getClass(), "referencedType", term103030);
        setBooleanField(term103029, term103029.getClass(), "visited", false);
        setField(term103029, term103029.getClass(), "docInfo", null);
        setBooleanField(term103029, term103029.getClass(), "unknown", false);
        setBooleanField(term103029, term103029.getClass(), "resolved", false);
        setField(term103029, term103029.getClass(), "resolveResult", null);
        setField(term103029, term103029.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term102723;
        args[1] = term102939;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term102723, term103181));
        assertTrue(recursiveEquals(term102939, term103183));
        assertTrue(recursiveEquals(retValue, term103029));
    }

};


