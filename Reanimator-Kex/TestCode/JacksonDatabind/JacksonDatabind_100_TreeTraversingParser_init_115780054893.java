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

public class TreeTraversingParser_init_115780054893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17510;
     Object term17530;
     Object term17533;

    public TreeTraversingParser_init_115780054893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17414 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setIntField(term17414, term17414.getClass(), "_features", 0);
        setField(term17414, term17414.getClass(), "_objectCodec", null);
        term17510 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ShortNode"));
        term17530 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term17531 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term17532 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ShortNode"));
        setField(term17530, term17530.getClass(), "_objectCodec", null);
        setShortField(term17532, term17532.getClass(), "_value", (short) 0);
        setField(term17531, term17531.getClass(), "_node", term17532);
        setBooleanField(term17531, term17531.getClass(), "_done", false);
        setField(term17531, term17531.getClass(), "_parent", null);
        setField(term17531, term17531.getClass(), "_currentName", null);
        setField(term17531, term17531.getClass(), "_currentValue", null);
        setIntField(term17531, term17531.getClass(), "_type", 0);
        setIntField(term17531, term17531.getClass(), "_index", -1);
        setField(term17530, term17530.getClass(), "_nodeCursor", term17531);
        setField(term17530, term17530.getClass(), "_nextToken", null);
        setBooleanField(term17530, term17530.getClass(), "_startContainer", false);
        setBooleanField(term17530, term17530.getClass(), "_closed", false);
        setField(term17530, term17530.getClass(), "_currToken", null);
        setField(term17530, term17530.getClass(), "_lastClearedToken", null);
        setIntField(term17530, term17530.getClass(), "_features", 0);
        setField(term17530, term17530.getClass(), "_requestPayload", null);
        term17533 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ShortNode"));
        setShortField(term17533, term17533.getClass(), "_value", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term17510;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17530));
        assertTrue(recursiveEquals(term17510, term17533));
    }

};


