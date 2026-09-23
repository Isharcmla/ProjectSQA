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

public class CollectionDeserializer_deserialize_1030086471157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92292;
     Object term92512;
     Object term92896;

    public CollectionDeserializer_deserialize_1030086471157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92292 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term92406 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term92292, term92292.getClass(), "_unwrapSingle", null);
        setField(term92292, term92292.getClass(), "_collectionType", term92406);
        Class<? extends Object> term93488 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term93487 = ((Class) term93488).getDeclaredField((String) "VALUE_STRING");
        ((Field) term93487).setAccessible(true);
        Object enum79 = ((Field) term93487).get((Object) null);
        term92512 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term92632 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term92632, term92632.getClass(), "_currToken", enum79);
        setField(term92512, term92512.getClass(), "delegate", term92632);
        term92896 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term92896, term92896.getClass(), "_featureFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term92512;
        args[1] = term92896;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term92292, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


