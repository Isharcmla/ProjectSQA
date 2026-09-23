package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.String;
import java.util.LinkedList;
import java.lang.Object;

public class TypeBindings_create_804154847107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30760;
     Object term30814;
     Object term31404;
     Object term31455;
     Object term31397;

    public TypeBindings_create_804154847107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30760 = Class.forName((String) "java.util.concurrent.CopyOnWriteArrayList$COWSubList");
        term30814 = new LinkedList();
        term31404 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer");
        term31455 = new LinkedList();
        term31397 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term31398 = (Object[]) newArray("java.lang.String", 0);
        Object[] term31399 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term31397, term31397.getClass(), "_names", term31398);
        setField(term31397, term31397.getClass(), "_types", term31399);
        setField(term31397, term31397.getClass(), "_unboundVariables", null);
        setIntField(term31397, term31397.getClass(), "_hashCode", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term30760;
        args[1] = term30814;
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(term30760, term31404));
        assertTrue(recursiveEquals(term30814, term31455));
        assertTrue(recursiveEquals(retValue, term31397));
    }

};


