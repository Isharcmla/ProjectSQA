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
     Object term260;
     Object term7956;
     Object term7939;

    public Flat3Map_values_170579397139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term265 = newInstance(Class.forName("java.lang.Object"));
        Object term266 = newInstance(Class.forName("java.lang.Object"));
        Object term267 = newInstance(Class.forName("java.lang.Object"));
        Object term268 = newInstance(Class.forName("java.lang.Object"));
        Object term269 = newInstance(Class.forName("java.lang.Object"));
        Object term270 = newInstance(Class.forName("java.lang.Object"));
        Object term271 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term260, term260.getClass(), "size", -1268314569);
        setIntField(term260, term260.getClass(), "hash1", 877649659);
        setIntField(term260, term260.getClass(), "hash2", -1332748804);
        setIntField(term260, term260.getClass(), "hash3", 1774507971);
        setField(term260, term260.getClass(), "key1", term265);
        setField(term260, term260.getClass(), "key2", term266);
        setField(term260, term260.getClass(), "key3", term267);
        setField(term260, term260.getClass(), "value1", term268);
        setField(term260, term260.getClass(), "value2", term269);
        setField(term260, term260.getClass(), "value3", term270);
        setFloatField(term271, term271.getClass(), "loadFactor", 0.0F);
        setIntField(term271, term271.getClass(), "size", 0);
        setField(term271, term271.getClass(), "data", null);
        setIntField(term271, term271.getClass(), "threshold", 0);
        setIntField(term271, term271.getClass(), "modCount", 0);
        setField(term271, term271.getClass(), "entrySet", null);
        setField(term271, term271.getClass(), "keySet", null);
        setField(term271, term271.getClass(), "values", null);
        setField(term271, term271.getClass(), "keySet", null);
        setField(term271, term271.getClass(), "values", null);
        setField(term260, term260.getClass(), "delegateMap", term271);
        term7956 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7957 = newInstance(Class.forName("java.lang.Object"));
        Object term7958 = newInstance(Class.forName("java.lang.Object"));
        Object term7959 = newInstance(Class.forName("java.lang.Object"));
        Object term7960 = newInstance(Class.forName("java.lang.Object"));
        Object term7961 = newInstance(Class.forName("java.lang.Object"));
        Object term7962 = newInstance(Class.forName("java.lang.Object"));
        Object term7963 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term7964 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$Values"));
        setIntField(term7956, term7956.getClass(), "size", -1268314569);
        setIntField(term7956, term7956.getClass(), "hash1", 877649659);
        setIntField(term7956, term7956.getClass(), "hash2", -1332748804);
        setIntField(term7956, term7956.getClass(), "hash3", 1774507971);
        setField(term7956, term7956.getClass(), "key1", term7957);
        setField(term7956, term7956.getClass(), "key2", term7958);
        setField(term7956, term7956.getClass(), "key3", term7959);
        setField(term7956, term7956.getClass(), "value1", term7960);
        setField(term7956, term7956.getClass(), "value2", term7961);
        setField(term7956, term7956.getClass(), "value3", term7962);
        setFloatField(term7963, term7963.getClass(), "loadFactor", 0.0F);
        setIntField(term7963, term7963.getClass(), "size", 0);
        setField(term7963, term7963.getClass(), "data", null);
        setIntField(term7963, term7963.getClass(), "threshold", 0);
        setIntField(term7963, term7963.getClass(), "modCount", 0);
        setField(term7963, term7963.getClass(), "entrySet", null);
        setField(term7963, term7963.getClass(), "keySet", null);
        setField(term7964, term7964.getClass(), "parent", term7963);
        setField(term7963, term7963.getClass(), "values", term7964);
        setField(term7963, term7963.getClass(), "keySet", null);
        setField(term7963, term7963.getClass(), "values", null);
        setField(term7956, term7956.getClass(), "delegateMap", term7963);
        term7939 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$Values"));
        Object term7940 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term7940, term7940.getClass(), "loadFactor", 0.0F);
        setIntField(term7940, term7940.getClass(), "size", 0);
        setField(term7940, term7940.getClass(), "data", null);
        setIntField(term7940, term7940.getClass(), "threshold", 0);
        setIntField(term7940, term7940.getClass(), "modCount", 0);
        setField(term7940, term7940.getClass(), "entrySet", null);
        setField(term7940, term7940.getClass(), "keySet", null);
        setField(term7940, term7940.getClass(), "values", term7939);
        setField(term7940, term7940.getClass(), "keySet", null);
        setField(term7940, term7940.getClass(), "values", null);
        setField(term7939, term7939.getClass(), "parent", term7940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term260, args);
        assertTrue(recursiveEquals(term260, term7956));
        assertTrue(recursiveEquals(retValue, term7939));
    }

};


