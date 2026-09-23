package com.fasterxml.jackson.databind.deser.std;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311232;

    public StdValueInstantiator_init_1394365189279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term311128 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term311268 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<? extends Object> term311446 = Class.forName((String) "java.lang.Object");
        term311232 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term311410 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term311598 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term311232, term311232.getClass(), "_class", term311268);
        setField(term311410, term311410.getClass(), "_canonicalName", null);
        setField(term311410, term311410.getClass(), "_class", term311446);
        setField(term311598, term311598.getClass(), "_canonicalName", "");
        setField(term311410, term311410.getClass(), "_referencedType", term311598);
        setField(term311232, term311232.getClass(), "_referencedType", term311410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term311232;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


