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

public class TypeValidator_containsForwardDeclaredUnresolvedName_54046344103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25417;
     Object term25529;
     Object term25749;
     Object term25750;

    public TypeValidator_containsForwardDeclaredUnresolvedName_54046344103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25417 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term25529 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        term25749 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term25749, term25749.getClass(), "compiler", null);
        setField(term25749, term25749.getClass(), "typeRegistry", null);
        setField(term25749, term25749.getClass(), "allValueTypes", null);
        setBooleanField(term25749, term25749.getClass(), "shouldReport", false);
        setField(term25749, term25749.getClass(), "nullOrUndefined", null);
        setField(term25749, term25749.getClass(), "mismatches", null);
        term25750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term25750, term25750.getClass(), "constructor", null);
        setField(term25750, term25750.getClass(), "className", null);
        setField(term25750, term25750.getClass(), "properties", null);
        setBooleanField(term25750, term25750.getClass(), "nativeType", false);
        setField(term25750, term25750.getClass(), "implicitPrototypeFallback", null);
        setField(term25750, term25750.getClass(), "ownerFunction", null);
        setBooleanField(term25750, term25750.getClass(), "prettyPrint", false);
        setBooleanField(term25750, term25750.getClass(), "visited", false);
        setField(term25750, term25750.getClass(), "docInfo", null);
        setBooleanField(term25750, term25750.getClass(), "unknown", false);
        setBooleanField(term25750, term25750.getClass(), "resolved", false);
        setField(term25750, term25750.getClass(), "resolveResult", null);
        setField(term25750, term25750.getClass(), "templateKeys", null);
        setField(term25750, term25750.getClass(), "templatizedTypes", null);
        setBooleanField(term25750, term25750.getClass(), "inTemplatedCheckVisit", false);
        setField(term25750, term25750.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term25529;
        Object retValue = callMethod(klass, "containsForwardDeclaredUnresolvedName", argTypes, term25417, args);
        assertTrue(recursiveEquals(term25417, term25749));
        assertTrue(recursiveEquals(term25529, term25750));
        assertTrue(recursiveEquals(retValue, false));
    }

};


