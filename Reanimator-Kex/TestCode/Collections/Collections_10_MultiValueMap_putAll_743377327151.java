package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class MultiValueMap_putAll_743377327151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30641;
     Object term30743;
     Object term41277;
     Object term41278;

    public MultiValueMap_putAll_743377327151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30641 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        term30743 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term30835 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap"));
        setField(term30743, term30743.getClass(), "map", term30835);
        term41277 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term41277, term41277.getClass(), "collectionFactory", null);
        setField(term41277, term41277.getClass(), "valuesView", null);
        setField(term41277, term41277.getClass(), "map", null);
        term41278 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term41279 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap"));
        Object term41280 = newInstance(Class.forName("java.util.HashMap$EntrySet"));
        setField(term41278, term41278.getClass(), "collectionFactory", null);
        setField(term41278, term41278.getClass(), "valuesView", null);
        setField(term41279, term41279.getClass(), "values", null);
        setField(term41279, term41279.getClass(), "table", null);
        setField(term41280, term41280.getClass(), "this$0", term41279);
        setField(term41279, term41279.getClass(), "entrySet", term41280);
        setIntField(term41279, term41279.getClass(), "size", 0);
        setIntField(term41279, term41279.getClass(), "modCount", 0);
        setIntField(term41279, term41279.getClass(), "threshold", 0);
        setFloatField(term41279, term41279.getClass(), "loadFactor", 0.0F);
        setField(term41279, term41279.getClass(), "keySet", null);
        setField(term41278, term41278.getClass(), "map", term41279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term30743;
        callMethod(klass, "putAll", argTypes, term30641, args);
        assertTrue(recursiveEquals(term30641, term41277));
        assertTrue(recursiveEquals(term30743, term41278));
    }

};


