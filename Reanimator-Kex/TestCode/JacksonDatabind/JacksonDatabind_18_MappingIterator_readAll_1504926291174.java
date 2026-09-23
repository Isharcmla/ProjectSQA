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
import java.lang.String;

public class MappingIterator_readAll_1504926291174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126285;

    public MappingIterator_readAll_1504926291174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term127696 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term127695 = ((Class) term127696).getDeclaredField((String) "VALUE_STRING");
        ((Field) term127695).setAccessible(true);
        Object enum80 = ((Field) term127695).get((Object) null);
        term126285 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term126405 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term126655 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        Object term126803 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term126405, term126405.getClass(), "_currToken", enum80);
        setField(term126285, term126285.getClass(), "_parser", term126405);
        setBooleanField(term126285, term126285.getClass(), "_hasNextChecked", false);
        setField(term126285, term126285.getClass(), "_updatedValue", null);
        setField(term126285, term126285.getClass(), "_deserializer", term126655);
        setIntField(term126803, term126803.getClass(), "_featureFlags", -1);
        setField(term126285, term126285.getClass(), "_context", term126803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term126285, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


