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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class WriterBasedJsonGenerator_writeStringCustom_1523775958121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464;
     Object term471;
     Object term473;

    public WriterBasedJsonGenerator_writeStringCustom_1523775958121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464 = (char[]) newCharArray(6);
        setCharElement(term464, 0, 'r');
        setCharElement(term464, 1, 'b');
        setCharElement(term464, 2, 'M');
        setCharElement(term464, 3, 'u');
        setCharElement(term464, 4, 'L');
        setCharElement(term464, 5, 'c');
        term471 = new Integer(-244121226);
        term473 = new Integer(-203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term464;
        args[1] = term471;
        args[2] = term473;
        try {
            callMethod(klass, "_writeStringCustom", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


