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

public class Flat3Map_put_1944740725598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124981;
     Object term125029;
     Object term125679;
     Object term125686;

    public Flat3Map_put_1944740725598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124981 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term124981, term124981.getClass(), "delegateMap", null);
        setIntField(term124981, term124981.getClass(), "size", 3);
        term125029 = newInstance(Class.forName("java.util.Collections"));
        term125679 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125680 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term125681 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term125682 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term125683 = newInstance(Class.forName("java.util.Collections"));
        Object term125684 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term125685 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term125679, term125679.getClass(), "size", 0);
        setIntField(term125679, term125679.getClass(), "hash1", 0);
        setIntField(term125679, term125679.getClass(), "hash2", 0);
        setIntField(term125679, term125679.getClass(), "hash3", 0);
        setField(term125679, term125679.getClass(), "key1", null);
        setField(term125679, term125679.getClass(), "key2", null);
        setField(term125679, term125679.getClass(), "key3", null);
        setField(term125679, term125679.getClass(), "value1", null);
        setField(term125679, term125679.getClass(), "value2", null);
        setField(term125679, term125679.getClass(), "value3", null);
        setFloatField(term125680, term125680.getClass(), "loadFactor", 0.75F);
        setIntField(term125680, term125680.getClass(), "size", 2);
        setField(term125682, term125682.getClass(), "next", null);
        setField(term125682, term125682.getClass(), "key", term125683);
        setField(term125682, term125682.getClass(), "value", null);
        setElement(term125681, 3, term125682);
        setField(term125684, term125684.getClass(), "next", null);
        setField(term125684, term125684.getClass(), "key", term125685);
        setField(term125684, term125684.getClass(), "value", null);
        setElement(term125681, 5, term125684);
        setField(term125680, term125680.getClass(), "data", term125681);
        setIntField(term125680, term125680.getClass(), "threshold", 12);
        setIntField(term125680, term125680.getClass(), "modCount", 2);
        setField(term125680, term125680.getClass(), "entrySet", null);
        setField(term125680, term125680.getClass(), "keySet", null);
        setField(term125680, term125680.getClass(), "values", null);
        setField(term125680, term125680.getClass(), "keySet", null);
        setField(term125680, term125680.getClass(), "values", null);
        setField(term125679, term125679.getClass(), "delegateMap", term125680);
        term125686 = newInstance(Class.forName("java.util.Collections"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term125029;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term124981, args);
        assertTrue(recursiveEquals(term124981, term125679));
        assertTrue(recursiveEquals(term125029, term125686));
        assertTrue(recursiveEquals(retValue, null));
    }

};


