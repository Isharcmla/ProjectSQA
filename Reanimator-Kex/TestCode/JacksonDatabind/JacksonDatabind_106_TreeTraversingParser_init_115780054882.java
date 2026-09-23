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
import java.util.ArrayList;
import java.lang.String;

public class TreeTraversingParser_init_115780054882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11804;
     Object term12346;
     Object term12358;

    public TreeTraversingParser_init_115780054882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11610 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term11708 = newInstance(Class.forName("com.fasterxml.jackson.databind.json.JsonMapper"));
        setIntField(term11610, term11610.getClass(), "_features", 0);
        setField(term11610, term11610.getClass(), "_objectCodec", term11708);
        setField(term11610, term11610.getClass(), "_nextToken", null);
        ArrayList term11856 = new ArrayList();
        term11804 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ArrayNode"));
        setField(term11804, term11804.getClass(), "_children", term11856);
        ArrayList term12349 = new ArrayList();
        Class<? extends Object> term12734 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term12733 = ((Class) term12734).getDeclaredField((String) "START_ARRAY");
        ((Field) term12733).setAccessible(true);
        Object enum0 = ((Field) term12733).get((Object) null);
        term12346 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term12347 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        Object term12348 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setField(term12346, term12346.getClass(), "_objectCodec", null);
        setIntField(term12348, term12348.getClass(), "cursor", 0);
        setIntField(term12348, term12348.getClass(), "lastRet", -1);
        setIntField(term12348, term12348.getClass(), "expectedModCount", 0);
        setField(term12348, term12348.getClass(), "this$0", term12349);
        setField(term12347, term12347.getClass(), "_contents", term12348);
        setField(term12347, term12347.getClass(), "_currentNode", null);
        setField(term12347, term12347.getClass(), "_parent", null);
        setField(term12347, term12347.getClass(), "_currentName", null);
        setField(term12347, term12347.getClass(), "_currentValue", null);
        setIntField(term12347, term12347.getClass(), "_type", 1);
        setIntField(term12347, term12347.getClass(), "_index", -1);
        setField(term12346, term12346.getClass(), "_nodeCursor", term12347);
        setField(term12346, term12346.getClass(), "_nextToken", enum0);
        setBooleanField(term12346, term12346.getClass(), "_startContainer", false);
        setBooleanField(term12346, term12346.getClass(), "_closed", false);
        setField(term12346, term12346.getClass(), "_currToken", null);
        setField(term12346, term12346.getClass(), "_lastClearedToken", null);
        setIntField(term12346, term12346.getClass(), "_features", 0);
        setField(term12346, term12346.getClass(), "_requestPayload", null);
        ArrayList term12359 = new ArrayList();
        term12358 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ArrayNode"));
        setField(term12358, term12358.getClass(), "_children", term12359);
        setField(term12358, term12358.getClass(), "_nodeFactory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term11804;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12346));
        assertTrue(recursiveEquals(term11804, term12358));
    }

};


