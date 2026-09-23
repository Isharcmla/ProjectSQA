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

public class TreeTraversingParser_init_115780054877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10881;
     Object term10899;
     Object term10902;

    public TreeTraversingParser_init_115780054877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10787 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setIntField(term10787, term10787.getClass(), "_features", 0);
        setField(term10787, term10787.getClass(), "_objectCodec", null);
        term10881 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NullNode"));
        term10899 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term10900 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term10901 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NullNode"));
        setField(term10899, term10899.getClass(), "_objectCodec", null);
        setField(term10900, term10900.getClass(), "_node", term10901);
        setBooleanField(term10900, term10900.getClass(), "_done", false);
        setField(term10900, term10900.getClass(), "_parent", null);
        setField(term10900, term10900.getClass(), "_currentName", null);
        setField(term10900, term10900.getClass(), "_currentValue", null);
        setIntField(term10900, term10900.getClass(), "_type", 0);
        setIntField(term10900, term10900.getClass(), "_index", -1);
        setField(term10899, term10899.getClass(), "_nodeCursor", term10900);
        setField(term10899, term10899.getClass(), "_nextToken", null);
        setBooleanField(term10899, term10899.getClass(), "_startContainer", false);
        setBooleanField(term10899, term10899.getClass(), "_closed", false);
        setField(term10899, term10899.getClass(), "_currToken", null);
        setField(term10899, term10899.getClass(), "_lastClearedToken", null);
        setIntField(term10899, term10899.getClass(), "_features", 0);
        setField(term10899, term10899.getClass(), "_requestPayload", null);
        term10902 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NullNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term10881;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10899));
        assertTrue(recursiveEquals(term10881, term10902));
    }

};


