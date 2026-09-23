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

public class JsonParserSequence_createFlattened_142082991429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4454;
     Object term4560;

    public JsonParserSequence_createFlattened_142082991429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4454 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object[] term4311 = (Object[]) newArray("com.fasterxml.jackson.core.JsonParser", 0);
        setIntField(term4454, term4454.getClass(), "_nextParser", 1);
        setField(term4454, term4454.getClass(), "_parsers", term4311);
        term4560 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object[] term4313 = (Object[]) newArray("com.fasterxml.jackson.core.JsonParser", 0);
        setIntField(term4560, term4560.getClass(), "_nextParser", 1);
        setField(term4560, term4560.getClass(), "_parsers", term4313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[2];
        args[0] = term4454;
        args[1] = term4560;
        try {
            callMethod(klass, "createFlattened", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


