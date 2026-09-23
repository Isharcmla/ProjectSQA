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

public class TreeTraversingParser_init_8322857897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18121;
     Object term18213;
     Object term18233;
     Object term18237;
     Object term18238;

    public TreeTraversingParser_init_8322857897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17923 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term18015 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setIntField(term17923, term17923.getClass(), "_features", 0);
        setField(term17923, term17923.getClass(), "_objectCodec", term18015);
        term18121 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.BigIntegerNode"));
        term18213 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term18233 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term18234 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term18235 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        Object term18236 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.BigIntegerNode"));
        setField(term18234, term18234.getClass(), "_config", null);
        setField(term18234, term18234.getClass(), "_context", null);
        setField(term18234, term18234.getClass(), "_parserFactory", null);
        setBooleanField(term18234, term18234.getClass(), "_unwrapRoot", false);
        setField(term18234, term18234.getClass(), "_filter", null);
        setField(term18234, term18234.getClass(), "_valueType", null);
        setField(term18234, term18234.getClass(), "_rootDeserializer", null);
        setField(term18234, term18234.getClass(), "_valueToUpdate", null);
        setField(term18234, term18234.getClass(), "_schema", null);
        setField(term18234, term18234.getClass(), "_injectableValues", null);
        setField(term18234, term18234.getClass(), "_dataFormatReaders", null);
        setField(term18234, term18234.getClass(), "_rootDeserializers", null);
        setField(term18233, term18233.getClass(), "_objectCodec", term18234);
        setField(term18236, term18236.getClass(), "_value", null);
        setField(term18235, term18235.getClass(), "_node", term18236);
        setBooleanField(term18235, term18235.getClass(), "_done", false);
        setField(term18235, term18235.getClass(), "_parent", null);
        setField(term18235, term18235.getClass(), "_currentName", null);
        setField(term18235, term18235.getClass(), "_currentValue", null);
        setIntField(term18235, term18235.getClass(), "_type", 0);
        setIntField(term18235, term18235.getClass(), "_index", -1);
        setField(term18233, term18233.getClass(), "_nodeCursor", term18235);
        setField(term18233, term18233.getClass(), "_nextToken", null);
        setBooleanField(term18233, term18233.getClass(), "_startContainer", false);
        setBooleanField(term18233, term18233.getClass(), "_closed", false);
        setField(term18233, term18233.getClass(), "_currToken", null);
        setField(term18233, term18233.getClass(), "_lastClearedToken", null);
        setIntField(term18233, term18233.getClass(), "_features", 0);
        setField(term18233, term18233.getClass(), "_requestPayload", null);
        term18237 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.BigIntegerNode"));
        setField(term18237, term18237.getClass(), "_value", null);
        term18238 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term18238, term18238.getClass(), "_config", null);
        setField(term18238, term18238.getClass(), "_context", null);
        setField(term18238, term18238.getClass(), "_parserFactory", null);
        setBooleanField(term18238, term18238.getClass(), "_unwrapRoot", false);
        setField(term18238, term18238.getClass(), "_filter", null);
        setField(term18238, term18238.getClass(), "_valueType", null);
        setField(term18238, term18238.getClass(), "_rootDeserializer", null);
        setField(term18238, term18238.getClass(), "_valueToUpdate", null);
        setField(term18238, term18238.getClass(), "_schema", null);
        setField(term18238, term18238.getClass(), "_injectableValues", null);
        setField(term18238, term18238.getClass(), "_dataFormatReaders", null);
        setField(term18238, term18238.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term18121;
        args[1] = term18213;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18233));
        assertTrue(recursiveEquals(term18121, term18237));
        assertTrue(recursiveEquals(term18213, term18238));
    }

};


