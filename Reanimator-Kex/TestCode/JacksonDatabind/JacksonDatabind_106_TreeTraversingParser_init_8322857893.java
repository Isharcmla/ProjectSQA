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

public class TreeTraversingParser_init_8322857893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16201;
     Object term16293;
     Object term16312;
     Object term16316;
     Object term16317;

    public TreeTraversingParser_init_8322857893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16003 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term16101 = newInstance(Class.forName("com.fasterxml.jackson.databind.json.JsonMapper"));
        setIntField(term16003, term16003.getClass(), "_features", 0);
        setField(term16003, term16003.getClass(), "_objectCodec", term16101);
        term16201 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.DecimalNode"));
        term16293 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term16312 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term16313 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term16314 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term16315 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.DecimalNode"));
        setField(term16313, term16313.getClass(), "_jsonFactory", null);
        setField(term16313, term16313.getClass(), "_typeFactory", null);
        setField(term16313, term16313.getClass(), "_injectableValues", null);
        setField(term16313, term16313.getClass(), "_subtypeResolver", null);
        setField(term16313, term16313.getClass(), "_configOverrides", null);
        setField(term16313, term16313.getClass(), "_mixIns", null);
        setField(term16313, term16313.getClass(), "_serializationConfig", null);
        setField(term16313, term16313.getClass(), "_serializerProvider", null);
        setField(term16313, term16313.getClass(), "_serializerFactory", null);
        setField(term16313, term16313.getClass(), "_deserializationConfig", null);
        setField(term16313, term16313.getClass(), "_deserializationContext", null);
        setField(term16313, term16313.getClass(), "_registeredModuleTypes", null);
        setField(term16313, term16313.getClass(), "_rootDeserializers", null);
        setField(term16312, term16312.getClass(), "_objectCodec", term16313);
        setField(term16315, term16315.getClass(), "_value", null);
        setField(term16314, term16314.getClass(), "_node", term16315);
        setBooleanField(term16314, term16314.getClass(), "_done", false);
        setField(term16314, term16314.getClass(), "_parent", null);
        setField(term16314, term16314.getClass(), "_currentName", null);
        setField(term16314, term16314.getClass(), "_currentValue", null);
        setIntField(term16314, term16314.getClass(), "_type", 0);
        setIntField(term16314, term16314.getClass(), "_index", -1);
        setField(term16312, term16312.getClass(), "_nodeCursor", term16314);
        setField(term16312, term16312.getClass(), "_nextToken", null);
        setBooleanField(term16312, term16312.getClass(), "_startContainer", false);
        setBooleanField(term16312, term16312.getClass(), "_closed", false);
        setField(term16312, term16312.getClass(), "_currToken", null);
        setField(term16312, term16312.getClass(), "_lastClearedToken", null);
        setIntField(term16312, term16312.getClass(), "_features", 0);
        setField(term16312, term16312.getClass(), "_requestPayload", null);
        term16316 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.DecimalNode"));
        setField(term16316, term16316.getClass(), "_value", null);
        term16317 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term16317, term16317.getClass(), "_jsonFactory", null);
        setField(term16317, term16317.getClass(), "_typeFactory", null);
        setField(term16317, term16317.getClass(), "_injectableValues", null);
        setField(term16317, term16317.getClass(), "_subtypeResolver", null);
        setField(term16317, term16317.getClass(), "_configOverrides", null);
        setField(term16317, term16317.getClass(), "_mixIns", null);
        setField(term16317, term16317.getClass(), "_serializationConfig", null);
        setField(term16317, term16317.getClass(), "_serializerProvider", null);
        setField(term16317, term16317.getClass(), "_serializerFactory", null);
        setField(term16317, term16317.getClass(), "_deserializationConfig", null);
        setField(term16317, term16317.getClass(), "_deserializationContext", null);
        setField(term16317, term16317.getClass(), "_registeredModuleTypes", null);
        setField(term16317, term16317.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term16201;
        args[1] = term16293;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16312));
        assertTrue(recursiveEquals(term16201, term16316));
        assertTrue(recursiveEquals(term16293, term16317));
    }

};


