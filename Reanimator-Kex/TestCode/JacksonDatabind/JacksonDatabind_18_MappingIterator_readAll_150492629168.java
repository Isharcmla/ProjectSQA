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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_150492629168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31542;

    public MappingIterator_readAll_150492629168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31934 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term31933 = ((Class) term31934).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term31933).setAccessible(true);
        Object enum15 = ((Field) term31933).get((Object) null);
        term31542 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term31652 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term31932 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$ShortDeser"));
        setField(term31652, term31652.getClass(), "_currToken", enum15);
        setField(term31542, term31542.getClass(), "_parser", term31652);
        setBooleanField(term31542, term31542.getClass(), "_hasNextChecked", false);
        setField(term31542, term31542.getClass(), "_updatedValue", null);
        setField(term31542, term31542.getClass(), "_deserializer", term31932);
        setField(term31542, term31542.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "readAll", argTypes, term31542, args);
    }

};


