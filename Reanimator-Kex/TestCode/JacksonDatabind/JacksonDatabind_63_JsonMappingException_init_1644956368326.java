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

public class JsonMappingException_init_1644956368326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508392;

    public JsonMappingException_init_1644956368326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term508186 = new ArrayList();
        Object term508090 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term508134 = newInstance(Class.forName("java.lang.Throwable"));
        Object term508282 = newInstance(Class.forName("java.io.ObjectOutputStream"));
        setField(term508090, term508090.getClass(), "cause", term508134);
        setField(term508090, term508090.getClass(), "stackTrace", null);
        setField(term508090, term508090.getClass(), "suppressedExceptions", term508186);
        setField(term508090, term508090.getClass(), "detailMessage", "");
        setField(term508090, term508090.getClass(), "_processor", term508282);
        term508392 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term508392;
        args[1] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


