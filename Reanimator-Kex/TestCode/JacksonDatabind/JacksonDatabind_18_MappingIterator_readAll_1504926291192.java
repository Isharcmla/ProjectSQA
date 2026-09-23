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

public class MappingIterator_readAll_1504926291192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147340;

    public MappingIterator_readAll_1504926291192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term148898 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term148897 = ((Class) term148898).getDeclaredField((String) "END_OBJECT");
        ((Field) term148897).setAccessible(true);
        Object enum86 = ((Field) term148897).get((Object) null);
        term147340 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term147460 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term147682 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object term147816 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        Object term147964 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term147460, term147460.getClass(), "_currToken", enum86);
        setField(term147460, term147460.getClass(), "delegate", term147682);
        setField(term147340, term147340.getClass(), "_parser", term147460);
        setBooleanField(term147340, term147340.getClass(), "_hasNextChecked", false);
        setField(term147340, term147340.getClass(), "_updatedValue", null);
        setField(term147340, term147340.getClass(), "_deserializer", term147816);
        setIntField(term147964, term147964.getClass(), "_featureFlags", -1);
        setField(term147340, term147340.getClass(), "_context", term147964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term147340, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


