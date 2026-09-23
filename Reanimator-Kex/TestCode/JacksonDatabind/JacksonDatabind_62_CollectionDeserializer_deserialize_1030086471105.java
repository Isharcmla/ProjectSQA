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

public class CollectionDeserializer_deserialize_1030086471105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47914;
     Object term48068;

    public CollectionDeserializer_deserialize_1030086471105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term47962 = new Boolean(false);
        term47914 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term47914, term47914.getClass(), "_unwrapSingle", term47962);
        Class<? extends Object> term48897 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term48896 = ((Class) term48897).getDeclaredField((String) "VALUE_EMBEDDED_OBJECT");
        ((Field) term48896).setAccessible(true);
        Object enum37 = ((Field) term48896).get((Object) null);
        term48068 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term48188 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term48188, term48188.getClass(), "_currToken", enum37);
        setField(term48068, term48068.getClass(), "delegate", term48188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term48068;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term47914, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


