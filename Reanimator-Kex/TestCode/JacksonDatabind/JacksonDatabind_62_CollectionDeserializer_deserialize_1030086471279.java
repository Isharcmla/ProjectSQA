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

public class CollectionDeserializer_deserialize_1030086471279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253347;
     Object term253621;

    public CollectionDeserializer_deserialize_1030086471279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term253395 = new Boolean(false);
        term253347 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term253515 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term253347, term253347.getClass(), "_unwrapSingle", term253395);
        setField(term253347, term253347.getClass(), "_collectionType", term253515);
        Class<? extends Object> term254460 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term254459 = ((Class) term254460).getDeclaredField((String) "VALUE_NUMBER_INT");
        ((Field) term254459).setAccessible(true);
        Object enum238 = ((Field) term254459).get((Object) null);
        term253621 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term253733 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term253733, term253733.getClass(), "_currToken", enum238);
        setField(term253621, term253621.getClass(), "delegate", term253733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term253621;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term253347, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


