package org.apache.commons.math.fraction;

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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProperFractionFormat_init_15041944909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ProperFractionFormat_init_15041944909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.ProperFractionFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.text.NumberFormat");
        argTypes[1] = Class.forName("java.text.NumberFormat");
        argTypes[2] = Class.forName("java.text.NumberFormat");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


