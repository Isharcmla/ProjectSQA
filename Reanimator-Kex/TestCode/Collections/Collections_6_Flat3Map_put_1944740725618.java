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

public class Flat3Map_put_1944740725618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131451;
     Object term132937;
     Object term132944;

    public Flat3Map_put_1944740725618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131451 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term131498 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term131451, term131451.getClass(), "delegateMap", null);
        setIntField(term131451, term131451.getClass(), "size", 3);
        setIntField(term131451, term131451.getClass(), "hash3", 0);
        setField(term131451, term131451.getClass(), "value3", null);
        setIntField(term131451, term131451.getClass(), "hash2", 0);
        setField(term131451, term131451.getClass(), "value2", null);
        setIntField(term131451, term131451.getClass(), "hash1", 0);
        setIntField(term131498, term131498.getClass(), "size", 0);
        setField(term131451, term131451.getClass(), "value1", term131498);
        term132937 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term132938 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term132939 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term132940 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term132941 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term132942 = newInstance(Class.forName("java.lang.Object"));
        Object term132943 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setIntField(term132937, term132937.getClass(), "size", 0);
        setIntField(term132937, term132937.getClass(), "hash1", 0);
        setIntField(term132937, term132937.getClass(), "hash2", 0);
        setIntField(term132937, term132937.getClass(), "hash3", 0);
        setField(term132937, term132937.getClass(), "key1", null);
        setField(term132937, term132937.getClass(), "key2", null);
        setField(term132937, term132937.getClass(), "key3", null);
        setField(term132937, term132937.getClass(), "value1", null);
        setField(term132937, term132937.getClass(), "value2", null);
        setField(term132937, term132937.getClass(), "value3", null);
        setFloatField(term132938, term132938.getClass(), "loadFactor", 0.75F);
        setIntField(term132938, term132938.getClass(), "size", 2);
        setField(term132940, term132940.getClass(), "next", null);
        setField(term132940, term132940.getClass(), "key", term132937);
        setField(term132940, term132940.getClass(), "value", null);
        setElement(term132939, 0, term132940);
        setField(term132941, term132941.getClass(), "next", null);
        setField(term132941, term132941.getClass(), "key", term132942);
        setField(term132943, term132943.getClass(), "header", null);
        setFloatField(term132943, term132943.getClass(), "loadFactor", 0.0F);
        setIntField(term132943, term132943.getClass(), "size", 0);
        setField(term132943, term132943.getClass(), "data", null);
        setIntField(term132943, term132943.getClass(), "threshold", 0);
        setIntField(term132943, term132943.getClass(), "modCount", 0);
        setField(term132943, term132943.getClass(), "entrySet", null);
        setField(term132943, term132943.getClass(), "keySet", null);
        setField(term132943, term132943.getClass(), "values", null);
        setField(term132943, term132943.getClass(), "keySet", null);
        setField(term132943, term132943.getClass(), "values", null);
        setField(term132941, term132941.getClass(), "value", term132943);
        setElement(term132939, 5, term132941);
        setField(term132938, term132938.getClass(), "data", term132939);
        setIntField(term132938, term132938.getClass(), "threshold", 12);
        setIntField(term132938, term132938.getClass(), "modCount", 2);
        setField(term132938, term132938.getClass(), "entrySet", null);
        setField(term132938, term132938.getClass(), "keySet", null);
        setField(term132938, term132938.getClass(), "values", null);
        setField(term132938, term132938.getClass(), "keySet", null);
        setField(term132938, term132938.getClass(), "values", null);
        setField(term132937, term132937.getClass(), "delegateMap", term132938);
        term132944 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term132945 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term132946 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term132947 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term132948 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term132949 = newInstance(Class.forName("java.lang.Object"));
        Object term132950 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setIntField(term132944, term132944.getClass(), "size", 0);
        setIntField(term132944, term132944.getClass(), "hash1", 0);
        setIntField(term132944, term132944.getClass(), "hash2", 0);
        setIntField(term132944, term132944.getClass(), "hash3", 0);
        setField(term132944, term132944.getClass(), "key1", null);
        setField(term132944, term132944.getClass(), "key2", null);
        setField(term132944, term132944.getClass(), "key3", null);
        setField(term132944, term132944.getClass(), "value1", null);
        setField(term132944, term132944.getClass(), "value2", null);
        setField(term132944, term132944.getClass(), "value3", null);
        setFloatField(term132945, term132945.getClass(), "loadFactor", 0.75F);
        setIntField(term132945, term132945.getClass(), "size", 2);
        setField(term132947, term132947.getClass(), "next", null);
        setField(term132947, term132947.getClass(), "key", term132944);
        setField(term132947, term132947.getClass(), "value", null);
        setElement(term132946, 0, term132947);
        setField(term132948, term132948.getClass(), "next", null);
        setField(term132948, term132948.getClass(), "key", term132949);
        setField(term132950, term132950.getClass(), "header", null);
        setFloatField(term132950, term132950.getClass(), "loadFactor", 0.0F);
        setIntField(term132950, term132950.getClass(), "size", 0);
        setField(term132950, term132950.getClass(), "data", null);
        setIntField(term132950, term132950.getClass(), "threshold", 0);
        setIntField(term132950, term132950.getClass(), "modCount", 0);
        setField(term132950, term132950.getClass(), "entrySet", null);
        setField(term132950, term132950.getClass(), "keySet", null);
        setField(term132950, term132950.getClass(), "values", null);
        setField(term132950, term132950.getClass(), "keySet", null);
        setField(term132950, term132950.getClass(), "values", null);
        setField(term132948, term132948.getClass(), "value", term132950);
        setElement(term132946, 5, term132948);
        setField(term132945, term132945.getClass(), "data", term132946);
        setIntField(term132945, term132945.getClass(), "threshold", 12);
        setIntField(term132945, term132945.getClass(), "modCount", 2);
        setField(term132945, term132945.getClass(), "entrySet", null);
        setField(term132945, term132945.getClass(), "keySet", null);
        setField(term132945, term132945.getClass(), "values", null);
        setField(term132945, term132945.getClass(), "keySet", null);
        setField(term132945, term132945.getClass(), "values", null);
        setField(term132944, term132944.getClass(), "delegateMap", term132945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term131451;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term131451, args);
        assertTrue(recursiveEquals(term131451, term132937));
        assertTrue(recursiveEquals(term131451, term132944));
        assertTrue(recursiveEquals(retValue, null));
    }

};


