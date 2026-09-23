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

public class CollectionDeserializer_handleNonArray_782599076181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125127;
     Object term125429;

    public CollectionDeserializer_handleNonArray_782599076181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term125175 = new Boolean(false);
        term125127 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term125281 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term125127, term125127.getClass(), "_unwrapSingle", term125175);
        setField(term125281, term125281.getClass(), "_class", null);
        setField(term125127, term125127.getClass(), "_collectionType", term125281);
        term125429 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term125535 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(term125429, term125429.getClass(), "_parser", term125535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term125429;
        args[2] = null;
        try {
            callMethod(klass, "handleNonArray", argTypes, term125127, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


