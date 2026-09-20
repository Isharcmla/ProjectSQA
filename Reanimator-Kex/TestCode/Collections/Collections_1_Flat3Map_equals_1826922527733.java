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
import java.util.HashMap;
import java.lang.Object;

public class Flat3Map_equals_1826922527733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147268;
     Object term147794;
     Object term147988;
     Object term147994;

    public Flat3Map_equals_1826922527733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term147873 = new HashMap();
        term147268 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term147794 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147849 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term147928 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term147748 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyMapIterator"));
        setField(term147268, term147268.getClass(), "delegateMap", null);
        setIntField(term147268, term147268.getClass(), "size", 2);
        setField(term147268, term147268.getClass(), "key2", term147873);
        setIntField(term147849, term147849.getClass(), "size", 0);
        setField(term147794, term147794.getClass(), "delegateMap", term147849);
        setIntField(term147794, term147794.getClass(), "size", 2);
        setIntField(term147794, term147794.getClass(), "hash2", 0);
        setField(term147794, term147794.getClass(), "key2", term147873);
        setIntField(term147928, term147928.getClass(), "size", 0);
        setField(term147794, term147794.getClass(), "value2", term147928);
        setField(term147794, term147794.getClass(), "key1", null);
        setField(term147794, term147794.getClass(), "value1", null);
        setField(term147268, term147268.getClass(), "value2", term147794);
        setField(term147268, term147268.getClass(), "key1", null);
        setField(term147268, term147268.getClass(), "value1", term147748);
        HashMap term147989 = new HashMap();
        term147988 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147990 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyMapIterator"));
        Object term147991 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147992 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term147993 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term147988, term147988.getClass(), "size", 2);
        setIntField(term147988, term147988.getClass(), "hash1", 0);
        setIntField(term147988, term147988.getClass(), "hash2", 0);
        setIntField(term147988, term147988.getClass(), "hash3", 0);
        setField(term147988, term147988.getClass(), "key1", null);
        setField(term147988, term147988.getClass(), "key2", term147989);
        setField(term147988, term147988.getClass(), "key3", null);
        setField(term147988, term147988.getClass(), "value1", term147990);
        setIntField(term147991, term147991.getClass(), "size", 2);
        setIntField(term147991, term147991.getClass(), "hash1", 0);
        setIntField(term147991, term147991.getClass(), "hash2", 0);
        setIntField(term147991, term147991.getClass(), "hash3", 0);
        setField(term147991, term147991.getClass(), "key1", null);
        setField(term147991, term147991.getClass(), "key2", term147989);
        setField(term147991, term147991.getClass(), "key3", null);
        setField(term147991, term147991.getClass(), "value1", null);
        setFloatField(term147992, term147992.getClass(), "loadFactor", 0.0F);
        setIntField(term147992, term147992.getClass(), "size", 0);
        setField(term147992, term147992.getClass(), "data", null);
        setIntField(term147992, term147992.getClass(), "threshold", 0);
        setIntField(term147992, term147992.getClass(), "modCount", 0);
        setField(term147992, term147992.getClass(), "entrySet", null);
        setField(term147992, term147992.getClass(), "keySet", null);
        setField(term147992, term147992.getClass(), "values", null);
        setField(term147992, term147992.getClass(), "keySet", null);
        setField(term147992, term147992.getClass(), "values", null);
        setField(term147991, term147991.getClass(), "value2", term147992);
        setField(term147991, term147991.getClass(), "value3", null);
        setFloatField(term147993, term147993.getClass(), "loadFactor", 0.0F);
        setIntField(term147993, term147993.getClass(), "size", 0);
        setField(term147993, term147993.getClass(), "data", null);
        setIntField(term147993, term147993.getClass(), "threshold", 0);
        setIntField(term147993, term147993.getClass(), "modCount", 0);
        setField(term147993, term147993.getClass(), "entrySet", null);
        setField(term147993, term147993.getClass(), "keySet", null);
        setField(term147993, term147993.getClass(), "values", null);
        setField(term147993, term147993.getClass(), "keySet", null);
        setField(term147993, term147993.getClass(), "values", null);
        setField(term147991, term147991.getClass(), "delegateMap", term147993);
        setField(term147988, term147988.getClass(), "value2", term147991);
        setField(term147988, term147988.getClass(), "value3", null);
        setField(term147988, term147988.getClass(), "delegateMap", null);
        HashMap term147995 = new HashMap();
        term147994 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147996 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term147997 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term147994, term147994.getClass(), "size", 2);
        setIntField(term147994, term147994.getClass(), "hash1", 0);
        setIntField(term147994, term147994.getClass(), "hash2", 0);
        setIntField(term147994, term147994.getClass(), "hash3", 0);
        setField(term147994, term147994.getClass(), "key1", null);
        setField(term147994, term147994.getClass(), "key2", term147995);
        setField(term147994, term147994.getClass(), "key3", null);
        setField(term147994, term147994.getClass(), "value1", null);
        setFloatField(term147996, term147996.getClass(), "loadFactor", 0.0F);
        setIntField(term147996, term147996.getClass(), "size", 0);
        setField(term147996, term147996.getClass(), "data", null);
        setIntField(term147996, term147996.getClass(), "threshold", 0);
        setIntField(term147996, term147996.getClass(), "modCount", 0);
        setField(term147996, term147996.getClass(), "entrySet", null);
        setField(term147996, term147996.getClass(), "keySet", null);
        setField(term147996, term147996.getClass(), "values", null);
        setField(term147996, term147996.getClass(), "keySet", null);
        setField(term147996, term147996.getClass(), "values", null);
        setField(term147994, term147994.getClass(), "value2", term147996);
        setField(term147994, term147994.getClass(), "value3", null);
        setFloatField(term147997, term147997.getClass(), "loadFactor", 0.0F);
        setIntField(term147997, term147997.getClass(), "size", 0);
        setField(term147997, term147997.getClass(), "data", null);
        setIntField(term147997, term147997.getClass(), "threshold", 0);
        setIntField(term147997, term147997.getClass(), "modCount", 0);
        setField(term147997, term147997.getClass(), "entrySet", null);
        setField(term147997, term147997.getClass(), "keySet", null);
        setField(term147997, term147997.getClass(), "values", null);
        setField(term147997, term147997.getClass(), "keySet", null);
        setField(term147997, term147997.getClass(), "values", null);
        setField(term147994, term147994.getClass(), "delegateMap", term147997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term147794;
        Object retValue = callMethod(klass, "equals", argTypes, term147268, args);
        assertTrue(recursiveEquals(term147268, term147988));
        assertTrue(recursiveEquals(term147794, term147994));
        assertTrue(recursiveEquals(retValue, false));
    }

};
