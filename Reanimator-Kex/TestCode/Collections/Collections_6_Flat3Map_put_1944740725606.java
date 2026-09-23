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

public class Flat3Map_put_1944740725606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127095;
     Object term127959;
     Object term127966;

    public Flat3Map_put_1944740725606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127095 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127150 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term127189 = newInstance(Class.forName("java.util.stream.MatchOps$4MatchSink"));
        setField(term127095, term127095.getClass(), "delegateMap", null);
        setIntField(term127095, term127095.getClass(), "size", 3);
        setIntField(term127095, term127095.getClass(), "hash3", 0);
        setField(term127095, term127095.getClass(), "value3", null);
        setIntField(term127095, term127095.getClass(), "hash2", 0);
        setIntField(term127150, term127150.getClass(), "size", 0);
        setField(term127095, term127095.getClass(), "value2", term127150);
        setIntField(term127095, term127095.getClass(), "hash1", 0);
        setField(term127095, term127095.getClass(), "value1", term127189);
        term127959 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127960 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term127961 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term127962 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term127963 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term127964 = newInstance(Class.forName("java.lang.Object"));
        Object term127965 = newInstance(Class.forName("java.util.stream.MatchOps$4MatchSink"));
        setIntField(term127959, term127959.getClass(), "size", 0);
        setIntField(term127959, term127959.getClass(), "hash1", 0);
        setIntField(term127959, term127959.getClass(), "hash2", 0);
        setIntField(term127959, term127959.getClass(), "hash3", 0);
        setField(term127959, term127959.getClass(), "key1", null);
        setField(term127959, term127959.getClass(), "key2", null);
        setField(term127959, term127959.getClass(), "key3", null);
        setField(term127959, term127959.getClass(), "value1", null);
        setField(term127959, term127959.getClass(), "value2", null);
        setField(term127959, term127959.getClass(), "value3", null);
        setFloatField(term127960, term127960.getClass(), "loadFactor", 0.75F);
        setIntField(term127960, term127960.getClass(), "size", 2);
        setField(term127962, term127962.getClass(), "next", null);
        setField(term127962, term127962.getClass(), "key", term127959);
        setField(term127962, term127962.getClass(), "value", null);
        setElement(term127961, 2, term127962);
        setField(term127963, term127963.getClass(), "next", null);
        setField(term127963, term127963.getClass(), "key", term127964);
        setField(term127965, term127965.getClass(), "val$matchKind", null);
        setField(term127965, term127965.getClass(), "val$predicate", null);
        setBooleanField(term127965, term127965.getClass(), "stop", false);
        setBooleanField(term127965, term127965.getClass(), "value", false);
        setField(term127963, term127963.getClass(), "value", term127965);
        setElement(term127961, 5, term127963);
        setField(term127960, term127960.getClass(), "data", term127961);
        setIntField(term127960, term127960.getClass(), "threshold", 12);
        setIntField(term127960, term127960.getClass(), "modCount", 2);
        setField(term127960, term127960.getClass(), "entrySet", null);
        setField(term127960, term127960.getClass(), "keySet", null);
        setField(term127960, term127960.getClass(), "values", null);
        setField(term127960, term127960.getClass(), "keySet", null);
        setField(term127960, term127960.getClass(), "values", null);
        setField(term127959, term127959.getClass(), "delegateMap", term127960);
        term127966 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127967 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term127968 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term127969 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term127970 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term127971 = newInstance(Class.forName("java.lang.Object"));
        Object term127972 = newInstance(Class.forName("java.util.stream.MatchOps$4MatchSink"));
        setIntField(term127966, term127966.getClass(), "size", 0);
        setIntField(term127966, term127966.getClass(), "hash1", 0);
        setIntField(term127966, term127966.getClass(), "hash2", 0);
        setIntField(term127966, term127966.getClass(), "hash3", 0);
        setField(term127966, term127966.getClass(), "key1", null);
        setField(term127966, term127966.getClass(), "key2", null);
        setField(term127966, term127966.getClass(), "key3", null);
        setField(term127966, term127966.getClass(), "value1", null);
        setField(term127966, term127966.getClass(), "value2", null);
        setField(term127966, term127966.getClass(), "value3", null);
        setFloatField(term127967, term127967.getClass(), "loadFactor", 0.75F);
        setIntField(term127967, term127967.getClass(), "size", 2);
        setField(term127969, term127969.getClass(), "next", null);
        setField(term127969, term127969.getClass(), "key", term127966);
        setField(term127969, term127969.getClass(), "value", null);
        setElement(term127968, 2, term127969);
        setField(term127970, term127970.getClass(), "next", null);
        setField(term127970, term127970.getClass(), "key", term127971);
        setField(term127972, term127972.getClass(), "val$matchKind", null);
        setField(term127972, term127972.getClass(), "val$predicate", null);
        setBooleanField(term127972, term127972.getClass(), "stop", false);
        setBooleanField(term127972, term127972.getClass(), "value", false);
        setField(term127970, term127970.getClass(), "value", term127972);
        setElement(term127968, 5, term127970);
        setField(term127967, term127967.getClass(), "data", term127968);
        setIntField(term127967, term127967.getClass(), "threshold", 12);
        setIntField(term127967, term127967.getClass(), "modCount", 2);
        setField(term127967, term127967.getClass(), "entrySet", null);
        setField(term127967, term127967.getClass(), "keySet", null);
        setField(term127967, term127967.getClass(), "values", null);
        setField(term127967, term127967.getClass(), "keySet", null);
        setField(term127967, term127967.getClass(), "values", null);
        setField(term127966, term127966.getClass(), "delegateMap", term127967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term127095;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term127095, args);
        assertTrue(recursiveEquals(term127095, term127959));
        assertTrue(recursiveEquals(term127095, term127966));
        assertTrue(recursiveEquals(retValue, null));
    }

};


