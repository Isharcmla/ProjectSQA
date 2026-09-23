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

public class TreeTraversingParser_init_115780054890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14811;
     Object term15526;
     Object term15529;

    public TreeTraversingParser_init_115780054890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14715 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setIntField(term14715, term14715.getClass(), "_features", 0);
        setField(term14715, term14715.getClass(), "_objectCodec", null);
        term14811 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.FloatNode"));
        term15526 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term15527 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term15528 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.FloatNode"));
        setField(term15526, term15526.getClass(), "_objectCodec", null);
        setFloatField(term15528, term15528.getClass(), "_value", 0.0F);
        setField(term15527, term15527.getClass(), "_node", term15528);
        setBooleanField(term15527, term15527.getClass(), "_done", false);
        setField(term15527, term15527.getClass(), "_parent", null);
        setField(term15527, term15527.getClass(), "_currentName", null);
        setField(term15527, term15527.getClass(), "_currentValue", null);
        setIntField(term15527, term15527.getClass(), "_type", 0);
        setIntField(term15527, term15527.getClass(), "_index", -1);
        setField(term15526, term15526.getClass(), "_nodeCursor", term15527);
        setField(term15526, term15526.getClass(), "_nextToken", null);
        setBooleanField(term15526, term15526.getClass(), "_startContainer", false);
        setBooleanField(term15526, term15526.getClass(), "_closed", false);
        setField(term15526, term15526.getClass(), "_currToken", null);
        setField(term15526, term15526.getClass(), "_lastClearedToken", null);
        setIntField(term15526, term15526.getClass(), "_features", 0);
        setField(term15526, term15526.getClass(), "_requestPayload", null);
        term15529 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.FloatNode"));
        setFloatField(term15529, term15529.getClass(), "_value", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term14811;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15526));
        assertTrue(recursiveEquals(term14811, term15529));
    }

};


