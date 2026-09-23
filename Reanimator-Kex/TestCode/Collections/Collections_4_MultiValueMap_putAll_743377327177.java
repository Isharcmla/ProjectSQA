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

public class MultiValueMap_putAll_743377327177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43520;
     Object term43622;
     Object term54158;
     Object term54159;

    public MultiValueMap_putAll_743377327177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43520 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        term43622 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term43724 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term43816 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap"));
        setField(term43724, term43724.getClass(), "map", term43816);
        setField(term43622, term43622.getClass(), "map", term43724);
        term54158 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term54158, term54158.getClass(), "collectionFactory", null);
        setField(term54158, term54158.getClass(), "values", null);
        setField(term54158, term54158.getClass(), "map", null);
        term54159 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term54160 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term54161 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap"));
        Object term54162 = newInstance(Class.forName("java.util.HashMap$EntrySet"));
        setField(term54159, term54159.getClass(), "collectionFactory", null);
        setField(term54159, term54159.getClass(), "values", null);
        setField(term54160, term54160.getClass(), "collectionFactory", null);
        setField(term54160, term54160.getClass(), "values", null);
        setField(term54161, term54161.getClass(), "values", null);
        setField(term54161, term54161.getClass(), "table", null);
        setField(term54162, term54162.getClass(), "this$0", term54161);
        setField(term54161, term54161.getClass(), "entrySet", term54162);
        setIntField(term54161, term54161.getClass(), "size", 0);
        setIntField(term54161, term54161.getClass(), "modCount", 0);
        setIntField(term54161, term54161.getClass(), "threshold", 0);
        setFloatField(term54161, term54161.getClass(), "loadFactor", 0.0F);
        setField(term54161, term54161.getClass(), "keySet", null);
        setField(term54160, term54160.getClass(), "map", term54161);
        setField(term54159, term54159.getClass(), "map", term54160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term43622;
        callMethod(klass, "putAll", argTypes, term43520, args);
        assertTrue(recursiveEquals(term43520, term54158));
        assertTrue(recursiveEquals(term43622, term54159));
    }

};


