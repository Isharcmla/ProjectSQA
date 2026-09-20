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

public class Flat3Map_get_229621781557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106373;
     Object term106557;
     Object term107875;
     Object term107877;

    public Flat3Map_get_229621781557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106373 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term106465 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term106373, term106373.getClass(), "delegateMap", null);
        setIntField(term106373, term106373.getClass(), "size", 2);
        setIntField(term106373, term106373.getClass(), "hash2", 0);
        setField(term106373, term106373.getClass(), "key2", null);
        setIntField(term106373, term106373.getClass(), "hash1", 0);
        setField(term106465, term106465.getClass(), "delegateMap", null);
        setIntField(term106465, term106465.getClass(), "size", 2);
        setField(term106373, term106373.getClass(), "key1", term106465);
        term106557 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term106667 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term106765 = newInstance(Class.forName("java.nio.channels.IllegalBlockingModeException"));
        setField(term106557, term106557.getClass(), "delegateMap", null);
        setIntField(term106557, term106557.getClass(), "size", 2);
        setIntField(term106557, term106557.getClass(), "hash2", 0);
        setIntField(term106667, term106667.getClass(), "size", 0);
        setField(term106557, term106557.getClass(), "value2", term106667);
        setIntField(term106557, term106557.getClass(), "hash1", 0);
        setField(term106557, term106557.getClass(), "value1", null);
        setField(term106557, term106557.getClass(), "key2", term106765);
        term107875 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107876 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term107875, term107875.getClass(), "size", 2);
        setIntField(term107875, term107875.getClass(), "hash1", 0);
        setIntField(term107875, term107875.getClass(), "hash2", 0);
        setIntField(term107875, term107875.getClass(), "hash3", 0);
        setIntField(term107876, term107876.getClass(), "size", 2);
        setIntField(term107876, term107876.getClass(), "hash1", 0);
        setIntField(term107876, term107876.getClass(), "hash2", 0);
        setIntField(term107876, term107876.getClass(), "hash3", 0);
        setField(term107876, term107876.getClass(), "key1", null);
        setField(term107876, term107876.getClass(), "key2", null);
        setField(term107876, term107876.getClass(), "key3", null);
        setField(term107876, term107876.getClass(), "value1", null);
        setField(term107876, term107876.getClass(), "value2", null);
        setField(term107876, term107876.getClass(), "value3", null);
        setField(term107876, term107876.getClass(), "delegateMap", null);
        setField(term107875, term107875.getClass(), "key1", term107876);
        setField(term107875, term107875.getClass(), "key2", null);
        setField(term107875, term107875.getClass(), "key3", null);
        setField(term107875, term107875.getClass(), "value1", null);
        setField(term107875, term107875.getClass(), "value2", null);
        setField(term107875, term107875.getClass(), "value3", null);
        setField(term107875, term107875.getClass(), "delegateMap", null);
        term107877 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107878 = newInstance(Class.forName("java.nio.channels.IllegalBlockingModeException"));
        Object term107879 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term107877, term107877.getClass(), "size", 2);
        setIntField(term107877, term107877.getClass(), "hash1", 0);
        setIntField(term107877, term107877.getClass(), "hash2", 0);
        setIntField(term107877, term107877.getClass(), "hash3", 0);
        setField(term107877, term107877.getClass(), "key1", null);
        setField(term107878, term107878.getClass(), "backtrace", null);
        setField(term107878, term107878.getClass(), "detailMessage", null);
        setField(term107878, term107878.getClass(), "cause", null);
        setField(term107878, term107878.getClass(), "stackTrace", null);
        setIntField(term107878, term107878.getClass(), "depth", 0);
        setField(term107878, term107878.getClass(), "suppressedExceptions", null);
        setField(term107877, term107877.getClass(), "key2", term107878);
        setField(term107877, term107877.getClass(), "key3", null);
        setField(term107877, term107877.getClass(), "value1", null);
        setFloatField(term107879, term107879.getClass(), "loadFactor", 0.0F);
        setIntField(term107879, term107879.getClass(), "size", 0);
        setField(term107879, term107879.getClass(), "data", null);
        setIntField(term107879, term107879.getClass(), "threshold", 0);
        setIntField(term107879, term107879.getClass(), "modCount", 0);
        setField(term107879, term107879.getClass(), "entrySet", null);
        setField(term107879, term107879.getClass(), "keySet", null);
        setField(term107879, term107879.getClass(), "values", null);
        setField(term107879, term107879.getClass(), "keySet", null);
        setField(term107879, term107879.getClass(), "values", null);
        setField(term107877, term107877.getClass(), "value2", term107879);
        setField(term107877, term107877.getClass(), "value3", null);
        setField(term107877, term107877.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term106557;
        Object retValue = callMethod(klass, "get", argTypes, term106373, args);
        assertTrue(recursiveEquals(term106373, term107875));
        assertTrue(recursiveEquals(term106557, term107877));
        assertTrue(recursiveEquals(retValue, null));
    }

};
