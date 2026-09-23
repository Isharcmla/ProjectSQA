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

public class CollectionDeserializer_deserialize_1030086471179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122736;
     Object term123010;

    public CollectionDeserializer_deserialize_1030086471179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term122784 = new Boolean(false);
        term122736 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term122904 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term122736, term122736.getClass(), "_unwrapSingle", term122784);
        setField(term122736, term122736.getClass(), "_collectionType", term122904);
        Class<? extends Object> term123847 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term123846 = ((Class) term123847).getDeclaredField((String) "VALUE_NUMBER_INT");
        ((Field) term123846).setAccessible(true);
        Object enum112 = ((Field) term123846).get((Object) null);
        term123010 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term123120 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term123120, term123120.getClass(), "_currToken", enum112);
        setField(term123010, term123010.getClass(), "delegate", term123120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term123010;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term122736, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


