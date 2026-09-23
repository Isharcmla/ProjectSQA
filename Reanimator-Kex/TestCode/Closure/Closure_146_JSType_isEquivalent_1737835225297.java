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

public class JSType_isEquivalent_1737835225297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56788;
     Object term56898;
     Object term56940;
     Object term56941;

    public JSType_isEquivalent_1737835225297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        term56898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term56940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term56940, term56940.getClass(), "primitiveType", null);
        setField(term56940, term56940.getClass(), "primitiveObjectType", null);
        setField(term56940, term56940.getClass(), "name", null);
        setBooleanField(term56940, term56940.getClass(), "visited", false);
        setField(term56940, term56940.getClass(), "docInfo", null);
        setBooleanField(term56940, term56940.getClass(), "unknown", false);
        setBooleanField(term56940, term56940.getClass(), "resolved", false);
        setField(term56940, term56940.getClass(), "resolveResult", null);
        setField(term56940, term56940.getClass(), "registry", null);
        term56941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term56941, term56941.getClass(), "call", null);
        setField(term56941, term56941.getClass(), "prototype", null);
        setField(term56941, term56941.getClass(), "kind", null);
        setField(term56941, term56941.getClass(), "typeOfThis", null);
        setField(term56941, term56941.getClass(), "source", null);
        setField(term56941, term56941.getClass(), "implementedInterfaces", null);
        setField(term56941, term56941.getClass(), "subTypes", null);
        setField(term56941, term56941.getClass(), "templateTypeName", null);
        setField(term56941, term56941.getClass(), "className", null);
        setField(term56941, term56941.getClass(), "properties", null);
        setField(term56941, term56941.getClass(), "implicitPrototype", null);
        setBooleanField(term56941, term56941.getClass(), "nativeType", false);
        setBooleanField(term56941, term56941.getClass(), "prettyPrint", false);
        setBooleanField(term56941, term56941.getClass(), "visited", false);
        setField(term56941, term56941.getClass(), "docInfo", null);
        setBooleanField(term56941, term56941.getClass(), "unknown", false);
        setBooleanField(term56941, term56941.getClass(), "resolved", false);
        setField(term56941, term56941.getClass(), "resolveResult", null);
        setField(term56941, term56941.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term56788;
        args[1] = term56898;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term56788, term56940));
        assertTrue(recursiveEquals(term56898, term56941));
        assertTrue(recursiveEquals(retValue, false));
    }

};


