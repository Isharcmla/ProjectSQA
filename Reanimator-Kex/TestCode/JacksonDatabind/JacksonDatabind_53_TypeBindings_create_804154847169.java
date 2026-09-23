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

public class TypeBindings_create_804154847169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57021;
     Object term57075;
     Object term57460;
     Object term57511;
     Object term57453;

    public TypeBindings_create_804154847169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57021 = Class.forName((String) "java.util.stream.Nodes$ToArrayTask$OfRef");
        term57075 = new LinkedList();
        term57460 = Class.forName((String) "kex.java.lang.StringBuilder");
        term57511 = new LinkedList();
        term57453 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term57454 = (Object[]) newArray("java.lang.String", 0);
        Object[] term57455 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term57453, term57453.getClass(), "_names", term57454);
        setField(term57453, term57453.getClass(), "_types", term57455);
        setField(term57453, term57453.getClass(), "_unboundVariables", null);
        setIntField(term57453, term57453.getClass(), "_hashCode", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term57021;
        args[1] = term57075;
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(term57021, term57460));
        assertTrue(recursiveEquals(term57075, term57511));
        assertTrue(recursiveEquals(retValue, term57453));
    }

};


