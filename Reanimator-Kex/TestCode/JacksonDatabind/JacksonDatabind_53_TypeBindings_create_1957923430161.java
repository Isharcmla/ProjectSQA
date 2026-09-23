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

public class TypeBindings_create_1957923430161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54317;
     Object term54723;
     Object term54469;

    public TypeBindings_create_1957923430161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54317 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        term54723 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonProperty");
        term54469 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term54470 = (Object[]) newArray("java.lang.String", 0);
        Object[] term54471 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term54469, term54469.getClass(), "_names", term54470);
        setField(term54469, term54469.getClass(), "_types", term54471);
        setField(term54469, term54469.getClass(), "_unboundVariables", null);
        setIntField(term54469, term54469.getClass(), "_hashCode", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term54317;
        args[1] = null;
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(term54317, term54723));
        assertTrue(recursiveEquals(retValue, term54469));
    }

};


