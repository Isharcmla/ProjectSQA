package com.fasterxml.jackson.core.util;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.fasterxml.jackson.core.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonParserSequence_createFlattened_142082991431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5018;
     Object term5124;

    public JsonParserSequence_createFlattened_142082991431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5018 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object[] term4869 = (Object[]) newArray("com.fasterxml.jackson.core.JsonParser", 0);
        setIntField(term5018, term5018.getClass(), "_nextParser", 128);
        setField(term5018, term5018.getClass(), "_parsers", term4869);
        term5124 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object[] term4871 = (Object[]) newArray("com.fasterxml.jackson.core.JsonParser", 0);
        setIntField(term5124, term5124.getClass(), "_nextParser", 0);
        setField(term5124, term5124.getClass(), "_parsers", term4871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[2];
        args[0] = term5018;
        args[1] = term5124;
        try {
            callMethod(klass, "createFlattened", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


