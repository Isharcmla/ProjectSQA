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

public class MappingIterator_readAll_1504926291164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114600;

    public MappingIterator_readAll_1504926291164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term116020 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term116019 = ((Class) term116020).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term116019).setAccessible(true);
        Object enum71 = ((Field) term116019).get((Object) null);
        term114600 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term114720 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term114970 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        Object term115118 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term114720, term114720.getClass(), "_currToken", enum71);
        setField(term114600, term114600.getClass(), "_parser", term114720);
        setBooleanField(term114600, term114600.getClass(), "_hasNextChecked", false);
        setField(term114600, term114600.getClass(), "_updatedValue", null);
        setField(term114600, term114600.getClass(), "_deserializer", term114970);
        setIntField(term115118, term115118.getClass(), "_featureFlags", -1);
        setField(term114600, term114600.getClass(), "_context", term115118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term114600, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


