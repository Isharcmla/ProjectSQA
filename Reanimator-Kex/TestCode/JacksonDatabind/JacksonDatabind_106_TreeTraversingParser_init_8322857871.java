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

public class TreeTraversingParser_init_8322857871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9282;
     Object term9374;
     Object term9762;
     Object term9766;
     Object term9767;

    public TreeTraversingParser_init_8322857871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9084 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term9176 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setIntField(term9084, term9084.getClass(), "_features", 0);
        setField(term9084, term9084.getClass(), "_objectCodec", term9176);
        term9282 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.BigIntegerNode"));
        term9374 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term9762 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term9763 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term9764 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term9765 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.BigIntegerNode"));
        setField(term9763, term9763.getClass(), "_jsonFactory", null);
        setField(term9763, term9763.getClass(), "_typeFactory", null);
        setField(term9763, term9763.getClass(), "_injectableValues", null);
        setField(term9763, term9763.getClass(), "_subtypeResolver", null);
        setField(term9763, term9763.getClass(), "_configOverrides", null);
        setField(term9763, term9763.getClass(), "_mixIns", null);
        setField(term9763, term9763.getClass(), "_serializationConfig", null);
        setField(term9763, term9763.getClass(), "_serializerProvider", null);
        setField(term9763, term9763.getClass(), "_serializerFactory", null);
        setField(term9763, term9763.getClass(), "_deserializationConfig", null);
        setField(term9763, term9763.getClass(), "_deserializationContext", null);
        setField(term9763, term9763.getClass(), "_registeredModuleTypes", null);
        setField(term9763, term9763.getClass(), "_rootDeserializers", null);
        setField(term9762, term9762.getClass(), "_objectCodec", term9763);
        setField(term9765, term9765.getClass(), "_value", null);
        setField(term9764, term9764.getClass(), "_node", term9765);
        setBooleanField(term9764, term9764.getClass(), "_done", false);
        setField(term9764, term9764.getClass(), "_parent", null);
        setField(term9764, term9764.getClass(), "_currentName", null);
        setField(term9764, term9764.getClass(), "_currentValue", null);
        setIntField(term9764, term9764.getClass(), "_type", 0);
        setIntField(term9764, term9764.getClass(), "_index", -1);
        setField(term9762, term9762.getClass(), "_nodeCursor", term9764);
        setField(term9762, term9762.getClass(), "_nextToken", null);
        setBooleanField(term9762, term9762.getClass(), "_startContainer", false);
        setBooleanField(term9762, term9762.getClass(), "_closed", false);
        setField(term9762, term9762.getClass(), "_currToken", null);
        setField(term9762, term9762.getClass(), "_lastClearedToken", null);
        setIntField(term9762, term9762.getClass(), "_features", 0);
        setField(term9762, term9762.getClass(), "_requestPayload", null);
        term9766 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.BigIntegerNode"));
        setField(term9766, term9766.getClass(), "_value", null);
        term9767 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term9767, term9767.getClass(), "_jsonFactory", null);
        setField(term9767, term9767.getClass(), "_typeFactory", null);
        setField(term9767, term9767.getClass(), "_injectableValues", null);
        setField(term9767, term9767.getClass(), "_subtypeResolver", null);
        setField(term9767, term9767.getClass(), "_configOverrides", null);
        setField(term9767, term9767.getClass(), "_mixIns", null);
        setField(term9767, term9767.getClass(), "_serializationConfig", null);
        setField(term9767, term9767.getClass(), "_serializerProvider", null);
        setField(term9767, term9767.getClass(), "_serializerFactory", null);
        setField(term9767, term9767.getClass(), "_deserializationConfig", null);
        setField(term9767, term9767.getClass(), "_deserializationContext", null);
        setField(term9767, term9767.getClass(), "_registeredModuleTypes", null);
        setField(term9767, term9767.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term9282;
        args[1] = term9374;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9762));
        assertTrue(recursiveEquals(term9282, term9766));
        assertTrue(recursiveEquals(term9374, term9767));
    }

};


