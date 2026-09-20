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

public class Flat3Map_clone_46866237142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6022;
     Object term13571;
     Object term13550;

    public Flat3Map_clone_46866237142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6022 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term6027 = newInstance(Class.forName("java.lang.Object"));
        Object term6028 = newInstance(Class.forName("java.lang.Object"));
        Object term6029 = newInstance(Class.forName("java.lang.Object"));
        Object term6030 = newInstance(Class.forName("java.lang.Object"));
        Object term6031 = newInstance(Class.forName("java.lang.Object"));
        Object term6032 = newInstance(Class.forName("java.lang.Object"));
        Object term6033 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term6022, term6022.getClass(), "size", 1964967720);
        setIntField(term6022, term6022.getClass(), "hash1", 1351900243);
        setIntField(term6022, term6022.getClass(), "hash2", -330897705);
        setIntField(term6022, term6022.getClass(), "hash3", 1065595802);
        setField(term6022, term6022.getClass(), "key1", term6027);
        setField(term6022, term6022.getClass(), "key2", term6028);
        setField(term6022, term6022.getClass(), "key3", term6029);
        setField(term6022, term6022.getClass(), "value1", term6030);
        setField(term6022, term6022.getClass(), "value2", term6031);
        setField(term6022, term6022.getClass(), "value3", term6032);
        setFloatField(term6033, term6033.getClass(), "loadFactor", 0.0F);
        setIntField(term6033, term6033.getClass(), "size", 0);
        setField(term6033, term6033.getClass(), "data", null);
        setIntField(term6033, term6033.getClass(), "threshold", 0);
        setIntField(term6033, term6033.getClass(), "modCount", 0);
        setField(term6033, term6033.getClass(), "entrySet", null);
        setField(term6033, term6033.getClass(), "keySet", null);
        setField(term6033, term6033.getClass(), "values", null);
        setField(term6033, term6033.getClass(), "keySet", null);
        setField(term6033, term6033.getClass(), "values", null);
        setField(term6022, term6022.getClass(), "delegateMap", term6033);
        term13571 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term13572 = newInstance(Class.forName("java.lang.Object"));
        Object term13573 = newInstance(Class.forName("java.lang.Object"));
        Object term13574 = newInstance(Class.forName("java.lang.Object"));
        Object term13575 = newInstance(Class.forName("java.lang.Object"));
        Object term13576 = newInstance(Class.forName("java.lang.Object"));
        Object term13577 = newInstance(Class.forName("java.lang.Object"));
        Object term13578 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term13571, term13571.getClass(), "size", 1964967720);
        setIntField(term13571, term13571.getClass(), "hash1", 1351900243);
        setIntField(term13571, term13571.getClass(), "hash2", -330897705);
        setIntField(term13571, term13571.getClass(), "hash3", 1065595802);
        setField(term13571, term13571.getClass(), "key1", term13572);
        setField(term13571, term13571.getClass(), "key2", term13573);
        setField(term13571, term13571.getClass(), "key3", term13574);
        setField(term13571, term13571.getClass(), "value1", term13575);
        setField(term13571, term13571.getClass(), "value2", term13576);
        setField(term13571, term13571.getClass(), "value3", term13577);
        setFloatField(term13578, term13578.getClass(), "loadFactor", 0.0F);
        setIntField(term13578, term13578.getClass(), "size", 0);
        setField(term13578, term13578.getClass(), "data", null);
        setIntField(term13578, term13578.getClass(), "threshold", 0);
        setIntField(term13578, term13578.getClass(), "modCount", 0);
        setField(term13578, term13578.getClass(), "entrySet", null);
        setField(term13578, term13578.getClass(), "keySet", null);
        setField(term13578, term13578.getClass(), "values", null);
        setField(term13578, term13578.getClass(), "keySet", null);
        setField(term13578, term13578.getClass(), "values", null);
        setField(term13571, term13571.getClass(), "delegateMap", term13578);
        term13550 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term13555 = newInstance(Class.forName("java.lang.Object"));
        Object term13556 = newInstance(Class.forName("java.lang.Object"));
        Object term13557 = newInstance(Class.forName("java.lang.Object"));
        Object term13558 = newInstance(Class.forName("java.lang.Object"));
        Object term13559 = newInstance(Class.forName("java.lang.Object"));
        Object term13560 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term13550, term13550.getClass(), "size", 1964967720);
        setIntField(term13550, term13550.getClass(), "hash1", 1351900243);
        setIntField(term13550, term13550.getClass(), "hash2", -330897705);
        setIntField(term13550, term13550.getClass(), "hash3", 1065595802);
        setField(term13550, term13550.getClass(), "key1", term13555);
        setField(term13550, term13550.getClass(), "key2", term13556);
        setField(term13550, term13550.getClass(), "key3", term13557);
        setField(term13550, term13550.getClass(), "value1", term13558);
        setField(term13550, term13550.getClass(), "value2", term13559);
        setField(term13550, term13550.getClass(), "value3", term13560);
        setField(term13550, term13550.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term6022, args);
        assertTrue(recursiveEquals(term6022, term13571));
        assertTrue(recursiveEquals(retValue, term13550));
    }

};
