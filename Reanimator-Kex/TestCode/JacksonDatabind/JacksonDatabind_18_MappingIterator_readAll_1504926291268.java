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

public class MappingIterator_readAll_1504926291268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235641;

    public MappingIterator_readAll_1504926291268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term237264 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term237263 = ((Class) term237264).getDeclaredField((String) "FIELD_NAME");
        ((Field) term237263).setAccessible(true);
        Object enum148 = ((Field) term237263).get((Object) null);
        term235641 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term235761 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term235989 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term236123 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        Object term236271 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term235761, term235761.getClass(), "_currToken", enum148);
        setField(term235989, term235989.getClass(), "_currToken", enum148);
        setField(term235761, term235761.getClass(), "delegate", term235989);
        setField(term235641, term235641.getClass(), "_parser", term235761);
        setBooleanField(term235641, term235641.getClass(), "_hasNextChecked", false);
        setField(term235641, term235641.getClass(), "_updatedValue", null);
        setField(term235641, term235641.getClass(), "_deserializer", term236123);
        setIntField(term236271, term236271.getClass(), "_featureFlags", -1);
        setField(term235641, term235641.getClass(), "_context", term236271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term235641, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


