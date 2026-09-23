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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

public class CollectionDeserializer_deserialize_1030086471155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89321;
     Object term89595;
     Object term89859;

    public CollectionDeserializer_deserialize_1030086471155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term89369 = new Boolean(false);
        term89321 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term89475 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term89321, term89321.getClass(), "_unwrapSingle", term89369);
        setField(term89475, term89475.getClass(), "_class", null);
        setField(term89321, term89321.getClass(), "_collectionType", term89475);
        Class<? extends Object> term90415 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term90414 = ((Class) term90415).getDeclaredField((String) "VALUE_EMBEDDED_OBJECT");
        ((Field) term90414).setAccessible(true);
        Object enum76 = ((Field) term90414).get((Object) null);
        term89595 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term89595, term89595.getClass(), "_currToken", enum76);
        term89859 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term89595;
        args[1] = term89859;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term89321, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


