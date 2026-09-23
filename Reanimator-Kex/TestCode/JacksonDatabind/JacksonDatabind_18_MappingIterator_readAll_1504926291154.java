package com.fasterxml.jackson.databind;

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
import java.lang.UnsupportedOperationException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101944;

    public MappingIterator_readAll_1504926291154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term103585 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term103584 = ((Class) term103585).getDeclaredField((String) "VALUE_NUMBER_INT");
        ((Field) term103584).setAccessible(true);
        Object enum62 = ((Field) term103584).get((Object) null);
        term101944 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term102054 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term102234 = newInstance(Class.forName("java.io.FileNotFoundException"));
        Object term102396 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        setField(term102054, term102054.getClass(), "_currToken", enum62);
        setField(term101944, term101944.getClass(), "_parser", term102054);
        setBooleanField(term101944, term101944.getClass(), "_hasNextChecked", false);
        setField(term101944, term101944.getClass(), "_updatedValue", term102234);
        setField(term101944, term101944.getClass(), "_deserializer", term102396);
        setField(term101944, term101944.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term101944, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


