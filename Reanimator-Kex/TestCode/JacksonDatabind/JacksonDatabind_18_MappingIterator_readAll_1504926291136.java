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

public class MappingIterator_readAll_1504926291136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85747;

    public MappingIterator_readAll_1504926291136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87341 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term87340 = ((Class) term87341).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term87340).setAccessible(true);
        Object enum53 = ((Field) term87340).get((Object) null);
        term85747 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term85857 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term86173 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        setField(term85857, term85857.getClass(), "_currToken", enum53);
        setField(term85747, term85747.getClass(), "_parser", term85857);
        setBooleanField(term85747, term85747.getClass(), "_hasNextChecked", false);
        setField(term85747, term85747.getClass(), "_updatedValue", "START_ARRAY");
        setField(term85747, term85747.getClass(), "_deserializer", term86173);
        setField(term85747, term85747.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term85747, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


