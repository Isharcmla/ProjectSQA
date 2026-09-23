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

public class CollectionDeserializer_deserialize_1030086471277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251070;
     Object term251344;
     Object term251718;

    public CollectionDeserializer_deserialize_1030086471277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term251118 = new Boolean(false);
        term251070 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term251238 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term251070, term251070.getClass(), "_unwrapSingle", term251118);
        setField(term251238, term251238.getClass(), "_class", null);
        setField(term251070, term251070.getClass(), "_collectionType", term251238);
        Class<? extends Object> term252356 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term252355 = ((Class) term252356).getDeclaredField((String) "VALUE_EMBEDDED_OBJECT");
        ((Field) term252355).setAccessible(true);
        Object enum235 = ((Field) term252355).get((Object) null);
        term251344 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term251454 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term251454, term251454.getClass(), "_currToken", enum235);
        setField(term251344, term251344.getClass(), "delegate", term251454);
        term251718 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term251344;
        args[1] = term251718;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term251070, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


