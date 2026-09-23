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

public class SerializationConfig_init_1011731883193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116425;
     Object term116440;
     Object term116441;

    public SerializationConfig_init_1011731883193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116425 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        term116440 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term116440, term116440.getClass(), "_filterProvider", null);
        setField(term116440, term116440.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term116440, term116440.getClass(), "_serFeatures", 0);
        setIntField(term116440, term116440.getClass(), "_generatorFeatures", 0);
        setIntField(term116440, term116440.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term116440, term116440.getClass(), "_formatWriteFeatures", 0);
        setIntField(term116440, term116440.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term116440, term116440.getClass(), "_serializationInclusion", null);
        setField(term116440, term116440.getClass(), "_mixIns", null);
        setField(term116440, term116440.getClass(), "_subtypeResolver", null);
        setField(term116440, term116440.getClass(), "_rootName", null);
        setField(term116440, term116440.getClass(), "_view", null);
        setField(term116440, term116440.getClass(), "_attributes", null);
        setField(term116440, term116440.getClass(), "_rootNames", null);
        setIntField(term116440, term116440.getClass(), "_mapperFeatures", 0);
        setField(term116440, term116440.getClass(), "_base", null);
        term116441 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term116441, term116441.getClass(), "_filterProvider", null);
        setField(term116441, term116441.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term116441, term116441.getClass(), "_serFeatures", 0);
        setIntField(term116441, term116441.getClass(), "_generatorFeatures", 0);
        setIntField(term116441, term116441.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term116441, term116441.getClass(), "_formatWriteFeatures", 0);
        setIntField(term116441, term116441.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term116441, term116441.getClass(), "_serializationInclusion", null);
        setField(term116441, term116441.getClass(), "_mixIns", null);
        setField(term116441, term116441.getClass(), "_subtypeResolver", null);
        setField(term116441, term116441.getClass(), "_rootName", null);
        setField(term116441, term116441.getClass(), "_view", null);
        setField(term116441, term116441.getClass(), "_attributes", null);
        setField(term116441, term116441.getClass(), "_rootNames", null);
        setIntField(term116441, term116441.getClass(), "_mapperFeatures", 0);
        setField(term116441, term116441.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver");
        Object[] args = new Object[2];
        args[0] = term116425;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term116440));
        assertTrue(recursiveEquals(term116425, term116441));
    }

};


