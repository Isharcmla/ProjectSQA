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

public class CollectionDeserializer_deserialize_103008647161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24637;
     Object term24903;

    public CollectionDeserializer_deserialize_103008647161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term24685 = new Boolean(false);
        term24637 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term24783 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term24637, term24637.getClass(), "_unwrapSingle", term24685);
        setField(term24637, term24637.getClass(), "_collectionType", term24783);
        Class<? extends Object> term25535 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term25534 = ((Class) term25535).getDeclaredField((String) "VALUE_STRING");
        ((Field) term25534).setAccessible(true);
        Object enum19 = ((Field) term25534).get((Object) null);
        term24903 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term24903, term24903.getClass(), "_currToken", enum19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term24903;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term24637, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


