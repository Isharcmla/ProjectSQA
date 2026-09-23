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
import java.util.HashMap;
import java.lang.String;

public class TreeTraversingParser_init_115780054891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15458;
     Object term15605;
     Object term15617;

    public TreeTraversingParser_init_115780054891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15262 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term15360 = newInstance(Class.forName("com.fasterxml.jackson.databind.json.JsonMapper"));
        setIntField(term15262, term15262.getClass(), "_features", 0);
        setField(term15262, term15262.getClass(), "_objectCodec", term15360);
        setField(term15262, term15262.getClass(), "_nextToken", null);
        HashMap term15506 = new HashMap();
        term15458 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ObjectNode"));
        setField(term15458, term15458.getClass(), "_children", term15506);
        HashMap term15608 = new HashMap();
        Class<? extends Object> term15621 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term15620 = ((Class) term15621).getDeclaredField((String) "START_OBJECT");
        ((Field) term15620).setAccessible(true);
        Object enum1 = ((Field) term15620).get((Object) null);
        term15605 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term15606 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object term15607 = newInstance(Class.forName("java.util.HashMap$EntryIterator"));
        setField(term15605, term15605.getClass(), "_objectCodec", null);
        setField(term15607, term15607.getClass(), "this$0", term15608);
        setField(term15607, term15607.getClass(), "next", null);
        setField(term15607, term15607.getClass(), "current", null);
        setIntField(term15607, term15607.getClass(), "expectedModCount", 0);
        setIntField(term15607, term15607.getClass(), "index", 0);
        setField(term15606, term15606.getClass(), "_contents", term15607);
        setField(term15606, term15606.getClass(), "_current", null);
        setBooleanField(term15606, term15606.getClass(), "_needEntry", true);
        setField(term15606, term15606.getClass(), "_parent", null);
        setField(term15606, term15606.getClass(), "_currentName", null);
        setField(term15606, term15606.getClass(), "_currentValue", null);
        setIntField(term15606, term15606.getClass(), "_type", 2);
        setIntField(term15606, term15606.getClass(), "_index", -1);
        setField(term15605, term15605.getClass(), "_nodeCursor", term15606);
        setField(term15605, term15605.getClass(), "_nextToken", enum1);
        setBooleanField(term15605, term15605.getClass(), "_startContainer", false);
        setBooleanField(term15605, term15605.getClass(), "_closed", false);
        setField(term15605, term15605.getClass(), "_currToken", null);
        setField(term15605, term15605.getClass(), "_lastClearedToken", null);
        setIntField(term15605, term15605.getClass(), "_features", 0);
        setField(term15605, term15605.getClass(), "_requestPayload", null);
        HashMap term15618 = new HashMap();
        term15617 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ObjectNode"));
        setField(term15617, term15617.getClass(), "_children", term15618);
        setField(term15617, term15617.getClass(), "_nodeFactory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term15458;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15605));
        assertTrue(recursiveEquals(term15458, term15617));
    }

};


