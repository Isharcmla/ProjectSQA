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
import static com.fasterxml.jackson.databind.node.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.node.EqualityUtils.*;
import java.lang.Object;

public class TreeTraversingParser_init_115780054871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9362;
     Object term9749;
     Object term9752;

    public TreeTraversingParser_init_115780054871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9176 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term9268 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setIntField(term9176, term9176.getClass(), "_features", 0);
        setField(term9176, term9176.getClass(), "_objectCodec", term9268);
        term9362 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.POJONode"));
        term9749 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term9750 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term9751 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.POJONode"));
        setField(term9749, term9749.getClass(), "_objectCodec", null);
        setField(term9751, term9751.getClass(), "_value", null);
        setField(term9750, term9750.getClass(), "_node", term9751);
        setBooleanField(term9750, term9750.getClass(), "_done", false);
        setField(term9750, term9750.getClass(), "_parent", null);
        setField(term9750, term9750.getClass(), "_currentName", null);
        setField(term9750, term9750.getClass(), "_currentValue", null);
        setIntField(term9750, term9750.getClass(), "_type", 0);
        setIntField(term9750, term9750.getClass(), "_index", -1);
        setField(term9749, term9749.getClass(), "_nodeCursor", term9750);
        setField(term9749, term9749.getClass(), "_nextToken", null);
        setBooleanField(term9749, term9749.getClass(), "_startContainer", false);
        setBooleanField(term9749, term9749.getClass(), "_closed", false);
        setField(term9749, term9749.getClass(), "_currToken", null);
        setField(term9749, term9749.getClass(), "_lastClearedToken", null);
        setIntField(term9749, term9749.getClass(), "_features", 0);
        setField(term9749, term9749.getClass(), "_requestPayload", null);
        term9752 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.POJONode"));
        setField(term9752, term9752.getClass(), "_value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term9362;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9749));
        assertTrue(recursiveEquals(term9362, term9752));
    }

};


