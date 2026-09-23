package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class TypeValidator_mismatch_1931343499134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30571;
     Object term30675;
     Object term30779;
     Object term31087;
     Object term31088;
     Object term31089;

    public TypeValidator_mismatch_1931343499134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30571 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term30675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term30779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term31087 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term31087, term31087.getClass(), "compiler", null);
        setField(term31087, term31087.getClass(), "typeRegistry", null);
        setField(term31087, term31087.getClass(), "allValueTypes", null);
        setBooleanField(term31087, term31087.getClass(), "shouldReport", false);
        setField(term31087, term31087.getClass(), "nullOrUndefined", null);
        setField(term31087, term31087.getClass(), "mismatches", null);
        term31088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term31088, term31088.getClass(), "call", null);
        setField(term31088, term31088.getClass(), "prototype", null);
        setField(term31088, term31088.getClass(), "kind", null);
        setField(term31088, term31088.getClass(), "typeOfThis", null);
        setField(term31088, term31088.getClass(), "source", null);
        setField(term31088, term31088.getClass(), "implementedInterfaces", null);
        setField(term31088, term31088.getClass(), "subTypes", null);
        setField(term31088, term31088.getClass(), "templateTypeName", null);
        setField(term31088, term31088.getClass(), "className", null);
        setField(term31088, term31088.getClass(), "properties", null);
        setBooleanField(term31088, term31088.getClass(), "nativeType", false);
        setField(term31088, term31088.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term31088, term31088.getClass(), "prettyPrint", false);
        setBooleanField(term31088, term31088.getClass(), "visited", false);
        setField(term31088, term31088.getClass(), "docInfo", null);
        setBooleanField(term31088, term31088.getClass(), "unknown", false);
        setBooleanField(term31088, term31088.getClass(), "resolved", false);
        setField(term31088, term31088.getClass(), "resolveResult", null);
        setField(term31088, term31088.getClass(), "registry", null);
        term31089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term31089, term31089.getClass(), "call", null);
        setField(term31089, term31089.getClass(), "prototype", null);
        setField(term31089, term31089.getClass(), "kind", null);
        setField(term31089, term31089.getClass(), "typeOfThis", null);
        setField(term31089, term31089.getClass(), "source", null);
        setField(term31089, term31089.getClass(), "implementedInterfaces", null);
        setField(term31089, term31089.getClass(), "subTypes", null);
        setField(term31089, term31089.getClass(), "templateTypeName", null);
        setField(term31089, term31089.getClass(), "className", null);
        setField(term31089, term31089.getClass(), "properties", null);
        setBooleanField(term31089, term31089.getClass(), "nativeType", false);
        setField(term31089, term31089.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term31089, term31089.getClass(), "prettyPrint", false);
        setBooleanField(term31089, term31089.getClass(), "visited", false);
        setField(term31089, term31089.getClass(), "docInfo", null);
        setBooleanField(term31089, term31089.getClass(), "unknown", false);
        setBooleanField(term31089, term31089.getClass(), "resolved", false);
        setField(term31089, term31089.getClass(), "resolveResult", null);
        setField(term31089, term31089.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term30675;
        args[4] = term30779;
        callMethod(klass, "mismatch", argTypes, term30571, args);
        assertTrue(recursiveEquals(term30571, term31087));
        assertTrue(recursiveEquals(term30675, null));
        assertTrue(recursiveEquals(term30779, null));
    }

};


