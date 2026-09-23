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

public class TypeBindings_createIfNeeded_23695431255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8250;
     Object term8693;
     Object term8420;

    public TypeBindings_createIfNeeded_23695431255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8250 = Class.forName((String) "java.util.stream.ReferencePipeline$4");
        term8693 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.JsonSerialize");
        term8420 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term8421 = (Object[]) newArray("java.lang.String", 0);
        Object[] term8422 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term8420, term8420.getClass(), "_names", term8421);
        setField(term8420, term8420.getClass(), "_types", term8422);
        setField(term8420, term8420.getClass(), "_unboundVariables", null);
        setIntField(term8420, term8420.getClass(), "_hashCode", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = term8250;
        args[1] = null;
        Object retValue = callMethod(klass, "createIfNeeded", argTypes, null, args);
        assertTrue(recursiveEquals(term8250, term8693));
        assertTrue(recursiveEquals(retValue, term8420));
    }

};


