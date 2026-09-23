package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ValueInstantiator_createFromObjectWith_35891033147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ValueInstantiator_createFromObjectWith_35891033147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("java.lang.Object", 5);
        Object term2 = newInstance(Class.forName("java.lang.Object"));
        Object term3 = newInstance(Class.forName("java.lang.Object"));
        Object term4 = newInstance(Class.forName("java.lang.Object"));
        Object term5 = newInstance(Class.forName("java.lang.Object"));
        Object term6 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1, 0, term2);
        setElement(term1, 1, term3);
        setElement(term1, 2, term4);
        setElement(term1, 3, term5);
        setElement(term1, 4, term6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        try {
            callMethod(klass, "createFromObjectWith", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


