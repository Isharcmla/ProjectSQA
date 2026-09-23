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
import java.util.HashMap;

public class Flat3Map_put_1944740725512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96728;
     Object term97008;
     Object term97616;
     Object term97624;

    public Flat3Map_put_1944740725512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term96868 = new HashMap();
        HashMap term96916 = new HashMap();
        term96728 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term96820 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term96728, term96728.getClass(), "delegateMap", null);
        setIntField(term96728, term96728.getClass(), "size", 3);
        setIntField(term96728, term96728.getClass(), "hash3", 0);
        setField(term96820, term96820.getClass(), "delegateMap", null);
        setIntField(term96820, term96820.getClass(), "size", 3);
        setField(term96820, term96820.getClass(), "key3", term96868);
        setField(term96820, term96820.getClass(), "key2", null);
        setField(term96820, term96820.getClass(), "value2", term96916);
        setField(term96728, term96728.getClass(), "key3", term96820);
        setIntField(term96728, term96728.getClass(), "hash2", -1);
        term97008 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term97008, term97008.getClass(), "delegateMap", null);
        setIntField(term97008, term97008.getClass(), "size", 3);
        setIntField(term97008, term97008.getClass(), "hash3", 0);
        setField(term97008, term97008.getClass(), "value3", null);
        setIntField(term97008, term97008.getClass(), "hash2", 0);
        setField(term97008, term97008.getClass(), "value2", null);
        setIntField(term97008, term97008.getClass(), "hash1", 0);
        setField(term97008, term97008.getClass(), "value1", null);
        setField(term97008, term97008.getClass(), "key3", null);
        term97616 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term97617 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term97618 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term97619 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term97620 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term97621 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term97622 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term97623 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term97616, term97616.getClass(), "size", 0);
        setIntField(term97616, term97616.getClass(), "hash1", 0);
        setIntField(term97616, term97616.getClass(), "hash2", 0);
        setIntField(term97616, term97616.getClass(), "hash3", 0);
        setField(term97616, term97616.getClass(), "key1", null);
        setField(term97616, term97616.getClass(), "key2", null);
        setField(term97616, term97616.getClass(), "key3", null);
        setField(term97616, term97616.getClass(), "value1", null);
        setField(term97616, term97616.getClass(), "value2", null);
        setField(term97616, term97616.getClass(), "value3", null);
        setFloatField(term97617, term97617.getClass(), "loadFactor", 0.75F);
        setIntField(term97617, term97617.getClass(), "size", 3);
        setField(term97620, term97620.getClass(), "next", null);
        setField(term97620, term97620.getClass(), "key", null);
        setField(term97620, term97620.getClass(), "value", null);
        setField(term97619, term97619.getClass(), "next", term97620);
        setIntField(term97621, term97621.getClass(), "size", 3);
        setIntField(term97621, term97621.getClass(), "hash1", 0);
        setIntField(term97621, term97621.getClass(), "hash2", 0);
        setIntField(term97621, term97621.getClass(), "hash3", 0);
        setField(term97621, term97621.getClass(), "key1", null);
        setField(term97621, term97621.getClass(), "key2", null);
        setField(term97621, term97621.getClass(), "key3", null);
        setField(term97621, term97621.getClass(), "value1", null);
        setField(term97621, term97621.getClass(), "value2", null);
        setField(term97621, term97621.getClass(), "value3", null);
        setField(term97621, term97621.getClass(), "delegateMap", null);
        setField(term97619, term97619.getClass(), "key", term97621);
        setField(term97619, term97619.getClass(), "value", null);
        setElement(term97618, 0, term97619);
        setField(term97622, term97622.getClass(), "next", null);
        setField(term97622, term97622.getClass(), "key", term97623);
        setField(term97622, term97622.getClass(), "value", null);
        setElement(term97618, 5, term97622);
        setField(term97617, term97617.getClass(), "data", term97618);
        setIntField(term97617, term97617.getClass(), "threshold", 12);
        setIntField(term97617, term97617.getClass(), "modCount", 3);
        setField(term97617, term97617.getClass(), "entrySet", null);
        setField(term97617, term97617.getClass(), "keySet", null);
        setField(term97617, term97617.getClass(), "values", null);
        setField(term97617, term97617.getClass(), "keySet", null);
        setField(term97617, term97617.getClass(), "values", null);
        setField(term97616, term97616.getClass(), "delegateMap", term97617);
        term97624 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term97624, term97624.getClass(), "size", 3);
        setIntField(term97624, term97624.getClass(), "hash1", 0);
        setIntField(term97624, term97624.getClass(), "hash2", 0);
        setIntField(term97624, term97624.getClass(), "hash3", 0);
        setField(term97624, term97624.getClass(), "key1", null);
        setField(term97624, term97624.getClass(), "key2", null);
        setField(term97624, term97624.getClass(), "key3", null);
        setField(term97624, term97624.getClass(), "value1", null);
        setField(term97624, term97624.getClass(), "value2", null);
        setField(term97624, term97624.getClass(), "value3", null);
        setField(term97624, term97624.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term97008;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term96728, args);
        assertTrue(recursiveEquals(term96728, term97616));
        assertTrue(recursiveEquals(term97008, term97624));
        assertTrue(recursiveEquals(retValue, null));
    }

};


