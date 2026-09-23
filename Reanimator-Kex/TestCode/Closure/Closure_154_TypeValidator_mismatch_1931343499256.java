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

public class TypeValidator_mismatch_1931343499256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82121;
     Object term82277;
     Object term82306;
     Object term82307;
     Object term82308;

    public TypeValidator_mismatch_1931343499256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82121 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term82277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term82277, term82277.getClass(), "unknown", true);
        term82306 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term82306, term82306.getClass(), "compiler", null);
        setField(term82306, term82306.getClass(), "typeRegistry", null);
        setField(term82306, term82306.getClass(), "allValueTypes", null);
        setBooleanField(term82306, term82306.getClass(), "shouldReport", false);
        setField(term82306, term82306.getClass(), "nullOrUndefined", null);
        setField(term82306, term82306.getClass(), "mismatches", null);
        term82307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term82307, term82307.getClass(), "call", null);
        setField(term82307, term82307.getClass(), "prototype", null);
        setField(term82307, term82307.getClass(), "kind", null);
        setField(term82307, term82307.getClass(), "typeOfThis", null);
        setField(term82307, term82307.getClass(), "source", null);
        setField(term82307, term82307.getClass(), "implementedInterfaces", null);
        setField(term82307, term82307.getClass(), "subTypes", null);
        setField(term82307, term82307.getClass(), "templateTypeName", null);
        setField(term82307, term82307.getClass(), "className", null);
        setField(term82307, term82307.getClass(), "properties", null);
        setBooleanField(term82307, term82307.getClass(), "nativeType", false);
        setField(term82307, term82307.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term82307, term82307.getClass(), "prettyPrint", false);
        setBooleanField(term82307, term82307.getClass(), "visited", false);
        setField(term82307, term82307.getClass(), "docInfo", null);
        setBooleanField(term82307, term82307.getClass(), "unknown", false);
        setBooleanField(term82307, term82307.getClass(), "resolved", false);
        setField(term82307, term82307.getClass(), "resolveResult", null);
        setField(term82307, term82307.getClass(), "registry", null);
        term82308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term82308, term82308.getClass(), "call", null);
        setField(term82308, term82308.getClass(), "prototype", null);
        setField(term82308, term82308.getClass(), "kind", null);
        setField(term82308, term82308.getClass(), "typeOfThis", null);
        setField(term82308, term82308.getClass(), "source", null);
        setField(term82308, term82308.getClass(), "implementedInterfaces", null);
        setField(term82308, term82308.getClass(), "subTypes", null);
        setField(term82308, term82308.getClass(), "templateTypeName", null);
        setField(term82308, term82308.getClass(), "className", null);
        setField(term82308, term82308.getClass(), "properties", null);
        setBooleanField(term82308, term82308.getClass(), "nativeType", false);
        setField(term82308, term82308.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term82308, term82308.getClass(), "prettyPrint", false);
        setBooleanField(term82308, term82308.getClass(), "visited", false);
        setField(term82308, term82308.getClass(), "docInfo", null);
        setBooleanField(term82308, term82308.getClass(), "unknown", false);
        setBooleanField(term82308, term82308.getClass(), "resolved", false);
        setField(term82308, term82308.getClass(), "resolveResult", null);
        setField(term82308, term82308.getClass(), "registry", null);
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
        args[3] = term82277;
        args[4] = term82277;
        callMethod(klass, "mismatch", argTypes, term82121, args);
        assertTrue(recursiveEquals(term82121, term82306));
        assertTrue(recursiveEquals(term82277, null));
        assertTrue(recursiveEquals(term82277, null));
    }

};


