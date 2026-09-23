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

public class CollectionDeserializer_deserialize_1030086471265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237676;
     Object term237782;

    public CollectionDeserializer_deserialize_1030086471265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237676 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        Class<? extends Object> term238763 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term238762 = ((Class) term238763).getDeclaredField((String) "VALUE_NUMBER_INT");
        ((Field) term238762).setAccessible(true);
        Object enum220 = ((Field) term238762).get((Object) null);
        term237782 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term237888 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term237998 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term237998, term237998.getClass(), "_currToken", enum220);
        setField(term237888, term237888.getClass(), "delegate", term237998);
        setField(term237782, term237782.getClass(), "delegate", term237888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term237782;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term237676, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


