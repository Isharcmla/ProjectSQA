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

public class Flat3Map_get_229621781326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58514;
     Object term58736;
     Object term59081;
     Object term59084;

    public Flat3Map_get_229621781326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58514 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term58552 = newInstance(Class.forName("java.lang.Object"));
        Object term58644 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term58514, term58514.getClass(), "delegateMap", null);
        setIntField(term58514, term58514.getClass(), "size", 2);
        setIntField(term58514, term58514.getClass(), "hash2", 0);
        setField(term58514, term58514.getClass(), "key2", term58552);
        setIntField(term58514, term58514.getClass(), "hash1", 0);
        setField(term58644, term58644.getClass(), "delegateMap", null);
        setIntField(term58644, term58644.getClass(), "size", 2);
        setField(term58514, term58514.getClass(), "key1", term58644);
        term58736 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term58736, term58736.getClass(), "delegateMap", null);
        setIntField(term58736, term58736.getClass(), "size", 2);
        setIntField(term58736, term58736.getClass(), "hash2", 0);
        setField(term58736, term58736.getClass(), "value2", null);
        setIntField(term58736, term58736.getClass(), "hash1", 0);
        setField(term58736, term58736.getClass(), "value1", null);
        term59081 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term59082 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term59083 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term59081, term59081.getClass(), "size", 2);
        setIntField(term59081, term59081.getClass(), "hash1", 0);
        setIntField(term59081, term59081.getClass(), "hash2", 0);
        setIntField(term59081, term59081.getClass(), "hash3", 0);
        setIntField(term59082, term59082.getClass(), "size", 2);
        setIntField(term59082, term59082.getClass(), "hash1", 0);
        setIntField(term59082, term59082.getClass(), "hash2", 0);
        setIntField(term59082, term59082.getClass(), "hash3", 0);
        setField(term59082, term59082.getClass(), "key1", null);
        setField(term59082, term59082.getClass(), "key2", null);
        setField(term59082, term59082.getClass(), "key3", null);
        setField(term59082, term59082.getClass(), "value1", null);
        setField(term59082, term59082.getClass(), "value2", null);
        setField(term59082, term59082.getClass(), "value3", null);
        setField(term59082, term59082.getClass(), "delegateMap", null);
        setField(term59081, term59081.getClass(), "key1", term59082);
        setField(term59081, term59081.getClass(), "key2", term59083);
        setField(term59081, term59081.getClass(), "key3", null);
        setField(term59081, term59081.getClass(), "value1", null);
        setField(term59081, term59081.getClass(), "value2", null);
        setField(term59081, term59081.getClass(), "value3", null);
        setField(term59081, term59081.getClass(), "delegateMap", null);
        term59084 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term59084, term59084.getClass(), "size", 2);
        setIntField(term59084, term59084.getClass(), "hash1", 0);
        setIntField(term59084, term59084.getClass(), "hash2", 0);
        setIntField(term59084, term59084.getClass(), "hash3", 0);
        setField(term59084, term59084.getClass(), "key1", null);
        setField(term59084, term59084.getClass(), "key2", null);
        setField(term59084, term59084.getClass(), "key3", null);
        setField(term59084, term59084.getClass(), "value1", null);
        setField(term59084, term59084.getClass(), "value2", null);
        setField(term59084, term59084.getClass(), "value3", null);
        setField(term59084, term59084.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term58736;
        Object retValue = callMethod(klass, "get", argTypes, term58514, args);
        assertTrue(recursiveEquals(term58514, term59081));
        assertTrue(recursiveEquals(term58736, term59084));
        assertTrue(recursiveEquals(retValue, null));
    }

};
