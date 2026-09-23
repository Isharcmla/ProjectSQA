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

public class TreeTraversingParser_init_115780054890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16140;
     Object term16676;
     Object term16688;

    public TreeTraversingParser_init_115780054890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15952 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term16044 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setIntField(term15952, term15952.getClass(), "_features", 0);
        setField(term15952, term15952.getClass(), "_objectCodec", term16044);
        setField(term15952, term15952.getClass(), "_nextToken", null);
        ArrayList term16192 = new ArrayList();
        term16140 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ArrayNode"));
        setField(term16140, term16140.getClass(), "_children", term16192);
        ArrayList term16679 = new ArrayList();
        Class<? extends Object> term16692 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term16691 = ((Class) term16692).getDeclaredField((String) "START_ARRAY");
        ((Field) term16691).setAccessible(true);
        Object enum4 = ((Field) term16691).get((Object) null);
        term16676 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term16677 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        Object term16678 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setField(term16676, term16676.getClass(), "_objectCodec", null);
        setIntField(term16678, term16678.getClass(), "cursor", 0);
        setIntField(term16678, term16678.getClass(), "lastRet", -1);
        setIntField(term16678, term16678.getClass(), "expectedModCount", 0);
        setField(term16678, term16678.getClass(), "this$0", term16679);
        setField(term16677, term16677.getClass(), "_contents", term16678);
        setField(term16677, term16677.getClass(), "_currentNode", null);
        setField(term16677, term16677.getClass(), "_parent", null);
        setField(term16677, term16677.getClass(), "_currentName", null);
        setField(term16677, term16677.getClass(), "_currentValue", null);
        setIntField(term16677, term16677.getClass(), "_type", 1);
        setIntField(term16677, term16677.getClass(), "_index", -1);
        setField(term16676, term16676.getClass(), "_nodeCursor", term16677);
        setField(term16676, term16676.getClass(), "_nextToken", enum4);
        setBooleanField(term16676, term16676.getClass(), "_startContainer", false);
        setBooleanField(term16676, term16676.getClass(), "_closed", false);
        setField(term16676, term16676.getClass(), "_currToken", null);
        setField(term16676, term16676.getClass(), "_lastClearedToken", null);
        setIntField(term16676, term16676.getClass(), "_features", 0);
        setField(term16676, term16676.getClass(), "_requestPayload", null);
        ArrayList term16689 = new ArrayList();
        term16688 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ArrayNode"));
        setField(term16688, term16688.getClass(), "_children", term16689);
        setField(term16688, term16688.getClass(), "_nodeFactory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        Object[] args = new Object[1];
        args[0] = term16140;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16676));
        assertTrue(recursiveEquals(term16140, term16688));
    }

};


