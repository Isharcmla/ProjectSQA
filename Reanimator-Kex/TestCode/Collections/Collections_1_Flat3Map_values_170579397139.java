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

public class Flat3Map_values_170579397139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262;
     Object term7953;
     Object term7936;

    public Flat3Map_values_170579397139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term267 = newInstance(Class.forName("java.lang.Object"));
        Object term268 = newInstance(Class.forName("java.lang.Object"));
        Object term269 = newInstance(Class.forName("java.lang.Object"));
        Object term270 = newInstance(Class.forName("java.lang.Object"));
        Object term271 = newInstance(Class.forName("java.lang.Object"));
        Object term272 = newInstance(Class.forName("java.lang.Object"));
        Object term273 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term262, term262.getClass(), "size", -1268314569);
        setIntField(term262, term262.getClass(), "hash1", 877649659);
        setIntField(term262, term262.getClass(), "hash2", -1332748804);
        setIntField(term262, term262.getClass(), "hash3", 1774507971);
        setField(term262, term262.getClass(), "key1", term267);
        setField(term262, term262.getClass(), "key2", term268);
        setField(term262, term262.getClass(), "key3", term269);
        setField(term262, term262.getClass(), "value1", term270);
        setField(term262, term262.getClass(), "value2", term271);
        setField(term262, term262.getClass(), "value3", term272);
        setFloatField(term273, term273.getClass(), "loadFactor", 0.0F);
        setIntField(term273, term273.getClass(), "size", 0);
        setField(term273, term273.getClass(), "data", null);
        setIntField(term273, term273.getClass(), "threshold", 0);
        setIntField(term273, term273.getClass(), "modCount", 0);
        setField(term273, term273.getClass(), "entrySet", null);
        setField(term273, term273.getClass(), "keySet", null);
        setField(term273, term273.getClass(), "values", null);
        setField(term273, term273.getClass(), "keySet", null);
        setField(term273, term273.getClass(), "values", null);
        setField(term262, term262.getClass(), "delegateMap", term273);
        term7953 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7954 = newInstance(Class.forName("java.lang.Object"));
        Object term7955 = newInstance(Class.forName("java.lang.Object"));
        Object term7956 = newInstance(Class.forName("java.lang.Object"));
        Object term7957 = newInstance(Class.forName("java.lang.Object"));
        Object term7958 = newInstance(Class.forName("java.lang.Object"));
        Object term7959 = newInstance(Class.forName("java.lang.Object"));
        Object term7960 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term7961 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$Values"));
        setIntField(term7953, term7953.getClass(), "size", -1268314569);
        setIntField(term7953, term7953.getClass(), "hash1", 877649659);
        setIntField(term7953, term7953.getClass(), "hash2", -1332748804);
        setIntField(term7953, term7953.getClass(), "hash3", 1774507971);
        setField(term7953, term7953.getClass(), "key1", term7954);
        setField(term7953, term7953.getClass(), "key2", term7955);
        setField(term7953, term7953.getClass(), "key3", term7956);
        setField(term7953, term7953.getClass(), "value1", term7957);
        setField(term7953, term7953.getClass(), "value2", term7958);
        setField(term7953, term7953.getClass(), "value3", term7959);
        setFloatField(term7960, term7960.getClass(), "loadFactor", 0.0F);
        setIntField(term7960, term7960.getClass(), "size", 0);
        setField(term7960, term7960.getClass(), "data", null);
        setIntField(term7960, term7960.getClass(), "threshold", 0);
        setIntField(term7960, term7960.getClass(), "modCount", 0);
        setField(term7960, term7960.getClass(), "entrySet", null);
        setField(term7960, term7960.getClass(), "keySet", null);
        setField(term7961, term7961.getClass(), "parent", term7960);
        setField(term7960, term7960.getClass(), "values", term7961);
        setField(term7960, term7960.getClass(), "keySet", null);
        setField(term7960, term7960.getClass(), "values", null);
        setField(term7953, term7953.getClass(), "delegateMap", term7960);
        term7936 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$Values"));
        Object term7937 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term7937, term7937.getClass(), "loadFactor", 0.0F);
        setIntField(term7937, term7937.getClass(), "size", 0);
        setField(term7937, term7937.getClass(), "data", null);
        setIntField(term7937, term7937.getClass(), "threshold", 0);
        setIntField(term7937, term7937.getClass(), "modCount", 0);
        setField(term7937, term7937.getClass(), "entrySet", null);
        setField(term7937, term7937.getClass(), "keySet", null);
        setField(term7937, term7937.getClass(), "values", term7936);
        setField(term7937, term7937.getClass(), "keySet", null);
        setField(term7937, term7937.getClass(), "values", null);
        setField(term7936, term7936.getClass(), "parent", term7937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term262, args);
        assertTrue(recursiveEquals(term262, term7953));
        assertTrue(recursiveEquals(retValue, term7936));
    }

};
