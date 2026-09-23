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

public class Flat3Map_put_1944740725921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246116;
     Object term246540;
     Object term247015;
     Object term247025;

    public Flat3Map_put_1944740725921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246116 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term246208 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term246300 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term246338 = newInstance(Class.forName("java.lang.Object"));
        Object term246448 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term246116, term246116.getClass(), "delegateMap", null);
        setIntField(term246116, term246116.getClass(), "size", 3);
        setIntField(term246116, term246116.getClass(), "hash3", -829948672);
        setField(term246208, term246208.getClass(), "delegateMap", null);
        setIntField(term246208, term246208.getClass(), "size", 3);
        setField(term246208, term246208.getClass(), "key3", term246300);
        setField(term246208, term246208.getClass(), "key2", null);
        setField(term246208, term246208.getClass(), "value2", null);
        setIntField(term246208, term246208.getClass(), "hash3", -138278848);
        setField(term246208, term246208.getClass(), "value3", null);
        setIntField(term246208, term246208.getClass(), "hash2", 1208222116);
        setIntField(term246208, term246208.getClass(), "hash1", 1401684032);
        setField(term246208, term246208.getClass(), "value1", null);
        setField(term246116, term246116.getClass(), "key3", term246208);
        setIntField(term246116, term246116.getClass(), "hash2", -829948672);
        setField(term246116, term246116.getClass(), "key2", null);
        setIntField(term246116, term246116.getClass(), "hash1", -829948672);
        setField(term246116, term246116.getClass(), "key1", null);
        setField(term246116, term246116.getClass(), "value3", term246338);
        setField(term246116, term246116.getClass(), "value2", term246448);
        setField(term246116, term246116.getClass(), "value1", null);
        term246540 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term246634 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term246540, term246540.getClass(), "delegateMap", null);
        setIntField(term246540, term246540.getClass(), "size", 3);
        setIntField(term246540, term246540.getClass(), "hash3", -299630528);
        setField(term246540, term246540.getClass(), "value3", null);
        setIntField(term246540, term246540.getClass(), "hash2", 2105984);
        setIntField(term246634, term246634.getClass(), "size", 0);
        setField(term246540, term246540.getClass(), "value2", term246634);
        setIntField(term246540, term246540.getClass(), "hash1", -532424128);
        setField(term246540, term246540.getClass(), "value1", null);
        setField(term246540, term246540.getClass(), "key3", null);
        setField(term246540, term246540.getClass(), "key2", null);
        term247015 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247016 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term247017 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term247018 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term247019 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247020 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term247021 = newInstance(Class.forName("java.lang.Object"));
        Object term247022 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term247023 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247024 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term247015, term247015.getClass(), "size", 0);
        setIntField(term247015, term247015.getClass(), "hash1", 0);
        setIntField(term247015, term247015.getClass(), "hash2", 5);
        setIntField(term247015, term247015.getClass(), "hash3", 0);
        setField(term247015, term247015.getClass(), "key1", null);
        setField(term247015, term247015.getClass(), "key2", null);
        setField(term247015, term247015.getClass(), "key3", null);
        setField(term247015, term247015.getClass(), "value1", null);
        setField(term247015, term247015.getClass(), "value2", null);
        setField(term247015, term247015.getClass(), "value3", null);
        setFloatField(term247016, term247016.getClass(), "loadFactor", 0.75F);
        setIntField(term247016, term247016.getClass(), "size", 3);
        setField(term247018, term247018.getClass(), "next", null);
        setIntField(term247019, term247019.getClass(), "size", 3);
        setIntField(term247019, term247019.getClass(), "hash1", -532424128);
        setIntField(term247019, term247019.getClass(), "hash2", 2105984);
        setIntField(term247019, term247019.getClass(), "hash3", -299630528);
        setField(term247019, term247019.getClass(), "key1", null);
        setField(term247019, term247019.getClass(), "key2", null);
        setField(term247019, term247019.getClass(), "key3", null);
        setField(term247019, term247019.getClass(), "value1", null);
        setField(term247019, term247019.getClass(), "value2", null);
        setField(term247019, term247019.getClass(), "value3", null);
        setField(term247019, term247019.getClass(), "delegateMap", null);
        setField(term247018, term247018.getClass(), "key", term247019);
        setField(term247018, term247018.getClass(), "value", null);
        setElement(term247017, 4, term247018);
        setField(term247020, term247020.getClass(), "next", null);
        setField(term247020, term247020.getClass(), "key", term247021);
        setField(term247020, term247020.getClass(), "value", null);
        setElement(term247017, 6, term247020);
        setField(term247022, term247022.getClass(), "next", null);
        setIntField(term247023, term247023.getClass(), "size", 3);
        setIntField(term247023, term247023.getClass(), "hash1", 1401684032);
        setIntField(term247023, term247023.getClass(), "hash2", 1208222116);
        setIntField(term247023, term247023.getClass(), "hash3", -138278848);
        setField(term247023, term247023.getClass(), "key1", null);
        setField(term247023, term247023.getClass(), "key2", null);
        setField(term247023, term247023.getClass(), "key3", null);
        setField(term247023, term247023.getClass(), "value1", null);
        setField(term247023, term247023.getClass(), "value2", null);
        setField(term247023, term247023.getClass(), "value3", null);
        setField(term247023, term247023.getClass(), "delegateMap", null);
        setField(term247022, term247022.getClass(), "key", term247023);
        setField(term247022, term247022.getClass(), "value", term247024);
        setElement(term247017, 15, term247022);
        setField(term247016, term247016.getClass(), "data", term247017);
        setIntField(term247016, term247016.getClass(), "threshold", 12);
        setIntField(term247016, term247016.getClass(), "modCount", 16);
        setField(term247016, term247016.getClass(), "entrySet", null);
        setField(term247016, term247016.getClass(), "keySet", null);
        setField(term247016, term247016.getClass(), "values", null);
        setField(term247016, term247016.getClass(), "keySet", null);
        setField(term247016, term247016.getClass(), "values", null);
        setField(term247015, term247015.getClass(), "delegateMap", term247016);
        term247025 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term247025, term247025.getClass(), "size", 3);
        setIntField(term247025, term247025.getClass(), "hash1", -532424128);
        setIntField(term247025, term247025.getClass(), "hash2", 2105984);
        setIntField(term247025, term247025.getClass(), "hash3", -299630528);
        setField(term247025, term247025.getClass(), "key1", null);
        setField(term247025, term247025.getClass(), "key2", null);
        setField(term247025, term247025.getClass(), "key3", null);
        setField(term247025, term247025.getClass(), "value1", null);
        setField(term247025, term247025.getClass(), "value2", null);
        setField(term247025, term247025.getClass(), "value3", null);
        setField(term247025, term247025.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term246540;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term246116, args);
        assertTrue(recursiveEquals(term246116, term247015));
        assertTrue(recursiveEquals(term246540, term247025));
        assertTrue(recursiveEquals(retValue, null));
    }

};


