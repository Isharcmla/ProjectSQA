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
import java.lang.Object;
import java.lang.String;

public class CollectionDeserializer_deserialize_1030086471229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184969;
     Object term185235;
     Object term185499;

    public CollectionDeserializer_deserialize_1030086471229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184969 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        Object term185115 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term184969, term184969.getClass(), "_unwrapSingle", null);
        setField(term184969, term184969.getClass(), "_valueDeserializer", null);
        setField(term184969, term184969.getClass(), "_valueTypeDeserializer", term185115);
        Class<? extends Object> term187329 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term187328 = ((Class) term187329).getDeclaredField((String) "VALUE_FALSE");
        ((Field) term187328).setAccessible(true);
        Object enum169 = ((Field) term187328).get((Object) null);
        term185235 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term185235, term185235.getClass(), "_currToken", enum169);
        term185499 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term185499, term185499.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term185235;
        args[1] = term185499;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term184969, args);
            assertTrue(false);
        }
        catch (JsonMappingException e) {
        }

    }

};


