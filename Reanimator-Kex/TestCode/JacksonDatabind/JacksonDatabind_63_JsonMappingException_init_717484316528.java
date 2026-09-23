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

public class JsonMappingException_init_717484316528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816952;
     Object term817146;

    public JsonMappingException_init_717484316528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term816788 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term816846 = newInstance(Class.forName("java.io.ObjectOutputStream"));
        setField(term816788, term816788.getClass(), "cause", null);
        setField(term816788, term816788.getClass(), "stackTrace", null);
        setField(term816788, term816788.getClass(), "suppressedExceptions", null);
        setField(term816788, term816788.getClass(), "detailMessage", null);
        setField(term816788, term816788.getClass(), "_location", null);
        setField(term816788, term816788.getClass(), "_processor", term816846);
        term816952 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term817064 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term816952, term816952.getClass(), "delegate", term817064);
        term817146 = newInstance(Class.forName("java.lang.Throwable"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term816952;
        args[1] = "";
        args[2] = term817146;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


