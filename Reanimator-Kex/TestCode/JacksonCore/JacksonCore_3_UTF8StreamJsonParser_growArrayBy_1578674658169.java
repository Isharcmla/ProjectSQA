package com.fasterxml.jackson.core.json;

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
import java.lang.NegativeArraySizeException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UTF8StreamJsonParser_growArrayBy_1578674658169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public UTF8StreamJsonParser_growArrayBy_1578674658169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = -1;
        try {
            callMethod(klass, "growArrayBy", argTypes, null, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


