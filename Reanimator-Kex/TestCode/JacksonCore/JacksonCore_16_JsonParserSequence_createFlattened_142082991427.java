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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.core.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonParserSequence_createFlattened_142082991427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3937;
     Object term4043;

    public JsonParserSequence_createFlattened_142082991427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3937 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object[] term3800 = (Object[]) newArray("com.fasterxml.jackson.core.JsonParser", 0);
        setIntField(term3937, term3937.getClass(), "_nextParser", 1);
        setField(term3937, term3937.getClass(), "_parsers", term3800);
        term4043 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[2];
        args[0] = term3937;
        args[1] = term4043;
        try {
            callMethod(klass, "createFlattened", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


