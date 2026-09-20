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

public class Flat3Map_isEmpty_38682173859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14405;
     Object term14736;

    public Flat3Map_isEmpty_38682173859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14405 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term14515 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term14515, term14515.getClass(), "size", -1);
        setField(term14405, term14405.getClass(), "delegateMap", term14515);
        term14736 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term14737 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term14736, term14736.getClass(), "size", 0);
        setIntField(term14736, term14736.getClass(), "hash1", 0);
        setIntField(term14736, term14736.getClass(), "hash2", 0);
        setIntField(term14736, term14736.getClass(), "hash3", 0);
        setField(term14736, term14736.getClass(), "key1", null);
        setField(term14736, term14736.getClass(), "key2", null);
        setField(term14736, term14736.getClass(), "key3", null);
        setField(term14736, term14736.getClass(), "value1", null);
        setField(term14736, term14736.getClass(), "value2", null);
        setField(term14736, term14736.getClass(), "value3", null);
        setFloatField(term14737, term14737.getClass(), "loadFactor", 0.0F);
        setIntField(term14737, term14737.getClass(), "size", -1);
        setField(term14737, term14737.getClass(), "data", null);
        setIntField(term14737, term14737.getClass(), "threshold", 0);
        setIntField(term14737, term14737.getClass(), "modCount", 0);
        setField(term14737, term14737.getClass(), "entrySet", null);
        setField(term14737, term14737.getClass(), "keySet", null);
        setField(term14737, term14737.getClass(), "values", null);
        setField(term14737, term14737.getClass(), "keySet", null);
        setField(term14737, term14737.getClass(), "values", null);
        setField(term14736, term14736.getClass(), "delegateMap", term14737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term14405, args);
        assertTrue(recursiveEquals(term14405, term14736));
        assertTrue(recursiveEquals(retValue, false));
    }

};
