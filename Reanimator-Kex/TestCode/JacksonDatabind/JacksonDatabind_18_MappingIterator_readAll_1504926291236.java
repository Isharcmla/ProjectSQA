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

public class MappingIterator_readAll_1504926291236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194238;

    public MappingIterator_readAll_1504926291236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term195853 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term195852 = ((Class) term195853).getDeclaredField((String) "VALUE_NULL");
        ((Field) term195852).setAccessible(true);
        Object enum115 = ((Field) term195852).get((Object) null);
        term194238 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term194348 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term194524 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term194668 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.NoClassDefFoundDeserializer"));
        setField(term194348, term194348.getClass(), "_currToken", enum115);
        setField(term194238, term194238.getClass(), "_parser", term194348);
        setBooleanField(term194238, term194238.getClass(), "_hasNextChecked", false);
        setField(term194238, term194238.getClass(), "_updatedValue", term194524);
        setField(term194238, term194238.getClass(), "_deserializer", term194668);
        setField(term194238, term194238.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term194238, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


