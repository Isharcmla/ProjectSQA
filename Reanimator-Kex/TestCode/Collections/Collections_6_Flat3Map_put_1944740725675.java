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

public class Flat3Map_put_1944740725675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154416;
     Object term154782;
     Object term155625;
     Object term155635;

    public Flat3Map_put_1944740725675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154782 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term154782, term154782.getClass(), "delegateMap", null);
        setIntField(term154782, term154782.getClass(), "size", 3);
        setIntField(term154782, term154782.getClass(), "hash3", 0);
        setField(term154782, term154782.getClass(), "value3", null);
        setIntField(term154782, term154782.getClass(), "hash2", 0);
        setField(term154782, term154782.getClass(), "value2", null);
        setIntField(term154782, term154782.getClass(), "hash1", 0);
        setField(term154782, term154782.getClass(), "value1", null);
        Object[] term154249 = (Object[]) newArray("java.lang.Object", 3);
        Object term154646 = newInstance(Class.forName("java.lang.Object"));
        setElement(term154249, 0, term154249);
        setElement(term154249, 1, term154646);
        setElement(term154249, 2, term154249);
        Object term154684 = newInstance(Class.forName("java.lang.Object"));
        HashMap term154464 = new HashMap();
        ((HashMap) term154464).put(term154782, term154782);
        ((HashMap) term154464).put((Object)term154249, (Object)term154249);
        ((HashMap) term154464).put(term154684, term154684);
        term154416 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term154243 = (Object[]) newArray("java.lang.Object", 0);
        setField(term154416, term154416.getClass(), "delegateMap", null);
        setIntField(term154416, term154416.getClass(), "size", 3);
        setIntField(term154416, term154416.getClass(), "hash3", 0);
        setField(term154416, term154416.getClass(), "key3", null);
        setIntField(term154416, term154416.getClass(), "hash2", 0);
        setField(term154416, term154416.getClass(), "key2", term154243);
        setIntField(term154416, term154416.getClass(), "hash1", 0);
        setField(term154416, term154416.getClass(), "key1", term154464);
        term155625 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term155626 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term155627 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term155628 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term155629 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term155630 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term155631 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term155632 = newInstance(Class.forName("java.lang.Object"));
        Object term155633 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object[] term155634 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term155625, term155625.getClass(), "size", 0);
        setIntField(term155625, term155625.getClass(), "hash1", 0);
        setIntField(term155625, term155625.getClass(), "hash2", 0);
        setIntField(term155625, term155625.getClass(), "hash3", 0);
        setField(term155625, term155625.getClass(), "key1", null);
        setField(term155625, term155625.getClass(), "key2", null);
        setField(term155625, term155625.getClass(), "key3", null);
        setField(term155625, term155625.getClass(), "value1", null);
        setField(term155625, term155625.getClass(), "value2", null);
        setField(term155625, term155625.getClass(), "value3", null);
        setFloatField(term155626, term155626.getClass(), "loadFactor", 0.75F);
        setIntField(term155626, term155626.getClass(), "size", 4);
        setField(term155629, term155629.getClass(), "next", null);
        setField(term155629, term155629.getClass(), "key", null);
        setField(term155629, term155629.getClass(), "value", null);
        setField(term155628, term155628.getClass(), "next", term155629);
        setIntField(term155630, term155630.getClass(), "size", 3);
        setIntField(term155630, term155630.getClass(), "hash1", 0);
        setIntField(term155630, term155630.getClass(), "hash2", 0);
        setIntField(term155630, term155630.getClass(), "hash3", 0);
        setField(term155630, term155630.getClass(), "key1", null);
        setField(term155630, term155630.getClass(), "key2", null);
        setField(term155630, term155630.getClass(), "key3", null);
        setField(term155630, term155630.getClass(), "value1", null);
        setField(term155630, term155630.getClass(), "value2", null);
        setField(term155630, term155630.getClass(), "value3", null);
        setField(term155630, term155630.getClass(), "delegateMap", null);
        setField(term155628, term155628.getClass(), "key", term155630);
        setField(term155628, term155628.getClass(), "value", null);
        setElement(term155627, 0, term155628);
        setField(term155631, term155631.getClass(), "next", null);
        setField(term155631, term155631.getClass(), "key", term155632);
        setField(term155631, term155631.getClass(), "value", null);
        setElement(term155627, 5, term155631);
        setField(term155633, term155633.getClass(), "next", null);
        setField(term155633, term155633.getClass(), "key", term155634);
        setField(term155633, term155633.getClass(), "value", null);
        setElement(term155627, 9, term155633);
        setField(term155626, term155626.getClass(), "data", term155627);
        setIntField(term155626, term155626.getClass(), "threshold", 12);
        setIntField(term155626, term155626.getClass(), "modCount", 4);
        setField(term155626, term155626.getClass(), "entrySet", null);
        setField(term155626, term155626.getClass(), "keySet", null);
        setField(term155626, term155626.getClass(), "values", null);
        setField(term155626, term155626.getClass(), "keySet", null);
        setField(term155626, term155626.getClass(), "values", null);
        setField(term155625, term155625.getClass(), "delegateMap", term155626);
        term155635 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term155635, term155635.getClass(), "size", 3);
        setIntField(term155635, term155635.getClass(), "hash1", 0);
        setIntField(term155635, term155635.getClass(), "hash2", 0);
        setIntField(term155635, term155635.getClass(), "hash3", 0);
        setField(term155635, term155635.getClass(), "key1", null);
        setField(term155635, term155635.getClass(), "key2", null);
        setField(term155635, term155635.getClass(), "key3", null);
        setField(term155635, term155635.getClass(), "value1", null);
        setField(term155635, term155635.getClass(), "value2", null);
        setField(term155635, term155635.getClass(), "value3", null);
        setField(term155635, term155635.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term154782;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term154416, args);
        assertTrue(recursiveEquals(term154416, term155625));
        assertTrue(recursiveEquals(term154782, term155635));
        assertTrue(recursiveEquals(retValue, null));
    }

};


