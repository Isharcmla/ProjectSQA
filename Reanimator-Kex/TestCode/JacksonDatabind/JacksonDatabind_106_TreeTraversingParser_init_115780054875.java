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

public class TreeTraversingParser_init_115780054875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10595;
     Object term10613;
     Object term10616;

    public TreeTraversingParser_init_115780054875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10501 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setIntField(term10501, term10501.getClass(), "_features", 0);
        setField(term10501, term10501.getClass(), "_objectCodec", null);
        term10595 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TextNode"));
        term10613 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term10614 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term10615 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TextNode"));
        setField(term10613, term10613.getClass(), "_objectCodec", null);
        setField(term10615, term10615.getClass(), "_value", null);
        setField(term10614, term10614.getClass(), "_node", term10615);
        setBooleanField(term10614, term10614.getClass(), "_done", false);
        setField(term10614, term10614.getClass(), "_parent", null);
        setField(term10614, term10614.getClass(), "_currentName", null);
        setField(term10614, term10614.getClass(), "_currentValue", null);
        setIntField(term10614, term10614.getClass(), "_type", 0);
        setIntField(term10614, term10614.getClass(), "_index", -1);
        setField(term10613, term10613.getClass(), "_nodeCursor", term10614);
        setField(term10613, term10613.getClass(), "_nextToken", null);
        setBooleanField(term10613, term10613.getClass(), "_startContainer", false);
        setBooleanField(term10613, term10613.getClass(), "_closed", false);
        setField(term10613, term10613.getClass(), "_currToken", null);
        setField(term10613, term10613.getClass(), "_lastClearedToken", null);
        setIntField(term10613, term10613.getClass(), "_features", 0);
        setField(term10613, term10613.getClass(), "_requestPayload", null);
        term10616 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TextNode"));
        setField(term10616, term10616.getClass(), "_value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term10595;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10613));
        assertTrue(recursiveEquals(term10595, term10616));
    }

};


