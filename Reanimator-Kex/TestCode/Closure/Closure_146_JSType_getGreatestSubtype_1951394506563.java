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

public class JSType_getGreatestSubtype_1951394506563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156635;
     Object term156851;
     Object term157093;
     Object term157095;
     Object term156941;

    public JSType_getGreatestSubtype_1951394506563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term156753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term156753, term156753.getClass(), "unknown", false);
        setField(term156753, term156753.getClass(), "implicitPrototype", null);
        setField(term156635, term156635.getClass(), "referencedType", term156753);
        term156851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term156939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term156851, term156851.getClass(), "referencedType", term156939);
        term157093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term157094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term157093, term157093.getClass(), "indexType", null);
        setField(term157094, term157094.getClass(), "leastSupertypeVisitor", null);
        setField(term157094, term157094.getClass(), "greatestSubtypeVisitor", null);
        setField(term157094, term157094.getClass(), "call", null);
        setField(term157094, term157094.getClass(), "prototype", null);
        setField(term157094, term157094.getClass(), "kind", null);
        setField(term157094, term157094.getClass(), "typeOfThis", null);
        setField(term157094, term157094.getClass(), "source", null);
        setField(term157094, term157094.getClass(), "implementedInterfaces", null);
        setField(term157094, term157094.getClass(), "subTypes", null);
        setField(term157094, term157094.getClass(), "templateTypeName", null);
        setField(term157094, term157094.getClass(), "className", null);
        setField(term157094, term157094.getClass(), "properties", null);
        setField(term157094, term157094.getClass(), "implicitPrototype", null);
        setBooleanField(term157094, term157094.getClass(), "nativeType", false);
        setBooleanField(term157094, term157094.getClass(), "prettyPrint", false);
        setBooleanField(term157094, term157094.getClass(), "visited", false);
        setField(term157094, term157094.getClass(), "docInfo", null);
        setBooleanField(term157094, term157094.getClass(), "unknown", false);
        setBooleanField(term157094, term157094.getClass(), "resolved", false);
        setField(term157094, term157094.getClass(), "resolveResult", null);
        setField(term157094, term157094.getClass(), "registry", null);
        setField(term157093, term157093.getClass(), "referencedType", term157094);
        setBooleanField(term157093, term157093.getClass(), "visited", false);
        setField(term157093, term157093.getClass(), "docInfo", null);
        setBooleanField(term157093, term157093.getClass(), "unknown", false);
        setBooleanField(term157093, term157093.getClass(), "resolved", false);
        setField(term157093, term157093.getClass(), "resolveResult", null);
        setField(term157093, term157093.getClass(), "registry", null);
        term157095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term157096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term157095, term157095.getClass(), "parameterType", null);
        setField(term157096, term157096.getClass(), "ownerFunction", null);
        setField(term157096, term157096.getClass(), "className", null);
        setField(term157096, term157096.getClass(), "properties", null);
        setField(term157096, term157096.getClass(), "implicitPrototype", null);
        setBooleanField(term157096, term157096.getClass(), "nativeType", false);
        setBooleanField(term157096, term157096.getClass(), "prettyPrint", false);
        setBooleanField(term157096, term157096.getClass(), "visited", false);
        setField(term157096, term157096.getClass(), "docInfo", null);
        setBooleanField(term157096, term157096.getClass(), "unknown", false);
        setBooleanField(term157096, term157096.getClass(), "resolved", false);
        setField(term157096, term157096.getClass(), "resolveResult", null);
        setField(term157096, term157096.getClass(), "registry", null);
        setField(term157095, term157095.getClass(), "referencedType", term157096);
        setBooleanField(term157095, term157095.getClass(), "visited", false);
        setField(term157095, term157095.getClass(), "docInfo", null);
        setBooleanField(term157095, term157095.getClass(), "unknown", false);
        setBooleanField(term157095, term157095.getClass(), "resolved", false);
        setField(term157095, term157095.getClass(), "resolveResult", null);
        setField(term157095, term157095.getClass(), "registry", null);
        term156941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term156942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term156941, term156941.getClass(), "indexType", null);
        setField(term156942, term156942.getClass(), "leastSupertypeVisitor", null);
        setField(term156942, term156942.getClass(), "greatestSubtypeVisitor", null);
        setField(term156942, term156942.getClass(), "call", null);
        setField(term156942, term156942.getClass(), "prototype", null);
        setField(term156942, term156942.getClass(), "kind", null);
        setField(term156942, term156942.getClass(), "typeOfThis", null);
        setField(term156942, term156942.getClass(), "source", null);
        setField(term156942, term156942.getClass(), "implementedInterfaces", null);
        setField(term156942, term156942.getClass(), "subTypes", null);
        setField(term156942, term156942.getClass(), "templateTypeName", null);
        setField(term156942, term156942.getClass(), "className", null);
        setField(term156942, term156942.getClass(), "properties", null);
        setField(term156942, term156942.getClass(), "implicitPrototype", null);
        setBooleanField(term156942, term156942.getClass(), "nativeType", false);
        setBooleanField(term156942, term156942.getClass(), "prettyPrint", false);
        setBooleanField(term156942, term156942.getClass(), "visited", false);
        setField(term156942, term156942.getClass(), "docInfo", null);
        setBooleanField(term156942, term156942.getClass(), "unknown", false);
        setBooleanField(term156942, term156942.getClass(), "resolved", false);
        setField(term156942, term156942.getClass(), "resolveResult", null);
        setField(term156942, term156942.getClass(), "registry", null);
        setField(term156941, term156941.getClass(), "referencedType", term156942);
        setBooleanField(term156941, term156941.getClass(), "visited", false);
        setField(term156941, term156941.getClass(), "docInfo", null);
        setBooleanField(term156941, term156941.getClass(), "unknown", false);
        setBooleanField(term156941, term156941.getClass(), "resolved", false);
        setField(term156941, term156941.getClass(), "resolveResult", null);
        setField(term156941, term156941.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term156635;
        args[1] = term156851;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term156635, term157093));
        assertTrue(recursiveEquals(term156851, term157095));
        assertTrue(recursiveEquals(retValue, term156941));
    }

};


