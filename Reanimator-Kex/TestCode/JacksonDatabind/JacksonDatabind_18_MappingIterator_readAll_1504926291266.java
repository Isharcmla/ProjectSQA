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

public class MappingIterator_readAll_1504926291266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233221;

    public MappingIterator_readAll_1504926291266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233221 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term233327 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term233433 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term233561 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term233709 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term233433, term233433.getClass(), "delegate", null);
        setField(term233327, term233327.getClass(), "delegate", term233433);
        setField(term233221, term233221.getClass(), "_parser", term233327);
        setBooleanField(term233221, term233221.getClass(), "_hasNextChecked", true);
        setField(term233221, term233221.getClass(), "_updatedValue", null);
        setField(term233221, term233221.getClass(), "_deserializer", term233561);
        setField(term233221, term233221.getClass(), "_context", term233709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term233221, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


