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
import java.lang.ClassCastException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MappingIterator_readAll_1504926291186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139433;

    public MappingIterator_readAll_1504926291186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139433 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term139539 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term139651 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term139749 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term139877 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
        Object term140025 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term139539, term139539.getClass(), "delegate", term139651);
        setField(term139433, term139433.getClass(), "_parser", term139539);
        setBooleanField(term139433, term139433.getClass(), "_hasNextChecked", true);
        setField(term139433, term139433.getClass(), "_updatedValue", term139749);
        setField(term139433, term139433.getClass(), "_deserializer", term139877);
        setField(term139433, term139433.getClass(), "_context", term140025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term139433, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


