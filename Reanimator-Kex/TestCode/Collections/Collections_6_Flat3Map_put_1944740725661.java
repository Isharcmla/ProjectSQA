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

public class Flat3Map_put_1944740725661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149132;
     Object term149484;
     Object term150007;
     Object term150016;

    public Flat3Map_put_1944740725661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149132 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term149224 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term148628 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object[] term148636 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term149262 = newInstance(Class.forName("java.lang.Object"));
        Object term149392 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term149132, term149132.getClass(), "delegateMap", null);
        setIntField(term149132, term149132.getClass(), "size", 3);
        setIntField(term149132, term149132.getClass(), "hash3", 785056514);
        setField(term149224, term149224.getClass(), "delegateMap", null);
        setIntField(term149224, term149224.getClass(), "size", 3);
        setField(term149224, term149224.getClass(), "key3", term148628);
        setField(term149224, term149224.getClass(), "key2", null);
        setField(term149224, term149224.getClass(), "value2", null);
        setIntField(term149224, term149224.getClass(), "hash3", -2146987992);
        setIntField(term149224, term149224.getClass(), "hash2", 14713105);
        setIntField(term149224, term149224.getClass(), "hash1", -1610506232);
        setField(term149224, term149224.getClass(), "key1", term148636);
        setField(term149224, term149224.getClass(), "value3", null);
        setField(term149224, term149224.getClass(), "value1", null);
        setField(term149132, term149132.getClass(), "key3", term149224);
        setIntField(term149132, term149132.getClass(), "hash2", 785056514);
        setField(term149132, term149132.getClass(), "key2", null);
        setIntField(term149132, term149132.getClass(), "hash1", 785056514);
        setField(term149132, term149132.getClass(), "key1", null);
        setField(term149132, term149132.getClass(), "value3", term149262);
        setField(term149132, term149132.getClass(), "value2", term149392);
        setField(term149132, term149132.getClass(), "value1", term148636);
        term149484 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term149576 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term149484, term149484.getClass(), "delegateMap", null);
        setIntField(term149484, term149484.getClass(), "size", 3);
        setIntField(term149484, term149484.getClass(), "hash3", -564068099);
        setField(term149484, term149484.getClass(), "value3", null);
        setIntField(term149484, term149484.getClass(), "hash2", 1179891);
        setField(term149484, term149484.getClass(), "value2", null);
        setIntField(term149484, term149484.getClass(), "hash1", 1347944722);
        setField(term149484, term149484.getClass(), "value1", null);
        setField(term149484, term149484.getClass(), "key3", null);
        setField(term149576, term149576.getClass(), "delegateMap", null);
        setIntField(term149576, term149576.getClass(), "size", 2);
        setIntField(term149576, term149576.getClass(), "hash2", 335618059);
        setField(term149576, term149576.getClass(), "value2", null);
        setIntField(term149576, term149576.getClass(), "hash1", 50611873);
        setField(term149576, term149576.getClass(), "value1", null);
        setField(term149484, term149484.getClass(), "key2", term149576);
        term150007 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term150008 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term150009 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term150010 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term150011 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term150012 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term150013 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term150014 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term150015 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term150007, term150007.getClass(), "size", 0);
        setIntField(term150007, term150007.getClass(), "hash1", 0);
        setIntField(term150007, term150007.getClass(), "hash2", 0);
        setIntField(term150007, term150007.getClass(), "hash3", 0);
        setField(term150007, term150007.getClass(), "key1", null);
        setField(term150007, term150007.getClass(), "key2", null);
        setField(term150007, term150007.getClass(), "key3", null);
        setField(term150007, term150007.getClass(), "value1", null);
        setField(term150007, term150007.getClass(), "value2", null);
        setField(term150007, term150007.getClass(), "value3", null);
        setFloatField(term150008, term150008.getClass(), "loadFactor", 0.75F);
        setIntField(term150008, term150008.getClass(), "size", 3);
        setField(term150011, term150011.getClass(), "next", null);
        setField(term150011, term150011.getClass(), "key", null);
        setField(term150011, term150011.getClass(), "value", null);
        setField(term150010, term150010.getClass(), "next", term150011);
        setIntField(term150012, term150012.getClass(), "size", 3);
        setIntField(term150012, term150012.getClass(), "hash1", 1347944722);
        setIntField(term150012, term150012.getClass(), "hash2", 1179891);
        setIntField(term150012, term150012.getClass(), "hash3", -564068099);
        setField(term150012, term150012.getClass(), "key1", null);
        setField(term150012, term150012.getClass(), "key2", null);
        setField(term150012, term150012.getClass(), "key3", null);
        setField(term150012, term150012.getClass(), "value1", null);
        setField(term150012, term150012.getClass(), "value2", null);
        setField(term150012, term150012.getClass(), "value3", null);
        setField(term150012, term150012.getClass(), "delegateMap", null);
        setField(term150010, term150010.getClass(), "key", term150012);
        setField(term150010, term150010.getClass(), "value", null);
        setElement(term150009, 5, term150010);
        setField(term150013, term150013.getClass(), "next", null);
        setIntField(term150014, term150014.getClass(), "size", 3);
        setIntField(term150014, term150014.getClass(), "hash1", -1610506232);
        setIntField(term150014, term150014.getClass(), "hash2", 14713105);
        setIntField(term150014, term150014.getClass(), "hash3", -2146987992);
        setField(term150014, term150014.getClass(), "key1", null);
        setField(term150014, term150014.getClass(), "key2", null);
        setField(term150014, term150014.getClass(), "key3", null);
        setField(term150014, term150014.getClass(), "value1", null);
        setField(term150014, term150014.getClass(), "value2", null);
        setField(term150014, term150014.getClass(), "value3", null);
        setField(term150014, term150014.getClass(), "delegateMap", null);
        setField(term150013, term150013.getClass(), "key", term150014);
        setField(term150013, term150013.getClass(), "value", term150015);
        setElement(term150009, 7, term150013);
        setField(term150008, term150008.getClass(), "data", term150009);
        setIntField(term150008, term150008.getClass(), "threshold", 12);
        setIntField(term150008, term150008.getClass(), "modCount", 3);
        setField(term150008, term150008.getClass(), "entrySet", null);
        setField(term150008, term150008.getClass(), "keySet", null);
        setField(term150008, term150008.getClass(), "values", null);
        setField(term150008, term150008.getClass(), "keySet", null);
        setField(term150008, term150008.getClass(), "values", null);
        setField(term150007, term150007.getClass(), "delegateMap", term150008);
        term150016 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term150016, term150016.getClass(), "size", 3);
        setIntField(term150016, term150016.getClass(), "hash1", 1347944722);
        setIntField(term150016, term150016.getClass(), "hash2", 1179891);
        setIntField(term150016, term150016.getClass(), "hash3", -564068099);
        setField(term150016, term150016.getClass(), "key1", null);
        setField(term150016, term150016.getClass(), "key2", null);
        setField(term150016, term150016.getClass(), "key3", null);
        setField(term150016, term150016.getClass(), "value1", null);
        setField(term150016, term150016.getClass(), "value2", null);
        setField(term150016, term150016.getClass(), "value3", null);
        setField(term150016, term150016.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term149484;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term149132, args);
        assertTrue(recursiveEquals(term149132, term150007));
        assertTrue(recursiveEquals(term149484, term150016));
        assertTrue(recursiveEquals(retValue, null));
    }

};


