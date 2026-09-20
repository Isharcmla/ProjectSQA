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
import java.util.HashMap;
import java.lang.Object;

public class Flat3Map_equals_1826922527717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142840;
     Object term143182;
     Object term143463;
     Object term143468;

    public Flat3Map_equals_1826922527717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term143206 = new HashMap();
        term142840 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term142980 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143090 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term142840, term142840.getClass(), "delegateMap", null);
        setIntField(term142840, term142840.getClass(), "size", 2);
        setField(term142840, term142840.getClass(), "key2", term143206);
        setField(term142980, term142980.getClass(), "delegateMap", term143090);
        setField(term142840, term142840.getClass(), "value2", term142980);
        term143182 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143244 = newInstance(Class.forName("java.lang.Object"));
        setField(term143182, term143182.getClass(), "delegateMap", null);
        setIntField(term143182, term143182.getClass(), "size", 2);
        setIntField(term143182, term143182.getClass(), "hash2", 0);
        setField(term143182, term143182.getClass(), "key2", term143206);
        setField(term143182, term143182.getClass(), "value2", term143244);
        HashMap term143464 = new HashMap();
        term143463 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143466 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143467 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term143463, term143463.getClass(), "size", 2);
        setIntField(term143463, term143463.getClass(), "hash1", 0);
        setIntField(term143463, term143463.getClass(), "hash2", 0);
        setIntField(term143463, term143463.getClass(), "hash3", 0);
        setField(term143463, term143463.getClass(), "key1", null);
        setField(term143463, term143463.getClass(), "key2", term143464);
        setField(term143463, term143463.getClass(), "key3", null);
        setField(term143463, term143463.getClass(), "value1", null);
        setIntField(term143466, term143466.getClass(), "size", 0);
        setIntField(term143466, term143466.getClass(), "hash1", 0);
        setIntField(term143466, term143466.getClass(), "hash2", 0);
        setIntField(term143466, term143466.getClass(), "hash3", 0);
        setField(term143466, term143466.getClass(), "key1", null);
        setField(term143466, term143466.getClass(), "key2", null);
        setField(term143466, term143466.getClass(), "key3", null);
        setField(term143466, term143466.getClass(), "value1", null);
        setField(term143466, term143466.getClass(), "value2", null);
        setField(term143466, term143466.getClass(), "value3", null);
        setFloatField(term143467, term143467.getClass(), "loadFactor", 0.0F);
        setIntField(term143467, term143467.getClass(), "size", 0);
        setField(term143467, term143467.getClass(), "data", null);
        setIntField(term143467, term143467.getClass(), "threshold", 0);
        setIntField(term143467, term143467.getClass(), "modCount", 0);
        setField(term143467, term143467.getClass(), "entrySet", null);
        setField(term143467, term143467.getClass(), "keySet", null);
        setField(term143467, term143467.getClass(), "values", null);
        setField(term143467, term143467.getClass(), "keySet", null);
        setField(term143467, term143467.getClass(), "values", null);
        setField(term143466, term143466.getClass(), "delegateMap", term143467);
        setField(term143463, term143463.getClass(), "value2", term143466);
        setField(term143463, term143463.getClass(), "value3", null);
        setField(term143463, term143463.getClass(), "delegateMap", null);
        HashMap term143469 = new HashMap();
        term143468 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143471 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term143468, term143468.getClass(), "size", 2);
        setIntField(term143468, term143468.getClass(), "hash1", 0);
        setIntField(term143468, term143468.getClass(), "hash2", 0);
        setIntField(term143468, term143468.getClass(), "hash3", 0);
        setField(term143468, term143468.getClass(), "key1", null);
        setField(term143468, term143468.getClass(), "key2", term143469);
        setField(term143468, term143468.getClass(), "key3", null);
        setField(term143468, term143468.getClass(), "value1", null);
        setField(term143468, term143468.getClass(), "value2", term143471);
        setField(term143468, term143468.getClass(), "value3", null);
        setField(term143468, term143468.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term143182;
        Object retValue = callMethod(klass, "equals", argTypes, term142840, args);
        assertTrue(recursiveEquals(term142840, term143463));
        assertTrue(recursiveEquals(term143182, term143468));
        assertTrue(recursiveEquals(retValue, false));
    }

};
