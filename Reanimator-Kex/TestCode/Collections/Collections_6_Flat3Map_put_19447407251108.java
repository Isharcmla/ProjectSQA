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

public class Flat3Map_put_19447407251108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329983;
     Object term330483;
     Object term331610;
     Object term331620;

    public Flat3Map_put_19447407251108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329983 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term330075 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term330169 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term330299 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term330391 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term329983, term329983.getClass(), "delegateMap", null);
        setIntField(term329983, term329983.getClass(), "size", 3);
        setIntField(term329983, term329983.getClass(), "hash3", 475148570);
        setField(term329983, term329983.getClass(), "key3", null);
        setIntField(term329983, term329983.getClass(), "hash2", 475148570);
        setField(term329983, term329983.getClass(), "key2", null);
        setIntField(term329983, term329983.getClass(), "hash1", 475148570);
        setIntField(term330169, term330169.getClass(), "size", 0);
        setField(term330075, term330075.getClass(), "delegateMap", term330169);
        setField(term329983, term329983.getClass(), "key1", term330075);
        setField(term329983, term329983.getClass(), "value3", term330299);
        setField(term329983, term329983.getClass(), "value2", null);
        setField(term329983, term329983.getClass(), "value1", term330391);
        term330483 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term330577 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term330483, term330483.getClass(), "delegateMap", null);
        setIntField(term330483, term330483.getClass(), "size", 3);
        setIntField(term330483, term330483.getClass(), "hash3", 261734613);
        setField(term330483, term330483.getClass(), "value3", null);
        setIntField(term330483, term330483.getClass(), "hash2", -742379484);
        setField(term330483, term330483.getClass(), "value2", null);
        setIntField(term330483, term330483.getClass(), "hash1", 955793441);
        setIntField(term330577, term330577.getClass(), "size", 0);
        setField(term330483, term330483.getClass(), "value1", term330577);
        term331610 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term331611 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term331612 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term331613 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term331614 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term331615 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term331616 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term331617 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term331618 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term331619 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term331610, term331610.getClass(), "size", 0);
        setIntField(term331610, term331610.getClass(), "hash1", 0);
        setIntField(term331610, term331610.getClass(), "hash2", 0);
        setIntField(term331610, term331610.getClass(), "hash3", 0);
        setField(term331610, term331610.getClass(), "key1", null);
        setField(term331610, term331610.getClass(), "key2", null);
        setField(term331610, term331610.getClass(), "key3", null);
        setField(term331610, term331610.getClass(), "value1", null);
        setField(term331610, term331610.getClass(), "value2", null);
        setField(term331610, term331610.getClass(), "value3", null);
        setFloatField(term331611, term331611.getClass(), "loadFactor", 0.75F);
        setIntField(term331611, term331611.getClass(), "size", 3);
        setField(term331613, term331613.getClass(), "next", null);
        setIntField(term331614, term331614.getClass(), "size", 0);
        setIntField(term331614, term331614.getClass(), "hash1", 0);
        setIntField(term331614, term331614.getClass(), "hash2", 0);
        setIntField(term331614, term331614.getClass(), "hash3", 0);
        setField(term331614, term331614.getClass(), "key1", null);
        setField(term331614, term331614.getClass(), "key2", null);
        setField(term331614, term331614.getClass(), "key3", null);
        setField(term331614, term331614.getClass(), "value1", null);
        setField(term331614, term331614.getClass(), "value2", null);
        setField(term331614, term331614.getClass(), "value3", null);
        setField(term331614, term331614.getClass(), "delegateMap", null);
        setField(term331613, term331613.getClass(), "key", term331614);
        setIntField(term331615, term331615.getClass(), "size", 0);
        setIntField(term331615, term331615.getClass(), "hash1", 0);
        setIntField(term331615, term331615.getClass(), "hash2", 0);
        setIntField(term331615, term331615.getClass(), "hash3", 0);
        setField(term331615, term331615.getClass(), "key1", null);
        setField(term331615, term331615.getClass(), "key2", null);
        setField(term331615, term331615.getClass(), "key3", null);
        setField(term331615, term331615.getClass(), "value1", null);
        setField(term331615, term331615.getClass(), "value2", null);
        setField(term331615, term331615.getClass(), "value3", null);
        setField(term331615, term331615.getClass(), "delegateMap", null);
        setField(term331613, term331613.getClass(), "value", term331615);
        setElement(term331612, 0, term331613);
        setField(term331616, term331616.getClass(), "next", null);
        setIntField(term331617, term331617.getClass(), "size", 3);
        setIntField(term331617, term331617.getClass(), "hash1", 955793441);
        setIntField(term331617, term331617.getClass(), "hash2", -742379484);
        setIntField(term331617, term331617.getClass(), "hash3", 261734613);
        setField(term331617, term331617.getClass(), "key1", null);
        setField(term331617, term331617.getClass(), "key2", null);
        setField(term331617, term331617.getClass(), "key3", null);
        setField(term331617, term331617.getClass(), "value1", null);
        setField(term331617, term331617.getClass(), "value2", null);
        setField(term331617, term331617.getClass(), "value3", null);
        setField(term331617, term331617.getClass(), "delegateMap", null);
        setField(term331616, term331616.getClass(), "key", term331617);
        setField(term331616, term331616.getClass(), "value", null);
        setElement(term331612, 5, term331616);
        setField(term331618, term331618.getClass(), "next", null);
        setField(term331618, term331618.getClass(), "key", term331619);
        setField(term331618, term331618.getClass(), "value", null);
        setElement(term331612, 6, term331618);
        setField(term331611, term331611.getClass(), "data", term331612);
        setIntField(term331611, term331611.getClass(), "threshold", 12);
        setIntField(term331611, term331611.getClass(), "modCount", 3);
        setField(term331611, term331611.getClass(), "entrySet", null);
        setField(term331611, term331611.getClass(), "keySet", null);
        setField(term331611, term331611.getClass(), "values", null);
        setField(term331611, term331611.getClass(), "keySet", null);
        setField(term331611, term331611.getClass(), "values", null);
        setField(term331610, term331610.getClass(), "delegateMap", term331611);
        term331620 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term331620, term331620.getClass(), "size", 3);
        setIntField(term331620, term331620.getClass(), "hash1", 955793441);
        setIntField(term331620, term331620.getClass(), "hash2", -742379484);
        setIntField(term331620, term331620.getClass(), "hash3", 261734613);
        setField(term331620, term331620.getClass(), "key1", null);
        setField(term331620, term331620.getClass(), "key2", null);
        setField(term331620, term331620.getClass(), "key3", null);
        setField(term331620, term331620.getClass(), "value1", null);
        setField(term331620, term331620.getClass(), "value2", null);
        setField(term331620, term331620.getClass(), "value3", null);
        setField(term331620, term331620.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term330483;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term329983, args);
        assertTrue(recursiveEquals(term329983, term331610));
        assertTrue(recursiveEquals(term330483, term331620));
        assertTrue(recursiveEquals(retValue, null));
    }

};


