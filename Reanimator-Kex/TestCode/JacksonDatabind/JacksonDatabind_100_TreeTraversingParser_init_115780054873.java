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

public class TreeTraversingParser_init_115780054873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9982;

    public TreeTraversingParser_init_115780054873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9884 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setIntField(term9884, term9884.getClass(), "_features", 0);
        setField(term9884, term9884.getClass(), "_objectCodec", null);
        term9982 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ObjectNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term9982;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


