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

public class TreeTraversingParser_init_8322857881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13645;
     Object term13737;
     Object term13756;
     Object term13760;
     Object term13761;

    public TreeTraversingParser_init_8322857881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13459 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term13551 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setIntField(term13459, term13459.getClass(), "_features", 0);
        setField(term13459, term13459.getClass(), "_objectCodec", term13551);
        term13645 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NullNode"));
        term13737 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term13756 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term13757 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term13758 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term13759 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NullNode"));
        setField(term13757, term13757.getClass(), "_jsonFactory", null);
        setField(term13757, term13757.getClass(), "_typeFactory", null);
        setField(term13757, term13757.getClass(), "_injectableValues", null);
        setField(term13757, term13757.getClass(), "_subtypeResolver", null);
        setField(term13757, term13757.getClass(), "_configOverrides", null);
        setField(term13757, term13757.getClass(), "_mixIns", null);
        setField(term13757, term13757.getClass(), "_serializationConfig", null);
        setField(term13757, term13757.getClass(), "_serializerProvider", null);
        setField(term13757, term13757.getClass(), "_serializerFactory", null);
        setField(term13757, term13757.getClass(), "_deserializationConfig", null);
        setField(term13757, term13757.getClass(), "_deserializationContext", null);
        setField(term13757, term13757.getClass(), "_registeredModuleTypes", null);
        setField(term13757, term13757.getClass(), "_rootDeserializers", null);
        setField(term13756, term13756.getClass(), "_objectCodec", term13757);
        setField(term13758, term13758.getClass(), "_node", term13759);
        setBooleanField(term13758, term13758.getClass(), "_done", false);
        setField(term13758, term13758.getClass(), "_parent", null);
        setField(term13758, term13758.getClass(), "_currentName", null);
        setField(term13758, term13758.getClass(), "_currentValue", null);
        setIntField(term13758, term13758.getClass(), "_type", 0);
        setIntField(term13758, term13758.getClass(), "_index", -1);
        setField(term13756, term13756.getClass(), "_nodeCursor", term13758);
        setField(term13756, term13756.getClass(), "_nextToken", null);
        setBooleanField(term13756, term13756.getClass(), "_startContainer", false);
        setBooleanField(term13756, term13756.getClass(), "_closed", false);
        setField(term13756, term13756.getClass(), "_currToken", null);
        setField(term13756, term13756.getClass(), "_lastClearedToken", null);
        setIntField(term13756, term13756.getClass(), "_features", 0);
        setField(term13756, term13756.getClass(), "_requestPayload", null);
        term13760 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NullNode"));
        term13761 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term13761, term13761.getClass(), "_jsonFactory", null);
        setField(term13761, term13761.getClass(), "_typeFactory", null);
        setField(term13761, term13761.getClass(), "_injectableValues", null);
        setField(term13761, term13761.getClass(), "_subtypeResolver", null);
        setField(term13761, term13761.getClass(), "_configOverrides", null);
        setField(term13761, term13761.getClass(), "_mixIns", null);
        setField(term13761, term13761.getClass(), "_serializationConfig", null);
        setField(term13761, term13761.getClass(), "_serializerProvider", null);
        setField(term13761, term13761.getClass(), "_serializerFactory", null);
        setField(term13761, term13761.getClass(), "_deserializationConfig", null);
        setField(term13761, term13761.getClass(), "_deserializationContext", null);
        setField(term13761, term13761.getClass(), "_registeredModuleTypes", null);
        setField(term13761, term13761.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term13645;
        args[1] = term13737;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13756));
        assertTrue(recursiveEquals(term13645, term13760));
        assertTrue(recursiveEquals(term13737, term13761));
    }

};


