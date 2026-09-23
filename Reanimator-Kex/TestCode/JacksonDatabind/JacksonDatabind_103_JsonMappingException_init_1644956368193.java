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

public class JsonMappingException_init_1644956368193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367944;

    public JsonMappingException_init_1644956368193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term367754 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term367798 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term367612 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term367838 = newInstance(Class.forName("java.util.Scanner"));
        setField(term367754, term367754.getClass(), "cause", term367798);
        setField(term367754, term367754.getClass(), "stackTrace", term367612);
        setField(term367754, term367754.getClass(), "suppressedExceptions", null);
        setField(term367754, term367754.getClass(), "detailMessage", null);
        setField(term367754, term367754.getClass(), "_processor", term367838);
        term367944 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term367944;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


