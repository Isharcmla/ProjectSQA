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

public class JsonParserSequence_createFlattened_142082991423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3213;

    public JsonParserSequence_createFlattened_142082991423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3213 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object[] term3078 = (Object[]) newArray("com.fasterxml.jackson.core.JsonParser", 9);
        Object term3333 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setIntField(term3213, term3213.getClass(), "_nextParser", 0);
        setElement(term3078, 8, term3333);
        setField(term3213, term3213.getClass(), "_parsers", term3078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[2];
        args[0] = term3213;
        args[1] = null;
        try {
            callMethod(klass, "createFlattened", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


