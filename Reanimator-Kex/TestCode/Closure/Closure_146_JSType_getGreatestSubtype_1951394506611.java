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

public class JSType_getGreatestSubtype_1951394506611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172078;
     Object term172294;
     Object term172536;
     Object term172538;
     Object term172384;

    public JSType_getGreatestSubtype_1951394506611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172078 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term172196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term172196, term172196.getClass(), "unknown", false);
        setField(term172078, term172078.getClass(), "referencedType", term172196);
        term172294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term172382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term172382, term172382.getClass(), "unknown", false);
        setField(term172294, term172294.getClass(), "referencedType", term172382);
        term172536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term172537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term172536, term172536.getClass(), "indexType", null);
        setField(term172537, term172537.getClass(), "leastSupertypeVisitor", null);
        setField(term172537, term172537.getClass(), "greatestSubtypeVisitor", null);
        setField(term172537, term172537.getClass(), "call", null);
        setField(term172537, term172537.getClass(), "prototype", null);
        setField(term172537, term172537.getClass(), "kind", null);
        setField(term172537, term172537.getClass(), "typeOfThis", null);
        setField(term172537, term172537.getClass(), "source", null);
        setField(term172537, term172537.getClass(), "implementedInterfaces", null);
        setField(term172537, term172537.getClass(), "subTypes", null);
        setField(term172537, term172537.getClass(), "templateTypeName", null);
        setField(term172537, term172537.getClass(), "className", null);
        setField(term172537, term172537.getClass(), "properties", null);
        setField(term172537, term172537.getClass(), "implicitPrototype", null);
        setBooleanField(term172537, term172537.getClass(), "nativeType", false);
        setBooleanField(term172537, term172537.getClass(), "prettyPrint", false);
        setBooleanField(term172537, term172537.getClass(), "visited", false);
        setField(term172537, term172537.getClass(), "docInfo", null);
        setBooleanField(term172537, term172537.getClass(), "unknown", false);
        setBooleanField(term172537, term172537.getClass(), "resolved", false);
        setField(term172537, term172537.getClass(), "resolveResult", null);
        setField(term172537, term172537.getClass(), "registry", null);
        setField(term172536, term172536.getClass(), "referencedType", term172537);
        setBooleanField(term172536, term172536.getClass(), "visited", false);
        setField(term172536, term172536.getClass(), "docInfo", null);
        setBooleanField(term172536, term172536.getClass(), "unknown", false);
        setBooleanField(term172536, term172536.getClass(), "resolved", false);
        setField(term172536, term172536.getClass(), "resolveResult", null);
        setField(term172536, term172536.getClass(), "registry", null);
        term172538 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term172539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term172538, term172538.getClass(), "parameterType", null);
        setField(term172539, term172539.getClass(), "ownerFunction", null);
        setField(term172539, term172539.getClass(), "className", null);
        setField(term172539, term172539.getClass(), "properties", null);
        setField(term172539, term172539.getClass(), "implicitPrototype", null);
        setBooleanField(term172539, term172539.getClass(), "nativeType", false);
        setBooleanField(term172539, term172539.getClass(), "prettyPrint", false);
        setBooleanField(term172539, term172539.getClass(), "visited", false);
        setField(term172539, term172539.getClass(), "docInfo", null);
        setBooleanField(term172539, term172539.getClass(), "unknown", false);
        setBooleanField(term172539, term172539.getClass(), "resolved", false);
        setField(term172539, term172539.getClass(), "resolveResult", null);
        setField(term172539, term172539.getClass(), "registry", null);
        setField(term172538, term172538.getClass(), "referencedType", term172539);
        setBooleanField(term172538, term172538.getClass(), "visited", false);
        setField(term172538, term172538.getClass(), "docInfo", null);
        setBooleanField(term172538, term172538.getClass(), "unknown", false);
        setBooleanField(term172538, term172538.getClass(), "resolved", false);
        setField(term172538, term172538.getClass(), "resolveResult", null);
        setField(term172538, term172538.getClass(), "registry", null);
        term172384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term172385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term172384, term172384.getClass(), "indexType", null);
        setField(term172385, term172385.getClass(), "leastSupertypeVisitor", null);
        setField(term172385, term172385.getClass(), "greatestSubtypeVisitor", null);
        setField(term172385, term172385.getClass(), "call", null);
        setField(term172385, term172385.getClass(), "prototype", null);
        setField(term172385, term172385.getClass(), "kind", null);
        setField(term172385, term172385.getClass(), "typeOfThis", null);
        setField(term172385, term172385.getClass(), "source", null);
        setField(term172385, term172385.getClass(), "implementedInterfaces", null);
        setField(term172385, term172385.getClass(), "subTypes", null);
        setField(term172385, term172385.getClass(), "templateTypeName", null);
        setField(term172385, term172385.getClass(), "className", null);
        setField(term172385, term172385.getClass(), "properties", null);
        setField(term172385, term172385.getClass(), "implicitPrototype", null);
        setBooleanField(term172385, term172385.getClass(), "nativeType", false);
        setBooleanField(term172385, term172385.getClass(), "prettyPrint", false);
        setBooleanField(term172385, term172385.getClass(), "visited", false);
        setField(term172385, term172385.getClass(), "docInfo", null);
        setBooleanField(term172385, term172385.getClass(), "unknown", false);
        setBooleanField(term172385, term172385.getClass(), "resolved", false);
        setField(term172385, term172385.getClass(), "resolveResult", null);
        setField(term172385, term172385.getClass(), "registry", null);
        setField(term172384, term172384.getClass(), "referencedType", term172385);
        setBooleanField(term172384, term172384.getClass(), "visited", false);
        setField(term172384, term172384.getClass(), "docInfo", null);
        setBooleanField(term172384, term172384.getClass(), "unknown", false);
        setBooleanField(term172384, term172384.getClass(), "resolved", false);
        setField(term172384, term172384.getClass(), "resolveResult", null);
        setField(term172384, term172384.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term172078;
        args[1] = term172294;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term172078, term172536));
        assertTrue(recursiveEquals(term172294, term172538));
        assertTrue(recursiveEquals(retValue, term172384));
    }

};


