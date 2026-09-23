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

public class JsonMappingException_init_1644956368362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563617;

    public JsonMappingException_init_1644956368362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term563419 = new ArrayList();
        Object term563259 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term563367 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term563505 = newInstance(Class.forName("java.util.zip.ZipFile"));
        setField(term563259, term563259.getClass(), "cause", term563367);
        setField(term563259, term563259.getClass(), "stackTrace", null);
        setField(term563259, term563259.getClass(), "suppressedExceptions", term563419);
        setField(term563259, term563259.getClass(), "detailMessage", "");
        setField(term563259, term563259.getClass(), "_processor", term563505);
        term563617 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term563617;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


