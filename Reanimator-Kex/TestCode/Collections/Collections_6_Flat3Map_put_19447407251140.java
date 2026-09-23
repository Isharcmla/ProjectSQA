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

public class Flat3Map_put_19447407251140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344723;
     Object term345854;
     Object term345860;

    public Flat3Map_put_19447407251140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344723 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term344770 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term344723, term344723.getClass(), "delegateMap", null);
        setIntField(term344723, term344723.getClass(), "size", 3);
        setIntField(term344723, term344723.getClass(), "hash3", 0);
        setField(term344723, term344723.getClass(), "value3", null);
        setIntField(term344723, term344723.getClass(), "hash2", 0);
        setIntField(term344770, term344770.getClass(), "size", 0);
        setField(term344723, term344723.getClass(), "value2", term344770);
        setIntField(term344723, term344723.getClass(), "hash1", 0);
        setField(term344723, term344723.getClass(), "value1", null);
        term345854 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term345855 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term345856 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term345857 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term345858 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term345859 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term345854, term345854.getClass(), "size", 0);
        setIntField(term345854, term345854.getClass(), "hash1", 0);
        setIntField(term345854, term345854.getClass(), "hash2", 0);
        setIntField(term345854, term345854.getClass(), "hash3", 0);
        setField(term345854, term345854.getClass(), "key1", null);
        setField(term345854, term345854.getClass(), "key2", null);
        setField(term345854, term345854.getClass(), "key3", null);
        setField(term345854, term345854.getClass(), "value1", null);
        setField(term345854, term345854.getClass(), "value2", null);
        setField(term345854, term345854.getClass(), "value3", null);
        setFloatField(term345855, term345855.getClass(), "loadFactor", 0.75F);
        setIntField(term345855, term345855.getClass(), "size", 2);
        setField(term345857, term345857.getClass(), "next", null);
        setField(term345857, term345857.getClass(), "key", term345854);
        setField(term345857, term345857.getClass(), "value", null);
        setElement(term345856, 0, term345857);
        setField(term345858, term345858.getClass(), "next", null);
        setField(term345858, term345858.getClass(), "key", term345859);
        setField(term345858, term345858.getClass(), "value", null);
        setElement(term345856, 6, term345858);
        setField(term345855, term345855.getClass(), "data", term345856);
        setIntField(term345855, term345855.getClass(), "threshold", 12);
        setIntField(term345855, term345855.getClass(), "modCount", 2);
        setField(term345855, term345855.getClass(), "entrySet", null);
        setField(term345855, term345855.getClass(), "keySet", null);
        setField(term345855, term345855.getClass(), "values", null);
        setField(term345855, term345855.getClass(), "keySet", null);
        setField(term345855, term345855.getClass(), "values", null);
        setField(term345854, term345854.getClass(), "delegateMap", term345855);
        term345860 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term345861 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term345862 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term345863 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term345864 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term345865 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term345860, term345860.getClass(), "size", 0);
        setIntField(term345860, term345860.getClass(), "hash1", 0);
        setIntField(term345860, term345860.getClass(), "hash2", 0);
        setIntField(term345860, term345860.getClass(), "hash3", 0);
        setField(term345860, term345860.getClass(), "key1", null);
        setField(term345860, term345860.getClass(), "key2", null);
        setField(term345860, term345860.getClass(), "key3", null);
        setField(term345860, term345860.getClass(), "value1", null);
        setField(term345860, term345860.getClass(), "value2", null);
        setField(term345860, term345860.getClass(), "value3", null);
        setFloatField(term345861, term345861.getClass(), "loadFactor", 0.75F);
        setIntField(term345861, term345861.getClass(), "size", 2);
        setField(term345863, term345863.getClass(), "next", null);
        setField(term345863, term345863.getClass(), "key", term345860);
        setField(term345863, term345863.getClass(), "value", null);
        setElement(term345862, 0, term345863);
        setField(term345864, term345864.getClass(), "next", null);
        setField(term345864, term345864.getClass(), "key", term345865);
        setField(term345864, term345864.getClass(), "value", null);
        setElement(term345862, 6, term345864);
        setField(term345861, term345861.getClass(), "data", term345862);
        setIntField(term345861, term345861.getClass(), "threshold", 12);
        setIntField(term345861, term345861.getClass(), "modCount", 2);
        setField(term345861, term345861.getClass(), "entrySet", null);
        setField(term345861, term345861.getClass(), "keySet", null);
        setField(term345861, term345861.getClass(), "values", null);
        setField(term345861, term345861.getClass(), "keySet", null);
        setField(term345861, term345861.getClass(), "values", null);
        setField(term345860, term345860.getClass(), "delegateMap", term345861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term344723;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term344723, args);
        assertTrue(recursiveEquals(term344723, term345854));
        assertTrue(recursiveEquals(term344723, term345860));
        assertTrue(recursiveEquals(retValue, null));
    }

};


