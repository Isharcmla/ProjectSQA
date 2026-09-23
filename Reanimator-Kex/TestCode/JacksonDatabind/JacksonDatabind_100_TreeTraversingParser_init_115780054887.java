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

public class TreeTraversingParser_init_115780054887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15142;
     Object term15266;
     Object term15278;

    public TreeTraversingParser_init_115780054887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14952 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term15044 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setIntField(term14952, term14952.getClass(), "_features", 0);
        setField(term14952, term14952.getClass(), "_objectCodec", term15044);
        setField(term14952, term14952.getClass(), "_nextToken", null);
        HashMap term15190 = new HashMap();
        term15142 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ObjectNode"));
        setField(term15142, term15142.getClass(), "_children", term15190);
        HashMap term15269 = new HashMap();
        Class<? extends Object> term15282 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term15281 = ((Class) term15282).getDeclaredField((String) "START_OBJECT");
        ((Field) term15281).setAccessible(true);
        Object enum3 = ((Field) term15281).get((Object) null);
        term15266 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term15267 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object term15268 = newInstance(Class.forName("java.util.HashMap$EntryIterator"));
        setField(term15266, term15266.getClass(), "_objectCodec", null);
        setField(term15268, term15268.getClass(), "this$0", term15269);
        setField(term15268, term15268.getClass(), "next", null);
        setField(term15268, term15268.getClass(), "current", null);
        setIntField(term15268, term15268.getClass(), "expectedModCount", 0);
        setIntField(term15268, term15268.getClass(), "index", 0);
        setField(term15267, term15267.getClass(), "_contents", term15268);
        setField(term15267, term15267.getClass(), "_current", null);
        setBooleanField(term15267, term15267.getClass(), "_needEntry", true);
        setField(term15267, term15267.getClass(), "_parent", null);
        setField(term15267, term15267.getClass(), "_currentName", null);
        setField(term15267, term15267.getClass(), "_currentValue", null);
        setIntField(term15267, term15267.getClass(), "_type", 2);
        setIntField(term15267, term15267.getClass(), "_index", -1);
        setField(term15266, term15266.getClass(), "_nodeCursor", term15267);
        setField(term15266, term15266.getClass(), "_nextToken", enum3);
        setBooleanField(term15266, term15266.getClass(), "_startContainer", false);
        setBooleanField(term15266, term15266.getClass(), "_closed", false);
        setField(term15266, term15266.getClass(), "_currToken", null);
        setField(term15266, term15266.getClass(), "_lastClearedToken", null);
        setIntField(term15266, term15266.getClass(), "_features", 0);
        setField(term15266, term15266.getClass(), "_requestPayload", null);
        HashMap term15279 = new HashMap();
        term15278 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ObjectNode"));
        setField(term15278, term15278.getClass(), "_children", term15279);
        setField(term15278, term15278.getClass(), "_nodeFactory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term15142;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15266));
        assertTrue(recursiveEquals(term15142, term15278));
    }

};


