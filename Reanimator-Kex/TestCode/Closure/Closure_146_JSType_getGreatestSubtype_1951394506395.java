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

public class JSType_getGreatestSubtype_1951394506395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94980;
     Object term95196;
     Object term95546;
     Object term95548;
     Object term95394;

    public JSType_getGreatestSubtype_1951394506395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term95098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term95098, term95098.getClass(), "unknown", false);
        setField(term95098, term95098.getClass(), "implicitPrototype", null);
        setField(term94980, term94980.getClass(), "referencedType", term95098);
        term95196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term95284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term95196, term95196.getClass(), "referencedType", term95284);
        term95546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term95547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term95546, term95546.getClass(), "indexType", null);
        setField(term95547, term95547.getClass(), "leastSupertypeVisitor", null);
        setField(term95547, term95547.getClass(), "greatestSubtypeVisitor", null);
        setField(term95547, term95547.getClass(), "call", null);
        setField(term95547, term95547.getClass(), "prototype", null);
        setField(term95547, term95547.getClass(), "kind", null);
        setField(term95547, term95547.getClass(), "typeOfThis", null);
        setField(term95547, term95547.getClass(), "source", null);
        setField(term95547, term95547.getClass(), "implementedInterfaces", null);
        setField(term95547, term95547.getClass(), "subTypes", null);
        setField(term95547, term95547.getClass(), "templateTypeName", null);
        setField(term95547, term95547.getClass(), "className", null);
        setField(term95547, term95547.getClass(), "properties", null);
        setField(term95547, term95547.getClass(), "implicitPrototype", null);
        setBooleanField(term95547, term95547.getClass(), "nativeType", false);
        setBooleanField(term95547, term95547.getClass(), "prettyPrint", false);
        setBooleanField(term95547, term95547.getClass(), "visited", false);
        setField(term95547, term95547.getClass(), "docInfo", null);
        setBooleanField(term95547, term95547.getClass(), "unknown", false);
        setBooleanField(term95547, term95547.getClass(), "resolved", false);
        setField(term95547, term95547.getClass(), "resolveResult", null);
        setField(term95547, term95547.getClass(), "registry", null);
        setField(term95546, term95546.getClass(), "referencedType", term95547);
        setBooleanField(term95546, term95546.getClass(), "visited", false);
        setField(term95546, term95546.getClass(), "docInfo", null);
        setBooleanField(term95546, term95546.getClass(), "unknown", false);
        setBooleanField(term95546, term95546.getClass(), "resolved", false);
        setField(term95546, term95546.getClass(), "resolveResult", null);
        setField(term95546, term95546.getClass(), "registry", null);
        term95548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term95549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term95548, term95548.getClass(), "indexType", null);
        setField(term95549, term95549.getClass(), "ownerFunction", null);
        setField(term95549, term95549.getClass(), "className", null);
        setField(term95549, term95549.getClass(), "properties", null);
        setField(term95549, term95549.getClass(), "implicitPrototype", null);
        setBooleanField(term95549, term95549.getClass(), "nativeType", false);
        setBooleanField(term95549, term95549.getClass(), "prettyPrint", false);
        setBooleanField(term95549, term95549.getClass(), "visited", false);
        setField(term95549, term95549.getClass(), "docInfo", null);
        setBooleanField(term95549, term95549.getClass(), "unknown", false);
        setBooleanField(term95549, term95549.getClass(), "resolved", false);
        setField(term95549, term95549.getClass(), "resolveResult", null);
        setField(term95549, term95549.getClass(), "registry", null);
        setField(term95548, term95548.getClass(), "referencedType", term95549);
        setBooleanField(term95548, term95548.getClass(), "visited", false);
        setField(term95548, term95548.getClass(), "docInfo", null);
        setBooleanField(term95548, term95548.getClass(), "unknown", false);
        setBooleanField(term95548, term95548.getClass(), "resolved", false);
        setField(term95548, term95548.getClass(), "resolveResult", null);
        setField(term95548, term95548.getClass(), "registry", null);
        term95394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term95395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term95394, term95394.getClass(), "indexType", null);
        setField(term95395, term95395.getClass(), "leastSupertypeVisitor", null);
        setField(term95395, term95395.getClass(), "greatestSubtypeVisitor", null);
        setField(term95395, term95395.getClass(), "call", null);
        setField(term95395, term95395.getClass(), "prototype", null);
        setField(term95395, term95395.getClass(), "kind", null);
        setField(term95395, term95395.getClass(), "typeOfThis", null);
        setField(term95395, term95395.getClass(), "source", null);
        setField(term95395, term95395.getClass(), "implementedInterfaces", null);
        setField(term95395, term95395.getClass(), "subTypes", null);
        setField(term95395, term95395.getClass(), "templateTypeName", null);
        setField(term95395, term95395.getClass(), "className", null);
        setField(term95395, term95395.getClass(), "properties", null);
        setField(term95395, term95395.getClass(), "implicitPrototype", null);
        setBooleanField(term95395, term95395.getClass(), "nativeType", false);
        setBooleanField(term95395, term95395.getClass(), "prettyPrint", false);
        setBooleanField(term95395, term95395.getClass(), "visited", false);
        setField(term95395, term95395.getClass(), "docInfo", null);
        setBooleanField(term95395, term95395.getClass(), "unknown", false);
        setBooleanField(term95395, term95395.getClass(), "resolved", false);
        setField(term95395, term95395.getClass(), "resolveResult", null);
        setField(term95395, term95395.getClass(), "registry", null);
        setField(term95394, term95394.getClass(), "referencedType", term95395);
        setBooleanField(term95394, term95394.getClass(), "visited", false);
        setField(term95394, term95394.getClass(), "docInfo", null);
        setBooleanField(term95394, term95394.getClass(), "unknown", false);
        setBooleanField(term95394, term95394.getClass(), "resolved", false);
        setField(term95394, term95394.getClass(), "resolveResult", null);
        setField(term95394, term95394.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term94980;
        args[1] = term95196;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term94980, term95546));
        assertTrue(recursiveEquals(term95196, term95548));
        assertTrue(recursiveEquals(retValue, term95394));
    }

};


