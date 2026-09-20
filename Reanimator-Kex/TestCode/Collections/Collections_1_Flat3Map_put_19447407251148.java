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

public class Flat3Map_put_19447407251148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247598;
     Object term249064;

    public Flat3Map_put_19447407251148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247598 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247690 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247782 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247874 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247966 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term248058 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term247335 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term247598, term247598.getClass(), "delegateMap", null);
        setIntField(term247598, term247598.getClass(), "size", 3);
        setField(term247690, term247690.getClass(), "delegateMap", null);
        setIntField(term247690, term247690.getClass(), "size", 0);
        setField(term247598, term247598.getClass(), "key3", term247690);
        setField(term247782, term247782.getClass(), "delegateMap", null);
        setIntField(term247782, term247782.getClass(), "size", 0);
        setField(term247598, term247598.getClass(), "key2", term247782);
        setField(term247874, term247874.getClass(), "delegateMap", null);
        setIntField(term247874, term247874.getClass(), "size", 0);
        setField(term247598, term247598.getClass(), "key1", term247874);
        setField(term247598, term247598.getClass(), "value3", term247966);
        setField(term247598, term247598.getClass(), "value2", term248058);
        setField(term247598, term247598.getClass(), "value1", term247335);
        setIntField(term247598, term247598.getClass(), "hash3", 0);
        setIntField(term247598, term247598.getClass(), "hash2", 0);
        setIntField(term247598, term247598.getClass(), "hash1", 0);
        term249064 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term249065 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term249066 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term249067 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term249068 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term249069 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term249064, term249064.getClass(), "size", 0);
        setIntField(term249064, term249064.getClass(), "hash1", 0);
        setIntField(term249064, term249064.getClass(), "hash2", 0);
        setIntField(term249064, term249064.getClass(), "hash3", 0);
        setField(term249064, term249064.getClass(), "key1", null);
        setField(term249064, term249064.getClass(), "key2", null);
        setField(term249064, term249064.getClass(), "key3", null);
        setField(term249064, term249064.getClass(), "value1", null);
        setField(term249064, term249064.getClass(), "value2", null);
        setField(term249064, term249064.getClass(), "value3", null);
        setFloatField(term249065, term249065.getClass(), "loadFactor", 0.75F);
        setIntField(term249065, term249065.getClass(), "size", 2);
        setField(term249068, term249068.getClass(), "next", null);
        setField(term249068, term249068.getClass(), "key", null);
        setField(term249068, term249068.getClass(), "value", null);
        setField(term249067, term249067.getClass(), "next", term249068);
        setField(term249067, term249067.getClass(), "key", term249069);
        setField(term249067, term249067.getClass(), "value", null);
        setElement(term249066, 0, term249067);
        setField(term249065, term249065.getClass(), "data", term249066);
        setIntField(term249065, term249065.getClass(), "threshold", 12);
        setIntField(term249065, term249065.getClass(), "modCount", 2);
        setField(term249065, term249065.getClass(), "entrySet", null);
        setField(term249065, term249065.getClass(), "keySet", null);
        setField(term249065, term249065.getClass(), "values", null);
        setField(term249065, term249065.getClass(), "keySet", null);
        setField(term249065, term249065.getClass(), "values", null);
        setField(term249064, term249064.getClass(), "delegateMap", term249065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term247598, args);
        assertTrue(recursiveEquals(term247598, term249064));
        assertTrue(recursiveEquals(retValue, null));
    }

};
