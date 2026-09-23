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
import java.lang.Integer;

public class JsonMappingException_wrapWithPath_97327424362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125704;
     Object term125765;

    public JsonMappingException_wrapWithPath_97327424362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125704 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term125704, term125704.getClass(), "_path", null);
        setField(term125704, term125704.getClass(), "_processor", null);
        setField(term125704, term125704.getClass(), "_location", null);
        setField(term125704, term125704.getClass(), "backtrace", null);
        setField(term125704, term125704.getClass(), "detailMessage", null);
        setField(term125704, term125704.getClass(), "cause", null);
        setField(term125704, term125704.getClass(), "stackTrace", null);
        setIntField(term125704, term125704.getClass(), "depth", 0);
        setField(term125704, term125704.getClass(), "suppressedExceptions", null);
        term125765 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term125765;
        try {
            callMethod(klass, "wrapWithPath", argTypes, term125704, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


