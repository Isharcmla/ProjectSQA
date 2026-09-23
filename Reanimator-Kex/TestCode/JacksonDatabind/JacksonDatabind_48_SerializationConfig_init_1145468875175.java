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

public class SerializationConfig_init_1145468875175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88174;
     Object term90862;
     Object term90863;

    public SerializationConfig_init_1145468875175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88174 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        term90862 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term90862, term90862.getClass(), "_filterProvider", null);
        setField(term90862, term90862.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term90862, term90862.getClass(), "_serFeatures", 0);
        setIntField(term90862, term90862.getClass(), "_generatorFeatures", 0);
        setIntField(term90862, term90862.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term90862, term90862.getClass(), "_formatWriteFeatures", 0);
        setIntField(term90862, term90862.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term90862, term90862.getClass(), "_serializationInclusion", null);
        setField(term90862, term90862.getClass(), "_mixIns", null);
        setField(term90862, term90862.getClass(), "_subtypeResolver", null);
        setField(term90862, term90862.getClass(), "_rootName", null);
        setField(term90862, term90862.getClass(), "_view", null);
        setField(term90862, term90862.getClass(), "_attributes", null);
        setField(term90862, term90862.getClass(), "_rootNames", null);
        setIntField(term90862, term90862.getClass(), "_mapperFeatures", 0);
        setField(term90862, term90862.getClass(), "_base", null);
        term90863 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term90863, term90863.getClass(), "_filterProvider", null);
        setField(term90863, term90863.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term90863, term90863.getClass(), "_serFeatures", 0);
        setIntField(term90863, term90863.getClass(), "_generatorFeatures", 0);
        setIntField(term90863, term90863.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term90863, term90863.getClass(), "_formatWriteFeatures", 0);
        setIntField(term90863, term90863.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term90863, term90863.getClass(), "_serializationInclusion", null);
        setField(term90863, term90863.getClass(), "_mixIns", null);
        setField(term90863, term90863.getClass(), "_subtypeResolver", null);
        setField(term90863, term90863.getClass(), "_rootName", null);
        setField(term90863, term90863.getClass(), "_view", null);
        setField(term90863, term90863.getClass(), "_attributes", null);
        setField(term90863, term90863.getClass(), "_rootNames", null);
        setIntField(term90863, term90863.getClass(), "_mapperFeatures", 0);
        setField(term90863, term90863.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.SubtypeResolver");
        Object[] args = new Object[2];
        args[0] = term88174;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term90862));
        assertTrue(recursiveEquals(term88174, term90863));
    }

};


