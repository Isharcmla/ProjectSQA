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

public class MappingIterator_readAll_150492629163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25936;

    public MappingIterator_readAll_150492629163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26973 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term26972 = ((Class) term26973).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term26972).setAccessible(true);
        Object enum10 = ((Field) term26972).get((Object) null);
        term25936 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term26046 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term26046, term26046.getClass(), "_currToken", enum10);
        setField(term25936, term25936.getClass(), "_parser", term26046);
        setBooleanField(term25936, term25936.getClass(), "_hasNextChecked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term25936, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


