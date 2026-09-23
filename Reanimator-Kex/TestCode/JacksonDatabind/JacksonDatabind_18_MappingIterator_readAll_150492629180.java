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
import java.lang.UnsupportedOperationException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_150492629180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40046;

    public MappingIterator_readAll_150492629180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41546 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term41545 = ((Class) term41546).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term41545).setAccessible(true);
        Object enum23 = ((Field) term41545).get((Object) null);
        term40046 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term40156 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term40436 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer"));
        setField(term40156, term40156.getClass(), "_currToken", enum23);
        setField(term40046, term40046.getClass(), "_parser", term40156);
        setBooleanField(term40046, term40046.getClass(), "_hasNextChecked", false);
        setField(term40046, term40046.getClass(), "_updatedValue", "");
        setField(term40046, term40046.getClass(), "_deserializer", term40436);
        setField(term40046, term40046.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term40046, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


