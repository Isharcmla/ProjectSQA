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
     Object term13677;
     Object term13775;
     Object term13794;
     Object term13798;
     Object term13799;

    public TreeTraversingParser_init_8322857885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13485 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term13583 = newInstance(Class.forName("com.fasterxml.jackson.databind.json.JsonMapper"));
        setIntField(term13485, term13485.getClass(), "_features", 0);
        setField(term13485, term13485.getClass(), "_objectCodec", term13583);
        term13677 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TextNode"));
        term13775 = newInstance(Class.forName("com.fasterxml.jackson.databind.json.JsonMapper"));
        term13794 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term13795 = newInstance(Class.forName("com.fasterxml.jackson.databind.json.JsonMapper"));
        Object term13796 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term13797 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TextNode"));
        setField(term13795, term13795.getClass(), "_jsonFactory", null);
        setField(term13795, term13795.getClass(), "_typeFactory", null);
        setField(term13795, term13795.getClass(), "_injectableValues", null);
        setField(term13795, term13795.getClass(), "_subtypeResolver", null);
        setField(term13795, term13795.getClass(), "_configOverrides", null);
        setField(term13795, term13795.getClass(), "_mixIns", null);
        setField(term13795, term13795.getClass(), "_serializationConfig", null);
        setField(term13795, term13795.getClass(), "_serializerProvider", null);
        setField(term13795, term13795.getClass(), "_serializerFactory", null);
        setField(term13795, term13795.getClass(), "_deserializationConfig", null);
        setField(term13795, term13795.getClass(), "_deserializationContext", null);
        setField(term13795, term13795.getClass(), "_registeredModuleTypes", null);
        setField(term13795, term13795.getClass(), "_rootDeserializers", null);
        setField(term13794, term13794.getClass(), "_objectCodec", term13795);
        setField(term13797, term13797.getClass(), "_value", null);
        setField(term13796, term13796.getClass(), "_node", term13797);
        setBooleanField(term13796, term13796.getClass(), "_done", false);
        setField(term13796, term13796.getClass(), "_parent", null);
        setField(term13796, term13796.getClass(), "_currentName", null);
        setField(term13796, term13796.getClass(), "_currentValue", null);
        setIntField(term13796, term13796.getClass(), "_type", 0);
        setIntField(term13796, term13796.getClass(), "_index", -1);
        setField(term13794, term13794.getClass(), "_nodeCursor", term13796);
        setField(term13794, term13794.getClass(), "_nextToken", null);
        setBooleanField(term13794, term13794.getClass(), "_startContainer", false);
        setBooleanField(term13794, term13794.getClass(), "_closed", false);
        setField(term13794, term13794.getClass(), "_currToken", null);
        setField(term13794, term13794.getClass(), "_lastClearedToken", null);
        setIntField(term13794, term13794.getClass(), "_features", 0);
        setField(term13794, term13794.getClass(), "_requestPayload", null);
        term13798 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TextNode"));
        setField(term13798, term13798.getClass(), "_value", null);
        term13799 = newInstance(Class.forName("com.fasterxml.jackson.databind.json.JsonMapper"));
        setField(term13799, term13799.getClass(), "_jsonFactory", null);
        setField(term13799, term13799.getClass(), "_typeFactory", null);
        setField(term13799, term13799.getClass(), "_injectableValues", null);
        setField(term13799, term13799.getClass(), "_subtypeResolver", null);
        setField(term13799, term13799.getClass(), "_configOverrides", null);
        setField(term13799, term13799.getClass(), "_mixIns", null);
        setField(term13799, term13799.getClass(), "_serializationConfig", null);
        setField(term13799, term13799.getClass(), "_serializerProvider", null);
        setField(term13799, term13799.getClass(), "_serializerFactory", null);
        setField(term13799, term13799.getClass(), "_deserializationConfig", null);
        setField(term13799, term13799.getClass(), "_deserializationContext", null);
        setField(term13799, term13799.getClass(), "_registeredModuleTypes", null);
        setField(term13799, term13799.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term13677;
        args[1] = term13775;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13794));
        assertTrue(recursiveEquals(term13677, term13798));
        assertTrue(recursiveEquals(term13775, term13799));
    }

};


