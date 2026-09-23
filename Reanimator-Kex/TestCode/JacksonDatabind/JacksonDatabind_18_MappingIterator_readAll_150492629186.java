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

public class MappingIterator_readAll_150492629186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44396;

    public MappingIterator_readAll_150492629186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44396 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term44502 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term44608 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term44706 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term44854 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term44502, term44502.getClass(), "delegate", term44608);
        setField(term44396, term44396.getClass(), "_parser", term44502);
        setBooleanField(term44396, term44396.getClass(), "_hasNextChecked", true);
        setField(term44396, term44396.getClass(), "_updatedValue", term44706);
        setField(term44396, term44396.getClass(), "_deserializer", null);
        setField(term44396, term44396.getClass(), "_context", term44854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term44396, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


