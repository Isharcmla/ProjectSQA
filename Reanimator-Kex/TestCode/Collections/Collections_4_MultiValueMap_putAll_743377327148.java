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

public class MultiValueMap_putAll_743377327148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33405;
     Object term33507;
     Object term38578;
     Object term38579;

    public MultiValueMap_putAll_743377327148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33405 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        term33507 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term33609 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term33701 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap"));
        setField(term33609, term33609.getClass(), "map", term33701);
        setField(term33507, term33507.getClass(), "map", term33609);
        term38578 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term38578, term38578.getClass(), "collectionFactory", null);
        setField(term38578, term38578.getClass(), "values", null);
        setField(term38578, term38578.getClass(), "map", null);
        term38579 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term38580 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term38581 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap"));
        Object term38582 = newInstance(Class.forName("java.util.HashMap$EntrySet"));
        setField(term38579, term38579.getClass(), "collectionFactory", null);
        setField(term38579, term38579.getClass(), "values", null);
        setField(term38580, term38580.getClass(), "collectionFactory", null);
        setField(term38580, term38580.getClass(), "values", null);
        setField(term38581, term38581.getClass(), "values", null);
        setField(term38581, term38581.getClass(), "table", null);
        setField(term38582, term38582.getClass(), "this$0", term38581);
        setField(term38581, term38581.getClass(), "entrySet", term38582);
        setIntField(term38581, term38581.getClass(), "size", 0);
        setIntField(term38581, term38581.getClass(), "modCount", 0);
        setIntField(term38581, term38581.getClass(), "threshold", 0);
        setFloatField(term38581, term38581.getClass(), "loadFactor", 0.0F);
        setField(term38581, term38581.getClass(), "keySet", null);
        setField(term38580, term38580.getClass(), "map", term38581);
        setField(term38579, term38579.getClass(), "map", term38580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term33507;
        callMethod(klass, "putAll", argTypes, term33405, args);
        assertTrue(recursiveEquals(term33405, term38578));
        assertTrue(recursiveEquals(term33507, term38579));
    }

};


