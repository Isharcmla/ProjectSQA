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

public class Flat3Map_put_1944740725395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68488;
     Object term68580;
     Object term68753;
     Object term68758;

    public Flat3Map_put_1944740725395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68488 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term68488, term68488.getClass(), "delegateMap", null);
        setIntField(term68488, term68488.getClass(), "size", -4);
        setIntField(term68488, term68488.getClass(), "hash3", 0);
        setField(term68488, term68488.getClass(), "key3", term68488);
        setIntField(term68488, term68488.getClass(), "hash2", -1);
        term68580 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term68580, term68580.getClass(), "delegateMap", null);
        setIntField(term68580, term68580.getClass(), "size", 3);
        setIntField(term68580, term68580.getClass(), "hash3", 0);
        setField(term68580, term68580.getClass(), "value3", null);
        setIntField(term68580, term68580.getClass(), "hash2", 0);
        setField(term68580, term68580.getClass(), "value2", null);
        setIntField(term68580, term68580.getClass(), "hash1", 0);
        setField(term68580, term68580.getClass(), "value1", null);
        term68753 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term68754 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term68755 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term68756 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term68757 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term68753, term68753.getClass(), "size", 0);
        setIntField(term68753, term68753.getClass(), "hash1", 0);
        setIntField(term68753, term68753.getClass(), "hash2", 0);
        setIntField(term68753, term68753.getClass(), "hash3", 0);
        setField(term68753, term68753.getClass(), "key1", null);
        setField(term68753, term68753.getClass(), "key2", null);
        setField(term68753, term68753.getClass(), "key3", null);
        setField(term68753, term68753.getClass(), "value1", null);
        setField(term68753, term68753.getClass(), "value2", null);
        setField(term68753, term68753.getClass(), "value3", null);
        setFloatField(term68754, term68754.getClass(), "loadFactor", 0.75F);
        setIntField(term68754, term68754.getClass(), "size", 1);
        setField(term68756, term68756.getClass(), "next", null);
        setIntField(term68757, term68757.getClass(), "size", 3);
        setIntField(term68757, term68757.getClass(), "hash1", 0);
        setIntField(term68757, term68757.getClass(), "hash2", 0);
        setIntField(term68757, term68757.getClass(), "hash3", 0);
        setField(term68757, term68757.getClass(), "key1", null);
        setField(term68757, term68757.getClass(), "key2", null);
        setField(term68757, term68757.getClass(), "key3", null);
        setField(term68757, term68757.getClass(), "value1", null);
        setField(term68757, term68757.getClass(), "value2", null);
        setField(term68757, term68757.getClass(), "value3", null);
        setField(term68757, term68757.getClass(), "delegateMap", null);
        setField(term68756, term68756.getClass(), "key", term68757);
        setField(term68756, term68756.getClass(), "value", null);
        setElement(term68755, 0, term68756);
        setField(term68754, term68754.getClass(), "data", term68755);
        setIntField(term68754, term68754.getClass(), "threshold", 12);
        setIntField(term68754, term68754.getClass(), "modCount", 1);
        setField(term68754, term68754.getClass(), "entrySet", null);
        setField(term68754, term68754.getClass(), "keySet", null);
        setField(term68754, term68754.getClass(), "values", null);
        setField(term68754, term68754.getClass(), "keySet", null);
        setField(term68754, term68754.getClass(), "values", null);
        setField(term68753, term68753.getClass(), "delegateMap", term68754);
        term68758 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term68758, term68758.getClass(), "size", 3);
        setIntField(term68758, term68758.getClass(), "hash1", 0);
        setIntField(term68758, term68758.getClass(), "hash2", 0);
        setIntField(term68758, term68758.getClass(), "hash3", 0);
        setField(term68758, term68758.getClass(), "key1", null);
        setField(term68758, term68758.getClass(), "key2", null);
        setField(term68758, term68758.getClass(), "key3", null);
        setField(term68758, term68758.getClass(), "value1", null);
        setField(term68758, term68758.getClass(), "value2", null);
        setField(term68758, term68758.getClass(), "value3", null);
        setField(term68758, term68758.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term68580;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term68488, args);
        assertTrue(recursiveEquals(term68488, term68753));
        assertTrue(recursiveEquals(term68580, term68758));
        assertTrue(recursiveEquals(retValue, null));
    }

};


