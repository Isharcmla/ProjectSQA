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

public class JsonMappingException_init_717484316236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385314;
     Object term385512;

    public JsonMappingException_init_717484316236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term385148 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term385208 = newInstance(Class.forName("java.io.SequenceInputStream"));
        setField(term385148, term385148.getClass(), "cause", null);
        setField(term385148, term385148.getClass(), "stackTrace", null);
        setField(term385148, term385148.getClass(), "suppressedExceptions", null);
        setField(term385148, term385148.getClass(), "detailMessage", null);
        setField(term385148, term385148.getClass(), "_location", null);
        setField(term385148, term385148.getClass(), "_processor", term385208);
        term385314 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term385430 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(term385314, term385314.getClass(), "delegate", term385430);
        term385512 = newInstance(Class.forName("java.lang.Throwable"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term385314;
        args[1] = "";
        args[2] = term385512;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


