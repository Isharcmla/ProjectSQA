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

public class StringCollectionDeserializer_handleNonArray_41383521169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27541;
     Object term27785;

    public StringCollectionDeserializer_handleNonArray_41383521169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27541 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object term27637 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term27541, term27541.getClass(), "_unwrapSingle", null);
        setField(term27541, term27541.getClass(), "_containerType", term27637);
        term27785 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term27785, term27785.getClass(), "_featureFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term27785;
        args[2] = null;
        try {
            callMethod(klass, "handleNonArray", argTypes, term27541, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


