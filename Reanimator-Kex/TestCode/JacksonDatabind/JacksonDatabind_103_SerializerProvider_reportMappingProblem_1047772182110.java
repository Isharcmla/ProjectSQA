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

public class SerializerProvider_reportMappingProblem_1047772182110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54;

    public SerializerProvider_reportMappingProblem_1047772182110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54 = (Object[]) newArray("java.lang.Object", 5);
        Object term55 = newInstance(Class.forName("java.lang.Object"));
        Object term56 = newInstance(Class.forName("java.lang.Object"));
        Object term57 = newInstance(Class.forName("java.lang.Object"));
        Object term58 = newInstance(Class.forName("java.lang.Object"));
        Object term59 = newInstance(Class.forName("java.lang.Object"));
        setElement(term54, 0, term55);
        setElement(term54, 1, term56);
        setElement(term54, 2, term57);
        setElement(term54, 3, term58);
        setElement(term54, 4, term59);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "sjlJAEtRrb";
        args[1] = term54;
        try {
            callMethod(klass, "reportMappingProblem", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


