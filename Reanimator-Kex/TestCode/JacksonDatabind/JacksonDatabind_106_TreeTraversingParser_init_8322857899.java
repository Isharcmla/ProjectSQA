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
import java.lang.String;
import java.util.ArrayList;

public class TreeTraversingParser_init_8322857899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18898;
     Object term19042;
     Object term19337;
     Object term19350;
     Object term19353;

    public TreeTraversingParser_init_8322857899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19355 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term19354 = ((Class) term19355).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term19354).setAccessible(true);
        Object enum6 = ((Field) term19354).get((Object) null);
        Object term18724 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setIntField(term18724, term18724.getClass(), "_features", 0);
        setField(term18724, term18724.getClass(), "_objectCodec", null);
        setField(term18724, term18724.getClass(), "_nextToken", enum6);
        ArrayList term18950 = new ArrayList();
        term18898 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ArrayNode"));
        setField(term18898, term18898.getClass(), "_children", term18950);
        term19042 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        ArrayList term19341 = new ArrayList();
        Class<? extends Object> term19581 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term19580 = ((Class) term19581).getDeclaredField((String) "START_ARRAY");
        ((Field) term19580).setAccessible(true);
        Object enum7 = ((Field) term19580).get((Object) null);
        term19337 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term19338 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term19339 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        Object term19340 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setField(term19338, term19338.getClass(), "_config", null);
        setField(term19338, term19338.getClass(), "_context", null);
        setField(term19338, term19338.getClass(), "_parserFactory", null);
        setBooleanField(term19338, term19338.getClass(), "_unwrapRoot", false);
        setField(term19338, term19338.getClass(), "_filter", null);
        setField(term19338, term19338.getClass(), "_valueType", null);
        setField(term19338, term19338.getClass(), "_rootDeserializer", null);
        setField(term19338, term19338.getClass(), "_valueToUpdate", null);
        setField(term19338, term19338.getClass(), "_schema", null);
        setField(term19338, term19338.getClass(), "_injectableValues", null);
        setField(term19338, term19338.getClass(), "_dataFormatReaders", null);
        setField(term19338, term19338.getClass(), "_rootDeserializers", null);
        setField(term19337, term19337.getClass(), "_objectCodec", term19338);
        setIntField(term19340, term19340.getClass(), "cursor", 0);
        setIntField(term19340, term19340.getClass(), "lastRet", -1);
        setIntField(term19340, term19340.getClass(), "expectedModCount", 0);
        setField(term19340, term19340.getClass(), "this$0", term19341);
        setField(term19339, term19339.getClass(), "_contents", term19340);
        setField(term19339, term19339.getClass(), "_currentNode", null);
        setField(term19339, term19339.getClass(), "_parent", null);
        setField(term19339, term19339.getClass(), "_currentName", null);
        setField(term19339, term19339.getClass(), "_currentValue", null);
        setIntField(term19339, term19339.getClass(), "_type", 1);
        setIntField(term19339, term19339.getClass(), "_index", -1);
        setField(term19337, term19337.getClass(), "_nodeCursor", term19339);
        setField(term19337, term19337.getClass(), "_nextToken", enum7);
        setBooleanField(term19337, term19337.getClass(), "_startContainer", false);
        setBooleanField(term19337, term19337.getClass(), "_closed", false);
        setField(term19337, term19337.getClass(), "_currToken", null);
        setField(term19337, term19337.getClass(), "_lastClearedToken", null);
        setIntField(term19337, term19337.getClass(), "_features", 0);
        setField(term19337, term19337.getClass(), "_requestPayload", null);
        ArrayList term19351 = new ArrayList();
        term19350 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ArrayNode"));
        setField(term19350, term19350.getClass(), "_children", term19351);
        setField(term19350, term19350.getClass(), "_nodeFactory", null);
        term19353 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term19353, term19353.getClass(), "_config", null);
        setField(term19353, term19353.getClass(), "_context", null);
        setField(term19353, term19353.getClass(), "_parserFactory", null);
        setBooleanField(term19353, term19353.getClass(), "_unwrapRoot", false);
        setField(term19353, term19353.getClass(), "_filter", null);
        setField(term19353, term19353.getClass(), "_valueType", null);
        setField(term19353, term19353.getClass(), "_rootDeserializer", null);
        setField(term19353, term19353.getClass(), "_valueToUpdate", null);
        setField(term19353, term19353.getClass(), "_schema", null);
        setField(term19353, term19353.getClass(), "_injectableValues", null);
        setField(term19353, term19353.getClass(), "_dataFormatReaders", null);
        setField(term19353, term19353.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term18898;
        args[1] = term19042;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19337));
        assertTrue(recursiveEquals(term18898, term19350));
        assertTrue(recursiveEquals(term19042, term19353));
    }

};


