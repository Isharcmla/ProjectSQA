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

public class FunctionType_isSubtype_2101002158317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206310;
     Object term206398;
     Object term206412;
     Object term206413;

    public FunctionType_isSubtype_2101002158317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        term206398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        term206412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term206412, term206412.getClass(), "leastSupertypeVisitor", null);
        setField(term206412, term206412.getClass(), "greatestSubtypeVisitor", null);
        setField(term206412, term206412.getClass(), "call", null);
        setField(term206412, term206412.getClass(), "prototype", null);
        setField(term206412, term206412.getClass(), "kind", null);
        setField(term206412, term206412.getClass(), "typeOfThis", null);
        setField(term206412, term206412.getClass(), "source", null);
        setField(term206412, term206412.getClass(), "implementedInterfaces", null);
        setField(term206412, term206412.getClass(), "subTypes", null);
        setField(term206412, term206412.getClass(), "templateTypeName", null);
        setField(term206412, term206412.getClass(), "className", null);
        setField(term206412, term206412.getClass(), "properties", null);
        setField(term206412, term206412.getClass(), "implicitPrototype", null);
        setBooleanField(term206412, term206412.getClass(), "nativeType", false);
        setBooleanField(term206412, term206412.getClass(), "prettyPrint", false);
        setBooleanField(term206412, term206412.getClass(), "visited", false);
        setField(term206412, term206412.getClass(), "docInfo", null);
        setBooleanField(term206412, term206412.getClass(), "unknown", false);
        setBooleanField(term206412, term206412.getClass(), "resolved", false);
        setField(term206412, term206412.getClass(), "resolveResult", null);
        setField(term206412, term206412.getClass(), "registry", null);
        term206413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term206413, term206413.getClass(), "leastSupertypeVisitor", null);
        setField(term206413, term206413.getClass(), "greatestSubtypeVisitor", null);
        setField(term206413, term206413.getClass(), "call", null);
        setField(term206413, term206413.getClass(), "prototype", null);
        setField(term206413, term206413.getClass(), "kind", null);
        setField(term206413, term206413.getClass(), "typeOfThis", null);
        setField(term206413, term206413.getClass(), "source", null);
        setField(term206413, term206413.getClass(), "implementedInterfaces", null);
        setField(term206413, term206413.getClass(), "subTypes", null);
        setField(term206413, term206413.getClass(), "templateTypeName", null);
        setField(term206413, term206413.getClass(), "className", null);
        setField(term206413, term206413.getClass(), "properties", null);
        setField(term206413, term206413.getClass(), "implicitPrototype", null);
        setBooleanField(term206413, term206413.getClass(), "nativeType", false);
        setBooleanField(term206413, term206413.getClass(), "prettyPrint", false);
        setBooleanField(term206413, term206413.getClass(), "visited", false);
        setField(term206413, term206413.getClass(), "docInfo", null);
        setBooleanField(term206413, term206413.getClass(), "unknown", false);
        setBooleanField(term206413, term206413.getClass(), "resolved", false);
        setField(term206413, term206413.getClass(), "resolveResult", null);
        setField(term206413, term206413.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term206398;
        callMethod(klass, "isSubtype", argTypes, term206310, args);
        assertTrue(recursiveEquals(term206310, term206412));
        assertTrue(recursiveEquals(term206398, term206413));
    }

};


