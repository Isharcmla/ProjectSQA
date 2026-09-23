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
import static com.fasterxml.jackson.databind.EqualityUtils.*;

public class SerializationConfig_init_1332549210191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113517;
     Object term116208;
     Object term116209;

    public SerializationConfig_init_1332549210191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113517 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        term116208 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term116208, term116208.getClass(), "_filterProvider", null);
        setField(term116208, term116208.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term116208, term116208.getClass(), "_serFeatures", 0);
        setIntField(term116208, term116208.getClass(), "_generatorFeatures", 0);
        setIntField(term116208, term116208.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term116208, term116208.getClass(), "_formatWriteFeatures", 0);
        setIntField(term116208, term116208.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term116208, term116208.getClass(), "_serializationInclusion", null);
        setField(term116208, term116208.getClass(), "_mixIns", null);
        setField(term116208, term116208.getClass(), "_subtypeResolver", null);
        setField(term116208, term116208.getClass(), "_rootName", null);
        setField(term116208, term116208.getClass(), "_view", null);
        setField(term116208, term116208.getClass(), "_attributes", null);
        setField(term116208, term116208.getClass(), "_rootNames", null);
        setIntField(term116208, term116208.getClass(), "_mapperFeatures", 0);
        setField(term116208, term116208.getClass(), "_base", null);
        term116209 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term116209, term116209.getClass(), "_filterProvider", null);
        setField(term116209, term116209.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term116209, term116209.getClass(), "_serFeatures", 0);
        setIntField(term116209, term116209.getClass(), "_generatorFeatures", 0);
        setIntField(term116209, term116209.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term116209, term116209.getClass(), "_formatWriteFeatures", 0);
        setIntField(term116209, term116209.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term116209, term116209.getClass(), "_serializationInclusion", null);
        setField(term116209, term116209.getClass(), "_mixIns", null);
        setField(term116209, term116209.getClass(), "_subtypeResolver", null);
        setField(term116209, term116209.getClass(), "_rootName", null);
        setField(term116209, term116209.getClass(), "_view", null);
        setField(term116209, term116209.getClass(), "_attributes", null);
        setField(term116209, term116209.getClass(), "_rootNames", null);
        setIntField(term116209, term116209.getClass(), "_mapperFeatures", 0);
        setField(term116209, term116209.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.PrettyPrinter");
        Object[] args = new Object[2];
        args[0] = term113517;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term116208));
        assertTrue(recursiveEquals(term113517, term116209));
    }

};


