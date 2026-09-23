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

public class TypeValidator_registerIfMismatch_1555764058296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102508;
     Object term102612;
     Object term102716;
     Object term102751;
     Object term102752;
     Object term102753;

    public TypeValidator_registerIfMismatch_1555764058296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102508 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term102612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term102716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term102716, term102716.getClass(), "unknown", true);
        term102751 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term102751, term102751.getClass(), "compiler", null);
        setField(term102751, term102751.getClass(), "typeRegistry", null);
        setField(term102751, term102751.getClass(), "allValueTypes", null);
        setBooleanField(term102751, term102751.getClass(), "shouldReport", false);
        setField(term102751, term102751.getClass(), "nullOrUndefined", null);
        setField(term102751, term102751.getClass(), "mismatches", null);
        term102752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term102752, term102752.getClass(), "call", null);
        setField(term102752, term102752.getClass(), "prototype", null);
        setField(term102752, term102752.getClass(), "kind", null);
        setField(term102752, term102752.getClass(), "typeOfThis", null);
        setField(term102752, term102752.getClass(), "source", null);
        setField(term102752, term102752.getClass(), "implementedInterfaces", null);
        setField(term102752, term102752.getClass(), "subTypes", null);
        setField(term102752, term102752.getClass(), "templateTypeName", null);
        setField(term102752, term102752.getClass(), "className", null);
        setField(term102752, term102752.getClass(), "properties", null);
        setBooleanField(term102752, term102752.getClass(), "nativeType", false);
        setField(term102752, term102752.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term102752, term102752.getClass(), "prettyPrint", false);
        setBooleanField(term102752, term102752.getClass(), "visited", false);
        setField(term102752, term102752.getClass(), "docInfo", null);
        setBooleanField(term102752, term102752.getClass(), "unknown", false);
        setBooleanField(term102752, term102752.getClass(), "resolved", false);
        setField(term102752, term102752.getClass(), "resolveResult", null);
        setField(term102752, term102752.getClass(), "registry", null);
        term102753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term102753, term102753.getClass(), "call", null);
        setField(term102753, term102753.getClass(), "prototype", null);
        setField(term102753, term102753.getClass(), "kind", null);
        setField(term102753, term102753.getClass(), "typeOfThis", null);
        setField(term102753, term102753.getClass(), "source", null);
        setField(term102753, term102753.getClass(), "implementedInterfaces", null);
        setField(term102753, term102753.getClass(), "subTypes", null);
        setField(term102753, term102753.getClass(), "templateTypeName", null);
        setField(term102753, term102753.getClass(), "className", null);
        setField(term102753, term102753.getClass(), "properties", null);
        setBooleanField(term102753, term102753.getClass(), "nativeType", false);
        setField(term102753, term102753.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term102753, term102753.getClass(), "prettyPrint", false);
        setBooleanField(term102753, term102753.getClass(), "visited", false);
        setField(term102753, term102753.getClass(), "docInfo", null);
        setBooleanField(term102753, term102753.getClass(), "unknown", false);
        setBooleanField(term102753, term102753.getClass(), "resolved", false);
        setField(term102753, term102753.getClass(), "resolveResult", null);
        setField(term102753, term102753.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term102612;
        args[1] = term102716;
        callMethod(klass, "registerIfMismatch", argTypes, term102508, args);
        assertTrue(recursiveEquals(term102508, term102751));
        assertTrue(recursiveEquals(term102612, term102752));
        assertTrue(recursiveEquals(term102716, term102753));
    }

};


