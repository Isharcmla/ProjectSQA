package com.fasterxml.jackson.databind.introspect;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JacksonAnnotationIntrospector_findEnumValues_116849503988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term4;

    public JacksonAnnotationIntrospector_findEnumValues_116849503988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = (Object[]) newArray("java.lang.Enum", 0);
        term4 = (Object[]) newArray("java.lang.String", 5);
        setElement(term4, 0, "PAEBtnZtTD");
        setElement(term4, 1, "sjlJAEtRrb");
        setElement(term4, 2, "MuLcgQHgqz");
        setElement(term4, 3, "xxtlPwDYFs");
        setElement(term4, 4, "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Enum"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3;
        args[2] = term4;
        try {
            callMethod(klass, "findEnumValues", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


