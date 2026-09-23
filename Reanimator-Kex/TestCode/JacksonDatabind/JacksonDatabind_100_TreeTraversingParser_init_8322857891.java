package com.fasterxml.jackson.databind.node;

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
import static com.fasterxml.jackson.databind.node.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TreeTraversingParser_init_8322857891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16517;
     Object term16609;

    public TreeTraversingParser_init_8322857891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16327 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term16419 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setIntField(term16327, term16327.getClass(), "_features", 0);
        setField(term16327, term16327.getClass(), "_objectCodec", term16419);
        term16517 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ObjectNode"));
        term16609 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term16517;
        args[1] = term16609;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


