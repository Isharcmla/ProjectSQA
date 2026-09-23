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

public class MappingIterator_readAll_1504926291238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197204;

    public MappingIterator_readAll_1504926291238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term198444 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term198443 = ((Class) term198444).getDeclaredField((String) "VALUE_NULL");
        ((Field) term198443).setAccessible(true);
        Object enum118 = ((Field) term198443).get((Object) null);
        term197204 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term197316 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term197560 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term197316, term197316.getClass(), "_currToken", enum118);
        setField(term197204, term197204.getClass(), "_parser", term197316);
        setBooleanField(term197204, term197204.getClass(), "_hasNextChecked", true);
        setField(term197204, term197204.getClass(), "_updatedValue", null);
        setField(term197204, term197204.getClass(), "_deserializer", term197560);
        setField(term197204, term197204.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term197204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


