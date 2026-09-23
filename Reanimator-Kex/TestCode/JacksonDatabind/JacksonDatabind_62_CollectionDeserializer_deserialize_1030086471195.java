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

public class CollectionDeserializer_deserialize_1030086471195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144863;
     Object term144983;
     Object term145247;

    public CollectionDeserializer_deserialize_1030086471195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144863 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        setField(term144863, term144863.getClass(), "_unwrapSingle", null);
        setField(term144863, term144863.getClass(), "_valueDeserializer", null);
        setField(term144863, term144863.getClass(), "_valueTypeDeserializer", null);
        Class<? extends Object> term147058 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term147057 = ((Class) term147058).getDeclaredField((String) "VALUE_STRING");
        ((Field) term147057).setAccessible(true);
        Object enum133 = ((Field) term147057).get((Object) null);
        term144983 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term144983, term144983.getClass(), "_currToken", enum133);
        term145247 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term145247, term145247.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term144983;
        args[1] = term145247;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term144863, args);
            assertTrue(false);
        }
        catch (JsonMappingException e) {
        }

    }

};


