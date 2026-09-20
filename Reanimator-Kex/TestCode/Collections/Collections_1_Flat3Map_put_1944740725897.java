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

public class Flat3Map_put_1944740725897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180775;
     Object term180957;
     Object term180960;

    public Flat3Map_put_1944740725897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180775 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term180821 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term180876 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term180775, term180775.getClass(), "delegateMap", null);
        setIntField(term180775, term180775.getClass(), "size", 1);
        setIntField(term180775, term180775.getClass(), "hash1", 0);
        setField(term180775, term180775.getClass(), "value1", null);
        setField(term180821, term180821.getClass(), "delegateMap", term180876);
        setField(term180775, term180775.getClass(), "key1", term180821);
        term180957 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term180958 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term180959 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term180957, term180957.getClass(), "size", 2);
        setIntField(term180957, term180957.getClass(), "hash1", 0);
        setIntField(term180957, term180957.getClass(), "hash2", 0);
        setIntField(term180957, term180957.getClass(), "hash3", 0);
        setIntField(term180958, term180958.getClass(), "size", 0);
        setIntField(term180958, term180958.getClass(), "hash1", 0);
        setIntField(term180958, term180958.getClass(), "hash2", 0);
        setIntField(term180958, term180958.getClass(), "hash3", 0);
        setField(term180958, term180958.getClass(), "key1", null);
        setField(term180958, term180958.getClass(), "key2", null);
        setField(term180958, term180958.getClass(), "key3", null);
        setField(term180958, term180958.getClass(), "value1", null);
        setField(term180958, term180958.getClass(), "value2", null);
        setField(term180958, term180958.getClass(), "value3", null);
        setFloatField(term180959, term180959.getClass(), "loadFactor", 0.0F);
        setIntField(term180959, term180959.getClass(), "size", 0);
        setField(term180959, term180959.getClass(), "data", null);
        setIntField(term180959, term180959.getClass(), "threshold", 0);
        setIntField(term180959, term180959.getClass(), "modCount", 0);
        setField(term180959, term180959.getClass(), "entrySet", null);
        setField(term180959, term180959.getClass(), "keySet", null);
        setField(term180959, term180959.getClass(), "values", null);
        setField(term180959, term180959.getClass(), "keySet", null);
        setField(term180959, term180959.getClass(), "values", null);
        setField(term180958, term180958.getClass(), "delegateMap", term180959);
        setField(term180957, term180957.getClass(), "key1", term180958);
        setField(term180957, term180957.getClass(), "key2", term180957);
        setField(term180957, term180957.getClass(), "key3", null);
        setField(term180957, term180957.getClass(), "value1", null);
        setField(term180957, term180957.getClass(), "value2", null);
        setField(term180957, term180957.getClass(), "value3", null);
        setField(term180957, term180957.getClass(), "delegateMap", null);
        term180960 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term180961 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term180962 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term180960, term180960.getClass(), "size", 2);
        setIntField(term180960, term180960.getClass(), "hash1", 0);
        setIntField(term180960, term180960.getClass(), "hash2", 0);
        setIntField(term180960, term180960.getClass(), "hash3", 0);
        setIntField(term180961, term180961.getClass(), "size", 0);
        setIntField(term180961, term180961.getClass(), "hash1", 0);
        setIntField(term180961, term180961.getClass(), "hash2", 0);
        setIntField(term180961, term180961.getClass(), "hash3", 0);
        setField(term180961, term180961.getClass(), "key1", null);
        setField(term180961, term180961.getClass(), "key2", null);
        setField(term180961, term180961.getClass(), "key3", null);
        setField(term180961, term180961.getClass(), "value1", null);
        setField(term180961, term180961.getClass(), "value2", null);
        setField(term180961, term180961.getClass(), "value3", null);
        setFloatField(term180962, term180962.getClass(), "loadFactor", 0.0F);
        setIntField(term180962, term180962.getClass(), "size", 0);
        setField(term180962, term180962.getClass(), "data", null);
        setIntField(term180962, term180962.getClass(), "threshold", 0);
        setIntField(term180962, term180962.getClass(), "modCount", 0);
        setField(term180962, term180962.getClass(), "entrySet", null);
        setField(term180962, term180962.getClass(), "keySet", null);
        setField(term180962, term180962.getClass(), "values", null);
        setField(term180962, term180962.getClass(), "keySet", null);
        setField(term180962, term180962.getClass(), "values", null);
        setField(term180961, term180961.getClass(), "delegateMap", term180962);
        setField(term180960, term180960.getClass(), "key1", term180961);
        setField(term180960, term180960.getClass(), "key2", term180960);
        setField(term180960, term180960.getClass(), "key3", null);
        setField(term180960, term180960.getClass(), "value1", null);
        setField(term180960, term180960.getClass(), "value2", null);
        setField(term180960, term180960.getClass(), "value3", null);
        setField(term180960, term180960.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term180775;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term180775, args);
        assertTrue(recursiveEquals(term180775, term180957));
        assertTrue(recursiveEquals(term180775, term180960));
        assertTrue(recursiveEquals(retValue, null));
    }

};
