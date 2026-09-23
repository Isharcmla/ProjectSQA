package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AnnotationIntrospector_findEnumValues_566249870133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;
     Object term12;

    public AnnotationIntrospector_findEnumValues_566249870133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = (Object[]) newArray("java.lang.Enum", 10);
        term12 = (Object[]) newArray("java.lang.String", 9);
        setElement(term12, 0, "PAEBtnZtTD");
        setElement(term12, 1, "sjlJAEtRrb");
        setElement(term12, 2, "MuLcgQHgqz");
        setElement(term12, 3, "xxtlPwDYFs");
        setElement(term12, 4, "jJCZpVmanW");
        setElement(term12, 5, "EGtDIRbSSb");
        setElement(term12, 6, "SzjVpOQTyS");
        setElement(term12, 7, "MjGYSRKTNF");
        setElement(term12, 8, "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Enum"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term11;
        args[2] = term12;
        try {
            callMethod(klass, "findEnumValues", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


