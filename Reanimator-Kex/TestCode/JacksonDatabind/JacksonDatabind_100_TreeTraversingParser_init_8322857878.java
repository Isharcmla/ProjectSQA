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

public class TreeTraversingParser_init_8322857878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11311;
     Object term11403;
     Object term12788;
     Object term12792;
     Object term12793;

    public TreeTraversingParser_init_8322857878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11125 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term11217 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setIntField(term11125, term11125.getClass(), "_features", 0);
        setField(term11125, term11125.getClass(), "_objectCodec", term11217);
        term11311 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TextNode"));
        term11403 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term12788 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term12789 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term12790 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term12791 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TextNode"));
        setField(term12789, term12789.getClass(), "_jsonFactory", null);
        setField(term12789, term12789.getClass(), "_typeFactory", null);
        setField(term12789, term12789.getClass(), "_injectableValues", null);
        setField(term12789, term12789.getClass(), "_subtypeResolver", null);
        setField(term12789, term12789.getClass(), "_configOverrides", null);
        setField(term12789, term12789.getClass(), "_mixIns", null);
        setField(term12789, term12789.getClass(), "_serializationConfig", null);
        setField(term12789, term12789.getClass(), "_serializerProvider", null);
        setField(term12789, term12789.getClass(), "_serializerFactory", null);
        setField(term12789, term12789.getClass(), "_deserializationConfig", null);
        setField(term12789, term12789.getClass(), "_deserializationContext", null);
        setField(term12789, term12789.getClass(), "_registeredModuleTypes", null);
        setField(term12789, term12789.getClass(), "_rootDeserializers", null);
        setField(term12788, term12788.getClass(), "_objectCodec", term12789);
        setField(term12791, term12791.getClass(), "_value", null);
        setField(term12790, term12790.getClass(), "_node", term12791);
        setBooleanField(term12790, term12790.getClass(), "_done", false);
        setField(term12790, term12790.getClass(), "_parent", null);
        setField(term12790, term12790.getClass(), "_currentName", null);
        setField(term12790, term12790.getClass(), "_currentValue", null);
        setIntField(term12790, term12790.getClass(), "_type", 0);
        setIntField(term12790, term12790.getClass(), "_index", -1);
        setField(term12788, term12788.getClass(), "_nodeCursor", term12790);
        setField(term12788, term12788.getClass(), "_nextToken", null);
        setBooleanField(term12788, term12788.getClass(), "_startContainer", false);
        setBooleanField(term12788, term12788.getClass(), "_closed", false);
        setField(term12788, term12788.getClass(), "_currToken", null);
        setField(term12788, term12788.getClass(), "_lastClearedToken", null);
        setIntField(term12788, term12788.getClass(), "_features", 0);
        setField(term12788, term12788.getClass(), "_requestPayload", null);
        term12792 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TextNode"));
        setField(term12792, term12792.getClass(), "_value", null);
        term12793 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term12793, term12793.getClass(), "_jsonFactory", null);
        setField(term12793, term12793.getClass(), "_typeFactory", null);
        setField(term12793, term12793.getClass(), "_injectableValues", null);
        setField(term12793, term12793.getClass(), "_subtypeResolver", null);
        setField(term12793, term12793.getClass(), "_configOverrides", null);
        setField(term12793, term12793.getClass(), "_mixIns", null);
        setField(term12793, term12793.getClass(), "_serializationConfig", null);
        setField(term12793, term12793.getClass(), "_serializerProvider", null);
        setField(term12793, term12793.getClass(), "_serializerFactory", null);
        setField(term12793, term12793.getClass(), "_deserializationConfig", null);
        setField(term12793, term12793.getClass(), "_deserializationContext", null);
        setField(term12793, term12793.getClass(), "_registeredModuleTypes", null);
        setField(term12793, term12793.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term11311;
        args[1] = term11403;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12788));
        assertTrue(recursiveEquals(term11311, term12792));
        assertTrue(recursiveEquals(term11403, term12793));
    }

};


