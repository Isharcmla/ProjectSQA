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

public class JSType_isSubtype_437021077597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166666;
     Object term166760;
     Object term166898;
     Object term166900;

    public JSType_isSubtype_437021077597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term166760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term166848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term166760, term166760.getClass(), "referencedType", term166848);
        term166898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term166899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term166898, term166898.getClass(), "reference", null);
        setField(term166898, term166898.getClass(), "sourceName", null);
        setIntField(term166898, term166898.getClass(), "lineno", 0);
        setIntField(term166898, term166898.getClass(), "charno", 0);
        setBooleanField(term166898, term166898.getClass(), "forgiving", false);
        setField(term166899, term166899.getClass(), "leastSupertypeVisitor", null);
        setField(term166899, term166899.getClass(), "greatestSubtypeVisitor", null);
        setField(term166899, term166899.getClass(), "call", null);
        setField(term166899, term166899.getClass(), "prototype", null);
        setField(term166899, term166899.getClass(), "kind", null);
        setField(term166899, term166899.getClass(), "typeOfThis", null);
        setField(term166899, term166899.getClass(), "source", null);
        setField(term166899, term166899.getClass(), "implementedInterfaces", null);
        setField(term166899, term166899.getClass(), "subTypes", null);
        setField(term166899, term166899.getClass(), "templateTypeName", null);
        setField(term166899, term166899.getClass(), "className", null);
        setField(term166899, term166899.getClass(), "properties", null);
        setField(term166899, term166899.getClass(), "implicitPrototype", null);
        setBooleanField(term166899, term166899.getClass(), "nativeType", false);
        setBooleanField(term166899, term166899.getClass(), "prettyPrint", false);
        setBooleanField(term166899, term166899.getClass(), "visited", false);
        setField(term166899, term166899.getClass(), "docInfo", null);
        setBooleanField(term166899, term166899.getClass(), "unknown", false);
        setBooleanField(term166899, term166899.getClass(), "resolved", false);
        setField(term166899, term166899.getClass(), "resolveResult", null);
        setField(term166899, term166899.getClass(), "registry", null);
        setField(term166898, term166898.getClass(), "referencedType", term166899);
        setBooleanField(term166898, term166898.getClass(), "visited", false);
        setField(term166898, term166898.getClass(), "docInfo", null);
        setBooleanField(term166898, term166898.getClass(), "unknown", false);
        setBooleanField(term166898, term166898.getClass(), "resolved", false);
        setField(term166898, term166898.getClass(), "resolveResult", null);
        setField(term166898, term166898.getClass(), "registry", null);
        term166900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term166900, term166900.getClass(), "resolved", false);
        setField(term166900, term166900.getClass(), "resolveResult", null);
        setField(term166900, term166900.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term166666;
        args[1] = term166760;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term166666, term166898));
        assertTrue(recursiveEquals(term166760, term166900));
        assertTrue(recursiveEquals(retValue, false));
    }

};


