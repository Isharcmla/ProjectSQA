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

public class CollectionDeserializer_deserialize_1030086471201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151910;
     Object term152174;
     Object term152438;

    public CollectionDeserializer_deserialize_1030086471201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term151958 = new Boolean(false);
        term151910 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term152062 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term151910, term151910.getClass(), "_unwrapSingle", term151958);
        setField(term152062, term152062.getClass(), "_class", null);
        setField(term151910, term151910.getClass(), "_collectionType", term152062);
        Class<? extends Object> term152989 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term152988 = ((Class) term152989).getDeclaredField((String) "START_OBJECT");
        ((Field) term152988).setAccessible(true);
        Object enum139 = ((Field) term152988).get((Object) null);
        term152174 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term152174, term152174.getClass(), "_currToken", enum139);
        term152438 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term152174;
        args[1] = term152438;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term151910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


