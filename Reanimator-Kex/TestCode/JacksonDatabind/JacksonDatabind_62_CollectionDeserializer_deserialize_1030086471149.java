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

public class CollectionDeserializer_deserialize_1030086471149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81854;
     Object term82112;

    public CollectionDeserializer_deserialize_1030086471149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term81902 = new Boolean(false);
        term81854 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term82006 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term81854, term81854.getClass(), "_unwrapSingle", term81902);
        setField(term81854, term81854.getClass(), "_collectionType", term82006);
        Class<? extends Object> term82919 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term82918 = ((Class) term82919).getDeclaredField((String) "VALUE_NUMBER_INT");
        ((Field) term82918).setAccessible(true);
        Object enum67 = ((Field) term82918).get((Object) null);
        term82112 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term82232 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term82232, term82232.getClass(), "_currToken", enum67);
        setField(term82112, term82112.getClass(), "delegate", term82232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term82112;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term81854, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


