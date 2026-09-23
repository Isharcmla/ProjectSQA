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

public class TreeTraversingParser_init_115780054895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17765;
     Object term17785;
     Object term17788;

    public TreeTraversingParser_init_115780054895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17665 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setIntField(term17665, term17665.getClass(), "_features", 0);
        setField(term17665, term17665.getClass(), "_objectCodec", null);
        term17765 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.BooleanNode"));
        term17785 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term17786 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term17787 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(term17785, term17785.getClass(), "_objectCodec", null);
        setBooleanField(term17787, term17787.getClass(), "_value", false);
        setField(term17786, term17786.getClass(), "_node", term17787);
        setBooleanField(term17786, term17786.getClass(), "_done", false);
        setField(term17786, term17786.getClass(), "_parent", null);
        setField(term17786, term17786.getClass(), "_currentName", null);
        setField(term17786, term17786.getClass(), "_currentValue", null);
        setIntField(term17786, term17786.getClass(), "_type", 0);
        setIntField(term17786, term17786.getClass(), "_index", -1);
        setField(term17785, term17785.getClass(), "_nodeCursor", term17786);
        setField(term17785, term17785.getClass(), "_nextToken", null);
        setBooleanField(term17785, term17785.getClass(), "_startContainer", false);
        setBooleanField(term17785, term17785.getClass(), "_closed", false);
        setField(term17785, term17785.getClass(), "_currToken", null);
        setField(term17785, term17785.getClass(), "_lastClearedToken", null);
        setIntField(term17785, term17785.getClass(), "_features", 0);
        setField(term17785, term17785.getClass(), "_requestPayload", null);
        term17788 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.BooleanNode"));
        setBooleanField(term17788, term17788.getClass(), "_value", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term17765;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17785));
        assertTrue(recursiveEquals(term17765, term17788));
    }

};


