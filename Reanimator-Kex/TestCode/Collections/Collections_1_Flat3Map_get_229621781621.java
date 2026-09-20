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

public class Flat3Map_get_229621781621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120186;
     Object term120408;
     Object term120750;
     Object term120753;

    public Flat3Map_get_229621781621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120186 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120224 = newInstance(Class.forName("java.lang.Object"));
        Object term120316 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term120186, term120186.getClass(), "delegateMap", null);
        setIntField(term120186, term120186.getClass(), "size", 2);
        setIntField(term120186, term120186.getClass(), "hash2", 0);
        setField(term120186, term120186.getClass(), "key2", term120224);
        setIntField(term120186, term120186.getClass(), "hash1", 0);
        setField(term120316, term120316.getClass(), "delegateMap", null);
        setIntField(term120316, term120316.getClass(), "size", 2);
        setField(term120186, term120186.getClass(), "key1", term120316);
        term120408 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120518 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term120408, term120408.getClass(), "delegateMap", null);
        setIntField(term120408, term120408.getClass(), "size", 2);
        setIntField(term120408, term120408.getClass(), "hash2", 0);
        setField(term120408, term120408.getClass(), "value2", null);
        setIntField(term120408, term120408.getClass(), "hash1", 0);
        setField(term120408, term120408.getClass(), "value1", null);
        setField(term120408, term120408.getClass(), "key2", term120518);
        term120750 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120751 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120752 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term120750, term120750.getClass(), "size", 2);
        setIntField(term120750, term120750.getClass(), "hash1", 0);
        setIntField(term120750, term120750.getClass(), "hash2", 0);
        setIntField(term120750, term120750.getClass(), "hash3", 0);
        setIntField(term120751, term120751.getClass(), "size", 2);
        setIntField(term120751, term120751.getClass(), "hash1", 0);
        setIntField(term120751, term120751.getClass(), "hash2", 0);
        setIntField(term120751, term120751.getClass(), "hash3", 0);
        setField(term120751, term120751.getClass(), "key1", null);
        setField(term120751, term120751.getClass(), "key2", null);
        setField(term120751, term120751.getClass(), "key3", null);
        setField(term120751, term120751.getClass(), "value1", null);
        setField(term120751, term120751.getClass(), "value2", null);
        setField(term120751, term120751.getClass(), "value3", null);
        setField(term120751, term120751.getClass(), "delegateMap", null);
        setField(term120750, term120750.getClass(), "key1", term120751);
        setField(term120750, term120750.getClass(), "key2", term120752);
        setField(term120750, term120750.getClass(), "key3", null);
        setField(term120750, term120750.getClass(), "value1", null);
        setField(term120750, term120750.getClass(), "value2", null);
        setField(term120750, term120750.getClass(), "value3", null);
        setField(term120750, term120750.getClass(), "delegateMap", null);
        term120753 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120754 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term120753, term120753.getClass(), "size", 2);
        setIntField(term120753, term120753.getClass(), "hash1", 0);
        setIntField(term120753, term120753.getClass(), "hash2", 0);
        setIntField(term120753, term120753.getClass(), "hash3", 0);
        setField(term120753, term120753.getClass(), "key1", null);
        setFloatField(term120754, term120754.getClass(), "loadFactor", 0.0F);
        setIntField(term120754, term120754.getClass(), "size", 0);
        setField(term120754, term120754.getClass(), "data", null);
        setIntField(term120754, term120754.getClass(), "threshold", 0);
        setIntField(term120754, term120754.getClass(), "modCount", 0);
        setField(term120754, term120754.getClass(), "entrySet", null);
        setField(term120754, term120754.getClass(), "keySet", null);
        setField(term120754, term120754.getClass(), "values", null);
        setField(term120754, term120754.getClass(), "keySet", null);
        setField(term120754, term120754.getClass(), "values", null);
        setField(term120753, term120753.getClass(), "key2", term120754);
        setField(term120753, term120753.getClass(), "key3", null);
        setField(term120753, term120753.getClass(), "value1", null);
        setField(term120753, term120753.getClass(), "value2", null);
        setField(term120753, term120753.getClass(), "value3", null);
        setField(term120753, term120753.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term120408;
        Object retValue = callMethod(klass, "get", argTypes, term120186, args);
        assertTrue(recursiveEquals(term120186, term120750));
        assertTrue(recursiveEquals(term120408, term120753));
        assertTrue(recursiveEquals(retValue, null));
    }

};
