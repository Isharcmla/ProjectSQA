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

public class MappingIterator_readAll_1504926291228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184656;

    public MappingIterator_readAll_1504926291228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184656 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term184762 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term184872 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term184970 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term185118 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term184762, term184762.getClass(), "delegate", term184872);
        setField(term184656, term184656.getClass(), "_parser", term184762);
        setBooleanField(term184656, term184656.getClass(), "_hasNextChecked", true);
        setField(term184656, term184656.getClass(), "_updatedValue", term184970);
        setField(term184656, term184656.getClass(), "_deserializer", null);
        setField(term184656, term184656.getClass(), "_context", term185118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term184656, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


