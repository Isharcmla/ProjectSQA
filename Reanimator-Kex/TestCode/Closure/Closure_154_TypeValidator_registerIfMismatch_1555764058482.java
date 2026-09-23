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
import java.lang.Object;

public class TypeValidator_registerIfMismatch_1555764058482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248973;
     Object term249077;
     Object term249175;
     Object term249331;
     Object term249332;
     Object term249334;

    public TypeValidator_registerIfMismatch_1555764058482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248973 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term249077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term249175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term249279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term249175, term249175.getClass(), "referencedType", term249279);
        term249331 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term249331, term249331.getClass(), "compiler", null);
        setField(term249331, term249331.getClass(), "typeRegistry", null);
        setField(term249331, term249331.getClass(), "allValueTypes", null);
        setBooleanField(term249331, term249331.getClass(), "shouldReport", false);
        setField(term249331, term249331.getClass(), "nullOrUndefined", null);
        setField(term249331, term249331.getClass(), "mismatches", null);
        term249332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term249333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term249332, term249332.getClass(), "indexType", null);
        setField(term249333, term249333.getClass(), "call", null);
        setField(term249333, term249333.getClass(), "prototype", null);
        setField(term249333, term249333.getClass(), "kind", null);
        setField(term249333, term249333.getClass(), "typeOfThis", null);
        setField(term249333, term249333.getClass(), "source", null);
        setField(term249333, term249333.getClass(), "implementedInterfaces", null);
        setField(term249333, term249333.getClass(), "subTypes", null);
        setField(term249333, term249333.getClass(), "templateTypeName", null);
        setField(term249333, term249333.getClass(), "className", null);
        setField(term249333, term249333.getClass(), "properties", null);
        setBooleanField(term249333, term249333.getClass(), "nativeType", false);
        setField(term249333, term249333.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term249333, term249333.getClass(), "prettyPrint", false);
        setBooleanField(term249333, term249333.getClass(), "visited", false);
        setField(term249333, term249333.getClass(), "docInfo", null);
        setBooleanField(term249333, term249333.getClass(), "unknown", false);
        setBooleanField(term249333, term249333.getClass(), "resolved", false);
        setField(term249333, term249333.getClass(), "resolveResult", null);
        setField(term249333, term249333.getClass(), "registry", null);
        setField(term249332, term249332.getClass(), "referencedType", term249333);
        setField(term249332, term249332.getClass(), "referencedObjType", null);
        setBooleanField(term249332, term249332.getClass(), "visited", false);
        setField(term249332, term249332.getClass(), "docInfo", null);
        setBooleanField(term249332, term249332.getClass(), "unknown", false);
        setBooleanField(term249332, term249332.getClass(), "resolved", false);
        setField(term249332, term249332.getClass(), "resolveResult", null);
        setField(term249332, term249332.getClass(), "registry", null);
        term249334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term249334, term249334.getClass(), "call", null);
        setField(term249334, term249334.getClass(), "prototype", null);
        setField(term249334, term249334.getClass(), "kind", null);
        setField(term249334, term249334.getClass(), "typeOfThis", null);
        setField(term249334, term249334.getClass(), "source", null);
        setField(term249334, term249334.getClass(), "implementedInterfaces", null);
        setField(term249334, term249334.getClass(), "subTypes", null);
        setField(term249334, term249334.getClass(), "templateTypeName", null);
        setField(term249334, term249334.getClass(), "className", null);
        setField(term249334, term249334.getClass(), "properties", null);
        setBooleanField(term249334, term249334.getClass(), "nativeType", false);
        setField(term249334, term249334.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term249334, term249334.getClass(), "prettyPrint", false);
        setBooleanField(term249334, term249334.getClass(), "visited", false);
        setField(term249334, term249334.getClass(), "docInfo", null);
        setBooleanField(term249334, term249334.getClass(), "unknown", false);
        setBooleanField(term249334, term249334.getClass(), "resolved", false);
        setField(term249334, term249334.getClass(), "resolveResult", null);
        setField(term249334, term249334.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term249077;
        args[1] = term249175;
        callMethod(klass, "registerIfMismatch", argTypes, term248973, args);
        assertTrue(recursiveEquals(term248973, term249331));
        assertTrue(recursiveEquals(term249077, term249332));
        assertTrue(recursiveEquals(term249175, term249334));
    }

};


