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

public class JSType_getGreatestSubtype_1951394506423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104990;
     Object term105206;
     Object term105448;
     Object term105450;
     Object term105296;

    public JSType_getGreatestSubtype_1951394506423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104990 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term105108 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term105108, term105108.getClass(), "unknown", false);
        setField(term104990, term104990.getClass(), "referencedType", term105108);
        term105206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term105294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term105294, term105294.getClass(), "unknown", false);
        setField(term105206, term105206.getClass(), "referencedType", term105294);
        term105448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term105449 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term105448, term105448.getClass(), "indexType", null);
        setField(term105449, term105449.getClass(), "leastSupertypeVisitor", null);
        setField(term105449, term105449.getClass(), "greatestSubtypeVisitor", null);
        setField(term105449, term105449.getClass(), "call", null);
        setField(term105449, term105449.getClass(), "prototype", null);
        setField(term105449, term105449.getClass(), "kind", null);
        setField(term105449, term105449.getClass(), "typeOfThis", null);
        setField(term105449, term105449.getClass(), "source", null);
        setField(term105449, term105449.getClass(), "implementedInterfaces", null);
        setField(term105449, term105449.getClass(), "subTypes", null);
        setField(term105449, term105449.getClass(), "templateTypeName", null);
        setField(term105449, term105449.getClass(), "className", null);
        setField(term105449, term105449.getClass(), "properties", null);
        setField(term105449, term105449.getClass(), "implicitPrototype", null);
        setBooleanField(term105449, term105449.getClass(), "nativeType", false);
        setBooleanField(term105449, term105449.getClass(), "prettyPrint", false);
        setBooleanField(term105449, term105449.getClass(), "visited", false);
        setField(term105449, term105449.getClass(), "docInfo", null);
        setBooleanField(term105449, term105449.getClass(), "unknown", false);
        setBooleanField(term105449, term105449.getClass(), "resolved", false);
        setField(term105449, term105449.getClass(), "resolveResult", null);
        setField(term105449, term105449.getClass(), "registry", null);
        setField(term105448, term105448.getClass(), "referencedType", term105449);
        setBooleanField(term105448, term105448.getClass(), "visited", false);
        setField(term105448, term105448.getClass(), "docInfo", null);
        setBooleanField(term105448, term105448.getClass(), "unknown", false);
        setBooleanField(term105448, term105448.getClass(), "resolved", false);
        setField(term105448, term105448.getClass(), "resolveResult", null);
        setField(term105448, term105448.getClass(), "registry", null);
        term105450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term105451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term105450, term105450.getClass(), "indexType", null);
        setField(term105451, term105451.getClass(), "ownerFunction", null);
        setField(term105451, term105451.getClass(), "className", null);
        setField(term105451, term105451.getClass(), "properties", null);
        setField(term105451, term105451.getClass(), "implicitPrototype", null);
        setBooleanField(term105451, term105451.getClass(), "nativeType", false);
        setBooleanField(term105451, term105451.getClass(), "prettyPrint", false);
        setBooleanField(term105451, term105451.getClass(), "visited", false);
        setField(term105451, term105451.getClass(), "docInfo", null);
        setBooleanField(term105451, term105451.getClass(), "unknown", false);
        setBooleanField(term105451, term105451.getClass(), "resolved", false);
        setField(term105451, term105451.getClass(), "resolveResult", null);
        setField(term105451, term105451.getClass(), "registry", null);
        setField(term105450, term105450.getClass(), "referencedType", term105451);
        setBooleanField(term105450, term105450.getClass(), "visited", false);
        setField(term105450, term105450.getClass(), "docInfo", null);
        setBooleanField(term105450, term105450.getClass(), "unknown", false);
        setBooleanField(term105450, term105450.getClass(), "resolved", false);
        setField(term105450, term105450.getClass(), "resolveResult", null);
        setField(term105450, term105450.getClass(), "registry", null);
        term105296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term105297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term105296, term105296.getClass(), "indexType", null);
        setField(term105297, term105297.getClass(), "leastSupertypeVisitor", null);
        setField(term105297, term105297.getClass(), "greatestSubtypeVisitor", null);
        setField(term105297, term105297.getClass(), "call", null);
        setField(term105297, term105297.getClass(), "prototype", null);
        setField(term105297, term105297.getClass(), "kind", null);
        setField(term105297, term105297.getClass(), "typeOfThis", null);
        setField(term105297, term105297.getClass(), "source", null);
        setField(term105297, term105297.getClass(), "implementedInterfaces", null);
        setField(term105297, term105297.getClass(), "subTypes", null);
        setField(term105297, term105297.getClass(), "templateTypeName", null);
        setField(term105297, term105297.getClass(), "className", null);
        setField(term105297, term105297.getClass(), "properties", null);
        setField(term105297, term105297.getClass(), "implicitPrototype", null);
        setBooleanField(term105297, term105297.getClass(), "nativeType", false);
        setBooleanField(term105297, term105297.getClass(), "prettyPrint", false);
        setBooleanField(term105297, term105297.getClass(), "visited", false);
        setField(term105297, term105297.getClass(), "docInfo", null);
        setBooleanField(term105297, term105297.getClass(), "unknown", false);
        setBooleanField(term105297, term105297.getClass(), "resolved", false);
        setField(term105297, term105297.getClass(), "resolveResult", null);
        setField(term105297, term105297.getClass(), "registry", null);
        setField(term105296, term105296.getClass(), "referencedType", term105297);
        setBooleanField(term105296, term105296.getClass(), "visited", false);
        setField(term105296, term105296.getClass(), "docInfo", null);
        setBooleanField(term105296, term105296.getClass(), "unknown", false);
        setBooleanField(term105296, term105296.getClass(), "resolved", false);
        setField(term105296, term105296.getClass(), "resolveResult", null);
        setField(term105296, term105296.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term104990;
        args[1] = term105206;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term104990, term105448));
        assertTrue(recursiveEquals(term105206, term105450));
        assertTrue(recursiveEquals(retValue, term105296));
    }

};


