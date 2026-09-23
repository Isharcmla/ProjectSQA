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

public class TreeTraversingParser_init_8322857895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16942;
     Object term17292;
     Object term17304;

    public TreeTraversingParser_init_8322857895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17308 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term17307 = ((Class) term17308).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term17307).setAccessible(true);
        Object enum3 = ((Field) term17307).get((Object) null);
        Object term16766 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setIntField(term16766, term16766.getClass(), "_features", 0);
        setField(term16766, term16766.getClass(), "_objectCodec", null);
        setField(term16766, term16766.getClass(), "_nextToken", enum3);
        HashMap term16990 = new HashMap();
        term16942 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ObjectNode"));
        setField(term16942, term16942.getClass(), "_children", term16990);
        HashMap term17295 = new HashMap();
        Class<? extends Object> term17534 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term17533 = ((Class) term17534).getDeclaredField((String) "START_OBJECT");
        ((Field) term17533).setAccessible(true);
        Object enum4 = ((Field) term17533).get((Object) null);
        term17292 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term17293 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object term17294 = newInstance(Class.forName("java.util.HashMap$EntryIterator"));
        setField(term17292, term17292.getClass(), "_objectCodec", null);
        setField(term17294, term17294.getClass(), "this$0", term17295);
        setField(term17294, term17294.getClass(), "next", null);
        setField(term17294, term17294.getClass(), "current", null);
        setIntField(term17294, term17294.getClass(), "expectedModCount", 0);
        setIntField(term17294, term17294.getClass(), "index", 0);
        setField(term17293, term17293.getClass(), "_contents", term17294);
        setField(term17293, term17293.getClass(), "_current", null);
        setBooleanField(term17293, term17293.getClass(), "_needEntry", true);
        setField(term17293, term17293.getClass(), "_parent", null);
        setField(term17293, term17293.getClass(), "_currentName", null);
        setField(term17293, term17293.getClass(), "_currentValue", null);
        setIntField(term17293, term17293.getClass(), "_type", 2);
        setIntField(term17293, term17293.getClass(), "_index", -1);
        setField(term17292, term17292.getClass(), "_nodeCursor", term17293);
        setField(term17292, term17292.getClass(), "_nextToken", enum4);
        setBooleanField(term17292, term17292.getClass(), "_startContainer", false);
        setBooleanField(term17292, term17292.getClass(), "_closed", false);
        setField(term17292, term17292.getClass(), "_currToken", null);
        setField(term17292, term17292.getClass(), "_lastClearedToken", null);
        setIntField(term17292, term17292.getClass(), "_features", 0);
        setField(term17292, term17292.getClass(), "_requestPayload", null);
        HashMap term17305 = new HashMap();
        term17304 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ObjectNode"));
        setField(term17304, term17304.getClass(), "_children", term17305);
        setField(term17304, term17304.getClass(), "_nodeFactory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term16942;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17292));
        assertTrue(recursiveEquals(term16942, term17304));
    }

};


