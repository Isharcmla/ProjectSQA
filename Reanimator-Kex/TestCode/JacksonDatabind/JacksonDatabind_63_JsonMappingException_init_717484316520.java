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

public class JsonMappingException_init_717484316520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term802791;
     Object term803103;

    public JsonMappingException_init_717484316520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term802637 = new ArrayList();
        Object term802585 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term802429 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term802685 = newInstance(Class.forName("java.io.InputStream$1"));
        setField(term802585, term802585.getClass(), "cause", null);
        setField(term802585, term802585.getClass(), "stackTrace", term802429);
        setField(term802585, term802585.getClass(), "suppressedExceptions", term802637);
        setField(term802585, term802585.getClass(), "detailMessage", null);
        setField(term802585, term802585.getClass(), "_location", null);
        setField(term802585, term802585.getClass(), "_processor", term802685);
        term802791 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term802911 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term803021 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term802911, term802911.getClass(), "delegate", term803021);
        setField(term802791, term802791.getClass(), "delegate", term802911);
        term803103 = newInstance(Class.forName("java.lang.Exception"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term802791;
        args[1] = "";
        args[2] = term803103;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


