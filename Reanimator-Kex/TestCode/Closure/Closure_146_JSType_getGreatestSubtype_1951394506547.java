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

public class JSType_getGreatestSubtype_1951394506547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150494;
     Object term150680;
     Object term150824;
     Object term150826;
     Object term150794;

    public JSType_getGreatestSubtype_1951394506547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term150582 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term150582, term150582.getClass(), "unknown", false);
        setField(term150494, term150494.getClass(), "referencedType", term150582);
        term150680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term150768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term150680, term150680.getClass(), "referencedType", term150768);
        term150824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term150825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term150824, term150824.getClass(), "indexType", null);
        setField(term150825, term150825.getClass(), "leastSupertypeVisitor", null);
        setField(term150825, term150825.getClass(), "greatestSubtypeVisitor", null);
        setField(term150825, term150825.getClass(), "call", null);
        setField(term150825, term150825.getClass(), "prototype", null);
        setField(term150825, term150825.getClass(), "kind", null);
        setField(term150825, term150825.getClass(), "typeOfThis", null);
        setField(term150825, term150825.getClass(), "source", null);
        setField(term150825, term150825.getClass(), "implementedInterfaces", null);
        setField(term150825, term150825.getClass(), "subTypes", null);
        setField(term150825, term150825.getClass(), "templateTypeName", null);
        setField(term150825, term150825.getClass(), "className", null);
        setField(term150825, term150825.getClass(), "properties", null);
        setField(term150825, term150825.getClass(), "implicitPrototype", null);
        setBooleanField(term150825, term150825.getClass(), "nativeType", false);
        setBooleanField(term150825, term150825.getClass(), "prettyPrint", false);
        setBooleanField(term150825, term150825.getClass(), "visited", false);
        setField(term150825, term150825.getClass(), "docInfo", null);
        setBooleanField(term150825, term150825.getClass(), "unknown", false);
        setBooleanField(term150825, term150825.getClass(), "resolved", false);
        setField(term150825, term150825.getClass(), "resolveResult", null);
        setField(term150825, term150825.getClass(), "registry", null);
        setField(term150824, term150824.getClass(), "referencedType", term150825);
        setBooleanField(term150824, term150824.getClass(), "visited", false);
        setField(term150824, term150824.getClass(), "docInfo", null);
        setBooleanField(term150824, term150824.getClass(), "unknown", false);
        setBooleanField(term150824, term150824.getClass(), "resolved", false);
        setField(term150824, term150824.getClass(), "resolveResult", null);
        setField(term150824, term150824.getClass(), "registry", null);
        term150826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term150827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term150826, term150826.getClass(), "parameterType", null);
        setField(term150827, term150827.getClass(), "leastSupertypeVisitor", null);
        setField(term150827, term150827.getClass(), "greatestSubtypeVisitor", null);
        setField(term150827, term150827.getClass(), "call", null);
        setField(term150827, term150827.getClass(), "prototype", null);
        setField(term150827, term150827.getClass(), "kind", null);
        setField(term150827, term150827.getClass(), "typeOfThis", null);
        setField(term150827, term150827.getClass(), "source", null);
        setField(term150827, term150827.getClass(), "implementedInterfaces", null);
        setField(term150827, term150827.getClass(), "subTypes", null);
        setField(term150827, term150827.getClass(), "templateTypeName", null);
        setField(term150827, term150827.getClass(), "className", null);
        setField(term150827, term150827.getClass(), "properties", null);
        setField(term150827, term150827.getClass(), "implicitPrototype", null);
        setBooleanField(term150827, term150827.getClass(), "nativeType", false);
        setBooleanField(term150827, term150827.getClass(), "prettyPrint", false);
        setBooleanField(term150827, term150827.getClass(), "visited", false);
        setField(term150827, term150827.getClass(), "docInfo", null);
        setBooleanField(term150827, term150827.getClass(), "unknown", false);
        setBooleanField(term150827, term150827.getClass(), "resolved", false);
        setField(term150827, term150827.getClass(), "resolveResult", null);
        setField(term150827, term150827.getClass(), "registry", null);
        setField(term150826, term150826.getClass(), "referencedType", term150827);
        setBooleanField(term150826, term150826.getClass(), "visited", false);
        setField(term150826, term150826.getClass(), "docInfo", null);
        setBooleanField(term150826, term150826.getClass(), "unknown", false);
        setBooleanField(term150826, term150826.getClass(), "resolved", false);
        setField(term150826, term150826.getClass(), "resolveResult", null);
        setField(term150826, term150826.getClass(), "registry", null);
        term150794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term150795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term150794, term150794.getClass(), "parameterType", null);
        setField(term150795, term150795.getClass(), "leastSupertypeVisitor", null);
        setField(term150795, term150795.getClass(), "greatestSubtypeVisitor", null);
        setField(term150795, term150795.getClass(), "call", null);
        setField(term150795, term150795.getClass(), "prototype", null);
        setField(term150795, term150795.getClass(), "kind", null);
        setField(term150795, term150795.getClass(), "typeOfThis", null);
        setField(term150795, term150795.getClass(), "source", null);
        setField(term150795, term150795.getClass(), "implementedInterfaces", null);
        setField(term150795, term150795.getClass(), "subTypes", null);
        setField(term150795, term150795.getClass(), "templateTypeName", null);
        setField(term150795, term150795.getClass(), "className", null);
        setField(term150795, term150795.getClass(), "properties", null);
        setField(term150795, term150795.getClass(), "implicitPrototype", null);
        setBooleanField(term150795, term150795.getClass(), "nativeType", false);
        setBooleanField(term150795, term150795.getClass(), "prettyPrint", false);
        setBooleanField(term150795, term150795.getClass(), "visited", false);
        setField(term150795, term150795.getClass(), "docInfo", null);
        setBooleanField(term150795, term150795.getClass(), "unknown", false);
        setBooleanField(term150795, term150795.getClass(), "resolved", false);
        setField(term150795, term150795.getClass(), "resolveResult", null);
        setField(term150795, term150795.getClass(), "registry", null);
        setField(term150794, term150794.getClass(), "referencedType", term150795);
        setBooleanField(term150794, term150794.getClass(), "visited", false);
        setField(term150794, term150794.getClass(), "docInfo", null);
        setBooleanField(term150794, term150794.getClass(), "unknown", false);
        setBooleanField(term150794, term150794.getClass(), "resolved", false);
        setField(term150794, term150794.getClass(), "resolveResult", null);
        setField(term150794, term150794.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term150494;
        args[1] = term150680;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term150494, term150824));
        assertTrue(recursiveEquals(term150680, term150826));
        assertTrue(recursiveEquals(retValue, term150794));
    }

};


