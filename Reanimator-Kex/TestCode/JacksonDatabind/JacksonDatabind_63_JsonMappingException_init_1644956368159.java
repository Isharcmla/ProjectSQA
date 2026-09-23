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

public class JsonMappingException_init_1644956368159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275456;

    public JsonMappingException_init_1644956368159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term275228 = new ArrayList();
        Object term275132 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term275176 = newInstance(Class.forName("java.lang.Throwable"));
        Object term275340 = newInstance(Class.forName("java.util.zip.DeflaterOutputStream"));
        setField(term275132, term275132.getClass(), "cause", term275176);
        setField(term275132, term275132.getClass(), "stackTrace", null);
        setField(term275132, term275132.getClass(), "suppressedExceptions", term275228);
        setField(term275132, term275132.getClass(), "detailMessage", "");
        setField(term275132, term275132.getClass(), "_processor", term275340);
        term275456 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term275456;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


