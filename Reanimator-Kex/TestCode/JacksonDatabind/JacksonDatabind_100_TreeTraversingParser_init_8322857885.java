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

public class TreeTraversingParser_init_8322857885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14357;
     Object term14449;
     Object term14470;
     Object term14474;
     Object term14475;

    public TreeTraversingParser_init_8322857885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14169 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term14261 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setIntField(term14169, term14169.getClass(), "_features", 0);
        setField(term14169, term14169.getClass(), "_objectCodec", term14261);
        term14357 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.FloatNode"));
        term14449 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term14470 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term14471 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term14472 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term14473 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.FloatNode"));
        setField(term14471, term14471.getClass(), "_jsonFactory", null);
        setField(term14471, term14471.getClass(), "_typeFactory", null);
        setField(term14471, term14471.getClass(), "_injectableValues", null);
        setField(term14471, term14471.getClass(), "_subtypeResolver", null);
        setField(term14471, term14471.getClass(), "_configOverrides", null);
        setField(term14471, term14471.getClass(), "_mixIns", null);
        setField(term14471, term14471.getClass(), "_serializationConfig", null);
        setField(term14471, term14471.getClass(), "_serializerProvider", null);
        setField(term14471, term14471.getClass(), "_serializerFactory", null);
        setField(term14471, term14471.getClass(), "_deserializationConfig", null);
        setField(term14471, term14471.getClass(), "_deserializationContext", null);
        setField(term14471, term14471.getClass(), "_registeredModuleTypes", null);
        setField(term14471, term14471.getClass(), "_rootDeserializers", null);
        setField(term14470, term14470.getClass(), "_objectCodec", term14471);
        setFloatField(term14473, term14473.getClass(), "_value", 0.0F);
        setField(term14472, term14472.getClass(), "_node", term14473);
        setBooleanField(term14472, term14472.getClass(), "_done", false);
        setField(term14472, term14472.getClass(), "_parent", null);
        setField(term14472, term14472.getClass(), "_currentName", null);
        setField(term14472, term14472.getClass(), "_currentValue", null);
        setIntField(term14472, term14472.getClass(), "_type", 0);
        setIntField(term14472, term14472.getClass(), "_index", -1);
        setField(term14470, term14470.getClass(), "_nodeCursor", term14472);
        setField(term14470, term14470.getClass(), "_nextToken", null);
        setBooleanField(term14470, term14470.getClass(), "_startContainer", false);
        setBooleanField(term14470, term14470.getClass(), "_closed", false);
        setField(term14470, term14470.getClass(), "_currToken", null);
        setField(term14470, term14470.getClass(), "_lastClearedToken", null);
        setIntField(term14470, term14470.getClass(), "_features", 0);
        setField(term14470, term14470.getClass(), "_requestPayload", null);
        term14474 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.FloatNode"));
        setFloatField(term14474, term14474.getClass(), "_value", 0.0F);
        term14475 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term14475, term14475.getClass(), "_jsonFactory", null);
        setField(term14475, term14475.getClass(), "_typeFactory", null);
        setField(term14475, term14475.getClass(), "_injectableValues", null);
        setField(term14475, term14475.getClass(), "_subtypeResolver", null);
        setField(term14475, term14475.getClass(), "_configOverrides", null);
        setField(term14475, term14475.getClass(), "_mixIns", null);
        setField(term14475, term14475.getClass(), "_serializationConfig", null);
        setField(term14475, term14475.getClass(), "_serializerProvider", null);
        setField(term14475, term14475.getClass(), "_serializerFactory", null);
        setField(term14475, term14475.getClass(), "_deserializationConfig", null);
        setField(term14475, term14475.getClass(), "_deserializationContext", null);
        setField(term14475, term14475.getClass(), "_registeredModuleTypes", null);
        setField(term14475, term14475.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term14357;
        args[1] = term14449;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14470));
        assertTrue(recursiveEquals(term14357, term14474));
        assertTrue(recursiveEquals(term14449, term14475));
    }

};


