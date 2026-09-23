package com.fasterxml.jackson.databind.deser.std;

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
import com.fasterxml.jackson.databind.JsonMappingException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class CollectionDeserializer_deserialize_1030086471167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105141;
     Object term105261;
     Object term105525;

    public CollectionDeserializer_deserialize_1030086471167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105141 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        setField(term105141, term105141.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term107347 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term107346 = ((Class) term107347).getDeclaredField((String) "VALUE_NULL");
        ((Field) term107346).setAccessible(true);
        Object enum94 = ((Field) term107346).get((Object) null);
        term105261 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term105261, term105261.getClass(), "_currToken", enum94);
        term105525 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term105525, term105525.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term105261;
        args[1] = term105525;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term105141, args);
            assertTrue(false);
        }
        catch (JsonMappingException e) {
        }

    }

};


