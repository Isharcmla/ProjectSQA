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

public class TreeTraversingParser_init_8322857897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18104;
     Object term18196;
     Object term18217;
     Object term18221;
     Object term18222;

    public TreeTraversingParser_init_8322857897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17916 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term18008 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setIntField(term17916, term17916.getClass(), "_features", 0);
        setField(term17916, term17916.getClass(), "_objectCodec", term18008);
        term18104 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ShortNode"));
        term18196 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term18217 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term18218 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term18219 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term18220 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ShortNode"));
        setField(term18218, term18218.getClass(), "_jsonFactory", null);
        setField(term18218, term18218.getClass(), "_typeFactory", null);
        setField(term18218, term18218.getClass(), "_injectableValues", null);
        setField(term18218, term18218.getClass(), "_subtypeResolver", null);
        setField(term18218, term18218.getClass(), "_configOverrides", null);
        setField(term18218, term18218.getClass(), "_mixIns", null);
        setField(term18218, term18218.getClass(), "_serializationConfig", null);
        setField(term18218, term18218.getClass(), "_serializerProvider", null);
        setField(term18218, term18218.getClass(), "_serializerFactory", null);
        setField(term18218, term18218.getClass(), "_deserializationConfig", null);
        setField(term18218, term18218.getClass(), "_deserializationContext", null);
        setField(term18218, term18218.getClass(), "_registeredModuleTypes", null);
        setField(term18218, term18218.getClass(), "_rootDeserializers", null);
        setField(term18217, term18217.getClass(), "_objectCodec", term18218);
        setShortField(term18220, term18220.getClass(), "_value", (short) 0);
        setField(term18219, term18219.getClass(), "_node", term18220);
        setBooleanField(term18219, term18219.getClass(), "_done", false);
        setField(term18219, term18219.getClass(), "_parent", null);
        setField(term18219, term18219.getClass(), "_currentName", null);
        setField(term18219, term18219.getClass(), "_currentValue", null);
        setIntField(term18219, term18219.getClass(), "_type", 0);
        setIntField(term18219, term18219.getClass(), "_index", -1);
        setField(term18217, term18217.getClass(), "_nodeCursor", term18219);
        setField(term18217, term18217.getClass(), "_nextToken", null);
        setBooleanField(term18217, term18217.getClass(), "_startContainer", false);
        setBooleanField(term18217, term18217.getClass(), "_closed", false);
        setField(term18217, term18217.getClass(), "_currToken", null);
        setField(term18217, term18217.getClass(), "_lastClearedToken", null);
        setIntField(term18217, term18217.getClass(), "_features", 0);
        setField(term18217, term18217.getClass(), "_requestPayload", null);
        term18221 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ShortNode"));
        setShortField(term18221, term18221.getClass(), "_value", (short) 0);
        term18222 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term18222, term18222.getClass(), "_jsonFactory", null);
        setField(term18222, term18222.getClass(), "_typeFactory", null);
        setField(term18222, term18222.getClass(), "_injectableValues", null);
        setField(term18222, term18222.getClass(), "_subtypeResolver", null);
        setField(term18222, term18222.getClass(), "_configOverrides", null);
        setField(term18222, term18222.getClass(), "_mixIns", null);
        setField(term18222, term18222.getClass(), "_serializationConfig", null);
        setField(term18222, term18222.getClass(), "_serializerProvider", null);
        setField(term18222, term18222.getClass(), "_serializerFactory", null);
        setField(term18222, term18222.getClass(), "_deserializationConfig", null);
        setField(term18222, term18222.getClass(), "_deserializationContext", null);
        setField(term18222, term18222.getClass(), "_registeredModuleTypes", null);
        setField(term18222, term18222.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term18104;
        args[1] = term18196;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18217));
        assertTrue(recursiveEquals(term18104, term18221));
        assertTrue(recursiveEquals(term18196, term18222));
    }

};


