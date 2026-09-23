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
import java.util.ArrayList;

public class TreeTraversingParser_init_8322857879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12027;
     Object term12171;
     Object term12862;
     Object term12875;
     Object term12878;

    public TreeTraversingParser_init_8322857879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12880 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term12879 = ((Class) term12880).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term12879).setAccessible(true);
        Object enum1 = ((Field) term12879).get((Object) null);
        Object term11853 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setIntField(term11853, term11853.getClass(), "_features", 0);
        setField(term11853, term11853.getClass(), "_objectCodec", null);
        setField(term11853, term11853.getClass(), "_nextToken", enum1);
        ArrayList term12079 = new ArrayList();
        term12027 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ArrayNode"));
        setField(term12027, term12027.getClass(), "_children", term12079);
        term12171 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        ArrayList term12866 = new ArrayList();
        Class<? extends Object> term13106 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term13105 = ((Class) term13106).getDeclaredField((String) "START_ARRAY");
        ((Field) term13105).setAccessible(true);
        Object enum2 = ((Field) term13105).get((Object) null);
        term12862 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object term12863 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term12864 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        Object term12865 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setField(term12863, term12863.getClass(), "_config", null);
        setField(term12863, term12863.getClass(), "_context", null);
        setField(term12863, term12863.getClass(), "_parserFactory", null);
        setBooleanField(term12863, term12863.getClass(), "_unwrapRoot", false);
        setField(term12863, term12863.getClass(), "_filter", null);
        setField(term12863, term12863.getClass(), "_valueType", null);
        setField(term12863, term12863.getClass(), "_rootDeserializer", null);
        setField(term12863, term12863.getClass(), "_valueToUpdate", null);
        setField(term12863, term12863.getClass(), "_schema", null);
        setField(term12863, term12863.getClass(), "_injectableValues", null);
        setField(term12863, term12863.getClass(), "_dataFormatReaders", null);
        setField(term12863, term12863.getClass(), "_rootDeserializers", null);
        setField(term12862, term12862.getClass(), "_objectCodec", term12863);
        setIntField(term12865, term12865.getClass(), "cursor", 0);
        setIntField(term12865, term12865.getClass(), "lastRet", -1);
        setIntField(term12865, term12865.getClass(), "expectedModCount", 0);
        setField(term12865, term12865.getClass(), "this$0", term12866);
        setField(term12864, term12864.getClass(), "_contents", term12865);
        setField(term12864, term12864.getClass(), "_currentNode", null);
        setField(term12864, term12864.getClass(), "_parent", null);
        setField(term12864, term12864.getClass(), "_currentName", null);
        setField(term12864, term12864.getClass(), "_currentValue", null);
        setIntField(term12864, term12864.getClass(), "_type", 1);
        setIntField(term12864, term12864.getClass(), "_index", -1);
        setField(term12862, term12862.getClass(), "_nodeCursor", term12864);
        setField(term12862, term12862.getClass(), "_nextToken", enum2);
        setBooleanField(term12862, term12862.getClass(), "_startContainer", false);
        setBooleanField(term12862, term12862.getClass(), "_closed", false);
        setField(term12862, term12862.getClass(), "_currToken", null);
        setField(term12862, term12862.getClass(), "_lastClearedToken", null);
        setIntField(term12862, term12862.getClass(), "_features", 0);
        setField(term12862, term12862.getClass(), "_requestPayload", null);
        ArrayList term12876 = new ArrayList();
        term12875 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.ArrayNode"));
        setField(term12875, term12875.getClass(), "_children", term12876);
        setField(term12875, term12875.getClass(), "_nodeFactory", null);
        term12878 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term12878, term12878.getClass(), "_config", null);
        setField(term12878, term12878.getClass(), "_context", null);
        setField(term12878, term12878.getClass(), "_parserFactory", null);
        setBooleanField(term12878, term12878.getClass(), "_unwrapRoot", false);
        setField(term12878, term12878.getClass(), "_filter", null);
        setField(term12878, term12878.getClass(), "_valueType", null);
        setField(term12878, term12878.getClass(), "_rootDeserializer", null);
        setField(term12878, term12878.getClass(), "_valueToUpdate", null);
        setField(term12878, term12878.getClass(), "_schema", null);
        setField(term12878, term12878.getClass(), "_injectableValues", null);
        setField(term12878, term12878.getClass(), "_dataFormatReaders", null);
        setField(term12878, term12878.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonNode");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[2];
        args[0] = term12027;
        args[1] = term12171;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12862));
        assertTrue(recursiveEquals(term12027, term12875));
        assertTrue(recursiveEquals(term12171, term12878));
    }

};


