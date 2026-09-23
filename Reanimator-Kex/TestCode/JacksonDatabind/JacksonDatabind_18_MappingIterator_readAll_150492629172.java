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

public class MappingIterator_readAll_150492629172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34534;

    public MappingIterator_readAll_150492629172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34534 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term34640 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term34738 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term34866 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
        setField(term34534, term34534.getClass(), "_parser", term34640);
        setBooleanField(term34534, term34534.getClass(), "_hasNextChecked", true);
        setField(term34534, term34534.getClass(), "_updatedValue", term34738);
        setField(term34534, term34534.getClass(), "_deserializer", term34866);
        setField(term34534, term34534.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term34534, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


