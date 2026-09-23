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

public class JSType_isSubtype_437021077475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125910;
     Object term126016;
     Object term126145;
     Object term126147;

    public JSType_isSubtype_437021077475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term126016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term126104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term126104, term126104.getClass(), "unknown", false);
        setField(term126016, term126016.getClass(), "referencedType", term126104);
        term126145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term126146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term126146, term126146.getClass(), "leastSupertypeVisitor", null);
        setField(term126146, term126146.getClass(), "greatestSubtypeVisitor", null);
        setField(term126146, term126146.getClass(), "call", null);
        setField(term126146, term126146.getClass(), "prototype", null);
        setField(term126146, term126146.getClass(), "kind", null);
        setField(term126146, term126146.getClass(), "typeOfThis", null);
        setField(term126146, term126146.getClass(), "source", null);
        setField(term126146, term126146.getClass(), "implementedInterfaces", null);
        setField(term126146, term126146.getClass(), "subTypes", null);
        setField(term126146, term126146.getClass(), "templateTypeName", null);
        setField(term126146, term126146.getClass(), "className", null);
        setField(term126146, term126146.getClass(), "properties", null);
        setField(term126146, term126146.getClass(), "implicitPrototype", null);
        setBooleanField(term126146, term126146.getClass(), "nativeType", false);
        setBooleanField(term126146, term126146.getClass(), "prettyPrint", false);
        setBooleanField(term126146, term126146.getClass(), "visited", false);
        setField(term126146, term126146.getClass(), "docInfo", null);
        setBooleanField(term126146, term126146.getClass(), "unknown", false);
        setBooleanField(term126146, term126146.getClass(), "resolved", false);
        setField(term126146, term126146.getClass(), "resolveResult", null);
        setField(term126146, term126146.getClass(), "registry", null);
        setField(term126145, term126145.getClass(), "referencedType", term126146);
        setBooleanField(term126145, term126145.getClass(), "visited", false);
        setField(term126145, term126145.getClass(), "docInfo", null);
        setBooleanField(term126145, term126145.getClass(), "unknown", false);
        setBooleanField(term126145, term126145.getClass(), "resolved", false);
        setField(term126145, term126145.getClass(), "resolveResult", null);
        setField(term126145, term126145.getClass(), "registry", null);
        term126147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term126147, term126147.getClass(), "resolved", false);
        setField(term126147, term126147.getClass(), "resolveResult", null);
        setField(term126147, term126147.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term125910;
        args[1] = term126016;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term125910, term126145));
        assertTrue(recursiveEquals(term126016, term126147));
        assertTrue(recursiveEquals(retValue, false));
    }

};


