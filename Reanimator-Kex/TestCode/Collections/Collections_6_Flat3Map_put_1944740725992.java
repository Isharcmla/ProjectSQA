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

public class Flat3Map_put_1944740725992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276820;
     Object term277410;
     Object term278774;

    public Flat3Map_put_1944740725992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276820 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term276912 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term277004 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term277114 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term277208 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term277318 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term276820, term276820.getClass(), "delegateMap", null);
        setIntField(term276820, term276820.getClass(), "size", 3);
        setIntField(term276820, term276820.getClass(), "hash3", -35708928);
        setField(term276912, term276912.getClass(), "delegateMap", null);
        setIntField(term276912, term276912.getClass(), "size", 3);
        setField(term277004, term277004.getClass(), "delegateMap", null);
        setIntField(term277004, term277004.getClass(), "size", 0);
        setField(term276912, term276912.getClass(), "key3", term277004);
        setField(term276912, term276912.getClass(), "key2", null);
        setField(term276912, term276912.getClass(), "value2", null);
        setIntField(term276912, term276912.getClass(), "hash3", -1065353216);
        setField(term276912, term276912.getClass(), "value3", null);
        setIntField(term276912, term276912.getClass(), "hash2", 1553956864);
        setIntField(term276912, term276912.getClass(), "hash1", 1210056704);
        setIntField(term277114, term277114.getClass(), "size", 0);
        setField(term276912, term276912.getClass(), "key1", term277114);
        setField(term276912, term276912.getClass(), "value1", null);
        setField(term276820, term276820.getClass(), "key3", term276912);
        setIntField(term276820, term276820.getClass(), "hash2", -35708928);
        setField(term276820, term276820.getClass(), "key2", null);
        setIntField(term276820, term276820.getClass(), "hash1", -35708928);
        setField(term276820, term276820.getClass(), "key1", null);
        setField(term276820, term276820.getClass(), "value3", term277208);
        setField(term276820, term276820.getClass(), "value2", null);
        setField(term276820, term276820.getClass(), "value1", term277318);
        term277410 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term277502 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term277594 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term277410, term277410.getClass(), "delegateMap", null);
        setIntField(term277410, term277410.getClass(), "size", 3);
        setIntField(term277410, term277410.getClass(), "hash3", 1010302976);
        setField(term277410, term277410.getClass(), "value3", null);
        setIntField(term277410, term277410.getClass(), "hash2", -2134441984);
        setField(term277410, term277410.getClass(), "value2", null);
        setIntField(term277410, term277410.getClass(), "hash1", 1088430080);
        setField(term277410, term277410.getClass(), "value1", null);
        setField(term277410, term277410.getClass(), "key3", null);
        setField(term277502, term277502.getClass(), "delegateMap", null);
        setIntField(term277502, term277502.getClass(), "size", 0);
        setField(term277410, term277410.getClass(), "key2", term277502);
        setField(term277594, term277594.getClass(), "delegateMap", null);
        setIntField(term277594, term277594.getClass(), "size", 1);
        setIntField(term277594, term277594.getClass(), "hash1", 0);
        setField(term277594, term277594.getClass(), "value1", null);
        setField(term277410, term277410.getClass(), "key1", term277594);
        term278774 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term278775 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term278776 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term278777 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term278778 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term278779 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term278780 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term278781 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term278782 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term278783 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term278774, term278774.getClass(), "size", 0);
        setIntField(term278774, term278774.getClass(), "hash1", 0);
        setIntField(term278774, term278774.getClass(), "hash2", 0);
        setIntField(term278774, term278774.getClass(), "hash3", -8130816);
        setField(term278774, term278774.getClass(), "key1", null);
        setField(term278774, term278774.getClass(), "key2", null);
        setField(term278774, term278774.getClass(), "key3", null);
        setField(term278774, term278774.getClass(), "value1", null);
        setField(term278774, term278774.getClass(), "value2", null);
        setField(term278774, term278774.getClass(), "value3", null);
        setFloatField(term278775, term278775.getClass(), "loadFactor", 0.75F);
        setIntField(term278775, term278775.getClass(), "size", 3);
        setField(term278778, term278778.getClass(), "next", null);
        setIntField(term278779, term278779.getClass(), "size", 0);
        setIntField(term278779, term278779.getClass(), "hash1", 0);
        setIntField(term278779, term278779.getClass(), "hash2", 0);
        setIntField(term278779, term278779.getClass(), "hash3", 0);
        setField(term278779, term278779.getClass(), "key1", null);
        setField(term278779, term278779.getClass(), "key2", null);
        setField(term278779, term278779.getClass(), "key3", null);
        setField(term278779, term278779.getClass(), "value1", null);
        setField(term278779, term278779.getClass(), "value2", null);
        setField(term278779, term278779.getClass(), "value3", null);
        setField(term278779, term278779.getClass(), "delegateMap", term278775);
        setField(term278778, term278778.getClass(), "key", term278779);
        setField(term278778, term278778.getClass(), "value", null);
        setField(term278777, term278777.getClass(), "next", term278778);
        setIntField(term278780, term278780.getClass(), "size", 3);
        setIntField(term278780, term278780.getClass(), "hash1", 0);
        setIntField(term278780, term278780.getClass(), "hash2", 0);
        setIntField(term278780, term278780.getClass(), "hash3", 0);
        setField(term278780, term278780.getClass(), "key1", null);
        setField(term278780, term278780.getClass(), "key2", null);
        setField(term278780, term278780.getClass(), "key3", null);
        setField(term278781, term278781.getClass(), "header", null);
        setFloatField(term278781, term278781.getClass(), "loadFactor", 0.0F);
        setIntField(term278781, term278781.getClass(), "size", 0);
        setField(term278781, term278781.getClass(), "data", null);
        setIntField(term278781, term278781.getClass(), "threshold", 0);
        setIntField(term278781, term278781.getClass(), "modCount", 0);
        setField(term278781, term278781.getClass(), "entrySet", null);
        setField(term278781, term278781.getClass(), "keySet", null);
        setField(term278781, term278781.getClass(), "values", null);
        setField(term278781, term278781.getClass(), "keySet", null);
        setField(term278781, term278781.getClass(), "values", null);
        setField(term278780, term278780.getClass(), "value1", term278781);
        setField(term278780, term278780.getClass(), "value2", null);
        setField(term278780, term278780.getClass(), "value3", null);
        setField(term278780, term278780.getClass(), "delegateMap", null);
        setField(term278777, term278777.getClass(), "key", term278780);
        setField(term278777, term278777.getClass(), "value", null);
        setElement(term278776, 0, term278777);
        setField(term278782, term278782.getClass(), "next", null);
        setField(term278782, term278782.getClass(), "key", term278783);
        setField(term278782, term278782.getClass(), "value", null);
        setElement(term278776, 5, term278782);
        setField(term278775, term278775.getClass(), "data", term278776);
        setIntField(term278775, term278775.getClass(), "threshold", 12);
        setIntField(term278775, term278775.getClass(), "modCount", 3);
        setField(term278775, term278775.getClass(), "entrySet", null);
        setField(term278775, term278775.getClass(), "keySet", null);
        setField(term278775, term278775.getClass(), "values", null);
        setField(term278775, term278775.getClass(), "keySet", null);
        setField(term278775, term278775.getClass(), "values", null);
        setField(term278774, term278774.getClass(), "delegateMap", term278775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term277410;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term276820, args);
        assertTrue(recursiveEquals(term276820, term278774));
        assertTrue(recursiveEquals(term277410, 12));
        assertTrue(recursiveEquals(retValue, null));
    }

};


