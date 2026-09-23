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
import java.util.ArrayList;

public class JsonMappingException_init_717484316222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356542;
     Object term356886;

    public JsonMappingException_init_717484316222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term356340 = new ArrayList();
        Object term356288 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term356436 = newInstance(Class.forName("com.fasterxml.jackson.databind.SequenceWriter"));
        setField(term356288, term356288.getClass(), "cause", null);
        setField(term356288, term356288.getClass(), "stackTrace", null);
        setField(term356288, term356288.getClass(), "suppressedExceptions", term356340);
        setField(term356288, term356288.getClass(), "detailMessage", null);
        setField(term356288, term356288.getClass(), "_location", null);
        setField(term356288, term356288.getClass(), "_processor", term356436);
        term356542 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term356662 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term356778 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(term356662, term356662.getClass(), "delegate", term356778);
        setField(term356542, term356542.getClass(), "delegate", term356662);
        term356886 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term356542;
        args[1] = null;
        args[2] = term356886;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


