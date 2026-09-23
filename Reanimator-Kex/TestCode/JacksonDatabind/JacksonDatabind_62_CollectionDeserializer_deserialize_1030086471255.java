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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class CollectionDeserializer_deserialize_1030086471255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223910;
     Object term224330;
     Object term224704;

    public CollectionDeserializer_deserialize_1030086471255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223910 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term224076 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer"));
        Object term224224 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(term223910, term223910.getClass(), "_unwrapSingle", null);
        setField(term223910, term223910.getClass(), "_valueDeserializer", term224076);
        setField(term223910, term223910.getClass(), "_valueTypeDeserializer", term224224);
        Class<? extends Object> term225859 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term225858 = ((Class) term225859).getDeclaredField((String) "VALUE_TRUE");
        ((Field) term225858).setAccessible(true);
        Object enum208 = ((Field) term225858).get((Object) null);
        term224330 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term224440 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term224440, term224440.getClass(), "_currToken", enum208);
        setField(term224330, term224330.getClass(), "delegate", term224440);
        term224704 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term224704, term224704.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term224330;
        args[1] = term224704;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term223910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


