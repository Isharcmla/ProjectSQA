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

public class SerializationConfig_init_708865171203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130389;
     Object term133083;
     Object term133084;

    public SerializationConfig_init_708865171203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130389 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        term133083 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term133083, term133083.getClass(), "_filterProvider", null);
        setField(term133083, term133083.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term133083, term133083.getClass(), "_serFeatures", 0);
        setIntField(term133083, term133083.getClass(), "_generatorFeatures", 0);
        setIntField(term133083, term133083.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term133083, term133083.getClass(), "_formatWriteFeatures", 0);
        setIntField(term133083, term133083.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term133083, term133083.getClass(), "_serializationInclusion", null);
        setField(term133083, term133083.getClass(), "_mixIns", null);
        setField(term133083, term133083.getClass(), "_subtypeResolver", null);
        setField(term133083, term133083.getClass(), "_rootName", null);
        setField(term133083, term133083.getClass(), "_view", null);
        setField(term133083, term133083.getClass(), "_attributes", null);
        setField(term133083, term133083.getClass(), "_rootNames", null);
        setIntField(term133083, term133083.getClass(), "_mapperFeatures", 0);
        setField(term133083, term133083.getClass(), "_base", null);
        term133084 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term133084, term133084.getClass(), "_filterProvider", null);
        setField(term133084, term133084.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term133084, term133084.getClass(), "_serFeatures", 0);
        setIntField(term133084, term133084.getClass(), "_generatorFeatures", 0);
        setIntField(term133084, term133084.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term133084, term133084.getClass(), "_formatWriteFeatures", 0);
        setIntField(term133084, term133084.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term133084, term133084.getClass(), "_serializationInclusion", null);
        setField(term133084, term133084.getClass(), "_mixIns", null);
        setField(term133084, term133084.getClass(), "_subtypeResolver", null);
        setField(term133084, term133084.getClass(), "_rootName", null);
        setField(term133084, term133084.getClass(), "_view", null);
        setField(term133084, term133084.getClass(), "_attributes", null);
        setField(term133084, term133084.getClass(), "_rootNames", null);
        setIntField(term133084, term133084.getClass(), "_mapperFeatures", 0);
        setField(term133084, term133084.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        Object[] args = new Object[2];
        args[0] = term130389;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term133083));
        assertTrue(recursiveEquals(term130389, term133084));
    }

};


