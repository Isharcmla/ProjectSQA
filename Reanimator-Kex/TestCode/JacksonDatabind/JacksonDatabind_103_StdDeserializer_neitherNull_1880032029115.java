package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.std.EqualityUtils.*;

public class StdDeserializer_neitherNull_1880032029115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406;
     Object term407;
     Object term14180;
     Object term14181;

    public StdDeserializer_neitherNull_1880032029115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406 = newInstance(Class.forName("java.lang.Object"));
        term407 = newInstance(Class.forName("java.lang.Object"));
        term14180 = newInstance(Class.forName("java.lang.Object"));
        term14181 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term406;
        args[1] = term407;
        Object retValue = callMethod(klass, "_neitherNull", argTypes, null, args);
        assertTrue(recursiveEquals(term406, term14180));
        assertTrue(recursiveEquals(term407, term14181));
        assertTrue(recursiveEquals(retValue, true));
    }

};


