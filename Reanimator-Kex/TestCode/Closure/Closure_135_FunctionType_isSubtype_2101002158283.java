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

public class FunctionType_isSubtype_2101002158283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148089;
     Object term148177;
     Object term148204;
     Object term148205;

    public FunctionType_isSubtype_2101002158283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        term148177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        term148204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term148204, term148204.getClass(), "leastSupertypeVisitor", null);
        setField(term148204, term148204.getClass(), "greatestSubtypeVisitor", null);
        setField(term148204, term148204.getClass(), "call", null);
        setField(term148204, term148204.getClass(), "prototype", null);
        setField(term148204, term148204.getClass(), "kind", null);
        setField(term148204, term148204.getClass(), "typeOfThis", null);
        setField(term148204, term148204.getClass(), "source", null);
        setField(term148204, term148204.getClass(), "implementedInterfaces", null);
        setField(term148204, term148204.getClass(), "subTypes", null);
        setField(term148204, term148204.getClass(), "templateTypeName", null);
        setField(term148204, term148204.getClass(), "className", null);
        setField(term148204, term148204.getClass(), "properties", null);
        setField(term148204, term148204.getClass(), "implicitPrototype", null);
        setBooleanField(term148204, term148204.getClass(), "nativeType", false);
        setBooleanField(term148204, term148204.getClass(), "visited", false);
        setField(term148204, term148204.getClass(), "docInfo", null);
        setBooleanField(term148204, term148204.getClass(), "unknown", false);
        setBooleanField(term148204, term148204.getClass(), "resolved", false);
        setField(term148204, term148204.getClass(), "resolveResult", null);
        setField(term148204, term148204.getClass(), "registry", null);
        term148205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term148205, term148205.getClass(), "leastSupertypeVisitor", null);
        setField(term148205, term148205.getClass(), "greatestSubtypeVisitor", null);
        setField(term148205, term148205.getClass(), "call", null);
        setField(term148205, term148205.getClass(), "prototype", null);
        setField(term148205, term148205.getClass(), "kind", null);
        setField(term148205, term148205.getClass(), "typeOfThis", null);
        setField(term148205, term148205.getClass(), "source", null);
        setField(term148205, term148205.getClass(), "implementedInterfaces", null);
        setField(term148205, term148205.getClass(), "subTypes", null);
        setField(term148205, term148205.getClass(), "templateTypeName", null);
        setField(term148205, term148205.getClass(), "className", null);
        setField(term148205, term148205.getClass(), "properties", null);
        setField(term148205, term148205.getClass(), "implicitPrototype", null);
        setBooleanField(term148205, term148205.getClass(), "nativeType", false);
        setBooleanField(term148205, term148205.getClass(), "visited", false);
        setField(term148205, term148205.getClass(), "docInfo", null);
        setBooleanField(term148205, term148205.getClass(), "unknown", false);
        setBooleanField(term148205, term148205.getClass(), "resolved", false);
        setField(term148205, term148205.getClass(), "resolveResult", null);
        setField(term148205, term148205.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term148177;
        callMethod(klass, "isSubtype", argTypes, term148089, args);
        assertTrue(recursiveEquals(term148089, term148204));
        assertTrue(recursiveEquals(term148177, term148205));
    }

};


