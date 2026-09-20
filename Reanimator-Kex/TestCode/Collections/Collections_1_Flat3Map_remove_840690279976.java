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

public class Flat3Map_remove_840690279976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195858;
     Object term196392;
     Object term196394;

    public Flat3Map_remove_840690279976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195858 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term195896 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setField(term195858, term195858.getClass(), "delegateMap", null);
        setIntField(term195858, term195858.getClass(), "size", 3);
        setIntField(term195858, term195858.getClass(), "hash3", 0);
        setField(term195858, term195858.getClass(), "value3", term195896);
        setIntField(term195858, term195858.getClass(), "hash2", 0);
        setField(term195858, term195858.getClass(), "value2", null);
        setIntField(term195858, term195858.getClass(), "hash1", 0);
        setField(term195858, term195858.getClass(), "value1", null);
        term196392 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term196393 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setIntField(term196392, term196392.getClass(), "size", 3);
        setIntField(term196392, term196392.getClass(), "hash1", 0);
        setIntField(term196392, term196392.getClass(), "hash2", 0);
        setIntField(term196392, term196392.getClass(), "hash3", 0);
        setField(term196392, term196392.getClass(), "key1", null);
        setField(term196392, term196392.getClass(), "key2", null);
        setField(term196392, term196392.getClass(), "key3", null);
        setField(term196392, term196392.getClass(), "value1", null);
        setField(term196392, term196392.getClass(), "value2", null);
        setField(term196393, term196393.getClass(), "this$1", null);
        setField(term196393, term196393.getClass(), "downstream", null);
        setField(term196392, term196392.getClass(), "value3", term196393);
        setField(term196392, term196392.getClass(), "delegateMap", null);
        term196394 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term196395 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setIntField(term196394, term196394.getClass(), "size", 3);
        setIntField(term196394, term196394.getClass(), "hash1", 0);
        setIntField(term196394, term196394.getClass(), "hash2", 0);
        setIntField(term196394, term196394.getClass(), "hash3", 0);
        setField(term196394, term196394.getClass(), "key1", null);
        setField(term196394, term196394.getClass(), "key2", null);
        setField(term196394, term196394.getClass(), "key3", null);
        setField(term196394, term196394.getClass(), "value1", null);
        setField(term196394, term196394.getClass(), "value2", null);
        setField(term196395, term196395.getClass(), "this$1", null);
        setField(term196395, term196395.getClass(), "downstream", null);
        setField(term196394, term196394.getClass(), "value3", term196395);
        setField(term196394, term196394.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term195858;
        Object retValue = callMethod(klass, "remove", argTypes, term195858, args);
        assertTrue(recursiveEquals(term195858, term196392));
        assertTrue(recursiveEquals(term195858, term196394));
        assertTrue(recursiveEquals(retValue, null));
    }

};
