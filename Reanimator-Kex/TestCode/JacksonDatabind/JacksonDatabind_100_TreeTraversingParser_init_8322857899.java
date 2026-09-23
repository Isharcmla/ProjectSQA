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
import java.util.HashMap;

public class TreeTraversingParser_init_8322857899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18915;
     Object term19265;
     Object term19277;

    public TreeTraversingParser_init_8322857899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19281 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term19280 = ((Class) term19281).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term19280).setAccessible(true);
        Object enum6 = ((Field) term19280).get((Object) null);
        Object term18739 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setIntField(term18739, term18739.getClass(), "_features", 0);
        setField(term18739, term18739.getClass(), "_objectCodec", null);
        setField(term18739, term18739.getClass(), "_nextToken", enum6);
        HashMap term18963 = new HashMap();
        term18915 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ObjectNode"));
        setField(term18915, term18915.getClass(), "_children", term18963);
        HashMap term19268 = new HashMap();
        Class<? extends Object> term19507 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term19506 = ((Class) term19507).getDeclaredField((String) "START_OBJECT");
        ((Field) term19506).setAccessible(true);
        Object enum7 = ((Field) term19506).get((Object) null);
        term19265 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term19266 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object term19267 = newInstance(Class.forName("java.util.HashMap$EntryIterator"));
        setField(term19265, term19265.getClass(), "_objectCodec", null);
        setField(term19267, term19267.getClass(), "this$0", term19268);
        setField(term19267, term19267.getClass(), "next", null);
        setField(term19267, term19267.getClass(), "current", null);
        setIntField(term19267, term19267.getClass(), "expectedModCount", 0);
        setIntField(term19267, term19267.getClass(), "index", 0);
        setField(term19266, term19266.getClass(), "_contents", term19267);
        setField(term19266, term19266.getClass(), "_current", null);
        setBooleanField(term19266, term19266.getClass(), "_needEntry", true);
        setField(term19266, term19266.getClass(), "_parent", null);
        setField(term19266, term19266.getClass(), "_currentName", null);
        setField(term19266, term19266.getClass(), "_currentValue", null);
        setIntField(term19266, term19266.getClass(), "_type", 2);
        setIntField(term19266, term19266.getClass(), "_index", -1);
        setField(term19265, term19265.getClass(), "_nodeCursor", term19266);
        setField(term19265, term19265.getClass(), "_nextToken", enum7);
        setBooleanField(term19265, term19265.getClass(), "_startContainer", false);
        setBooleanField(term19265, term19265.getClass(), "_closed", false);
        setField(term19265, term19265.getClass(), "_currToken", null);
        setField(term19265, term19265.getClass(), "_lastClearedToken", null);
        setIntField(term19265, term19265.getClass(), "_features", 0);
        setField(term19265, term19265.getClass(), "_requestPayload", null);
        HashMap term19278 = new HashMap();
        term19277 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ObjectNode"));
        setField(term19277, term19277.getClass(), "_children", term19278);
        setField(term19277, term19277.getClass(), "_nodeFactory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term18915;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19265));
        assertTrue(recursiveEquals(term18915, term19277));
    }

};


