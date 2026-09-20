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

public class Flat3Map_equals_1826922527706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139770;
     Object term140014;
     Object term140730;
     Object term140732;

    public Flat3Map_equals_1826922527706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139770 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139922 = newInstance(Class.forName("org.apache.commons.collections.list.PredicatedList$PredicatedListIterator"));
        setField(term139770, term139770.getClass(), "delegateMap", null);
        setIntField(term139770, term139770.getClass(), "size", 3);
        setField(term139770, term139770.getClass(), "key3", term139922);
        term140014 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term140014, term140014.getClass(), "delegateMap", null);
        setIntField(term140014, term140014.getClass(), "size", 3);
        term140730 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term140731 = newInstance(Class.forName("org.apache.commons.collections.list.PredicatedList$PredicatedListIterator"));
        setIntField(term140730, term140730.getClass(), "size", 3);
        setIntField(term140730, term140730.getClass(), "hash1", 0);
        setIntField(term140730, term140730.getClass(), "hash2", 0);
        setIntField(term140730, term140730.getClass(), "hash3", 0);
        setField(term140730, term140730.getClass(), "key1", null);
        setField(term140730, term140730.getClass(), "key2", null);
        setField(term140731, term140731.getClass(), "this$0", null);
        setField(term140731, term140731.getClass(), "iterator", null);
        setField(term140730, term140730.getClass(), "key3", term140731);
        setField(term140730, term140730.getClass(), "value1", null);
        setField(term140730, term140730.getClass(), "value2", null);
        setField(term140730, term140730.getClass(), "value3", null);
        setField(term140730, term140730.getClass(), "delegateMap", null);
        term140732 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term140732, term140732.getClass(), "size", 3);
        setIntField(term140732, term140732.getClass(), "hash1", 0);
        setIntField(term140732, term140732.getClass(), "hash2", 0);
        setIntField(term140732, term140732.getClass(), "hash3", 0);
        setField(term140732, term140732.getClass(), "key1", null);
        setField(term140732, term140732.getClass(), "key2", null);
        setField(term140732, term140732.getClass(), "key3", null);
        setField(term140732, term140732.getClass(), "value1", null);
        setField(term140732, term140732.getClass(), "value2", null);
        setField(term140732, term140732.getClass(), "value3", null);
        setField(term140732, term140732.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term140014;
        Object retValue = callMethod(klass, "equals", argTypes, term139770, args);
        assertTrue(recursiveEquals(term139770, term140730));
        assertTrue(recursiveEquals(term140014, term140732));
        assertTrue(recursiveEquals(retValue, false));
    }

};
