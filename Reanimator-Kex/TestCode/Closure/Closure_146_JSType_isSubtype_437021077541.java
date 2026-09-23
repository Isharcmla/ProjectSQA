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

public class JSType_isSubtype_437021077541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149022;
     Object term149116;
     Object term149254;
     Object term149256;

    public JSType_isSubtype_437021077541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term149116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term149204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term149116, term149116.getClass(), "referencedType", term149204);
        term149254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term149255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term149254, term149254.getClass(), "reference", null);
        setField(term149254, term149254.getClass(), "sourceName", null);
        setIntField(term149254, term149254.getClass(), "lineno", 0);
        setIntField(term149254, term149254.getClass(), "charno", 0);
        setBooleanField(term149254, term149254.getClass(), "forgiving", false);
        setField(term149255, term149255.getClass(), "leastSupertypeVisitor", null);
        setField(term149255, term149255.getClass(), "greatestSubtypeVisitor", null);
        setField(term149255, term149255.getClass(), "call", null);
        setField(term149255, term149255.getClass(), "prototype", null);
        setField(term149255, term149255.getClass(), "kind", null);
        setField(term149255, term149255.getClass(), "typeOfThis", null);
        setField(term149255, term149255.getClass(), "source", null);
        setField(term149255, term149255.getClass(), "implementedInterfaces", null);
        setField(term149255, term149255.getClass(), "subTypes", null);
        setField(term149255, term149255.getClass(), "templateTypeName", null);
        setField(term149255, term149255.getClass(), "className", null);
        setField(term149255, term149255.getClass(), "properties", null);
        setField(term149255, term149255.getClass(), "implicitPrototype", null);
        setBooleanField(term149255, term149255.getClass(), "nativeType", false);
        setBooleanField(term149255, term149255.getClass(), "prettyPrint", false);
        setBooleanField(term149255, term149255.getClass(), "visited", false);
        setField(term149255, term149255.getClass(), "docInfo", null);
        setBooleanField(term149255, term149255.getClass(), "unknown", false);
        setBooleanField(term149255, term149255.getClass(), "resolved", false);
        setField(term149255, term149255.getClass(), "resolveResult", null);
        setField(term149255, term149255.getClass(), "registry", null);
        setField(term149254, term149254.getClass(), "referencedType", term149255);
        setBooleanField(term149254, term149254.getClass(), "visited", false);
        setField(term149254, term149254.getClass(), "docInfo", null);
        setBooleanField(term149254, term149254.getClass(), "unknown", false);
        setBooleanField(term149254, term149254.getClass(), "resolved", false);
        setField(term149254, term149254.getClass(), "resolveResult", null);
        setField(term149254, term149254.getClass(), "registry", null);
        term149256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term149256, term149256.getClass(), "resolved", false);
        setField(term149256, term149256.getClass(), "resolveResult", null);
        setField(term149256, term149256.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term149022;
        args[1] = term149116;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term149022, term149254));
        assertTrue(recursiveEquals(term149116, term149256));
        assertTrue(recursiveEquals(retValue, false));
    }

};


