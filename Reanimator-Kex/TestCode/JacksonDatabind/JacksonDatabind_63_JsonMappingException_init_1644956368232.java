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

public class JsonMappingException_init_1644956368232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377487;

    public JsonMappingException_init_1644956368232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term377269 = new ArrayList();
        Object term377173 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term377217 = newInstance(Class.forName("java.lang.Throwable"));
        Object term377381 = newInstance(Class.forName("java.util.zip.DeflaterOutputStream"));
        setField(term377173, term377173.getClass(), "cause", term377217);
        setField(term377173, term377173.getClass(), "stackTrace", null);
        setField(term377173, term377173.getClass(), "suppressedExceptions", term377269);
        setField(term377173, term377173.getClass(), "detailMessage", "");
        setField(term377173, term377173.getClass(), "_processor", term377381);
        term377487 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term377487;
        args[1] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


