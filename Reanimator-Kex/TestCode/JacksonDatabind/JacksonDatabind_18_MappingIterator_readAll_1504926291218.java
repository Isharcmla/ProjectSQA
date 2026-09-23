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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174586;

    public MappingIterator_readAll_1504926291218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term175632 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term175631 = ((Class) term175632).getDeclaredField((String) "VALUE_STRING");
        ((Field) term175631).setAccessible(true);
        Object enum106 = ((Field) term175631).get((Object) null);
        term174586 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term174698 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term174698, term174698.getClass(), "_currToken", enum106);
        setField(term174586, term174586.getClass(), "_parser", term174698);
        setBooleanField(term174586, term174586.getClass(), "_hasNextChecked", true);
        setField(term174586, term174586.getClass(), "_updatedValue", "");
        setField(term174586, term174586.getClass(), "_deserializer", null);
        setField(term174586, term174586.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term174586, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


