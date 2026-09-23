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

public class MappingIterator_readAll_1504926291142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91042;

    public MappingIterator_readAll_1504926291142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92694 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term92693 = ((Class) term92694).getDeclaredField((String) "VALUE_NUMBER_INT");
        ((Field) term92693).setAccessible(true);
        Object enum56 = ((Field) term92693).get((Object) null);
        term91042 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term91152 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term91338 = newInstance(Class.forName("java.util.concurrent.Executors$1"));
        Object term91500 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        setField(term91152, term91152.getClass(), "_currToken", enum56);
        setField(term91042, term91042.getClass(), "_parser", term91152);
        setBooleanField(term91042, term91042.getClass(), "_hasNextChecked", false);
        setField(term91042, term91042.getClass(), "_updatedValue", term91338);
        setField(term91042, term91042.getClass(), "_deserializer", term91500);
        setField(term91042, term91042.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term91042, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


