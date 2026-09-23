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

public class TreeTraversingParser_init_115780054879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11140;
     Object term11158;
     Object term11161;

    public TreeTraversingParser_init_115780054879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11034 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setIntField(term11034, term11034.getClass(), "_features", 0);
        setField(term11034, term11034.getClass(), "_objectCodec", null);
        term11140 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.BigIntegerNode"));
        term11158 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term11159 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term11160 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.BigIntegerNode"));
        setField(term11158, term11158.getClass(), "_objectCodec", null);
        setField(term11160, term11160.getClass(), "_value", null);
        setField(term11159, term11159.getClass(), "_node", term11160);
        setBooleanField(term11159, term11159.getClass(), "_done", false);
        setField(term11159, term11159.getClass(), "_parent", null);
        setField(term11159, term11159.getClass(), "_currentName", null);
        setField(term11159, term11159.getClass(), "_currentValue", null);
        setIntField(term11159, term11159.getClass(), "_type", 0);
        setIntField(term11159, term11159.getClass(), "_index", -1);
        setField(term11158, term11158.getClass(), "_nodeCursor", term11159);
        setField(term11158, term11158.getClass(), "_nextToken", null);
        setBooleanField(term11158, term11158.getClass(), "_startContainer", false);
        setBooleanField(term11158, term11158.getClass(), "_closed", false);
        setField(term11158, term11158.getClass(), "_currToken", null);
        setField(term11158, term11158.getClass(), "_lastClearedToken", null);
        setIntField(term11158, term11158.getClass(), "_features", 0);
        setField(term11158, term11158.getClass(), "_requestPayload", null);
        term11161 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.BigIntegerNode"));
        setField(term11161, term11161.getClass(), "_value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term11140;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11158));
        assertTrue(recursiveEquals(term11140, term11161));
    }

};


