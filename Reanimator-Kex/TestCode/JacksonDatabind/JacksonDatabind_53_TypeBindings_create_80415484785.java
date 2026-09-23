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
import java.lang.Object;

public class TypeBindings_create_80415484785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16953;
     Object term18019;
     Object term18015;

    public TypeBindings_create_80415484785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16953 = Class.forName((String) "kex.sun.misc.FloatConsts");
        term18019 = Class.forName((String) "com.fasterxml.jackson.core.io.NumberInput");
        term18015 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term18016 = (Object[]) newArray("java.lang.String", 0);
        Object[] term18017 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term18015, term18015.getClass(), "_names", term18016);
        setField(term18015, term18015.getClass(), "_types", term18017);
        setField(term18015, term18015.getClass(), "_unboundVariables", null);
        setIntField(term18015, term18015.getClass(), "_hashCode", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term16953;
        args[1] = null;
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(term16953, term18019));
        assertTrue(recursiveEquals(retValue, term18015));
    }

};


