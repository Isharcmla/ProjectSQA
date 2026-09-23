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

public class MappingIterator_readAll_1504926291274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243713;

    public MappingIterator_readAll_1504926291274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term245239 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term245238 = ((Class) term245239).getDeclaredField((String) "VALUE_STRING");
        ((Field) term245238).setAccessible(true);
        Object enum154 = ((Field) term245238).get((Object) null);
        term243713 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term243833 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term244083 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        Object term244231 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term244337 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(term243833, term243833.getClass(), "_currToken", enum154);
        setField(term243713, term243713.getClass(), "_parser", term243833);
        setBooleanField(term243713, term243713.getClass(), "_hasNextChecked", false);
        setField(term243713, term243713.getClass(), "_updatedValue", null);
        setField(term244083, term244083.getClass(), "_valueClass", null);
        setField(term243713, term243713.getClass(), "_deserializer", term244083);
        setIntField(term244231, term244231.getClass(), "_featureFlags", -1);
        setField(term244231, term244231.getClass(), "_parser", term244337);
        setField(term243713, term243713.getClass(), "_context", term244231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term243713, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


