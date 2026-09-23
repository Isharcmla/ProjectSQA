package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Option_init_18650044161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Option_init_18650044161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23228 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term23228, term23228.getClass(), "argName", "");
        setIntField(term23228, term23228.getClass(), "numberOfArgs", 0);
        setField(term23228, term23228.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = " ";
        args[1] = false;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


