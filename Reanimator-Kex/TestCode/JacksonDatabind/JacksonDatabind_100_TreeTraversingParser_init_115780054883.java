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

public class TreeTraversingParser_init_115780054883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13987;
     Object term14005;
     Object term14008;

    public TreeTraversingParser_init_115780054883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13893 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setIntField(term13893, term13893.getClass(), "_features", 0);
        setField(term13893, term13893.getClass(), "_objectCodec", null);
        term13987 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TextNode"));
        term14005 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term14006 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term14007 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TextNode"));
        setField(term14005, term14005.getClass(), "_objectCodec", null);
        setField(term14007, term14007.getClass(), "_value", null);
        setField(term14006, term14006.getClass(), "_node", term14007);
        setBooleanField(term14006, term14006.getClass(), "_done", false);
        setField(term14006, term14006.getClass(), "_parent", null);
        setField(term14006, term14006.getClass(), "_currentName", null);
        setField(term14006, term14006.getClass(), "_currentValue", null);
        setIntField(term14006, term14006.getClass(), "_type", 0);
        setIntField(term14006, term14006.getClass(), "_index", -1);
        setField(term14005, term14005.getClass(), "_nodeCursor", term14006);
        setField(term14005, term14005.getClass(), "_nextToken", null);
        setBooleanField(term14005, term14005.getClass(), "_startContainer", false);
        setBooleanField(term14005, term14005.getClass(), "_closed", false);
        setField(term14005, term14005.getClass(), "_currToken", null);
        setField(term14005, term14005.getClass(), "_lastClearedToken", null);
        setIntField(term14005, term14005.getClass(), "_features", 0);
        setField(term14005, term14005.getClass(), "_requestPayload", null);
        term14008 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TextNode"));
        setField(term14008, term14008.getClass(), "_value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term13987;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14005));
        assertTrue(recursiveEquals(term13987, term14008));
    }

};


