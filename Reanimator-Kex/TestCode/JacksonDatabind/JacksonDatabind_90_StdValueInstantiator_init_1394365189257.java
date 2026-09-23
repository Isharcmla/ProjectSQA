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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270742;

    public StdValueInstantiator_init_1394365189257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term270638 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term270778 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term271864 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeId");
        Class term271855 = Array.newInstance(term271864, 0).getClass();
        Class term271840 = Array.newInstance(term271855, 0).getClass();
        Class term270956 = Array.newInstance(term271840, 0).getClass();
        term270742 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term270920 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term271098 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term270742, term270742.getClass(), "_class", term270778);
        setField(term270920, term270920.getClass(), "_canonicalName", null);
        setField(term270920, term270920.getClass(), "_class", term270956);
        setField(term271098, term271098.getClass(), "_canonicalName", null);
        setField(term270920, term270920.getClass(), "_referencedType", term271098);
        setField(term270742, term270742.getClass(), "_referencedType", term270920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term270742;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


